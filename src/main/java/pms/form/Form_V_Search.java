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

public class Form_V_Search extends javax.swing.JPanel {

    public static String fullName;
    public static String firstName;
    public static String middleName;
    public static String lastName;
    public static String gender;
    public static String address;
    public static String dateOfBirth;
    public static String jobTitle;
    public static String mobileNo;
    public static String email;
    public static String tinNo;

    public static String codeNo;
    public static String licensePlate;
    public static String manufacturer;
    public static String modelNo;
    public static String year;
    public static String id;

    public static Form_V_Search_Detail vehicleSearchDetail = new Form_V_Search_Detail();

    public Form_V_Search() {
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
        TableColumnModel tcm = tblVehicle.getColumnModel();
        tcm.removeColumn(tcm.getColumn(10));
    }

    private void loadDate(int page) {
        DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();
        model.setRowCount(0);
        int pageLimit = 10;
        int numberOfRecords = 0;

        try {
            String[] inputs = new String[]{txtFullName.getText(), txtMobile.getText(), txtEmail.getText(), txtCode.getText(),
                txtLicensePlate.getText(), txtManufacturer.getText(), txtModel.getText(), txtYear.getText()};
            numberOfRecords = Client.stub.getTotalCount("customer", inputs);
            int totalPage = (int) Math.ceil(numberOfRecords / pageLimit);

            pageVehicle.setPagegination(page, totalPage);

            ArrayList<Object> arrayList = Client.stub.getRows("customer", inputs, page, pageLimit);
            for (Object row : arrayList) {
                /*For every row add it to the table */
                tblVehicle.addRow((Object[]) row);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        vehiclePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicle = new pms.form.Table();
        jPanel4 = new javax.swing.JPanel();
        pageVehicle = new pms.pagination.Pagination();

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("A u t o m o b i l e  S e a r c h");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Mobile #:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Email:");

        txtFullName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        txtMobile.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Code#:");

        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("License Plate#:");

        txtLicensePlate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Manufacturer:");

        txtManufacturer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Model:");

        txtModel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtYear.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Year:");

        vehiclePanel.setBackground(new java.awt.Color(221, 240, 255));

        tblVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO#", "Name", "Mobile#", "Email", "tin#", "Code#", "License Plate#", "Manufacturer", "Model", "Year", "Title 9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVehicle.setRowHeight(35);
        tblVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehicleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehicle);
        if (tblVehicle.getColumnModel().getColumnCount() > 0) {
            tblVehicle.getColumnModel().getColumn(0).setMinWidth(50);
            tblVehicle.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblVehicle.getColumnModel().getColumn(0).setMaxWidth(50);
            tblVehicle.getColumnModel().getColumn(3).setHeaderValue("Email");
            tblVehicle.getColumnModel().getColumn(4).setHeaderValue("tin#");
            tblVehicle.getColumnModel().getColumn(7).setHeaderValue("Manufacturer");
            tblVehicle.getColumnModel().getColumn(10).setHeaderValue("Title 9");
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vehiclePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        vehiclePanelLayout.setVerticalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiclePanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiclePanelLayout.createSequentialGroup()
                    .addGap(0, 449, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtManufacturer)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addGap(16, 16, 16))
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)))
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(vehiclePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(driverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbHeader)
                .addGap(38, 38, 38)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadDate(1);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void pageParkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageParkingMouseClicked

    }//GEN-LAST:event_pageParkingMouseClicked

    private void tblVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehicleMouseClicked
        // When a record is clicked 
        DefaultTableModel model = (DefaultTableModel) tblVehicle.getModel();
        int selectedRowIndex = tblVehicle.getSelectedRow();
        id = model.getValueAt(selectedRowIndex, 10).toString();
        System.out.println(id);

        String[] inputs = new String[]{txtFullName.getText(), txtMobile.getText(), txtEmail.getText(), txtCode.getText(),
            txtLicensePlate.getText(), txtManufacturer.getText(), txtModel.getText(), txtYear.getText(), id};

        try {
            ArrayList<Object> arrayList = Client.stub.getRows("customer", inputs, -1, 1);
            Form_V_Search_Detail.setEditable(false);
            for (Object row : arrayList) {
                Object[] records = (Object[]) row;

                firstName = (String) records[0];
                middleName = (String) records[1];
                lastName = (String) records[2];
                gender = (String) records[3];
                address = (String) records[4];
                dateOfBirth = (String) records[6];
                jobTitle = (String) records[7];
                mobileNo = (String) records[5];
                email = (String) records[9];
                tinNo = (String) records[8];

                codeNo = (String) records[10];
                licensePlate = (String) records[11];
                manufacturer = (String) records[12];
                modelNo = (String) records[13];
                year = (String) records[14];
                id = (String) records[15];
                System.out.println(firstName);
                Form_V_Search_Detail.txtFirstName.setText(firstName);
                Form_V_Search_Detail.txtMiddleName.setText(middleName);
                Form_V_Search_Detail.txtLastName.setText(lastName);
                Form_V_Search_Detail.txtAddress.setText(address);
                Form_V_Search_Detail.txtEmail.setText(email);
                Form_V_Search_Detail.txtMobile.setText(mobileNo);
                Form_V_Search_Detail.txtDateOfBirth.setText(dateOfBirth);
                Form_V_Search_Detail.txtJobTitle.setText(jobTitle);
                Form_V_Search_Detail.txtTin.setText(tinNo);

                Form_V_Search_Detail.btnGenderGroup.clearSelection();
                if (gender.equals("Male")) {
                    Form_V_Search_Detail.rbMale.setSelected(true);
                } else if (gender.equals("Female")) {
                    Form_V_Search_Detail.rbFemale.setSelected(true);
                } else {
                    Form_V_Search_Detail.btnGenderGroup.clearSelection();
                }
                Form_V_Search_Detail.txtCode.setText(codeNo);
                Form_V_Search_Detail.txtLicensePlate.setText(licensePlate);
                Form_V_Search_Detail.txtManufacturer.setText(manufacturer);
                Form_V_Search_Detail.txtModel.setText(modelNo);
                Form_V_Search_Detail.txtYear.setText(year);
            }
            Client.setForm(vehicleSearchDetail);
        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_Search.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }
    }//GEN-LAST:event_tblVehicleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHeader;
    private pms.pagination.Pagination pageVehicle;
    private pms.form.Table tblVehicle;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtYear;
    private javax.swing.JPanel vehiclePanel;
    // End of variables declaration//GEN-END:variables
}
