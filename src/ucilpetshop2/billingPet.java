/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucilpetshop2;

/**
 *
 * @author Annisa Anggraini
 */
public class billingPet extends javax.swing.JFrame implements BlueprintInter{
    @Override
    public void opening(String katakata){
        jTextField1.setText(katakata);
    }

    /**
     * Creates new form billingPet
     */
    public billingPet() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in the screen
       
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMinLogin = new javax.swing.JLabel();
        jCloseLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ResetForm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jCat = new javax.swing.JRadioButton();
        jNext = new javax.swing.JButton();
        jDog = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jBreeding = new javax.swing.JCheckBox();
        jGrooming = new javax.swing.JCheckBox();
        jVet = new javax.swing.JCheckBox();
        jTotal = new javax.swing.JLabel();
        jSubTotalField = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(145, 180, 150));
        setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(231, 76, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMinLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMinLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMinLogin.setText("-");
        jMinLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMinLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinLoginMouseClicked(evt);
            }
        });

        jCloseLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCloseLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCloseLogin.setText("X");
        jCloseLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCloseLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                .addComponent(jMinLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCloseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jMinLogin)
                        .addComponent(jCloseLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(145, 180, 150));

        ResetForm.setText("Reset Form");
        ResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetFormActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Ucil Pet Shop");

        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jCat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCat.setText("Cat");
        jCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCatActionPerformed(evt);
            }
        });

        jNext.setText("Next");
        jNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextActionPerformed(evt);
            }
        });

        jDog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDog.setText("Dog");
        jDog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDogActionPerformed(evt);
            }
        });

        jPanel3.setLayout(null);

        jBreeding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBreeding.setText("Breeding      Rp.500.000");
        jBreeding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBreeding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBreedingActionPerformed(evt);
            }
        });

        jGrooming.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jGrooming.setText("Grooming   Rp.300.000");
        jGrooming.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jVet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jVet.setText("Vet            Rp450.000");
        jVet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTotal.setText("Total");

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDog)
                                .addComponent(jCat))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jBreeding)
                                        .addGap(138, 138, 138))
                                    .addComponent(jGrooming))
                                .addComponent(jVet, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(Calculate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ResetForm)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBack)
                                    .addGap(18, 18, 18)
                                    .addComponent(jNext))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(286, 286, 286)
                                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(72, 72, 72)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCat)
                        .addComponent(jBreeding))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDog)
                        .addComponent(jGrooming))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jVet))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(51, 51, 51)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTotal))
                    .addGap(52, 52, 52)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Calculate)
                        .addComponent(ResetForm)
                        .addComponent(jBack)
                        .addComponent(jNext))
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCloseLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseLoginMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jCloseLoginMouseClicked

    private void jMinLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinLoginMouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_jMinLoginMouseClicked

    private void jCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCatActionPerformed
        // TODO add your handling code here:
        if (jCat.isSelected())
        jDog.setSelected(false);
    }//GEN-LAST:event_jCatActionPerformed

    private void jDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDogActionPerformed
        // TODO add your handling code here:
        if (jDog.isSelected())
        jCat.setSelected(false);
    }//GEN-LAST:event_jDogActionPerformed

    private void jBreedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBreedingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBreedingActionPerformed

    private void jNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PaymentMethods().setVisible(true);
    }//GEN-LAST:event_jNextActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Customer().setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

    private void ResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetFormActionPerformed
        // TODO add your handling code here:
        jCat.setSelected(false);
        jDog.setSelected(false);

        jBreeding.setSelected(false);
        jGrooming.setSelected(false);
        jVet.setSelected(false);

        jSubTotalField.setText("");
        //jTaxField.setText("");
        //jTotalField.setText("");

    }//GEN-LAST:event_ResetFormActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        int total;
        int subtotal1=500000;
        int subtotal2=300000;
        int subtotal3=450000;
        int subtotal4=800000;
        int subtotal5=950000;
        int subtotal6=750000;
        int subtotal7=1250000;
        //final double TAXRATE = 0;
        //double tax;
        if (jBreeding.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal1));
        } else if (jGrooming.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal2));
        }

        if (jVet.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal3));
        } else if(jGrooming.isSelected()&& jBreeding.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal4));
        }

        if (jVet.isSelected()&& jBreeding.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal5));
        } else if(jGrooming.isSelected()&& jVet.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal6));
        }

        if (jVet.isSelected()&& jGrooming.isSelected()&& jBreeding.isSelected()){
            jSubTotalField.setText(Integer.toString(subtotal7));
        }

        //subtotal = Double.parseDouble(jSubTotalField.getText());
        //tax = subtotal * TAXRATE;
        //total = tax + subtotal;

        //jTaxField.setText(Double.toString(tax));
        //jTotalField.setText(Double.toString(total));

    }//GEN-LAST:event_CalculateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(billingPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billingPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billingPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billingPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String welcomemessage="hello";
               //new billingPet().setVisible(true);
                billingPet objMenu=new billingPet();
            objMenu.setVisible(true);  
        objMenu.opening(welcomemessage);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JButton ResetForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBack;
    private javax.swing.JCheckBox jBreeding;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jCat;
    private javax.swing.JLabel jCloseLogin;
    private javax.swing.JRadioButton jDog;
    private javax.swing.JCheckBox jGrooming;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMinLogin;
    private javax.swing.JButton jNext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jSubTotalField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTotal;
    private javax.swing.JCheckBox jVet;
    // End of variables declaration//GEN-END:variables
}
