/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;

/**
 *
 * @author Honore
 */
public class Pharmacie extends javax.swing.JPanel {

    public Pharmacie() {
        initComponents();
         jPanel3.setBackground(new Color(54, 175, 231));
        jPanel2.setBackground(new Color(54, 175, 231));
    }
    Syncronisation.Syncroniser sy = new Syncronisation.Syncroniser();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        approv5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Pharmacie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approv5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        approv5.setForeground(new java.awt.Color(51, 0, 204));
        approv5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approv5.setText("Voir mes commandes");
        approv5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        approv5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approv5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approv5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approv5MouseExited(evt);
            }
        });
        jPanel2.add(approv5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Stock");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Vente");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 170, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1150, 520));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        sy.appelle(jPanel3, new Produit());        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        sy.appelle(jPanel3,new Vente()); 
     
    }//GEN-LAST:event_jLabel17MouseClicked

    private void approv5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approv5MouseClicked
         sy.appelle(jPanel3,new Panier()); 
    }//GEN-LAST:event_approv5MouseClicked

    private void approv5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approv5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_approv5MouseEntered

    private void approv5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approv5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_approv5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approv5;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
