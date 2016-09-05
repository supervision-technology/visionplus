/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.dialog.Invoice_Payment;

import com.sv.visionplus.transaction.invoice.MBankBranch;
import com.sv.visionplus.transaction.invoice.PCInvoice;
import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.transaction.invoice.model.Status;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.transaction.invoice.model.TPatientInformation;
import com.sv.visionplus.transaction.invoice.model.TTransaction;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
public class InvoicePayment extends javax.swing.JDialog {

    private PCInvoice invoiceForm;

    /**
     * Creates new form InvoicePayment
     */
    public InvoicePayment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtInvoiceValue.setEnabled(false);
        txtNewBalance.setEnabled(false);
        txtPayAmount.setEnabled(false);
        setCardPayment(false);
        setChequePayment(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdoIssueGoods = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCashAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtInvoiceValue = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtPayAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtNewBalance = new com.sv.visionplus.util.component.textfield.CDoubleField();
        cardPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rdoCardPayment = new javax.swing.JRadioButton();
        cmboCardBank = new com.sv.visionplus.util.component.combobox.CComboBox(){
            @Override
            public List getComboData(){
                return allBankBranch();
            }
        };
        txtCardAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtCardNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        chequePanel = new javax.swing.JPanel();
        rdoChequePayment = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmboChequeBank = new com.sv.visionplus.util.component.combobox.CComboBox();
        txtChequeAmount = new com.sv.visionplus.util.component.textfield.CDoubleField();
        txtChequeNo = new com.sv.visionplus.util.component.textfield.CIntegerField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rdoPrintBill = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setText("Pay Amount :");

        jLabel7.setText("Invoice Value :");

        rdoIssueGoods.setText("Issue Goods");

        jLabel13.setText("New Balance :");

        cardPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cash Payment"));

        jLabel12.setText(" Amount :");

        txtCashAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addComponent(txtCashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCashAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtInvoiceValue.setText("1000.00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdoIssueGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(txtInvoiceValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPayAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtInvoiceValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoIssueGoods)
                .addContainerGap())
        );

        cardPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Card Payment"));

        jLabel18.setText(" Amount :");

        jLabel19.setText("Bank :");

        jLabel20.setText(" Card No :");

        rdoCardPayment.setText("Card Payment");
        rdoCardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCardPaymentActionPerformed(evt);
            }
        });

        txtCardAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCardAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout cardPanel1Layout = new javax.swing.GroupLayout(cardPanel1);
        cardPanel1.setLayout(cardPanel1Layout);
        cardPanel1Layout.setHorizontalGroup(
            cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPanel1Layout.createSequentialGroup()
                        .addComponent(rdoCardPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGap(27, 27, 27)
                        .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmboCardBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCardAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCardNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        cardPanel1Layout.setVerticalGroup(
            cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoCardPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCardAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(cmboCardBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        chequePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cheque Payment"));

        rdoChequePayment.setText("Cheque Payment");
        rdoChequePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChequePaymentActionPerformed(evt);
            }
        });

        jLabel15.setText(" Amount :");

        jLabel16.setText("Bank :");

        jLabel17.setText(" Cheque No :");

        txtChequeAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChequeAmountKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout chequePanelLayout = new javax.swing.GroupLayout(chequePanel);
        chequePanel.setLayout(chequePanelLayout);
        chequePanelLayout.setHorizontalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmboChequeBank, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(txtChequeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChequeNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addComponent(rdoChequePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(212, 212, 212))))
        );
        chequePanelLayout.setVerticalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoChequePayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtChequeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(cmboChequeBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtChequeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jButton2.setText("Refresh");

        jButton1.setText("Save ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rdoPrintBill.setText("Print Bill");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoPrintBill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chequePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chequePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(rdoPrintBill))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCardPaymentActionPerformed
        if (rdoCardPayment.isSelected()) {
            setCardPayment(true);

        } else {
            setCardPayment(false);
        }
    }//GEN-LAST:event_rdoCardPaymentActionPerformed

    private void rdoChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChequePaymentActionPerformed
        if (rdoChequePayment.isSelected()) {
            setChequePayment(true);

        } else {
            setChequePayment(false);
        }
    }//GEN-LAST:event_rdoChequePaymentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
