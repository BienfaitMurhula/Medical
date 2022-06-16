/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gui.VentePanier;
import Syncronisation.Syncroniser;
import java.awt.Color;

/**
 *
 * @author BIENFAIT
 */
public class Vente extends javax.swing.JPanel {

    /**
     * Creates new form Vente
     */
    Syncroniser sy = new Syncroniser();

    public Vente() {
        initComponents();
        jPanel3.setBackground(new Color(54, 175, 231));
        jPanel1.setBackground(new Color(54, 175, 231));
        jPanel2.setBackground(new Color(54, 175, 231));
        sy.affichage(pharmacie, "SELECT * FROM PHARMACIE");
        sy.chargementCombo("identite", "nom", combo1);
        id.setVisible(false);
        jLabel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        approv4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        qteVendu = new javax.swing.JTextField();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPu = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        dossage = new javax.swing.JLabel();
        txtproduit = new javax.swing.JLabel();
        txtQteEnStrock = new javax.swing.JLabel();
        txtReference = new javax.swing.JLabel();
        txtdexpiration = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        approv = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacie = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jXSearchField1 = new org.jdesktop.swingx.JXSearchField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Vente de produit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approv4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        approv4.setForeground(new java.awt.Color(0, 51, 102));
        approv4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approv4.setText("Executer la vente");
        approv4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        approv4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approv4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approv4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approv4MouseExited(evt);
            }
        });
        jPanel2.add(approv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "VENTE PRODUIT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 0, 102));
        jLabel21.setText("Qté a vendre:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 120, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 102));
        jLabel12.setText("Date de l'operation");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 0, 102));
        jLabel24.setText("Total:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 30));

        qteVendu.setBackground(new java.awt.Color(240, 240, 240));
        qteVendu.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        qteVendu.setForeground(new java.awt.Color(102, 102, 102));
        qteVendu.setText("Enter la quantite a ventre");
        qteVendu.setBorder(null);
        qteVendu.setOpaque(false);
        qteVendu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qteVenduMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                qteVenduMouseEntered(evt);
            }
        });
        qteVendu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qteVenduKeyReleased(evt);
            }
        });
        jPanel3.add(qteVendu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 75, 160, 30));

        jDateChooser5.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 160, 30));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 0, 102));
        jLabel27.setText("Prix de vente :");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, 10));
        jPanel3.add(txtPu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, 30));
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 370, 220));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "DETAIL PRODUIT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Nom du produit:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 102));
        jLabel16.setText("Date de peremption:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Dosage:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 102));
        jLabel18.setText("Quantité en Strock ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Reference");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 30));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 50, 20));
        jPanel1.add(dossage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, 30));
        jPanel1.add(txtproduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 220, 30));
        jPanel1.add(txtQteEnStrock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 220, 30));
        jPanel1.add(txtReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 220, 30));
        jPanel1.add(txtdexpiration, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 220, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 10));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 396, 220));

        approv.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        approv.setForeground(new java.awt.Color(0, 51, 102));
        approv.setText("Client:");
        approv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approvMouseClicked(evt);
            }
        });
        jPanel2.add(approv, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 44, -1));

        pharmacie.setModel(new javax.swing.table.DefaultTableModel(
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
        pharmacie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pharmacie);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1130, 170));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 36, -1));

        combo1.setEditable(true);
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel2.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 231, -1));

        jXSearchField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jXSearchField1KeyReleased(evt);
            }
        });
        jPanel2.add(jXSearchField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 360, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void approv4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approv4MouseClicked
        int i=sy.Chargerid(combo1, "identite", "id");
        sy.insertAchat(i, id, jDateChooser5, qteVendu, txtPu);
        sy.vente(qteVendu, id);
        sy.insertvente(jLabel1, qteVendu, txtPu, total, jDateChooser5, i, id);
        jTextField1.setText("");
        qteVendu.setText("");
        txtPu.setText("");
        total.setText("");
        sy.affichage(pharmacie, "SELECT * FROM PHARMACIE");
        
    
    }//GEN-LAST:event_approv4MouseClicked

    private void approv4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approv4MouseEntered
        //en.Changer(approv4);        // TODO add your handling code here:
    }//GEN-LAST:event_approv4MouseEntered

    private void approv4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approv4MouseExited
        //en.ExitChanger(approv4);        // TODO add your handling code here:
    }//GEN-LAST:event_approv4MouseExited

    private void qteVenduMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qteVenduMouseClicked
        qteVendu.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_qteVenduMouseClicked

    private void qteVenduKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qteVenduKeyReleased
        sy.testCalcul(qteVendu, txtPu, total, txtQteEnStrock, jTextField1);

//        Double Qte = 0.0;
//        Double PU = 0.0;
//        Qte = Double.parseDouble(qteVendu.getText());
//        PU = Double.parseDouble(txtPu.getText());
//        total.setText("" + Qte * PU);
        // TODO add your handling code here:
    }//GEN-LAST:event_qteVenduKeyReleased

    private void approvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvMouseClicked

        // en.Approv(txtprovenanance.getText(), txtreference.getText(),Double.parseDouble(txtEntree.getText()) , Double.parseDouble(prix.getText()), txtNLot.getText(), ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText(), ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText(), id.getText());
        //en.Modpharma("pharmacie","id",id.getText(),txtproduit.getText(), txtdesignation.getText(), txtprovenanance.getText(),
        //        txtreference.getText(), txtEntree.getText(),prix.getText(), txtNLot.getText(),
        //             ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText().toUpperCase(),
        //            ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().toUpperCase(),
        //            txtDossage.getText(), forme1.getText(),condition.getText());
        // en.ChargermentTable(pharmacie, "pharmacie", "id");// TODO add your handling code here:
    }//GEN-LAST:event_approvMouseClicked

    private void pharmacieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacieMouseClicked
        sy.selectionstock(id, txtproduit, txtQteEnStrock, txtReference, txtdexpiration,
                 dossage, txtPu, pharmacie);

//        qteVendu.setText("");
//        txtPu.setText("");
//        total.setText("");
//        en.deplacerpharmacieVente(pharmacie, id, txtproduit, txtQteEnStrock, txtReference, txtdexpiration, dossage, txtPu);         // TODO add your handling code here:
    }//GEN-LAST:event_pharmacieMouseClicked

    private void qteVenduMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qteVenduMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_qteVenduMouseEntered

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void jXSearchField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jXSearchField1KeyReleased
        sy.AllReseach(pharmacie, "select * from pharmacie where NOM_PRODUIT LIKE '%" + jXSearchField1.getText() + "%'");          // TODO add your handling code here:
    }//GEN-LAST:event_jXSearchField1KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        sy.testCalcul(qteVendu, txtPu, total, txtQteEnStrock, jTextField1);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approv;
    private javax.swing.JLabel approv4;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JLabel dossage;
    private javax.swing.JLabel id;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXSearchField jXSearchField1;
    private javax.swing.JTable pharmacie;
    private javax.swing.JTextField qteVendu;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txtPu;
    private javax.swing.JLabel txtQteEnStrock;
    private javax.swing.JLabel txtReference;
    private javax.swing.JLabel txtdexpiration;
    private javax.swing.JLabel txtproduit;
    // End of variables declaration//GEN-END:variables
}