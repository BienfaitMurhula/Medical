/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Syncronisation.Syncroniser;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author BIENFAIT
 */
public class AjoutExamen extends javax.swing.JDialog {

    /**
     * Creates new form AjoutExamen
     */
    Syncroniser sy = new Syncroniser();

    public AjoutExamen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        this.setBackground(new Color(54, 175, 231));
        exam.setBackground(new Color(54, 175, 231));
        this.setResizable(false);
        setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(54, 175, 231));
        
//        jPanel6.setBackground(new Color(54, 175, 231));
//        jPanel4.setBackground(new Color(54, 175, 231));
//        jPanel5.setBackground(new Color(54, 175, 231));
        
//        idExamen.setVisible(false);
        jPanel2.setBackground(new Color(192, 192, 255));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        exam = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aprops = new javax.swing.JTextField();
        examen = new javax.swing.JTextField();
        idExamen = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(54, 175, 231));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 175, 231));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Ajouter l'examen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        exam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                examMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(exam);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 710, 200));

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Apropos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nom Examen");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        aprops.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(aprops, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, 30));

        examen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(examen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, 30));

        idExamen.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        idExamen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(idExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 40, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Hematotogie");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
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
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 20, 90, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Sero Immunologie");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 204));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Lcr");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ionogramme");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 80, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Urologie");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 60, 30));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 204));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Parasitologie");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, 30));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 204));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Autres");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 70, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Biochimie");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 90, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 204));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Imagerie medicale");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 130, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 204));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Enregistrer");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 70, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 204));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Supprimer");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 80, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
         aprops.setVisible(true);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from autres");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans autres ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_autres ?,?");
                sy.affichage(exam, "select * from autres");
                 aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                 aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
         aprops.setVisible(false);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from PARASITOLOGIE");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans PARASITOLOGIE ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_parasitologie ?,?");
                sy.affichage(exam, "select * from PARASITOLOGIE");
                 aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                 aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
         aprops.setVisible(false);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from urologie");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans urologie ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_urologie ?,?");
                sy.affichage(exam, "select * from urologie");
                 aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                 aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        aprops.setVisible(false);
        if (examen.getText().isEmpty() || aprops.getText().isEmpty()) {
            sy.affichage(exam, "select * from IONOGRAMME");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans IONOGRAMME ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_ionogramme ?,?");
                sy.affichage(exam, "select * from IONOGRAMME");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        aprops.setVisible(false);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from lcr");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans lcr ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_lcr ?,?");
                sy.affichage(exam, "select * from lcr");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        aprops.setVisible(false);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from SERO_IMMUNOLOGIE");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans SERO_IMMUNOLOGIE ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_sero ?,?");
                sy.affichage(exam, "select * from SERO_IMMUNOLOGIE");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        aprops.setVisible(false);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from HEMATOLOGIE");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans HEMATOLOGIE ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_hematologie ?,?");
                sy.affichage(exam, "select * from HEMATOLOGIE");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        aprops.setVisible(false);
        if (examen.getText().isEmpty()) {
            sy.affichage(exam, "select * from ExamenImagerie");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans l'Imagerie medical??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_ExamenImagerie ?,?");
                sy.affichage(exam, "select * from ExamenImagerie");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        aprops.setVisible(false);
        if (examen.getText().isEmpty() || aprops.getText().isEmpty()) {
            sy.affichage(exam, "select * from biochimie");
        } else {
            if (JOptionPane.showConfirmDialog(null, "voulez-vous enregistrer dans biochimie ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.savehematologie(idExamen, examen, "exec sp_biochimie ?,?");
                sy.affichage(exam, "select * from biochimie");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void examMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examMouseClicked

    }//GEN-LAST:event_examMouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       aprops.setVisible(true);
        if (examen.getText().isEmpty() || aprops.getText().isEmpty()) {
            sy.affichage(exam, "select * from Examen");
        }else{
            if (JOptionPane.showConfirmDialog(null, "voulez-vous Ajouter un examen ??",
                    "", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                sy.SaveExamen(idExamen, examen, aprops, "exec sp_Examen ?,?,?");
                sy.affichage(exam, "select * from Examen");
                aprops.setVisible(true);
            } else if (JOptionPane.YES_NO_OPTION != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(this, "Enregistrement Annul??");
                aprops.setVisible(true);
            }
            }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        sy.AllDelete("SERO_IMMUNOLOGIE", "id", idExamen);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AjoutExamen dialog = new AjoutExamen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aprops;
    private javax.swing.JTable exam;
    private javax.swing.JTextField examen;
    private javax.swing.JLabel idExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