//            boolean res = InvoiceDao.getInstance().addInvoice(invoiceModel, patientInformation);
//            if (res) {
        JOptionPane.showMessageDialog(this, "invoice Saved Successfully..");
        this.dispose();
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(InvoicePayment.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCashAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashAmountKeyReleased
        setValue();
    }//GEN-LAST:event_txtCashAmountKeyReleased

    private void txtCardAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardAmountKeyReleased
        setValue();
    }//GEN-LAST:event_txtCardAmountKeyReleased

    private void txtChequeAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChequeAmountKeyReleased
        setValue();
    }//GEN-LAST:event_txtChequeAmountKeyReleased

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
            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InvoicePayment dialog = new InvoicePayment(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel cardPanel1;
    private javax.swing.JPanel chequePanel;
    private com.sv.visionplus.util.component.combobox.CComboBox cmboCardBank;
    private com.sv.visionplus.util.component.combobox.CComboBox cmboChequeBank;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton rdoCardPayment;
    private javax.swing.JRadioButton rdoChequePayment;
    private javax.swing.JRadioButton rdoIssueGoods;
    private javax.swing.JRadioButton rdoPrintBill;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCardAmount;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtCardNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtCashAmount;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtChequeAmount;
    private com.sv.visionplus.util.component.textfield.CIntegerField txtChequeNo;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtInvoiceValue;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtNewBalance;
    private com.sv.visionplus.util.component.textfield.CDoubleField txtPayAmount;
    // End of variables declaration//GEN-END:variables

    private void setCardPayment(boolean res) {
        txtCardAmount.setEnabled(res);
        cmboCardBank.setEnabled(res);
        txtCardNo.setEnabled(res);
        if (res) {

            txtPayAmount.setCValue(txtPayAmount.getCValue() + txtCardAmount.getCValue());
        } else {
            txtPayAmount.setCValue(txtPayAmount.getCValue() - txtCardAmount.getCValue());
        }
        txtNewBalance.setCValue(txtInvoiceValue.getCValue() - txtPayAmount.getCValue());
    }

    private void setChequePayment(boolean res) {
        txtChequeAmount.setEnabled(res);
        cmboChequeBank.setEnabled(res);
        txtChequeNo.setEnabled(res);
        if (res) {
            txtPayAmount.setCValue(txtPayAmount.getCValue() + txtChequeAmount.getCValue());
        } else {
            txtPayAmount.setCValue(txtPayAmount.getCValue() - txtChequeAmount.getCValue());
        }
        txtNewBalance.setCValue(txtInvoiceValue.getCValue() - txtPayAmount.getCValue());
    }

    private void setValue() {
        txtPayAmount.setCValue(txtCashAmount.getCValue() + txtChequeAmount.getCValue() + txtCardAmount.getCValue());

        txtNewBalance.setCValue(txtInvoiceValue.getCValue() - txtPayAmount.getCValue());
        if (txtNewBalance.getCValue() < 0) {
            JOptionPane.showMessageDialog(null, "Over Payment..");
        }
        if (txtNewBalance.getCValue() <= 0) {
            rdoIssueGoods.setSelected(true);
        } else {
            rdoIssueGoods.setSelected(false);
        }
    }

    public void setFrame(PCInvoice invoiceForm) {
        this.invoiceForm = invoiceForm;
    }

    public void setValue(TInvoice tInvoice, TInvoiceItem tInvoiceItem, TPatientInformation tPatientInformation, MCustomer customer, Status status, TTransaction tTransaction) {
        txtInvoiceValue.setCValue(tInvoice.getAmount());
    }

    private List<MBankBranch> allBankBranch() {
//        List<MBankBranch> allBankBanch = BankBranchDAO.getInstance().allBankBanch();
        return BankBranchDAO.getInstance().allBankBanch();
//        if (allBankBanch != null) {
//            for (MBankBranch bankBanch : allBankBanch) {
//                System.out.println(bankBanch.getBank());
//                cmboCardBank.setCValue(bankBanch.getCode() + "" + bankBanch.getBank() + "" + bankBanch.getBranch());
//                cmboChequeBank.setCValue(bankBanch.getCode() + "" + bankBanch.getBank() + "" + bankBanch.getBranch());
//            }
//        }
    }
}