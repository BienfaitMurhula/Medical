/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Syncronisation.Syncroniser;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Honore
 */
public class Agent extends javax.swing.JPanel {

    /**
     * Creates new form Agent
     */
    Syncroniser sy = new Syncroniser();
    
    public Agent() {
        initComponents();
        this.setBackground(new Color(54, 175, 231));
        sy.affichage(tagent, "select * from agent");
        chemin.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tagent = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        sexe = new javax.swing.JComboBox<>();
        fonction = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        eta = new javax.swing.JComboBox<>();
        etude = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        adresse = new javax.swing.JTextField();
        niveau = new javax.swing.JComboBox<>();
        specialite = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jXSearchField1 = new org.jdesktop.swingx.JXSearchField();
        jLabel1 = new javax.swing.JLabel();
        chemin = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Infirmations sur l'Agent", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tagent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tagent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tagentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tagent);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1100, 280));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enreigistrer");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Modifier");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Supprimer");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 140, 30));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("NOM");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 30));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("PRENOM");
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 120, 30));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText("POST NOM");
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        nom.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 320, 30));

        post.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        post.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });
        add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 320, 30));

        prenom.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        prenom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 320, 30));

        sexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        add(sexe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 320, 30));

        fonction.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fonction.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fonction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonctionActionPerformed(evt);
            }
        });
        add(fonction, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 320, 30));

        tel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });
        add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 320, 30));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 102));
        jLabel35.setText("TELEPHONE");
        add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, 120, 30));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 102));
        jLabel34.setText("FONCTION");
        add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setText("SEXE");
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));

        eta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Célibataire", "Marié(e)", "Autre" }));
        add(eta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 300, 30));

        etude.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etudeActionPerformed(evt);
            }
        });
        add(etude, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 300, 30));

        date.setDateFormatString("yyyy-MM-dd");
        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 300, 30));

        adresse.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        adresse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseActionPerformed(evt);
            }
        });
        add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 300, 30));

        niveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIPLOME D'ETAT", "GRADUE", "LICENCIE", "MASTER", "DOCTORAT" }));
        add(niveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 300, 30));

        specialite.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        specialite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        specialite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialiteActionPerformed(evt);
            }
        });
        add(specialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 300, 30));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 102));
        jLabel39.setText("SPECIALITE");
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 130, 30));

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 102));
        jLabel36.setText("NIVEAU D'ETUDE");
        add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, 30));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 102));
        jLabel38.setText("ADRESSE");
        jLabel38.setToolTipText("");
        add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 130, 30));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 102));
        jLabel37.setText("DATE DE NAISSANCE");
        add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 30));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 102));
        jLabel32.setText("ETUDE FAITE");
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 130, 30));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 102));
        jLabel33.setText("ETAT CIVIL");
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 130, 30));
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 10));
        add(jXSearchField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 300, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Male_User_100px_4.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 110, 110));
        add(chemin, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void tagentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagentMouseClicked
        sy.deplaceragent(tagent, id, nom, post, prenom, sexe, eta, etude, date, adresse, tel, niveau, specialite, fonction, jLabel1);
    }//GEN-LAST:event_tagentMouseClicked

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postActionPerformed

    private void fonctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_telKeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if (id.getText().isEmpty()) {
            sy.agent(id, nom, post, prenom, sexe, eta, etude, date, adresse, tel, niveau, specialite, fonction, "Enregistrement réussi avec succès", sy.image);
            sy.affichage(tagent, "select * from agent");
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez cliquer sur le bouton modification pour modifier svp !!");
        }

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        //en.Changer(jLabel12);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        //en.ExitChanger(jLabel12);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       if (!(id.getText().isEmpty())) {
            sy.agent(id, nom, post, prenom, sexe, eta, etude, date, adresse, tel, niveau, specialite, fonction, "Enregistrement réussi avec succès", sy.image);
            sy.affichage(tagent, "select * from agent");
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez cliquer sur le bouton modification pour modifier svp !!");
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        //en.Changer(jLabel14);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // en.ExitChanger(jLabel14);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if (!(id.getText().isEmpty())) {
             sy.AllDelete("agent", "id", id);
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner les elements à supprimer");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // en.Changer(jLabel15);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // en.ExitChanger(jLabel15);
    }//GEN-LAST:event_jLabel15MouseExited

    private void etudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etudeActionPerformed

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        
    }//GEN-LAST:event_datePropertyChange

    private void adresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseActionPerformed

    private void specialiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialiteActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        sy.photoimagerie(jLabel1, chemin);
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JLabel chemin;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> eta;
    private javax.swing.JTextField etude;
    private javax.swing.JTextField fonction;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXSearchField jXSearchField1;
    private javax.swing.JComboBox<String> niveau;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField post;
    private javax.swing.JTextField prenom;
    private javax.swing.JComboBox<String> sexe;
    private javax.swing.JTextField specialite;
    private javax.swing.JTable tagent;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}