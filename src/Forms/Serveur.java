/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gui.Login;
import static Gui.Login.jLabel5;
import Syncronisation.Syncroniser;
import java.awt.Color;

/**
 *
 * @author Soft developpers
 */
public class Serveur extends javax.swing.JPanel {

    /**
     * Creates new form Serveur
     */
    Syncroniser t = new Syncroniser();

    public Serveur() {
        initComponents();
        // this.setBackground(new Color(54, 175, 231));
        jLabel2.setBackground(new Color(54, 175, 231));
        m.setVisible(false);
         Login.retour.setVisible(true);
        jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        serveur = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONFIGURATION DU SERVEUR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        serveur.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 16)); // NOI18N
        serveur.setForeground(new java.awt.Color(0, 0, 153));
        serveur.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serveur.setText("Serveur name");
        serveur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serveurMouseClicked(evt);
            }
        });
        add(serveur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, 31));

        user.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 16)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 153));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setText("Username");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 260, 30));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Configurer");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LOGO1 copy.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 100));

        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("MEDICAL");
        add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 20));

        pass.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 9)); // NOI18N
        pass.setForeground(new java.awt.Color(0, 0, 153));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setText("jPasswordField1");
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        t.OptenirEcriture(serveur, m, user, pass);
        t.lireEcriture();
        t.lireClaire();


    }//GEN-LAST:event_jLabel2MouseClicked

    private void serveurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serveurMouseClicked
        serveur.setText("");
    }//GEN-LAST:event_serveurMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
       user.setText("");
    }//GEN-LAST:event_userMouseClicked

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
       pass.setText("");
    }//GEN-LAST:event_passMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel m;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField serveur;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
