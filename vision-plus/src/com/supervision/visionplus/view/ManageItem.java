/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.view;

import com.supervision.visionplus.config.IDGenerator;
import com.supervision.visionplus.dao.BrandDao;
import com.supervision.visionplus.dao.CategoryDao;
import com.supervision.visionplus.dao.ItemDao;
import com.supervision.visionplus.model.MBrand;
import com.supervision.visionplus.model.MCategory;
import com.supervision.visionplus.model.MItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Date : Aug 16, 2016 Time : 7:02:35 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class ManageItem extends javax.swing.JPanel {

    private DefaultTableModel model;

    /**
     * Creates new form ManageItem
     */
    public ManageItem() {
        initComponents();
        model = (DefaultTableModel) itemTable.getModel();
        getAllCategory();
        getAllBrands();
        getAllItems();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        salePrice_text = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costPrice_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        itemCode_text = new javax.swing.JTextField();
        reOrderQty_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        description_text = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        brand_combo = new javax.swing.JComboBox();
        category_combo = new javax.swing.JComboBox();
        deleteButton = new javax.swing.JButton();

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Brand", "Category", "Description", "Sale Price", "Cost Price", "Re-Order Qty"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jLabel5.setText("sale Price :");

        jLabel1.setText("Item Code .: ");

        jLabel6.setText("Cost Price :");

        jLabel7.setText("Re-Order Qty : ");

        jLabel2.setText("Brand :");

        jLabel3.setText("Category : ");

        addButton.setText("Save");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Description :");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        brand_combo.setEditable(true);
        brand_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brand_comboItemStateChanged(evt);
            }
        });

        category_combo.setEditable(true);
        category_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                category_comboItemStateChanged(evt);
            }
        });

        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salePrice_text)
                            .addComponent(costPrice_text)
                            .addComponent(itemCode_text)
                            .addComponent(description_text)
                            .addComponent(brand_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(reOrderQty_text, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(category_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemCode_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(brand_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(category_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(description_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(salePrice_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(costPrice_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(reOrderQty_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(deleteButton))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int newId = getLastId();
        String itemCode = itemCode_text.getText();
        String description = description_text.getText();
        double costPrice = Double.parseDouble(costPrice_text.getText());
        double salePrice = Double.parseDouble(salePrice_text.getText());
        int reOrderQty = Integer.parseInt(reOrderQty_text.getText());
        int brandId = 0;
        int categoryId = 0;

        MItem item = new MItem(newId, brandId, categoryId, itemCode, description, salePrice, costPrice, reOrderQty);
        
        try {
            boolean isItem = ItemDao.getInstance().isItem(itemCode);
            if (isItem) {
                boolean updateItems = ItemDao.getInstance().updateItems(item);
                if (updateItems) {
                    getAllItems();
                    removeAllTextField();
                    JOptionPane.showMessageDialog(this, "success....");
                }
            } else {
//                if (!itemCode_text.getText().trim().equals("") && !description_text.getText().trim().equals("") && !salePrice_text.getText().trim().equals("") && costPrice_text.getText().trim().equals("")) {
//
//                    MBrand brand = BrandDao.getInstance().searchBrand((String) brand_combo.getSelectedItem());
//                    if (brand != null) {
//                        brandId = brand.getIndexNo();
//                    }
//                    MCategory category = CategoryDao.getInstance().searchCategory((String) category_combo.getSelectedItem());
//                    if (category != null) {
//                        categoryId = category.getIndexNo();
//                    }
//
//                    boolean addItems = ItemDao.getInstance().addItems(item);
//                    if (addItems) {
//                        getAllItems();
//                        JOptionPane.showMessageDialog(this, "success....");
//                        removeAllTextField();
//                    }
//                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ManageBrand(null, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void brand_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brand_comboItemStateChanged

    }//GEN-LAST:event_brand_comboItemStateChanged

    private void category_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_category_comboItemStateChanged

    }//GEN-LAST:event_category_comboItemStateChanged

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            boolean item = ItemDao.getInstance().isItem(itemCode_text.getText());
            if (item) {
                boolean deleteItems = ItemDao.getInstance().deleteItems(itemCode_text.getText());
                if (deleteItems) {
                    removeAllTextField();
                    getAllItems();
                    JOptionPane.showMessageDialog(this, "Delete...");
                    getLastId();
                } else {
                    JOptionPane.showMessageDialog(this, "Fail...");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a Item");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        itemCode_text.setText(model.getValueAt(itemTable.getSelectedRow(), 0).toString());
//        name_text.setText((String) model.getValueAt(itemTable.getSelectedRow(), 1));
//        nic_text.setText((String) model.getValueAt(itemTable.getSelectedRow(), 2));
        description_text.setText((String) model.getValueAt(itemTable.getSelectedRow(), 3));
        salePrice_text.setText(model.getValueAt(itemTable.getSelectedRow(), 4).toString());
        costPrice_text.setText((String) model.getValueAt(itemTable.getSelectedRow(), 5).toString());
        reOrderQty_text.setText((String) model.getValueAt(itemTable.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_itemTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox brand_combo;
    private javax.swing.JComboBox category_combo;
    private javax.swing.JTextField costPrice_text;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField description_text;
    private javax.swing.JTextField itemCode_text;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField reOrderQty_text;
    private javax.swing.JTextField salePrice_text;
    // End of variables declaration//GEN-END:variables

    Integer getLastId() {
        int indexNo = IDGenerator.getNewId("m_item", "index_no");
        return indexNo;
    }

    void getAllCategory() {
        try {
            ArrayList<MCategory> allCategory = CategoryDao.getInstance().getAllCategory();
            for (MCategory allCategory1 : allCategory) {
                category_combo.addItem(allCategory1.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getAllBrands() {
        try {
            ArrayList<MBrand> allBrands = BrandDao.getInstance().getAllBrands();
            for (MBrand allBrand : allBrands) {
                brand_combo.addItem(allBrand.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void getAllItems() {
        try {
            ArrayList<MItem> allItems = ItemDao.getInstance().getAllItems();
            model.setRowCount(0);
            for (MItem allItem : allItems) {
                Object[] rd = {allItem.getCode(), allItem.getBrand(), allItem.getCategory(), allItem.getName(), allItem.getSalePrice(), allItem.getCostPrice(), allItem.getReorderQty()};
                model.addRow(rd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void removeAllTextField() {
        itemCode_text.setText("");
        description_text.setText("");
        salePrice_text.setText("");
        costPrice_text.setText("");
        reOrderQty_text.setText("");
    }
}