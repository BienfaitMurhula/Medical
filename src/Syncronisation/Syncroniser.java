/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Syncronisation;

import Connexion.Connexion;
import static Connexion.Connexion.con;
import Gui.Home;
import Gui.Login;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author honore
 */
public class Syncroniser {

    PreparedStatement ps;
    ResultSet rs;

    // 3requete
    public void appelle(JPanel v, JPanel w) {
        try {
            v.removeAll();
            v.add(w);
            v.repaint();
            v.revalidate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur des pages" + e.getMessage());
        }
    }

    public void insertionPatient(
            JLabel id, JTextField nom,
            JTextField postnom,
            JComboBox sexe, JDateChooser datenaiss,
            JTextField adresse, JLabel agent, JTextField curatif,
            JTextField mat, JTextField echo, JTextField cpn, JTextField pren,
            JTextField autre, JTextField numFiche, JComboBox prov, JTextField tel, String requete, String mess, String messerror
    ) {
        try {
            if (nom.getText().isEmpty() || postnom.getText().isEmpty() || adresse.getText().isEmpty() || sexe.getSelectedItem().toString().isEmpty() || curatif.getText().isEmpty() || echo.getText().isEmpty() || cpn.getText().isEmpty() || mat.getText().isEmpty() || numFiche.getText().isEmpty() || ((JTextField) datenaiss.getDateEditor().getUiComponent()).getText().isEmpty() || autre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Veiller remplir tous les champs svp !!!");
            } else {
                ps = Connexion.con().prepareCall(requete);
                ps.setString(1, id.getText().toUpperCase());
                ps.setString(2, nom.getText().toUpperCase());
                ps.setString(3, sexe.getSelectedItem().toString().toUpperCase());
                ps.setString(4, ((JTextField) datenaiss.getDateEditor().getUiComponent()).getText());
                ps.setString(5, adresse.getText().toUpperCase());
                ps.setString(6, agent.getText().toUpperCase());
                ps.setString(7, postnom.getText().toUpperCase());
                ps.setString(8, pren.getText().toUpperCase());
                ps.setString(9, numFiche.getText().toUpperCase());
                ps.setString(10, curatif.getText().toUpperCase());
                ps.setString(11, mat.getText().toUpperCase());
                ps.setString(12, echo.getText().toUpperCase());
                ps.setString(13, cpn.getText().toUpperCase());
                ps.setString(14, autre.getText().toUpperCase());
                ps.setString(15, prov.getSelectedItem().toString().toUpperCase());
                ps.setString(16, tel.getText());
                ps.execute();
                JOptionPane.showMessageDialog(null, mess);
                id.setText("");
                nom.setText("");
                postnom.setText("");
                pren.setText("");
                numFiche.setText("");
                adresse.setText("");
                curatif.setText("");
                mat.setText("");
                echo.setText("");
                cpn.setText("");
                autre.setText("");
                tel.setText("");
                ((JTextField) datenaiss.getDateEditor().getUiComponent()).setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'Indentification de patient" + e.getMessage());
        }
    }

    public void Delete(JLabel id, String requete) {
        try {
            ps = Connexion.con().prepareStatement(requete);
            ps.setString(1, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Suppression effectuée");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de suppression" + e.getMessage());
        }
    }

    public void affichage(JTable table, String requete) {
        try {
            ps = Connexion.con().prepareStatement(requete);
            rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'affichage des informations" + e.getMessage());
        }
    }

//    public void Modlivre( JLabel Id, JDateChooser Date, JTextField nomcl, JTextField Libelle, JLabel Debit, JLabel Credit, String sql) {
//        try {
//            ps = Connexion.con().prepareCall(sql);
//            ps.setString(1, Id.getText());
//            ps.setString(2, ((JTextField)Date.getDateEditor().getUiComponent()).getText());
//            ps.setString(3, nomcl.getText());
//            ps.setString(4, Libelle.getText());
//            ps.setString(5, Debit.getText());
//            ps.setString(6, Credit.getText());
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "Modification reussi !!");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Impossible de faire l'operation !!" + e.getMessage());
//        }
//    }
    public void SommeCredit(String table, JLabel h, JDateChooser dat, String col) {

        try {
            ps = Connexion.con().prepareStatement("SELECT ISNULL(SUM(credit),0)as TOTAL FROM " + table + " where " + col + "='" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setText(rs.getString("TOTAL"));
            }
        } catch (SQLException e) {
        }
    }

