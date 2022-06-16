/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gui.Home;
import Syncronisation.Syncroniser;
import java.awt.Color;
import java.sql.SQLException;

/**
 *
 * @author Honore
 */
public class Ordonance extends javax.swing.JPanel {

    /**
     * Creates new form Ordonance
     */
    Syncroniser sy = new Syncroniser();

    public Ordonance() {
        initComponents();
        //jPanel3.setBackground(new Color(192, 192, 255));
        jPanel2.setBackground(new Color(54, 175, 231));
        sy.chargementdetail(codeper);
        //sy.chargementCombo("IDENTITE", "NOM", codeper);
        sy.affichage(table_ordonnance, "select * from v_ordon");
        nbre_de_fois.setVisible(false);
        fois.setVisible(false);
        nepasren.setVisible(false);
        id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        codeper = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordonnance = new javax.swing.JTextArea();
        nepasren = new javax.swing.JCheckBox();
        ren = new javax.swing.JCheckBox();
        nbre_de_fois = new javax.swing.JTextField();
        fois = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_ordonnance = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
        id = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Ordonance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codeper.setEditable(true);
        jPanel2.add(codeper, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 260, 30));

        ordonnance.setColumns(20);
        ordonnance.setRows(5);
        jScrollPane3.setViewportView(ordonnance);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 800, 280));

        buttonGroup1.add(nepasren);
        nepasren.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nepasren.setForeground(new java.awt.Color(0, 0, 204));
        nepasren.setText("Ne pas renouveler");
        nepasren.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        nepasren.setOpaque(false);
        nepasren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nepasrenMouseClicked(evt);
            }
        });
        jPanel2.add(nepasren, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        buttonGroup1.add(ren);
        ren.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ren.setForeground(new java.awt.Color(0, 0, 204));
        ren.setText("Renouveler");
        ren.setOpaque(false);
        ren.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                renMouseClicked(evt);
            }
        });
        jPanel2.add(ren, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        nbre_de_fois.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbre_de_fois.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(nbre_de_fois, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 44, 25));

        fois.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        fois.setForeground(new java.awt.Color(0, 0, 204));
        fois.setText("Fois ");
        jPanel2.add(fois, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 30, 22));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Imprimer");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 100, 40));

        table_ordonnance.setModel(new javax.swing.table.DefaultTableModel(
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
        table_ordonnance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ordonnanceMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table_ordonnance);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 428, 820, 140));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("NOM PATIENT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Modifier");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 40));
        jPanel2.add(jXSearchField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 370, 30));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 10));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Enregistrer");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        String c = "Ordonnance",
                req = "SELECT NOM,SEXE,AGE,PHYSIQUE.MENSURATION_POIDS,ORDONNANCE,RENOUVELER,NE_PAS_RENOUVELER,NOMBRE,ORDONNANCE.AGENT\n"
                + "FROM ORDONNANCE INNER JOIN IDENTITE\n"
                + "ON IDENTITE.ID=ORDONNANCE.PATIENT left JOIN PHYSIQUE\n"
                + "ON IDENTITE.ID=PHYSIQUE.CODE_PERS where ORDONNANCE.id='" + id.getText() + "'";
//        sy.imprimertest(id);
        try {
            sy.EtatSortie(req, c);
        } catch (SQLException e) {
        }


    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // t.Changer(jLabel13);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // t.ExitChanger(jLabel13);
    }//GEN-LAST:event_jLabel13MouseExited

    private void table_ordonnanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ordonnanceMouseClicked
        sy.deplacerOrd(table_ordonnance, id, ordonnance, codeper);
        // TODO add your handling code here:
    }//GEN-LAST:event_table_ordonnanceMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int id1 = sy.Chargerid(codeper, "identite", "id");
        sy.savedOrdonace(id, ordonnance, Home.admin1, id1, "Modification réussie avec succès", "Erreur de Modification");
        sy.affichage(table_ordonnance, "select * from v_ordon");
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        // t.Changer(jLabel18);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // t.ExitChanger(jLabel18);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        //sy.savedOrdonace(id, ordonnance, agen1, agen1, codeper);
        int id1 = sy.Chargerid(codeper, "identite", "id");
//        String rena = "";
//        String nepas = "";
//        if (ren.isSelected()) {
//            rena = "VRAI";
//
//        } else if (nepasren.isSelected()) {
//            nepas = "FAUX";
//
//        }
        sy.savedOrdonace(id, ordonnance, Home.admin1, id1, "Enregistrement réussi avec succès", "Erreur d'enregistrement");
        sy.affichage(table_ordonnance, "select * from v_ordon");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited

    private void nepasrenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nepasrenMouseClicked
        if (nepasren.isSelected()) {
            fois.setVisible(false);
            nbre_de_fois.setText("");
            nbre_de_fois.setVisible(false);
        }
    }//GEN-LAST:event_nepasrenMouseClicked

    private void renMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_renMouseClicked
        if (ren.isSelected()) {
            nbre_de_fois.setVisible(true);
            fois.setVisible(true);
        }
    }//GEN-LAST:event_renMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> codeper;
    private javax.swing.JLabel fois;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private org.jdesktop.swingx.JXSearchField jXSearchField1;
    private javax.swing.JTextField nbre_de_fois;
    private javax.swing.JCheckBox nepasren;
    private javax.swing.JTextArea ordonnance;
    private javax.swing.JCheckBox ren;
    private javax.swing.JTable table_ordonnance;
    // End of variables declaration//GEN-END:variables
}