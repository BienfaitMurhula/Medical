/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Gui.Home;
import Syncronisation.Syncroniser;
import java.awt.Color;

/**
 *
 * @author Honore
 */
public class Imagerie extends javax.swing.JPanel {

    /**
     * Creates new form Imagerie
     */
    Syncronisation.Syncroniser sy = new Syncroniser();

    public Imagerie() {
        initComponents();
        jPanel2.setBackground(new Color(54, 175, 231));
        this.setBackground(new Color(54, 175, 231));
        sy.TableCharg(img, "* from V_imagerie ORDER BY ID DESC");
        sy.affichage(resultatimagerie, "select * from imagerieresultat order by ID desc");
        chemin.setVisible(false);
       // sy.chargementCombo("en_tete_consultation", "patient", code_pers);
        sy.chargementdetail(code_pers);
        id1.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        demandeur = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        exam1 = new javax.swing.JLabel();
        exam2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exam3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        exam4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        exam5 = new javax.swing.JLabel();
        exam6 = new javax.swing.JLabel();
        exam7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        exam8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        img = new javax.swing.JTable();
        code_pers = new javax.swing.JComboBox();
        rechercher = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultatimagerie = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        stand = new javax.swing.JTextField();
        autre = new javax.swing.JTextField();
        echo = new javax.swing.JTextField();
        irm = new javax.swing.JTextField();
        rx = new javax.swing.JTextField();
        specialisee = new javax.swing.JTextField();
        medicament = new javax.swing.JTextField();
        ecg = new javax.swing.JTextField();
        imprime = new javax.swing.JTextField();
        enduscopie = new javax.swing.JTextField();
        ees = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        photop = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        chemin = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "Imagerie médicale", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 30, 20));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Demandeur");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 90, -1));

        demandeur.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(demandeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 230, 19));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examen demandés", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 51, 102))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("1");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("2");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("3");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("4");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("5");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("7");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("8");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exam2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exam5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(exam6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exam4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exam1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exam3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exam7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exam8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel5)
                        .addComponent(exam1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exam3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exam4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(exam2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(exam5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exam6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(exam8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exam7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 380, 170));

        img.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(img);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 1120, 140));

        code_pers.setEditable(true);
        jPanel2.add(code_pers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 250, 30));

        rechercher.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechercherKeyReleased(evt);
            }
        });
        jPanel2.add(rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 18, 170, 30));

        resultatimagerie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        resultatimagerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultatimagerieMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(resultatimagerie);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 860, 110));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Personne");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 70, 30));

        stand.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Standard", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 40));

        autre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autre RX", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(autre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 40));

        echo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Echographie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(echo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 40));

        irm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IRM Scanner", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(irm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 40));

        rx.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rx", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(rx, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        specialisee.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spécialisée ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(specialisee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

        medicament.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Médicament", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(medicament, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 40));

        ecg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ECG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(ecg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, 40));

        imprime.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imprimé", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(imprime, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, 40));

        enduscopie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enduscopie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(enduscopie, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 140, 40));

        ees.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.add(ees, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 140, 40));

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("NB : Ramenez votre ordonnance à la prochaine consultation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, -1));

        photop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/images1.jpg"))); // NOI18N
        photop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photopMouseClicked(evt);
            }
        });
        jPanel2.add(photop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 180));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Enregistrer");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 190, 40));
        jPanel2.add(chemin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, 20));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Imprimé");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 190, 40));

        id1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(153, 0, 0));
        id1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 30, 20));

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("PHOTO IMAGERIE MEDICALE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 20));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked
        sy.retourInfos(id, demandeur, exam1, exam2, exam3, exam4, exam5, exam6, exam7, exam8, img);

//en.deplacerImagerie(TABLE_RESULT, id, nom, demandeur, exam1, exam2, exam3, exam4, exam5, exam6, exam7, exam8);        // TODO add your handling code here:
    }//GEN-LAST:event_imgMouseClicked

    private void rechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechercherKeyReleased
        //en.Recherchecombo(code_pers, "identite", "id", rechercher);          // TODO add your handling code here:
    }//GEN-LAST:event_rechercherKeyReleased

    private void resultatimagerieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultatimagerieMouseClicked
        sy.deplacerImage(resultatimagerie, id1, photop);
    }//GEN-LAST:event_resultatimagerieMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int idc = sy.Chargerid(code_pers, "en_tete_consultation", "id");
        sy.resultatimagerie(id1, idc, rx, stand, autre, echo, imprime, ees, ecg, irm, medicament, enduscopie, specialisee, Home.admin1, "exec sp_resultatImagerie ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");
        sy.affichage(resultatimagerie, "select * from imagerieresultat order by ID desc ");
        rx.setText("");
        stand.setText("");
        imprime.setText("");
        irm.setText("");
        autre.setText("");
        enduscopie.setText("");
        specialisee.setText("");
        echo.setText("");
        ees.setText("");
        medicament.setText("");
        ecg.setText("");

    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void photopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photopMouseClicked
        sy.photoimagerie(photop, chemin);
    }//GEN-LAST:event_photopMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        String c = "Imagerie",
                req = "select * from imagerieresultat where id='" + id1.getText() + "'";
        try {
            sy.EtatSortie(req, c);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autre;
    private javax.swing.JLabel chemin;
    private javax.swing.JComboBox code_pers;
    private javax.swing.JLabel demandeur;
    private javax.swing.JTextField ecg;
    private javax.swing.JTextField echo;
    private javax.swing.JTextField ees;
    private javax.swing.JTextField enduscopie;
    private javax.swing.JLabel exam1;
    private javax.swing.JLabel exam2;
    private javax.swing.JLabel exam3;
    private javax.swing.JLabel exam4;
    private javax.swing.JLabel exam5;
    private javax.swing.JLabel exam6;
    private javax.swing.JLabel exam7;
    private javax.swing.JLabel exam8;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JTable img;
    private javax.swing.JTextField imprime;
    private javax.swing.JTextField irm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField medicament;
    public static javax.swing.JLabel photop;
    private javax.swing.JTextField rechercher;
    private javax.swing.JTable resultatimagerie;
    private javax.swing.JTextField rx;
    private javax.swing.JTextField specialisee;
    private javax.swing.JTextField stand;
    // End of variables declaration//GEN-END:variables
}
