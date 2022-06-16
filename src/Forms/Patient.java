/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Syncronisation.Syncroniser;
import java.awt.Color;
import static Gui.Home.admin1;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author honore
 */
public class Patient extends javax.swing.JPanel {

    int end_day_of_month = 0;
    int vrai_valeur;
    int vrai_valeur1;
    /**
     * Creates new form Patient
     */
    Syncroniser sy = new Syncroniser();

    public Patient() {
        initComponents();
        id.setVisible(false);
        jPanel1.setBackground(new Color(54, 175, 231));
        jPanel2.setBackground(new Color(54, 175, 231));
        jPanel3.setBackground(new Color(54, 175, 231));
        sy.affichage(jTable1, "select * from v_identite");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        adresse = new javax.swing.JTextField();
        prov = new javax.swing.JComboBox<>();
        prenom = new javax.swing.JTextField();
        numfiche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        echo = new javax.swing.JTextField();
        mat = new javax.swing.JTextField();
        cpn = new javax.swing.JTextField();
        curatif = new javax.swing.JTextField();
        autre = new javax.swing.JTextField();
        jXSearchField2 = new org.jdesktop.swingx.JXSearchField();
        postnom = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        sexe = new javax.swing.JComboBox<>();
        telephone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Information sur le patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1150, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1170, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)), "IDENTIFICATION DE PATIENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 450, 30));

        prov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ZONED", "HORS ZONED", "AS" }));
        jPanel3.add(prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 450, 30));
        jPanel3.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 450, 30));
        jPanel3.add(numfiche, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 450, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Nom");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Prenom");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Sexe");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 40, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Date Naissance");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Telephone");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Adresse");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 90, 30));

        jLabel16.setForeground(new java.awt.Color(51, 0, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Modifié");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 170, 40));

        jLabel15.setForeground(new java.awt.Color(51, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Enregistré");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 170, 40));

        jLabel14.setForeground(new java.awt.Color(51, 0, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Supprimé");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 170, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Autres");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Cpn");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Echo");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Mat");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Curatif");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 90, 30));
        jPanel3.add(echo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 450, 30));
        jPanel3.add(mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 450, 30));
        jPanel3.add(cpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 450, 30));
        jPanel3.add(curatif, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 450, 30));
        jPanel3.add(autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 450, 30));

        jXSearchField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXSearchField2ActionPerformed(evt);
            }
        });
        jXSearchField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jXSearchField2KeyReleased(evt);
            }
        });
        jPanel3.add(jXSearchField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 340, 30));
        jPanel3.add(postnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 450, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setText("Postnom");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 30));
        jPanel3.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 450, 30));
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 20));

        jDateChooser1.setDateFormatString("yyyy-MM-dd"); // NOI18N
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 450, 30));

        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel3.add(sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 450, 30));

        telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telephoneKeyTyped(evt);
            }
        });
        jPanel3.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 450, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 153));
        jLabel18.setText("Num fiche");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1170, 300));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if (!(id.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Cette operation necessite la modification");
        } else {
            sy.insertionPatient(id, nom, postnom, sexe, jDateChooser1, adresse, admin1, curatif, mat, echo, cpn, prenom, autre, numfiche, prov, telephone, "EXEC sp_identite ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?", "Patient Identifié", "Erreur d'insertion");
            sy.affichage(jTable1, "select * from v_identite");
        }

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if (!(id.getText().isEmpty())) {
            if (JOptionPane.showConfirmDialog(null, "Voulez-vous modifier ?", " ", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            sy.insertionPatient(id, nom, postnom, sexe, jDateChooser1, adresse, admin1, curatif, mat, echo, cpn, prenom, autre, numfiche, prov, telephone, "EXEC sp_identite ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?", " Modification éffectuée avec succès", "Erreur de modification");
        sy.affichage(jTable1, "select * from v_identite");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Il vous d'abord insérer avant de modifier les informations");
        }
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        sy.SelectionPatient(jTable1, nom, postnom, prov, jDateChooser1, adresse, curatif, mat, echo, cpn, autre, numfiche, id, numfiche, prenom, prov,telephone);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if (!(id.getText().isEmpty())){
             if (JOptionPane.showConfirmDialog(null, "Voulez-vous supprimé ?", " ", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                 sy.AllDelete("v_identite", "ID", id);
                 sy.affichage(jTable1, "select * from v_identite");
                 id.setText("");
                 nom.setText("");
                 postnom.setText("");
                 prenom.setText("");
                 numfiche.setText("");
                 adresse.setText("");
                 curatif.setText("");
                 mat.setText("");
                 echo.setText("");
                 cpn.setText("");
                 autre.setText("");
                 telephone.setText("");
                 ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
             }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner une personne à supprimer");
        }
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jXSearchField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXSearchField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXSearchField2ActionPerformed

    private void jXSearchField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXSearchField2KeyReleased
        sy.AllReseach(jTable1, "select * from v_identite where ID LIKE '%" + jXSearchField2.getText() + "%' or POSTNOM LIKE '%" + jXSearchField2.getText() + "%' OR NOM LIKE '%" + jXSearchField2.getText() + "%' OR PRENOM LIKE '%" + jXSearchField2.getText() + "%'");         // TODO add your handling code here:
    }//GEN-LAST:event_jXSearchField2KeyReleased

    private void telephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephoneKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_telephoneKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField autre;
    private javax.swing.JTextField cpn;
    private javax.swing.JTextField curatif;
    private javax.swing.JTextField echo;
    private javax.swing.JLabel id;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXSearchField jXSearchField2;
    private javax.swing.JTextField mat;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField numfiche;
    private javax.swing.JTextField postnom;
    private javax.swing.JTextField prenom;
    private javax.swing.JComboBox<String> prov;
    private javax.swing.JComboBox<String> sexe;
    private javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables
}
