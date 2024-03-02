package pms.form;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import main.Client;
import pms.common.PopUp;
import pms.pagination.EventPagination;
import pms.pagination.style.PaginationItemRenderStyle1;

public class Form_V_In_Search extends javax.swing.JPanel {

    private static String codeNo;
    private static String licensePlate;

    private static String fullName;
    private static String address;
    private static String mobileNo;

    private static String manufacturer;
    private static String modelNo;
    private static String year;

    private static String parkingLotNo;
    private static String parkingLotDesc;
    private static String parkedSince;
    
    private static String id;

    public static Form_V_In_Search_Detail vehicleInSearchDetail = new Form_V_In_Search_Detail();

    public Form_V_In_Search() {
        initComponents();
        pageVehicle.setPaginationItemRender(new PaginationItemRenderStyle1());
        pageVehicle.addEventPagination(new EventPagination() {
            @Override
            public void pageChanged(int page) {
                loadDate(page);
                System.out.println("page:: " + page);
            }
        });

        // hide ID column from the vehicle table
        TableColumnModel tcm = tblInVehicle.getColumnModel();
        tcm.removeColumn(tcm.getColumn(7));
    }

    private void loadDate(int page) {
        DefaultTableModel model = (DefaultTableModel) tblInVehicle.getModel();
        model.setRowCount(0);
        int pageLimit = 10;
        int numberOfRecords = 0;

        try {
            String[] inputs = new String[]{Client.companyID, txtFullName.getText(), txtCode.getText(), txtLicensePlate.getText(), txtYear.getText()};
            numberOfRecords = Client.stub.getTotalCount("parked", inputs);
            int totalPage = (int) Math.ceil(numberOfRecords / pageLimit);

            pageVehicle.setPagegination(page, totalPage);

            ArrayList<Object> arrayList = Client.stub.getRows("parked", inputs, page, pageLimit);
            for (Object row : arrayList) {
                /*For every row add it to the table */
                tblInVehicle.addRow((Object[]) row);
            }
        } catch (Exception e) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
            PopUp.connectionError();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        lbHeader = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        vehiclePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInVehicle = new pms.form.Table();
        jPanel4 = new javax.swing.JPanel();
        pageVehicle = new pms.pagination.Pagination();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lbHeader1 = new javax.swing.JLabel();

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("I n  V e h i c l e  S e a r c h");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        vehiclePanel.setBackground(new java.awt.Color(221, 240, 255));

        tblInVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO#", "Code#", "License Plate#", "Model", "Year", "Name", "Parking lot No#", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInVehicle.setRowHeight(35);
        tblInVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInVehicleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInVehicle);
        if (tblInVehicle.getColumnModel().getColumnCount() > 0) {
            tblInVehicle.getColumnModel().getColumn(0).setMinWidth(50);
            tblInVehicle.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblInVehicle.getColumnModel().getColumn(0).setMaxWidth(50);
            tblInVehicle.getColumnModel().getColumn(4).setMinWidth(70);
            tblInVehicle.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblInVehicle.getColumnModel().getColumn(4).setMaxWidth(70);
            tblInVehicle.getColumnModel().getColumn(5).setMinWidth(250);
            tblInVehicle.getColumnModel().getColumn(5).setPreferredWidth(250);
            tblInVehicle.getColumnModel().getColumn(5).setMaxWidth(250);
        }

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.setOpaque(false);

        pageVehicle.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(pageVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vehiclePanelLayout = new javax.swing.GroupLayout(vehiclePanel);
        vehiclePanel.setLayout(vehiclePanelLayout);
        vehiclePanelLayout.setHorizontalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        vehiclePanelLayout.setVerticalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiclePanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Code#:");
        jPanel1.add(jLabel11);

        txtCode.setColumns(3);
        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtCode);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("License Plate#:");
        jPanel1.add(jLabel12);

        txtLicensePlate.setColumns(7);
        txtLicensePlate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtLicensePlate);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);

        txtFullName.setColumns(15);
        txtFullName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFullName);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Year:");
        jPanel1.add(jLabel15);

        txtYear.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtYear);

        btnSearch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        lbHeader1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbHeader1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbHeader1.setText("  S e a r c h  P a r k e d  V e h i c l e s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(driverPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHeader1)
                .addGap(12, 12, 12)
                .addComponent(driverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadDate(1);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void pageParkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageParkingMouseClicked

    }//GEN-LAST:event_pageParkingMouseClicked

    private void tblInVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInVehicleMouseClicked
        // When a record is clicked 
        DefaultTableModel model = (DefaultTableModel) tblInVehicle.getModel();
        int selectedRowIndex = tblInVehicle.getSelectedRow();
        id = model.getValueAt(selectedRowIndex, 7).toString();
        System.out.println(id);

        String[] inputs = new String[]{Client.companyID, txtFullName.getText(), txtCode.getText(), txtLicensePlate.getText(), txtYear.getText(), id};

        try {
            ArrayList<Object> arrayList = Client.stub.getRows("parked", inputs, -1, 1);
            // Form_V_In_Search_Detail.setEditable(false);
            for (Object row : arrayList) {
                Object[] records = (Object[]) row;

                fullName = (String) records[0];
                address = (String) records[1];
                mobileNo = (String) records[2];

                codeNo = (String) records[3];
                licensePlate = (String) records[4];
                manufacturer = (String) records[5];
                modelNo = (String) records[6];
                year = (String) records[7];
                
                parkingLotNo = (String) records[8];
                parkingLotDesc = (String) records[9];
                parkedSince = (String) records[10];

                Form_V_In_Search_Detail.lbFullname.setText(fullName);
                Form_V_In_Search_Detail.lbAddress.setText(address);
                Form_V_In_Search_Detail.lbMobile.setText(mobileNo);
                Form_V_In_Search_Detail.lbCode.setText(codeNo);
                Form_V_In_Search_Detail.lbPlate.setText(licensePlate);
                Form_V_In_Search_Detail.lbManufacturer.setText(manufacturer);
                Form_V_In_Search_Detail.lbModel.setText(modelNo);
                Form_V_In_Search_Detail.lbYear.setText(year);
                Form_V_In_Search_Detail.lbParkingLotNo.setText(parkingLotNo);
                Form_V_In_Search_Detail.lbParkingLotDesc.setText(parkingLotDesc);
                Form_V_In_Search_Detail.lbParkedSince.setText(parkedSince);

            }
            Client.setForm(vehicleInSearchDetail);
        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_In_Search.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }
    }//GEN-LAST:event_tblInVehicleMouseClicked

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbHeader1;
    private pms.pagination.Pagination pageVehicle;
    private pms.form.Table tblInVehicle;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtYear;
    private javax.swing.JPanel vehiclePanel;
    // End of variables declaration//GEN-END:variables
}
