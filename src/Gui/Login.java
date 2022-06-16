/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Forms.Acceuil;
import Forms.Serveur;
import Syncronisation.Syncroniser;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author honore
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Syncronisation.Syncroniser k = new Syncronisation.Syncroniser();

    public Login() {
        initComponents();
//        this.setIconImage(new ImageIcon(getClass().getResource("Rapport\\LOGO.png")).getImage());
        k.appelle(jPanel1, new Acceuil());
        this.setBackground(new Color(54, 175, 231));
        jLabel5.setBackground(new Color(54, 175, 231));
        jPanel2.setBackground(new Color(54, 175, 231));
        jPanel3.setBackground(new Color(54, 175, 231));
        coter();
        jLabel5.setVisible(true);
        retour1.setVisible(false);
    }
    Syncronisation.Syncroniser j = new Syncroniser();

    public void coter() {
        Thread g = new Thread() {
            public void run() {
                for (;;) {
                    try {
                        sleep(300);
                        j.lireEcriture();
                        j.lireClaire();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        g.start();
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
        jLabel5 = new javax.swing.JLabel();
        retour = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        retour1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 420, 230));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Configurer le serveur");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        retour.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        retour.setForeground(new java.awt.Color(255, 255, 255));
        retour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        retour.setText("Retour");
        retour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 420, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        retour1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        retour1.setForeground(new java.awt.Color(255, 255, 255));
        retour1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        retour1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Right1_30px.png"))); // NOI18N
        retour1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retour1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retour1MouseClicked(evt);
            }
        });
        jPanel3.add(retour1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 20));

        setSize(new java.awt.Dimension(421, 281));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
//        this.hide();
//        new Home().show();
    }//GEN-LAST:event_formMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        if (JOptionPane.showConfirmDialog(null, "Voulez-vous passer à la configuration du serveur ?", " ", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            String i = JOptionPane.showInputDialog("Entrer le mot de passe pour configurer le serveur");
            if ("5050".equals(i)) {
                k.appelle(jPanel1, new Serveur());
                JOptionPane.showMessageDialog(null, "Bravo", "", 1);
                retour1.setVisible(true);
                retour.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Vous n'avez pas l'accès au serveur \ncontacter votre Administrateur", "", 1);
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked
    private void retourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retourMouseClicked
        k.appelle(jPanel1, new Acceuil());
        jLabel5.setVisible(true);
        retour1.setVisible(false);
    }//GEN-LAST:event_retourMouseClicked

    private void retour1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retour1MouseClicked
         k.appelle(jPanel1, new Acceuil());
        jLabel5.setVisible(true);
        retour1.setVisible(false);
    }//GEN-LAST:event_retour1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel retour;
    public static javax.swing.JLabel retour1;
    // End of variables declaration//GEN-END:variables
}
