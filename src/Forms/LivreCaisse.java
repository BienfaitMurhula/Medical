/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author BIENFAIT
 */
public class LivreCaisse extends javax.swing.JPanel {

    /**
     * Creates new form LivreCaisse
     */
    Syncronisation.Syncroniser sy = new Syncronisation.Syncroniser();

    public LivreCaisse() {
        initComponents();
        // jPanel1.setBackground(new Color(192, 192, 255));
        jPanel2.setBackground(new Color(54, 175, 231));
        jPanel4.setBackground(new Color(54, 175, 231));
        sy.ChargermentTable(Table_Caisse, "livre_de_caisse", "id");
        debit.setVisible(false);
        montant_.setVisible(false);
        id_caisse.setVisible(false);
        sy.chargementdetail(txtsujet);
        afficher();
    }

    public void afficher() {
        
        if (usd.getText().isEmpty()) {
            valider.setVisible(false);
        } else {
            valider.setVisible(true);
        }
    }

    public void Conversion(JTextField rest, JLabel s) {

        double cred = Double.parseDouble(debit.getText());
        double debi = Double.parseDouble(credit.getText());
        double som = debi - cred;
        rest.setText("" + som);
        s.setText("" + som);

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
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        id_caisse = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        libelle = new javax.swing.JTextField();
        montant = new javax.swing.JTextField();
        txtsujet = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtDebit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        credit = new javax.swing.JLabel();
        debit = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        sommeFacture1 = new javax.swing.JLabel();
        solde = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Caisse = new javax.swing.JTable();
        rech = new org.jdesktop.swingx.JXSearchField();
        montant_ = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        usd = new javax.swing.JLabel();
        fc = new javax.swing.JTextField();
        valider = new javax.swing.JLabel();
        taux = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Supprimer");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 150, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Enreigistrer");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 140, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Modifier");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jLabel12.setOpaque(true);
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
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 140, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "OPERATION JOURNALIERE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_caisse.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(id_caisse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Sujet");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Libellé:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 30));

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setDateFormatString("yyyy-MM-dd");
        jDateChooser3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser3PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 290, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Montant");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 30));

        libelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libelleActionPerformed(evt);
            }
        });
        jPanel1.add(libelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 290, 30));

        montant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montantActionPerformed(evt);
            }
        });
        jPanel1.add(montant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 290, 30));

        jPanel1.add(txtsujet, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 290, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 430, 203));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "DEVISE EN DOLLARS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria Math", 0, 14), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Débit:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 30));

        txtDebit.setEditable(false);
        txtDebit.setBackground(new java.awt.Color(255, 255, 255));
        txtDebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDebitActionPerformed(evt);
            }
        });
        jPanel3.add(txtDebit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Crédit:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 30));

        txtCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditActionPerformed(evt);
            }
        });
        jPanel3.add(txtCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 280, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 66, 450, 203));

        credit.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        credit.setForeground(new java.awt.Color(255, 0, 0));
        credit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        credit.setText("Crédit");
        credit.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Crédit", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.add(credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 65, -1));

        debit.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        debit.setForeground(new java.awt.Color(0, 0, 255));
        debit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        debit.setText("Debit");
        jPanel2.add(debit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 40, 30));

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 30));

        sommeFacture1.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        sommeFacture1.setForeground(new java.awt.Color(255, 0, 0));
        sommeFacture1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sommeFacture1.setText("TOTAL");
        sommeFacture1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAT/Jr", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(255, 0, 0))); // NOI18N
        sommeFacture1.setPreferredSize(new java.awt.Dimension(70, 32));
        jPanel2.add(sommeFacture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 0, 90, 70));

        solde.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        solde.setForeground(new java.awt.Color(255, 0, 0));
        solde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        solde.setText("solde");
        solde.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Solde", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        solde.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(solde, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 70, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("$");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 24, 34));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("$");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 24, 35));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("$");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 10, 24, 60));

        Table_Caisse.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Caisse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_CaisseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Caisse);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, 872, 250));

        rech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechKeyReleased(evt);
            }
        });
        jPanel2.add(rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 292, 280, 30));
        jPanel2.add(montant_, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 50, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conversion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(51, 0, 204))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usd.setBackground(new java.awt.Color(255, 255, 255));
        usd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Montant en $", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        usd.setOpaque(true);
        jPanel4.add(usd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 40));

        fc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Montant en francs", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 204))); // NOI18N
        fc.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fcCaretUpdate(evt);
            }
        });
        fc.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                fcCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        fc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fcPropertyChange(evt);
            }
        });
        fc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fcKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fcKeyTyped(evt);
            }
        });
        jPanel4.add(fc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 40));

        valider.setForeground(new java.awt.Color(255, 255, 255));
        valider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valider.setText("Valider");
        valider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerMouseClicked(evt);
            }
        });
        jPanel4.add(valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 30));

        taux.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Taux du jour", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        taux.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tauxCaretUpdate(evt);
            }
        });
        taux.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tauxCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        taux.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tauxPropertyChange(evt);
            }
        });
        taux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tauxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tauxKeyTyped(evt);
            }
        });
        jPanel4.add(taux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 200, 230));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void rechKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechKeyReleased
        sy.AllReseach(Table_Caisse, "select * from LIVRE_DE_CAISSE where numero_dordre like '%" + rech.getText() + "%' or libelle like '%" + rech.getText() + "%'");
    }//GEN-LAST:event_rechKeyReleased

    private void Table_CaisseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_CaisseMouseClicked
        sy.deplacerlivre(Table_Caisse, id_caisse, jDateChooser3, txtsujet, libelle, txtDebit, txtCredit, montant);
    }//GEN-LAST:event_Table_CaisseMouseClicked

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        sy.Sommefacture("FACTURE", debit, jDateChooser2, "DATE_");
        sy.Sommefacture("FACTURE", sommeFacture1, jDateChooser2, "DATE_");
        sy.SommeCredit("livre_de_caisse", credit, jDateChooser2, "DATE_OPERATION");
        // sy.SommeDette("livre_de_caisse", dette, jDateChooser2, "DATE_OPERATION");
        sy.Sommemont("livre_de_caisse", montant_, jDateChooser2, "DATE_OPERATION");
        //sy.Solde(,solde, jDateChooser2, "DATE_OPERATION");
        //Conversion(txtDebit, solde);
        sy.soustraire(debit, montant_, txtDebit);
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void txtCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditActionPerformed

    private void txtDebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDebitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDebitActionPerformed

    private void montantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montantActionPerformed

    private void libelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libelleActionPerformed

    private void jDateChooser3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser3PropertyChange
        sy.Solde(txtDebit, jDateChooser3, "DATE_OPERATION");        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser3PropertyChange

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        sy.ExitChanger(jLabel12);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        sy.Changer(jLabel12);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()
                || txtCredit.getText().isEmpty() || libelle.getText().isEmpty()
                || ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()
                || txtsujet.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Remplissez tout les champs");
        } else {
            sy.SavedCaisse(id_caisse, jDateChooser2, txtsujet, libelle, txtDebit, txtCredit, montant);
            Conversion(txtDebit, solde);
            ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
            ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).setText("");
            txtDebit.setText("");
            txtCredit.setText("");
            sy.ChargermentTable(Table_Caisse, "livre_de_caisse", "id");
            sy.Solde(txtDebit, jDateChooser3, "DATE_OPERATION");
            sy.reunitialiser(taux, fc, usd);
            afficher();
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        sy.ExitChanger(jLabel11);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        sy.Changer(jLabel11);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        if (((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText().isEmpty()
                || txtCredit.getText().isEmpty() || libelle.getText().isEmpty()
                || ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText().isEmpty()
                || txtsujet.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Remplissez tout les champs");
        } else {
            sy.SavedCaisse(id_caisse, jDateChooser2, txtsujet, libelle, txtDebit, txtCredit, montant);
            Conversion(txtDebit, solde);
            ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
            ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).setText("");
            txtDebit.setText("");
            txtCredit.setText("");
            sy.ChargermentTable(Table_Caisse, "livre_de_caisse", "id");
            sy.Solde(txtDebit, jDateChooser3, "DATE_OPERATION");
            sy.reunitialiser(taux, fc, usd);
            afficher();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        sy.ExitChanger(jLabel6);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        sy.Changer(jLabel6);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        sy.Suppression("livre_de_caisse", "id", id_caisse);
        sy.ChargermentTable(Table_Caisse, "livre_de_caisse", "id");
        sy.reunitialiser(taux, fc, usd);
        afficher();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseClicked
//        sy.covertir(taux, fc, usd);
        montant.setText(usd.getText());
    }//GEN-LAST:event_validerMouseClicked

    private void fcPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fcPropertyChange
        // sy.covertir(taux, fc, usd);
    }//GEN-LAST:event_fcPropertyChange

    private void tauxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tauxPropertyChange
        //sy.covertir(taux, fc, usd);
    }//GEN-LAST:event_tauxPropertyChange

    private void tauxCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tauxCaretPositionChanged

    }//GEN-LAST:event_tauxCaretPositionChanged

    private void fcCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fcCaretPositionChanged

    }//GEN-LAST:event_fcCaretPositionChanged

    private void tauxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tauxCaretUpdate
        sy.covertir(taux, fc, usd);
        afficher();
    }//GEN-LAST:event_tauxCaretUpdate

    private void fcCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fcCaretUpdate
        sy.covertir(taux, fc, usd);
        afficher();
    }//GEN-LAST:event_fcCaretUpdate

    private void fcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fcKeyTyped
//        afficher();
    }//GEN-LAST:event_fcKeyTyped

    private void tauxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tauxKeyTyped
//        afficher();
    }//GEN-LAST:event_tauxKeyTyped

    private void fcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fcKeyReleased
     afficher();
    }//GEN-LAST:event_fcKeyReleased

    private void tauxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tauxKeyReleased
        afficher();
    }//GEN-LAST:event_tauxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Caisse;
    private javax.swing.JLabel credit;
    private javax.swing.JLabel debit;
    private javax.swing.JTextField fc;
    private javax.swing.JLabel id_caisse;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libelle;
    private javax.swing.JTextField montant;
    private javax.swing.JLabel montant_;
    private org.jdesktop.swingx.JXSearchField rech;
    private javax.swing.JLabel solde;
    private javax.swing.JLabel sommeFacture1;
    private javax.swing.JTextField taux;
    private javax.swing.JTextField txtCredit;
    public static javax.swing.JTextField txtDebit;
    private javax.swing.JComboBox<String> txtsujet;
    private javax.swing.JLabel usd;
    private javax.swing.JLabel valider;
    // End of variables declaration//GEN-END:variables
}