    public void deplacerlivre(JTable table, JLabel Id, JDateChooser date, JComboBox Num_ordre, JTextField Libelle, JTextField Debit, JTextField Credit, JTextField mont) {

        try {
            int sold = table.getSelectedRow();
            String mode = (table.getModel().getValueAt(sold, 0).toString());
            ps = Connexion.con().prepareStatement("select * from livre_de_caisse where id='" + mode + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                Id.setText(rs.getString(1));
                ((JTextField) date.getDateEditor().getUiComponent()).setText(rs.getString(2));
                Num_ordre.setSelectedItem(rs.getString(3));
                Libelle.setText(rs.getString(4));
                // Dette.setText(rs.getString(5));
                Debit.setText(rs.getString(5));
                Credit.setText(rs.getString(6));
                mont.setText(rs.getString(8));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Veuiller selectioner un élément Svp !!" + e.getMessage());
        }
    }

    public void SommeDette(String table, JLabel h, JDateChooser dat, String col) {

        try {
            ps = Connexion.con().prepareStatement("SELECT ISNULL(SUM(dette),0)as TOTAL FROM " + table + " where " + col + "='" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setText(rs.getString("TOTAL"));
            }
        } catch (Exception e) {
        }
    }

    public void Sommefacture(String table, JLabel h, JDateChooser dat, String col) {

        try {
            ps = Connexion.con().prepareStatement("SELECT ISNULL(SUM(Total),0)as TOTAL FROM " + table + " where " + col + "='" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setText(rs.getString("TOTAL"));
            }
        } catch (Exception e) {
        }
    }

    public void Solde(JTextField cre, JDateChooser dat, String col) {

        try {
            ps = Connexion.con().prepareStatement("select TOT,DEP_TOAL,(TOT-DEP_TOAL) AS RESTE from depase_total,total_aujrd where " + col + "='" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                cre.setText(rs.getString("RESTE"));
            }
        } catch (Exception e) {
        }
    }

    public void SavedCaisse(JLabel id, JDateChooser date, JComboBox ordre, JTextField libelle,
            JTextField debit, JTextField credit, JTextField montant) {
        try {
            ps = Connexion.con().prepareCall("exec PRO_livre ?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, ((JTextField) date.getDateEditor().getUiComponent()).getText());
            ps.setString(3, ordre.getSelectedItem().toString());
            ps.setString(4, libelle.getText());
            // ps.setString(4, dette.getText());
            ps.setString(5, debit.getText());
            ps.setString(6, credit.getText());
            ps.setString(7, montant.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Enregistrement reussi");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERREUR" + ex.getMessage());
            Logger.getLogger(Syncroniser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Suppression(String table, String col, JLabel id) {
        try {
            ps = Connexion.con().prepareStatement("delete from " + table + " where " + col + "='" + id.getText() + "'");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Supprimé avec succès");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "non Supprimé" + e.getMessage());
        }
    }

    public void chargementCombo(String table, String col, JComboBox co) {
        try {
            ps = Connexion.con().prepareStatement("select " + col + " from " + table + " order by id desc");
            rs = ps.executeQuery();
            while (rs.next()) {
                co.addItem(rs.getString(col));
            }
        } catch (SQLException e) {
        }
    }

    public void chargementdetail(JComboBox co) {
        try {
            ps = con().prepareStatement("select nom from v_detail  inner join IDENTITE on IDENTITE.ID=v_detail.[NUM CONSULTATION]  order by v_detail.ID desc");
            rs = ps.executeQuery();
            while (rs.next()) {
                co.addItem(rs.getString("NOM"));
            }
        } catch (Exception e) {
        }
    }

    public void insertionPhysique(
            JLabel id, int codepers,
            JLabel agent,
            JTextField temp,
            JTextField FC, JTextField FR,
            JTextField Sa02, JTextField MEnsuration_poid,
            JTextField Taill,
            JTextField Ta, JTextField Pouls,
            JTextField EtatGeneral, JTextField Paeu,
            JTextField Aire_Gangl,
            JTextField Sphere_Orl, JTextField thorax,
            JTextField Abdomen, JTextField Organe_genitaux,
            JTextField Apareil_loco, JTextField Examen_neuro,
            JTextField resume_sydro, JTextField hypothese,
            String requete, String message, String mess
    ) {
        try {
            if (agent.getText().isEmpty()
                    || temp.getText().isEmpty()
                    || FC.getText().isEmpty()
                    || FR.getText().isEmpty()
                    || Sa02.getText().isEmpty()
                    || MEnsuration_poid.getText().isEmpty()
                    || Taill.getText().isEmpty()
                    || Ta.getText().isEmpty()
                    || Pouls.getText().isEmpty()
                    || EtatGeneral.getText().isEmpty()
                    || Paeu.getText().isEmpty()
                    || Aire_Gangl.getText().isEmpty()
                    || Sphere_Orl.getText().isEmpty()
                    || thorax.getText().isEmpty()
                    || Abdomen.getText().isEmpty()
                    || Organe_genitaux.getText().isEmpty()
                    || Apareil_loco.getText().isEmpty()
                    || Examen_neuro.getText().isEmpty()
                    || resume_sydro.getText().isEmpty()
                    || hypothese.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Veiller remplir tous les champs !!!");
            } else {
                ps = Connexion.con().prepareStatement(requete);
                ps.setString(1, id.getText());
                ps.setInt(2, codepers);
                ps.setString(3, agent.getText().toUpperCase());
                ps.setString(4, temp.getText().toUpperCase());
                ps.setString(5, FC.getText());
                ps.setString(6, FR.getText().toUpperCase());
                ps.setString(7, Sa02.getText().toUpperCase());
                ps.setString(8, MEnsuration_poid.getText().toUpperCase());
                ps.setString(9, Taill.getText().toUpperCase());
                ps.setString(10, Ta.getText().toUpperCase());
                ps.setString(11, Pouls.getText().toUpperCase());
                ps.setString(12, EtatGeneral.getText().toUpperCase());
                ps.setString(13, Paeu.getText().toUpperCase());
                ps.setString(14, Aire_Gangl.getText().toUpperCase());
                ps.setString(15, Sphere_Orl.getText().toUpperCase());
                ps.setString(16, thorax.getText().toUpperCase());
                ps.setString(17, Abdomen.getText().toUpperCase());
                ps.setString(18, Organe_genitaux.getText().toUpperCase());
                ps.setString(19, Apareil_loco.getText().toUpperCase());
                ps.setString(20, Examen_neuro.getText().toUpperCase());
                ps.setString(21, resume_sydro.getText().toUpperCase());
                ps.setString(22, hypothese.getText().toUpperCase());
                ps.execute();
                JOptionPane.showMessageDialog(null, message);
                id.setText("");
                temp.setText("");
                FC.setText("");
                FR.setText("");
                Sa02.setText("");
                MEnsuration_poid.setText("");
                Taill.setText("");
                Ta.setText("");
                Pouls.setText("");
                EtatGeneral.setText("");
                Paeu.setText("");
                Aire_Gangl.setText("");
                thorax.setText("");
                Abdomen.setText("");
                Organe_genitaux.setText("");
                Apareil_loco.setText("");
                Examen_neuro.setText("");
                resume_sydro.setText("");
                hypothese.setText("");
                Sphere_Orl.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, mess + " " + e.getMessage());
        }
    }

    public void selection(
            JTable table, JLabel id, JComboBox codepers,
            JLabel agent,
            JTextField temp,
            JTextField FC, JTextField FR,
            JTextField Sa02, JTextField MEnsuration_poid,
            JTextField Taill,
            JTextField Ta, JTextField Pouls,
            JTextField EtatGeneral, JTextField Peau,
            JTextField Aire_Gangl,
            JTextField Sphere_Orl, JTextField thorax,
            JTextField Abdomen, JTextField Organe_genitaux,
            JTextField Apareil_loco, JTextField Examen_neuro,
            JTextField resume_sydro, JTextField hypothese
    ) {
        try {
            int i = table.getSelectedRow();
            String u = table.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from v_physique WHERE code ='" + u + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                codepers.setSelectedItem(rs.getString(2));
                temp.setText(rs.getString(3));
                FC.setText(rs.getString(4));
                FR.setText(rs.getString(5));
                Sa02.setText(rs.getString(6));
                MEnsuration_poid.setText(rs.getString(7));
                Taill.setText(rs.getString(8));
                Ta.setText(rs.getString(9));
                Pouls.setText(rs.getString(10));
                EtatGeneral.setText(rs.getString(11));
                Peau.setText(rs.getString(12));
                Aire_Gangl.setText(rs.getString(13));
                Sphere_Orl.setText(rs.getString(14));
                thorax.setText(rs.getString(15));
                Abdomen.setText(rs.getString(16));
                Organe_genitaux.setText(rs.getString(17));
                Apareil_loco.setText(rs.getString(18));
                Examen_neuro.setText(rs.getString(19));
                resume_sydro.setText(rs.getString(20));
                hypothese.setText(rs.getString(21));
            }
        } catch (SQLException e) {
        }
    }
//
//    public void Facture(JLabel h) {
//        try {
//            JasperDesign jd = JRXmlLoader.load(".//Facture.jrxml");
//            String sql = "select id,NOM_PATIENT,ex1,prix,ex2,pri2,ex3,pri3,ex4,prix4,ex5,prix5,ex6,prix6,ex7,prix7,TOTAL  from facture where id= '" + h.getText() + "'";
//            JRDesignQuery newQuery = new JRDesignQuery();
//            newQuery.setText(sql);
//            jd.setQuery(newQuery);
//            JasperReport jr = JasperCompileManager.compileReport(jd);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null, Connexion.con());
//            JasperViewer.viewReport(jp, false);
//        } catch (JRException exp) {
//            JOptionPane.showMessageDialog(null, "erreur d'impression" + exp.getMessage());
//
//        }
//    }

    public void deplacerPrixLibele(JTable u, JLabel Exam1, JLabel prix) {
        try {
            int i = u.getSelectedRow();
            Exam1.setText(u.getModel().getValueAt(i, 1).toString());
            prix.setText(u.getModel().getValueAt(i, 2).toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }

    public void deplacerfacture(JTable k, JLabel id,
            JLabel libel1, JLabel prix1, JLabel libel2, JLabel prix2, JLabel libel3, JLabel prix3,
            JLabel libel4, JLabel prix4, JLabel libel5, JLabel prix5,
            JLabel libel6, JLabel prix6, JLabel libel7, JLabel prix7, JLabel total, JDateChooser date_op
    ) {
        try {
            int i = k.getSelectedRow();
            String moise = (k.getModel().getValueAt(i, 0).toString());
            ps = Connexion.con().prepareStatement("select * from FACTURE where id = '" + moise + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
//                idpatient.setText(rs.getString(3));
                libel1.setText(rs.getString(3));
                prix1.setText(rs.getString(4));
                libel2.setText(rs.getString(5));
                prix2.setText(rs.getString(6));
                libel3.setText(rs.getString(7));
                prix3.setText(rs.getString(8));
                libel4.setText(rs.getString(9));
                prix4.setText(rs.getString(10));
                libel5.setText((rs.getString(11)));
                prix5.setText((rs.getString(12)));
                libel6.setText(rs.getString(13));
                prix6.setText(rs.getString(14));
                libel7.setText(rs.getString(15));
                prix7.setText(rs.getString(16));
                total.setText(rs.getString(17));
                ((JTextField) date_op.getDateEditor().getUiComponent()).setText(rs.getString(18));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void SaveFacturation(JLabel id, int idf, JLabel Exam1, JLabel prix1,
            JLabel Exam2, JLabel prix2, JLabel Exam3, JLabel prix3,
            JLabel Exam4, JLabel prix4, JLabel Exam5, JLabel prix5, JLabel Exam6,
            JLabel prix6, JLabel Exam7, JLabel prix7, JDateChooser date) {
        try {
            ps = Connexion.con().prepareCall("exec sp_facture ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setInt(2, idf);
            ps.setString(3, Exam1.getText());
            ps.setString(4, prix1.getText());
            ps.setString(5, Exam2.getText());
            ps.setString(6, prix2.getText());
            ps.setString(7, Exam3.getText());
            ps.setString(8, prix3.getText());
            ps.setString(9, Exam4.getText());
            ps.setString(10, prix4.getText());
            ps.setString(11, Exam5.getText());
            ps.setString(12, prix5.getText());
            ps.setString(13, Exam6.getText());
            ps.setString(14, prix6.getText());
            ps.setString(15, Exam7.getText());
            ps.setString(16, prix7.getText());
            ps.setString(17, ((JTextField) date.getDateEditor().getUiComponent()).getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Facture  Enregistrée");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e.getMessage());
        }
    }

    public void SelectionPatient(JTable table,
            JTextField nom,
            JTextField postnom,
            JComboBox sexe, JDateChooser datenaiss,
            JTextField adresse, JTextField curatif,
            JTextField mat, JTextField echo, JTextField cpn,
            JTextField autre, JTextField numFiche, JLabel id,
            JTextField numfiche, JTextField prenom, JComboBox prov, JTextField tel
    ) {
        try {
            int i = table.getSelectedRow();
            String u = table.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from v_identite WHERE ID='" + u + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                nom.setText(rs.getString(2));
                postnom.setText(rs.getString(3));
                prenom.setText(rs.getString(4));
                ((JTextField) datenaiss.getDateEditor().getUiComponent()).setText(rs.getString(6));
                sexe.setSelectedItem(rs.getString(5));
                adresse.setText(rs.getString(8));
                curatif.setText(rs.getString(9));
                mat.setText(rs.getString(10));
                echo.setText(rs.getString(11));
                cpn.setText(rs.getString(12));
                autre.setText(rs.getString(13));
                numfiche.setText(rs.getString(14));
                prov.setSelectedItem(rs.getString(15));
                tel.setText(rs.getString(20));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de selection des informations" + e.getMessage());
        }

    }

    public void Anamenese(JLabel id, int ID, String bcg, String dtc, String pneumo, String vpbo, String vpi3, String vpob1,
            String dtc3, String vpob2, String var,
            JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4, JTextField txt5, JTextField txt6,
            JTextField txt7, JTextField txt8, JTextField txt9, JTextField txt10, JTextField txt11, JTextField txt12,
            JTextField txt13, JTextField txt14, JTextField txt15, JTextField txt16, JTextField txt17, JTextField txt18,
            JTextField mois2, JTextField mois12_15, JTextField mois3, JTextField mois9,
            JTextField mois6, JTextField mois24, JTextArea Antecedent, JTextArea Environnement, JTextArea Complement,
            JTextField motif, JTextField historique, JTextField suivie, JTextField circonstan, JTextField alimentation, JLabel agent) {

        try {
            ps = Connexion.con().prepareCall("exec sp_annamnese ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setInt(2, ID);
            ps.setString(3, bcg);
            ps.setString(4, txt1.getText());
            ps.setString(5, txt2.getText());
            ps.setString(6, dtc);
            ps.setString(7, txt3.getText());
            ps.setString(8, txt4.getText());
            ps.setString(9, pneumo);
            ps.setString(10, txt5.getText());
            ps.setString(11, txt6.getText());
            ps.setString(12, vpbo);
            ps.setString(13, txt7.getText());
            ps.setString(14, txt8.getText());
            ps.setString(15, vpi3);
            ps.setString(16, txt9.getText());
            ps.setString(17, txt10.getText());
            ps.setString(18, vpob1);
            ps.setString(19, txt11.getText());
            ps.setString(20, txt12.getText());
            ps.setString(21, dtc3);
            ps.setString(22, txt13.getText());
            ps.setString(23, txt14.getText());
            ps.setString(24, vpob2);
            ps.setString(25, txt15.getText());
            ps.setString(26, txt16.getText());
            ps.setString(27, var);
            ps.setString(28, txt17.getText());
            ps.setString(29, txt18.getText());
            ps.setString(30, mois2.getText());
            ps.setString(31, mois3.getText());
            ps.setString(32, mois6.getText());
            ps.setString(33, mois9.getText());
            ps.setString(34, mois12_15.getText());
            ps.setString(35, mois24.getText());
            ps.setString(36, Antecedent.getText());
            ps.setString(37, Environnement.getText());
            ps.setString(38, Complement.getText());
            ps.setString(39, motif.getText());
            ps.setString(40, historique.getText());
            ps.setString(41, suivie.getText());
            ps.setString(42, circonstan.getText());
            ps.setString(43, alimentation.getText());
            ps.setString(44, agent.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Vaccination Enregistrée  avec succès");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erreur" + ex.getMessage());

        }

    }

    public void paraclinique(JLabel id, JLabel Agent, JLabel Exam1, JLabel Exam2, JLabel Exam3,
            JLabel Exam4, JLabel Exam5, JLabel Exam6, JLabel Exam7, JLabel Exam8, int idi, String requete) {
        try {
            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, id.getText());
            ps.setString(2, Agent.getText());
            ps.setString(3, Exam1.getText());
            ps.setString(4, Exam2.getText());
            ps.setString(5, Exam3.getText());
            ps.setString(6, Exam4.getText());
            ps.setString(7, Exam5.getText());
            ps.setString(8, Exam6.getText());
            ps.setString(9, Exam7.getText());
            ps.setString(10, Exam8.getText());
            ps.setInt(11, idi);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Envoyer au labo");
            //JOptionPane.showMessageDialog(null, "Examen Paraclinique Enreigistré");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e.getMessage());
        }
    }
    //paraclinique

    //deplacer examen
    public void deplacerEx1(JTable u, JLabel Exam1) {
        try {
            int i = u.getSelectedRow();
            Exam1.setText(u.getModel().getValueAt(i, 1).toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }
    //condition de deplacement des maladie

    public void deplacermaladie(JTable tab, JLabel exam1, JLabel exit1, JLabel exit2, JLabel exit3, JLabel exit4,
            JLabel exit5, JLabel exit6, JLabel exit7, JLabel exit8, JLabel exam2, JLabel exam3, JLabel exam4, JLabel exam5,
            JLabel exam6, JLabel exam7, JLabel exam8, JLabel l1, JLabel l2, JLabel l3, JLabel l4, JLabel l5, JLabel l6, JLabel l7, JLabel l8) {
        if (exam1.getText().equals("")) {
            deplacerEx1(tab, exam1);
            exit1.setVisible(true);
            l1.setVisible(true);
        } else if (!exam1.getText().equals("") && exam2.getText().equals("")) {
            deplacerEx1(tab, exam2);
            exit2.setVisible(true);
            l2.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("") && exam3.getText().equals("")) {
            deplacerEx1(tab, exam3);
            exit3.setVisible(true);
            l3.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("") && !exam3.getText().equals("") && exam4.getText().equals("")) {
            deplacerEx1(tab, exam4);
            exit4.setVisible(true);
            l4.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("") && !exam3.getText().equals("") && !exam4.getText().equals("") && exam5.getText().equals("")) {
            deplacerEx1(tab, exam5);
            exit5.setVisible(true);
            l5.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("")
                && !exam3.getText().equals("") && !exam4.getText().equals("") && !exam5.getText().equals("") && exam6.getText().equals("")) {
            deplacerEx1(tab, exam6);
            exit6.setVisible(true);
            l6.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("")
                && !exam3.getText().equals("") && !exam4.getText().equals("") && !exam5.getText().equals("") && !exam6.getText().equals("") && exam7.getText().equals("")) {
            deplacerEx1(tab, exam7);
            exit7.setVisible(true);
            l7.setVisible(true);
        } else if (!exam1.getText().equals("") && !exam2.getText().equals("")
                && !exam3.getText().equals("") && !exam4.getText().equals("") && !exam5.getText().equals("")
                && !exam6.getText().equals("") && !exam7.getText().equals("") && exam8.getText().equals("")) {
            deplacerEx1(tab, exam8);
            exit8.setVisible(true);
            l8.setVisible(true);
        }
    }

    public void savehematologie(JLabel id, JTextField Examen, String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, id.getText());
            ps.setString(2, Examen.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
    //    ---------------------------------------------------------------------------------------------------------------------------------

    public void SaveExamen(JLabel id, JTextField Examen, JTextField Apropos, String requete) {
        try {

            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, id.getText());
            ps.setString(2, Examen.getText());
            ps.setString(3, Apropos.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Enregistré");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }

    }
//    public int Charger(JComboBox co, String table, String col) {
//        int idagent = 0;
//        try {
//            
//            ps = Connexion.con().prepareStatement("select " + col + " from " + table + " where NOM='" + co.getSelectedItem().toString() + "'");
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                idagent = rs.getInt(col);
//            }
//        } catch (SQLException e) {
//        }
//        return idagent;
//    }

    public int Chargerid(JComboBox co, String table, String col) {
        int idagent = 0;
        try {

            ps = Connexion.con().prepareStatement("select " + col + " from " + table + " where [NOM]='" + co.getSelectedItem().toString() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                idagent = rs.getInt(col);
            }
        } catch (SQLException e) {
        }
        return idagent;
    }

    public void Chargernom(JComboBox co, String table, String pri, JLabel a) {

        try {

            ps = Connexion.con().prepareStatement("select " + pri + " from " + table + " where Libele='" + co.getSelectedItem().toString() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                a.setText(rs.getString(pri));
            }
        } catch (SQLException e) {
        }
        //return 0;
    }

    public void TableCharg(final JTable d, String sql) {

        Thread tr = new Thread() {
            @Override
            public void run() {

                try {
                    for (;;) {
                        Thread.sleep(4000);
                        ps = Connexion.con().prepareStatement("select " + sql + "");
                        // ps=Connexion.con().prepareStatement("select ID ,NOM,NOM_AGENT AS [NOM DU MEDECIN], EXA1 AS EXAMEN,EXA2 AS [EXAMEN 2],EXA3 AS [EXAMEN 3], EXA4 AS [EXAMEN 4],EXA5 AS [EXAMEN 5],EXA6 AS [EXAMEN 6],EXA7 AS [EXAMEN 7],EXA8 AS [EXAMEN 8] FROM PARACLINIQUE ORDER BY ID DESC");
                        //ps = conn().prepareStatement("select * from  imagerie  order by id desc");
                        rs = ps.executeQuery();
                        d.setModel(DbUtils.resultSetToTableModel(rs));
                    }

                } catch (InterruptedException | SQLException e) {
                }
            }

        };
        tr.start();
    }

//    public void savedMenu(JTextField menu, JTextField prix) {
//        try {
//            ps = Connexion.con().prepareCall("exec pro_finance ?,?");
//            ps.setString(1, menu.getText());
//            ps.setString(2, prix.getText());
//            ps.execute();
//            JOptionPane.showMessageDialog(null, "Ajout menu avec succes");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erreure" + ex.getMessage());
//
//        }
//    }
    public byte image[] = null;
    public static String p;

    public void photoimagerie(JLabel photos, JLabel chemin) {
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File f = fc.getSelectedFile();
            p = f.getAbsolutePath();
            chemin.setText(p);
            ImageIcon k = new ImageIcon(p);
            Rectangle re = photos.getBounds();
            Image i = k.getImage().getScaledInstance(re.width, re.height, Image.SCALE_DEFAULT);
            k = new ImageIcon(i);
            photos.setIcon(k);
        } catch (HeadlessException v) {
            System.out.println(v.getMessage());
        }
        try {
            File t = new File(p);
            FileInputStream v = new FileInputStream(t);
            ByteArrayOutputStream o = new ByteArrayOutputStream();
            byte[] x = new byte[1024];
            for (int d; (d = v.read(x)) != -1;) {
                o.write(x, 0, d);
            }
            image = o.toByteArray();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ImageIcon returnphoto(String a, byte[] d, JLabel r) {
        ImageIcon img = null;
        if (a != null) {
            img = new ImageIcon(a);
        } else {
            img = new ImageIcon(d);
        }
        Image im = img.getImage().getScaledInstance(r.getHeight(), r.getWidth(), Image.SCALE_SMOOTH);
        img = new ImageIcon(im);
        return img;
    }

    public void pharmacie(JLabel id, JTextField Nom_produit, JTextField txtprovenanance,
            JTextField txtreference, JTextField txtEntree, JTextField prix, JTextField txtNLot, JDateChooser date,
            JDateChooser Date_peremption, JTextField txtDossage, JTextField forme, JTextField con) {
        try {
            ps = Connexion.con().prepareCall("exec sp_pharmacie ?,?,?,?,?,?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, Nom_produit.getText());
            ps.setString(3, txtprovenanance.getText());
            ps.setString(4, txtreference.getText());
            ps.setString(5, txtEntree.getText());
            ps.setString(6, prix.getText());
            ps.setString(7, txtNLot.getText());
            ps.setString(8, ((JTextField) date.getDateEditor().getUiComponent()).getText());
            ps.setString(9, ((JTextField) Date_peremption.getDateEditor().getUiComponent()).getText());
            ps.setString(10, txtDossage.getText());
            ps.setString(11, forme.getText());
            ps.setString(12, con.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Produit enregistrer");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'insertion" + e.getMessage());
        }
    }

    public void saveImagerie(JLabel id, int nompers, JLabel Agent,
            JLabel exam1, JLabel exam2, JLabel exam3, JLabel exam4, JLabel exam5, JLabel exam6,
            JLabel exam7, JLabel exam8, String requete) {
        try {
            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, id.getText());
            ps.setInt(2, nompers);
            ps.setString(3, Agent.getText());
            ps.setString(4, exam1.getText());
            ps.setString(5, exam2.getText());
            ps.setString(6, exam3.getText());
            ps.setString(7, exam4.getText());
            ps.setString(8, exam5.getText());
            ps.setString(9, exam6.getText());
            ps.setString(10, exam7.getText());
            ps.setString(11, exam8.getText());
            ps.execute();
            //JOptionPane.showMessageDialog(null, "Resultat Imagerie envoyé");
            JOptionPane.showMessageDialog(null, "Examen Envoyer a l'imagerie");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }
    }

    public void LaboResult(JLabel id, String idp, JLabel Agent, JTextArea Resultat) {
        try {
            ps = Connexion.con().prepareCall("exec  SP_RESULTAT ?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, idp);
            ps.setString(3, Agent.getText());
            ps.setString(4, Resultat.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Resultat Enregistré");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e);
        }
    }

    public String chargernom(JLabel nom, String col, String table) {
        String nomp = "";
        try {

            ps = Connexion.con().prepareStatement("select " + col + " from " + table + " where id='" + nom.getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                nomp = rs.getString(col);
            }
        } catch (SQLException e) {
        }
        return nomp;
    }

    public void deplacerlabo(JTable t, JLabel nom, JLabel demande, JLabel ex1, JLabel ex2) {

        try {
            int i = t.getSelectedRow();
            String u = t.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from PARACLINIQUE WHERE ID='" + u + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                nom.setText(rs.getString(11));
                demande.setText(rs.getString(2));
                ex1.setText(rs.getString(3));
                ex2.setText(rs.getString(4));
                //text.setText(rs.getString(u));
            }
        } catch (SQLException e) {
        }
    }

    public void resultatimagerie(JLabel id, int idc, JTextField rx, JTextField standard, JTextField autre, JTextField echo,
            JTextField imprime, JTextField ees, JTextField ecg, JTextField irm, JTextField medicament, JTextField enduscopie,
            JTextField speciaise, JLabel admin, String requete) {
        try {
            ps = Connexion.con().prepareCall(requete);
            ps.setString(1, id.getText());
            ps.setInt(2, idc);
            ps.setString(3, rx.getText());
            ps.setString(4, standard.getText());
            ps.setString(5, autre.getText());
            ps.setString(6, echo.getText());
            ps.setString(7, imprime.getText());
            ps.setString(8, ees.getText());
            ps.setString(9, ecg.getText());
            ps.setString(10, irm.getText());
            ps.setString(11, medicament.getText());
            ps.setString(12, enduscopie.getText());
            ps.setString(13, speciaise.getText());
            ps.setBytes(14, image);
            ps.setString(15, admin.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Imagerie executé");
        } catch (SQLException e) {
        }
    }

    public void AllReseach(JTable table, String data) {
        try {
            ps = Connexion.con().prepareStatement(data);
            rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de faire la recherche" + e.getMessage());
        }
    }

    public void AllDelete(String table, String id, JLabel id1) {
        try {
            ps = Connexion.con().prepareStatement("delete from " + table + " where " + id + "=?");
            ps.setString(1, id1.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Suppression reussi");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de suppression" + e.getMessage());
        }
    }

    public void Backup() {
        try {
            ps = Connexion.con().prepareStatement("backup database medical to disk='E:\\Backups\\medicale.bak'");
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'effectuer le Backup !!!" + e.getMessage());
        }
    }

    public void retourInfos(JLabel idracin, JLabel agent,
            JLabel exa1, JLabel exa2, JLabel exa3,
            JLabel exa4, JLabel exa5, JLabel exa6,
            JLabel exa7, JLabel exa8, JTable ta) {
        try {
            int i = ta.getSelectedRow();
            String h = ta.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from imagerie where ID='" + h + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                idracin.setText(rs.getString(1));
                //codep.setText(rs.getString(2));
                agent.setText(rs.getString(3));
                exa1.setText(rs.getString(4));
                exa2.setText(rs.getString(5));
                exa3.setText(rs.getString(6));
                exa4.setText(rs.getString(7));
                exa5.setText(rs.getString(8));
                exa6.setText(rs.getString(9));
                exa7.setText(rs.getString(10));
                exa8.setText(rs.getString(11));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de faire retour" + e.getMessage());
        }
    }

    public void selectionApro(JLabel id, JTextField nomp, JTextField provenance,
            JTextField refere,
            JTextField quatite, JTextField pu, JTextField nlot,
            JDateChooser dateentrer, JDateChooser prece, JTextField dosage,
            JTextField forme, JTextField condition, JTable ta) {
        try {
            int i = ta.getSelectedRow();
            String u = ta.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from PHARMACIE where ID='" + u + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                nomp.setText(rs.getString(2));
                provenance.setText(rs.getString(3));
                refere.setText(rs.getString(4));
                quatite.setText(rs.getString(5));
                pu.setText(rs.getString(6));
                nlot.setText(rs.getString(7));
                ((JTextField) dateentrer.getDateEditor().getUiComponent()).setText(rs.getString(8));
                ((JTextField) prece.getDateEditor().getUiComponent()).setText(rs.getString(9));
                dosage.setText(rs.getString(10));
                forme.setText(rs.getString(11));
                condition.setText(rs.getString(12));

            }
        } catch (SQLException e) {
        }
    }

    public void upgradeappro(JTextField qua, JLabel id) {
        try {
            ps = Connexion.con().prepareStatement("exec [sp_approvisionnement] ?,?");
            ps.setString(1, qua.getText());
            ps.setString(2, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La quantité de ce produit est approvisionnée !!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de faire l'aprovisionnement " + e.getMessage());
        }
    }

    public void vente(JTextField qua, JLabel id) {
        try {
            ps = Connexion.con().prepareStatement("exec [sp_vente] ?,?");
            ps.setString(1, qua.getText());
            ps.setString(2, id.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La vente est effectuée !!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de faire l'aprovisionnement " + e.getMessage());
        }
    }

    public void selectionstock(JLabel id, JLabel nomp, JLabel quant,
            JLabel refence, JLabel prece,
            JLabel dosage, JLabel pu, JTable ta) {
        try {
            int o = ta.getSelectedRow();
            String h = ta.getModel().getValueAt(o, 0).toString();
            ps = Connexion.con().prepareStatement("select * from PHARMACIE where ID='" + h + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString("ID"));
                nomp.setText(rs.getString("NOM_PRODUIT"));
                quant.setText(rs.getString("QUANTITE"));
                refence.setText(rs.getString("REFFERENCES"));
                prece.setText(rs.getString("DATE_PRESOMPTION"));
                dosage.setText(rs.getString("DOSAGE"));
                pu.setText(rs.getString("PRIX"));
            }
        } catch (SQLException e) {
        }
    }

    public void testCalcul(JTextField quatitre, JLabel pu, JLabel to, JLabel enstock, JTextField d) {
        try {
            float qu = Float.parseFloat(quatitre.getText());
            float p = Float.parseFloat(pu.getText());
            float st = Float.parseFloat(enstock.getText());
            float d2 = Float.parseFloat(d.getText());
            if (qu > st) {
                JOptionPane.showMessageDialog(null, "La quantité entrée ne doit pas être superieure au stock !!");
                quatitre.setText("");
            } else {
                float re = qu * p * d2;
                to.setText("" + re);
            }

        } catch (NumberFormatException e) {
        }
    }

    public void insertvente(JLabel id, JTextField quante, JLabel pu, JLabel total,
            JDateChooser date, int perso, JLabel idp) {
        try {
            ps = Connexion.con().prepareStatement("exec sp_ventecool ?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, quante.getText());
            ps.setString(3, pu.getText());
            ps.setString(4, total.getText());
            ps.setString(5, ((JTextField) date.getDateEditor().getUiComponent()).getText());
            ps.setInt(6, perso);
            ps.setString(7, idp.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "La vente bien faite !!!");
//            quante.setText("");
//            pu.setText("");
//            total.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de faire la vente !!!" + e.getMessage());
        }
    }

    public ImageIcon retour(String b, byte[] im, JLabel phot) {
        ImageIcon ima = null;
        try {

            if (b != null) {
                ima = new ImageIcon(b);
            } else {
                ima = new ImageIcon(im);
            }
            Image i = ima.getImage().getScaledInstance(phot.getWidth(), phot.getHeight(), Image.SCALE_SMOOTH);
            new ImageIcon(i);
        } catch (Exception e) {
        }
        return ima;
    }

    public void savedOrdonace(JLabel id, JTextArea ordonance, JLabel agent, int code, String mess, String msgerr) {
        try {
            ps = Connexion.con().prepareCall("exec sp_ordonnance ?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, ordonance.getText());
            ps.setString(3, agent.getText());
            ps.setInt(4, code);
            ps.execute();
            JOptionPane.showMessageDialog(null, mess);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, msgerr + ex.getMessage());

        }
    }

    public void deplacerOrd(JTable f, JLabel id, JTextArea a, JComboBox per) {
        try {
            int i = f.getSelectedRow();
            String y = f.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from v_ordon where ID = '" + y + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                per.setSelectedItem(rs.getString(2));
                a.setText(rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Syncroniser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deplacerImage(JTable f, JLabel id, JLabel tof) {
        try {
            int i = f.getSelectedRow();
            String y = f.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from imagerieresultat where ID = '" + y + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                tof.setIcon(retour(null, rs.getBytes("photo"), tof));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Syncroniser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void paraclinique(JLabel id, JLabel Agent, JLabel Exam1, JLabel Exam2, JLabel Exam3,
            JLabel Exam4, JLabel Exam5, JLabel Exam6, JLabel Exam7, JLabel Exam8, int code) {
        try {
            ps = Connexion.con().prepareCall("exec sp_paraclinique ?,?,?,?,?,?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, Agent.getText());
            ps.setString(3, Exam1.getText());
            ps.setString(4, Exam2.getText());
            ps.setString(5, Exam3.getText());
            ps.setString(6, Exam4.getText());
            ps.setString(7, Exam5.getText());
            ps.setString(8, Exam6.getText());
            ps.setString(9, Exam7.getText());
            ps.setString(10, Exam8.getText());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Examen Paraclinique Enreigistré");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur" + e.getMessage());
        }
    }

    public void Changer(JLabel g) {
        g.setBackground(new java.awt.Color(42, 56, 92));
    }

    public void ChargerCo(JComboBox co, String table, String col, String id) {
        try {
            ps = Connexion.con().prepareStatement("SELECT NOM FROM IDENTITE ORDER BY ID DESC");
            rs = ps.executeQuery();
            while (rs.next()) {
                co.addItem(rs.getString("NOM"));
            }
        } catch (SQLException e) {
        }
    }

    public void Recherchecombo(JComboBox n, String table, String col, JTextField d) {
        try {

            ps = Connexion.con().prepareStatement("select NOM from " + table + " where  " + col + " like '%" + d.getText() + "%' OR NOM LIKE '%" + d.getText() + "%'");
            rs = ps.executeQuery();
            n.setSelectedItem(DbUtils.resultSetToNestedList(rs));
            if (n.getItemAt(1).equals(true)) {
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void deplacerSuivi(JTable tab, JLabel id) {

        try {
            int i = tab.getSelectedRow();
            String y = tab.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from identite where ID = '" + y + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Syncroniser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void RechercherSuivie(JTable n, String table, String col, JTextField f) {
        try {

            ps = Connexion.con().prepareStatement("select * from " + table + " where  " + col + " like '%" + f.getText()
                    + "%' or NOM LIKE '%" + f.getText() + "%'");
            rs = ps.executeQuery();
            n.setModel(DbUtils.resultSetToTableModel(rs));
            if (n.getRowCount() == 0) {
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }
    }

    public void ExitChanger(JLabel g) {
        g.setBackground(new java.awt.Color(255, 255, 255));
    }

    public String ChargerNomAgent(JComboBox co, String table, String col) {
        String idagent = "";
        try {

            ps = Connexion.con().prepareStatement("select " + col + " from " + table + " where NOM='" + co.getSelectedItem().toString() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                idagent = rs.getString(col);
            }
        } catch (SQLException e) {
        }
        return idagent;
    }

    public void ChargermentTable(JTable s, String table, String col) {
        try {
            ps = Connexion.con().prepareStatement("select * from  " + table + " order by " + col + " desc");
            rs = ps.executeQuery();
            s.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur de chargement " + ex.getMessage());
        }
    }

    public void enregistrementSuiVi(int idp, String nom, JTextArea observArea, JTextArea traitement, JLabel Agent, JLabel exam1, JLabel exam2,
            JLabel exam3, JLabel exam4, JLabel exam5, JLabel exam6, JLabel exam7, JLabel exam8, JTextField NumOrdre) {
        try {
            ps = Connexion.con().prepareCall("exec PROFICHE ?,?,?,?,?,?,?,?,?,?,?,?,?,?");
            ps.setInt(1, idp);
            ps.setString(2, nom);
            ps.setString(3, observArea.getText());
            ps.setString(4, traitement.getText());
            ps.setString(5, Agent.getText());
            ps.setString(6, exam1.getText()); 
            ps.setString(7, exam2.getText());
            ps.setString(8, exam3.getText());
            ps.setString(9, exam4.getText());
            ps.setString(10, exam5.getText());
            ps.setString(11, exam6.getText());
            ps.setString(12, exam7.getText());
            ps.setString(13, exam8.getText());
            ps.setString(14, exam8.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Enregistrement reussi");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Erreur d'enregistrement" + e);
        }
    }

    public void RapportTot(String table, String col, String date, JLabel h, JDateChooser dat, JDateChooser dat2) {

        try {
            ps = Connexion.con().prepareStatement("select isnull(sum(" + col + "),0) as TOTAL from " + table + " where " + date + " between '" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "' AND '" + ((JTextField) dat2.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setText(rs.getString("TOTAL"));

            }
        } catch (SQLException e) {
        }
    }

    public void RapportLibelle(String table, String col, String date, JLabel h, JDateChooser dat, JDateChooser dat2, String libel) {

        try {
            ps = Connexion.con().prepareStatement("select isnull(sum(" + col + "),0) as TOTAL from " + table + " where libelle='" + libel + "' and " + date + " between '" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "' AND '" + ((JTextField) dat2.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setText(rs.getString("TOTAL"));

            }
        } catch (SQLException e) {
        }
    }
    public static JTable tab;

    public void testLogin(JTextField user, JPasswordField pass) {
        try {
            ps = Connexion.con().prepareStatement("select users.FONCTION as FONCTION,users.USERNAME,users.PASSWORDS,agent.PRENOM+' '+agent.NOM as NOM,photo as tof from users inner join agent on users.ID_AGENT=agent.ID WHERE users.USERNAME='" + user.getText() + "' and users.PASSWORDS='" + pass.getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                if ("admin".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Login().hide();
                    new Gui.Home().show();
                    Home.admin1.setText(rs.getString("NOM"));
//                    Home.tof.setIcon(retour(null, rs.getBytes("tof"), Home.tof));
                } else if ("FINANCE".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Gui.Home().show();
                    new Login().hide();
                    Home.jLabel7.setVisible(false);
                    Home.consult.setVisible(false);
                    Home.jLabel8.setVisible(false);
                    Home.jLabel9.setVisible(false);
                    Home.imagerie.setVisible(false);
                    Home.jLabel13.setVisible(false);
                    Home.jLabel6.setVisible(false);
                    Home.admin1.setText(rs.getString("NOM"));
//                    Home.tof.setIcon(retour(null, rs.getBytes("tof"), Home.tof));
                } else if ("PHARMACIE".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Gui.Home().show();
                    new Login().hide();
                    Home.jLabel7.setVisible(false);
                    Home.consult.setVisible(false);
                    Home.jLabel8.setVisible(false);
                    Home.jLabel9.setVisible(true);
                    Home.imagerie.setVisible(false);
                    Home.jLabel13.setVisible(false);
                    Home.jLabel6.setVisible(false);
                    Home.jLabel12.setVisible(false);
                    Home.admin1.setText(rs.getString("NOM"));
                    // Home.tof.setIcon(retour(null, rs.getBytes("tof"), Home.tof));
                } else if ("MEDECIN".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Gui.Home().show();
                    new Login().hide();
                    Home.jLabel7.setVisible(false);
                    //Home.jLabel23.setVisible(false);
                    Home.jLabel8.setVisible(false);
                    Home.jLabel9.setVisible(false);
                    Home.imagerie.setVisible(false);
                    Home.jLabel13.setVisible(false);
                    Home.jLabel6.setVisible(false);
                    Home.jLabel12.setVisible(true);
                    Home.admin1.setText(rs.getString("NOM"));
//                    Home.tof.setIcon(retour(null, rs.getBytes("tof"), Home.tof));
                } else if ("TECHNICIEN IMAGERIE".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Gui.Home().show();
                    new Login().hide();
                    Home.jLabel7.setVisible(false);
                    Home.consult.setVisible(false);
                    Home.jLabel8.setVisible(false);
                    Home.jLabel9.setVisible(false);
                    //Home.imagerie.setVisible(false);
                    Home.jLabel13.setVisible(false);
                    Home.jLabel6.setVisible(false);
                    Home.jLabel12.setVisible(true);
                    Home.admin1.setText(rs.getString("NOM"));
                } else if ("TECHNICIEN LABO".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Gui.Home().show();
                    new Login().hide();
                    Home.jLabel7.setVisible(false);
                    Home.consult.setVisible(false);
                    Home.jLabel8.setVisible(false);
                    Home.jLabel9.setVisible(false);
                    Home.imagerie.setVisible(false);
//                    Home.jLabel13.setVisible(false);
                    Home.jLabel6.setVisible(false);
                    Home.jLabel12.setVisible(true);
                    Home.admin1.setText(rs.getString("NOM"));
                } else if ("RECEPTIONNISTE".equalsIgnoreCase(rs.getString("FONCTION"))) {
                    new Gui.Home().show();
                    new Login().hide();
//                    Home.jLabel7.setVisible(false);
                    Home.consult.setVisible(false);
                    Home.jLabel8.setVisible(false);
                    Home.jLabel9.setVisible(false);
                    Home.imagerie.setVisible(false);
                    Home.jLabel13.setVisible(false);
                    Home.jLabel6.setVisible(false);
                    Home.jLabel12.setVisible(true);
                    Home.admin1.setText(rs.getString("NOM"));
                }

            } else {
                JOptionPane.showMessageDialog(null, "Mot de passe oublié");
                user.setText("");
                pass.setText("");
                new Login().show();
            }
        } catch (SQLException e) {
        } finally {
            try {
                con().close();
            } catch (Exception e) {
            }
        }

    }

    public void EtatSortie(String querry, String nomEtAT) throws SQLException {
        try {
            //_conn = DriverManager.getConnection(url, user, pass);
            JasperDesign jd = JRXmlLoader.load("./" + nomEtAT + ".jrxml");
            String sql = querry;
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con());
            JasperViewer.viewReport(jp, false);
            //  Waiting.setAlwaysOnTop(false);
            //   Waiting.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con().close();
        }
    }

    public void agent(JLabel id, JTextField Nom, JTextField post,
            JTextField prenom, JComboBox sexe, JComboBox Etatc, JTextField Etudefaites, JDateChooser dat, JTextField adres, JTextField tel, JComboBox niv, JTextField spec, JTextField foct, String mess, byte[] img) {
        try {
            if (img == null) {

            } else {
                ps = Connexion.con().prepareCall("exec sp_agent ?,?,?,?,?,?,?,?,?,?,?,?,?,?");
                ps.setString(1, id.getText());
                ps.setString(2, Nom.getText());
                ps.setString(3, post.getText());
                ps.setString(4, prenom.getText());
                ps.setString(5, sexe.getSelectedItem().toString());
                ps.setString(6, Etatc.getSelectedItem().toString());
                ps.setString(7, Etudefaites.getText());
                ps.setString(8, ((JTextField) dat.getDateEditor().getUiComponent()).getText());
                ps.setString(9, adres.getText());
                ps.setString(10, tel.getText());
                ps.setString(11, niv.getSelectedItem().toString());
                ps.setString(12, spec.getText());
                ps.setString(13, foct.getText());
                ps.setBytes(14, img);
                ps.execute();
                // initialisation agent
                Nom.setText("");
                post.setText("");
                prenom.setText("");
                sexe.setSelectedItem("");
                ((JTextField) dat.getDateEditor().getUiComponent()).setText("");
                Etatc.setSelectedItem("");
                Etudefaites.setText("");
                adres.setText("");
                tel.setText("");
                niv.setSelectedItem("");
                spec.setText("");
                foct.setText("");
                JOptionPane.showMessageDialog(null, mess);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Echec de sauvegarde" + e.getMessage());
        } finally {
            try {
                ps.close();
                con().close();
            } catch (Exception e) {
            }
        }
    }

    public void deplaceragent(JTable t, JLabel id, JTextField Nom, JTextField post, JTextField prenom, JComboBox sexe, JComboBox Etatc, JTextField Etudefaites, JDateChooser dat, JTextField adres, JTextField tel, JComboBox niv, JTextField spec, JTextField foct, JLabel tof) {
        try {
            int i = t.getSelectedRow();
            String a = t.getModel().getValueAt(i, 0).toString();
            ps = Connexion.con().prepareStatement("select * from agent where id='" + a + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString(1));
                Nom.setText(rs.getString(2));
                post.setText(rs.getString(3));
                prenom.setText(rs.getString(4));
                sexe.setSelectedItem(rs.getString(5));
                Etatc.setSelectedItem(rs.getString(6));
                Etudefaites.setText(rs.getString(7));
                ((JTextField) dat.getDateEditor().getUiComponent()).setText(rs.getString(8));
                adres.setText(rs.getString(9));
                tel.setText(rs.getString(10));
                niv.setSelectedItem(rs.getString(11));
                spec.setText(rs.getString(12));
                foct.setText(rs.getString(13));
                tof.setIcon(returnphoto(null, rs.getBytes(15), tof));
            }
        } catch (SQLException e) {
        }
    }

    public void saveobservation(JLabel id, int nom, JTextArea obs, String req) {
        try {
            ps = Connexion.con().prepareCall(req);
            ps.setString(1, id.getText());
            ps.setInt(2, nom);
            ps.setString(3, obs.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bien enregistré");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'enregistrement" + e);
        }
    }

    public void users(JLabel id, JTextField users, JTextField pass, JComboBox fonction, int agent, String sql) {
        try {
            ps = Connexion.con().prepareCall(sql);
            ps.setString(1, id.getText());
            ps.setString(2, users.getText());
            ps.setString(3, pass.getText());
            ps.setString(4, fonction.getSelectedItem().toString());
            ps.setInt(5, agent);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Enregistrement effectué");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Enregistrement non effectué" + e);
        }
    }

    public void deplacer(JTable tab, JLabel id, JTextField users, JTextField pass, JComboBox fonction) {
        int i = tab.getSelectedRow();
        String k = tab.getModel().getValueAt(i, 0).toString();
        try {
            ps = Connexion.con().prepareStatement("select * from users where id_user='" + k + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString(1));
                users.setText(rs.getString(2));
                pass.setText(rs.getString(3));
                fonction.setSelectedItem(rs.getString(4));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }

    public int getCount(String req) {
        try {
            ps = Connexion.con().prepareStatement(req);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            ps.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return 0;
    }

    public void Statistique(JPanel p) {
        try {
            DefaultCategoryDataset d = new DefaultCategoryDataset();
            d.setValue(getCount("select count(*) from v_detail where [DATE CONSULTATION] = getdate()"), "Nombre de personnes consultés", "Consultation journalière");
            d.setValue(getCount("select count(*) from PHARMACIE"), "Produits en stock", "Produits");
            d.setValue(getCount("select count(*) from agent"), "Agents identifiés", "Agents");
            d.setValue(getCount("select count(*) from IDENTITE"), "Nombre des patients frequentés ", "Patients");
            d.setValue(getCount("select count(*) from Examen"), "Nombre d'examens consultés", "Examen");
            d.setValue(getCount("select count(*) from Resultat"), "Nombre des resultats trouvés  ", "Résultat");
            JFreeChart jchart = ChartFactory.createAreaChart("", "", "", d, PlotOrientation.VERTICAL, true, true, false);
            CategoryPlot plot = jchart.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.black);
            ChartPanel charpanel = new ChartPanel(jchart);
            p.removeAll();
            p.add(charpanel);
            charpanel.updateUI();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void totpanier(JLabel t, String col, String table) {
        try {
            ps = Connexion.con().prepareStatement("select ISNULL(SUM(" + col + "),0) as tot from " + table + "");
            rs = ps.executeQuery();
            while (rs.next()) {
                t.setText(rs.getString("tot"));
            }
        } catch (SQLException e) {
        }
    }

    public void retourpanier(JTable t, JLabel idpers, JLabel idprod, String table, String col, int r, int l) {
        int s = t.getSelectedRow();
        String k = t.getModel().getValueAt(s, 0).toString();
        try {
            ps = con().prepareStatement("select * from " + table + " where " + col + " ='" + k + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                idpers.setText(rs.getString(r));
                idprod.setText(rs.getString(l));
            }
        } catch (SQLException e) {
        }
    }

    public void SaveTotal(JLabel id, JLabel idpro, JLabel total, JDateChooser date, JLabel idp) {
        try {
            ps = con().prepareCall("exec sp_totalachat ?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, idpro.getText());
            ps.setString(3, total.getText());
            ps.setString(4, ((JTextField) date.getDateEditor().getUiComponent()).getText());
            ps.setString(5, idp.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "saved");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        }
    }

    public void insertAchat(int idPersonne, JLabel id_produit, JDateChooser date, JTextField quantite, JLabel prix_unitaire) {
        if (id_produit.getText().isEmpty() || ((JTextField) date.getDateEditor().getUiComponent()).getText().isEmpty() || id_produit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuiller remplir tout les champs!!");
        } else {
            try {
                ps = con().prepareCall("exec sp_rapport_achat ?,?,?,?,?");
                ps.setString(1, quantite.getText());
                ps.setString(2, prix_unitaire.getText());
                ps.setString(3, ((JTextField) date.getDateEditor().getUiComponent()).getText());
                ps.setString(4, id_produit.getText());
                ps.setInt(5, idPersonne);
                ps.execute();
                // JOptionPane.showMessageDialog(null, "Achat effectué");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Non Achat effectué" + e.getMessage());
            }
        }
    }

    public void Charger(JTable t, String sql) {
        try {
            ps = con().prepareStatement(sql);
            rs = ps.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
        }

    }

    public void SommeVente(JLabel vente, JDateChooser dat1, JDateChooser dat2) {

        try {
            ps = con().prepareStatement("SELECT ISNULL(SUM(Total),0)as TOTAL FROM RAPPORT_ACHAT where [DATE D'ACHAT] between '" + ((JTextField) dat1.getDateEditor().getUiComponent()).getText() + "' and '" + ((JTextField) dat2.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                vente.setText(rs.getString("TOTAL"));
            }
        } catch (SQLException e) {
        }
    }

    public void Viderpanier() {
        try {
            ps = con().prepareStatement("exec sp_provider_panier");
            ps.execute();
//            JOptionPane.showMessageDialog(null, "Panier est vidé");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Panier n'est pas vidé" + ex);
        }
    }

    public void soustraire(JLabel debit, JLabel mont, JTextField rest) {

        float deb = Float.parseFloat(debit.getText());
        float montant = Float.parseFloat(mont.getText());
        rest.setText("" + (deb - montant));
    }

    public void calculfacture(JLabel res, JLabel t1, JLabel l1) {
        try {
            float a = Float.parseFloat(t1.getText());
            float b = Float.parseFloat(l1.getText());
            //float r=a*b;
            res.setText("" + (a * b));
        } catch (NumberFormatException e) {
        }
    }

    public void Sommemont(String table, JLabel h, JDateChooser dat, String col) {

        try {
            ps = Connexion.con().prepareStatement("SELECT ISNULL(SUM(montant),0)as TOTAL FROM " + table + " where " + col + "='" + ((JTextField) dat.getDateEditor().getUiComponent()).getText() + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                h.setText(rs.getString("TOTAL"));
            }
        } catch (SQLException e) {
        }
    }

    public void calcul(JLabel tot, JLabel nbr2, JLabel prix) {
        float i = Float.parseFloat(tot.getText());
        float j = Float.parseFloat(nbr2.getText());
        try {
            prix.setText("" + (i / j));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void OptenirEcriture(JTextField url, JLabel datab, JTextField user, JTextField pass) {
        ecrire(url.getText() + "/" + datab.getText().toUpperCase() + "/" + user.getText() + "/" + pass.getText().toLowerCase());
        url.setText("");
        user.setText("");
        pass.setText("");
    }
    String q1 = "";

    public String lireEcriture() {
        try {
            BufferedReader s1 = new BufferedReader(new FileReader("\\NetBeansProjects\\Medical\\src\\Fichier2\\Fichier.txt"));
            q1 = s1.readLine();
            s1.close();
        } catch (Exception d) {
        }
        return null;
    }

    public void lireClaire() {
        try {
            String[] w = q1.split("/");
            Connexion.url = w[0];
            Connexion.database = w[1];
            Connexion.user = w[2];
            if (w[3].contains("null")) {
                Connexion.pass = "";
            } else {
                Connexion.pass = w[3];
            }
        } catch (Exception n) {
            //JOptionPane.showMessageDialog(null, "Erreur d'ecrire"+n.getMessage());
        }
    }

    void ecrire(String fichier) {
        String q = "\\NetBeansProjects\\Medical\\src\\Fichier2\\Fichier.txt";
        try {
            FileWriter a1 = new FileWriter(q);
            BufferedWriter a2 = new BufferedWriter(a1);
            a2.write(fichier);
            a2.newLine();
            a2.close();
            JOptionPane.showMessageDialog(null, "Le serveur vient d'etre configuré");
        } catch (IOException ex) {
            Logger.getLogger(Syncroniser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void calcultotal(JLabel c1, JLabel c2, JLabel c3, JLabel c4, JLabel c5, JLabel c6, JLabel c7, JLabel tot) {
        float i = Float.parseFloat(c1.getText());
        float j = Float.parseFloat(c2.getText());
        float k = Float.parseFloat(c3.getText());
        float l = Float.parseFloat(c4.getText());
        float m = Float.parseFloat(c5.getText());
        float a = Float.parseFloat(c6.getText());
        float b = Float.parseFloat(c7.getText());
        try {
            tot.setText("" + (i + j + k + l + m + a + b));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }

    }

    public void paiementconsultation(JLabel id, int pat, String sql) {
        try {
            ps = con().prepareCall(sql);
            ps.setString(1, id.getText());
            ps.setInt(2, pat);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Enregistré avec succès");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'enregistrement" + e);
        }
    }

    public void savepaiment(JLabel id, JComboBox codep, JTextField motif, JTextField prix, String sql) {
        try {
            ps = con().prepareCall(sql);
            ps.setString(1, id.getText());
            ps.setString(2, codep.getSelectedItem().toString());
            ps.setString(3, motif.getText());
            ps.setString(4, prix.getText());
            ps.execute();
            id.setText("");
            motif.setText("");
            prix.setText("");
            JOptionPane.showMessageDialog(null, "Enregistré avec succès");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur d'enregistrement" + e);
        }
    }

    public void covertir(JTextField taux, JTextField fc, JLabel usd) {
        try {
            float i = Float.parseFloat(taux.getText());
            float j = Float.parseFloat(fc.getText());

            if (taux.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Le taux de change ne peut pas être de 0");
                taux.setText("");
            } else {
                if (taux.getText().isEmpty() || fc.getText().isEmpty()) {
                    usd.setText("");
                } else {
                    usd.setText("" + (j / i));
                }

            }
        } catch (Exception e) {
        }
    }

    public void reunitialiser(JTextField taux, JTextField fr, JLabel usd) {
        taux.setText("");
        fr.setText("");
        usd.setText("");
    }
}
