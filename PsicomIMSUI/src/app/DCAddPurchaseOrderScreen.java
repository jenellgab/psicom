package app;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abby
 */
public class DCAddPurchaseOrderScreen extends javax.swing.JFrame {

    /**
     * Creates new form DCAddPurchaseOrderScreen
     */
    public DCAddPurchaseOrderScreen() {
        initComponents();
        
        Color x = new Color(32, 55, 73);
        this.getContentPane().setBackground(x);
        
        Color y = new Color(205, 0, 69);
        addButton.setBackground(y);
        
        Color z = new Color(102, 102, 102);
        cancelButton.setBackground(z);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPurchaseOrderLabel = new javax.swing.JLabel();
        purchaseOrderNumberLabel = new javax.swing.JLabel();
        purchaseOrderNumberField = new javax.swing.JTextField();
        contactPersonField = new javax.swing.JTextField();
        dateTodayLabel = new javax.swing.JLabel();
        outletLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        dateTodayChooser = new com.toedter.calendar.JDateChooser();
        contactPersonLabel = new javax.swing.JLabel();
        outletField = new javax.swing.JTextField();
        bookDetailsPanel = new javax.swing.JPanel();
        bookDetailsLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        orderLabel = new javax.swing.JLabel();
        orderField = new javax.swing.JTextField();
        itemCodeLabel1 = new javax.swing.JLabel();
        itemCodeField = new javax.swing.JTextField();
        deliveryDateLabel = new javax.swing.JLabel();
        deliveryDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Purchase Order");
        setResizable(false);

        addPurchaseOrderLabel.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        addPurchaseOrderLabel.setForeground(new java.awt.Color(255, 255, 255));
        addPurchaseOrderLabel.setText("ADD PURCHASE ORDER");

        purchaseOrderNumberLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        purchaseOrderNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        purchaseOrderNumberLabel.setText("Purchase Order Number");

        purchaseOrderNumberField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        purchaseOrderNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseOrderNumberFieldActionPerformed(evt);
            }
        });

        contactPersonField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        contactPersonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactPersonFieldActionPerformed(evt);
            }
        });

        dateTodayLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dateTodayLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateTodayLabel.setText("Date Today");

        outletLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        outletLabel.setForeground(new java.awt.Color(255, 255, 255));
        outletLabel.setText("Outlet");

        addButton.setBackground(new java.awt.Color(205, 0, 69));
        addButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Purchase Order");
        addButton.setBorder(null);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(102, 102, 102));
        cancelButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(null);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        contactPersonLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        contactPersonLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactPersonLabel.setText("Contact Person");

        outletField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        outletField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outletFieldActionPerformed(evt);
            }
        });

        bookDetailsPanel.setBackground(new java.awt.Color(88, 101, 113));

        bookDetailsLabel.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        bookDetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookDetailsLabel.setText("Book Details");

        titleLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");

        titleField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantityLabel.setText("Quantity");

        quantityField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        orderLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        orderLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderLabel.setText("Order");

        orderField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        orderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderFieldActionPerformed(evt);
            }
        });

        itemCodeLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        itemCodeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        itemCodeLabel1.setText("Item Code");

        itemCodeField.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        itemCodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCodeFieldActionPerformed(evt);
            }
        });

        deliveryDateLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        deliveryDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        deliveryDateLabel.setText("Delivery Date");

        javax.swing.GroupLayout bookDetailsPanelLayout = new javax.swing.GroupLayout(bookDetailsPanel);
        bookDetailsPanel.setLayout(bookDetailsPanelLayout);
        bookDetailsPanelLayout.setHorizontalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(bookDetailsLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                                        .addComponent(titleLabel)
                                        .addGap(248, 248, 248))
                                    .addComponent(titleField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemCodeLabel1)
                                    .addComponent(itemCodeField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookDetailsPanelLayout.createSequentialGroup()
                                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(orderLabel))
                                    .addComponent(quantityLabel)
                                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(orderField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deliveryDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deliveryDateLabel))))
                        .addGap(28, 28, 28))))
        );
        bookDetailsPanelLayout.setVerticalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bookDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemCodeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(deliveryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliveryDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(addPurchaseOrderLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(purchaseOrderNumberLabel)
                                    .addComponent(purchaseOrderNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTodayChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTodayLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactPersonField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactPersonLabel))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outletLabel)
                                    .addComponent(outletField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addPurchaseOrderLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseOrderNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTodayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(purchaseOrderNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(dateTodayChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactPersonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outletLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactPersonField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outletField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseOrderNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseOrderNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseOrderNumberFieldActionPerformed

    private void contactPersonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactPersonFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactPersonFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void outletFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outletFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outletFieldActionPerformed

    private void itemCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCodeFieldActionPerformed

    private void orderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderFieldActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DCAddPurchaseOrderScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCAddPurchaseOrderScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCAddPurchaseOrderScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCAddPurchaseOrderScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DCAddPurchaseOrderScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addPurchaseOrderLabel;
    private javax.swing.JLabel bookDetailsLabel;
    private javax.swing.JPanel bookDetailsPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField contactPersonField;
    private javax.swing.JLabel contactPersonLabel;
    private com.toedter.calendar.JDateChooser dateTodayChooser;
    private javax.swing.JLabel dateTodayLabel;
    private com.toedter.calendar.JDateChooser deliveryDateChooser;
    private javax.swing.JLabel deliveryDateLabel;
    private javax.swing.JTextField itemCodeField;
    private javax.swing.JLabel itemCodeLabel1;
    private javax.swing.JTextField orderField;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JTextField outletField;
    private javax.swing.JLabel outletLabel;
    private javax.swing.JTextField purchaseOrderNumberField;
    private javax.swing.JLabel purchaseOrderNumberLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}