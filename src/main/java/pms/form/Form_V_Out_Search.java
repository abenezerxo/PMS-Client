package pms.form;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import main.Client;
import pms.common.PopUp;
import pms.pagination.EventPagination;
import pms.pagination.style.PaginationItemRenderStyle1;

public class Form_V_Out_Search extends javax.swing.JPanel {

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
    private static String parkedFrom;
    private static String parkedTo;
    private static String duration;

    private static String id;
    public static Form_V_Out_Search_Detail vehicleOutDetail = new Form_V_Out_Search_Detail();

    public Form_V_Out_Search() {
        initComponents();
        pageOutVehicle.setPaginationItemRender(new PaginationItemRenderStyle1());
        pageOutVehicle.addEventPagination(new EventPagination() {
            @Override
            public void pageChanged(int page) {
                loadDate(page);
                System.out.println("page:: " + page);
            }
        });

        // hide ID column from the vehicle table
        TableColumnModel tcm = tblVehicleOut.getColumnModel();
        tcm.removeColumn(tcm.getColumn(8));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        date = new pms.component.DateChooser();
        lbHeader = new javax.swing.JLabel();
        lbDriver = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehicleOut = new pms.form.Table();
        jPanel1 = new javax.swing.JPanel();
        pageOutVehicle = new pms.pagination.Pagination();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPlate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLot = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();

        date.setForeground(new java.awt.Color(85, 146, 85));

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("O u t  V e h i c l e  S e a r c h");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  S e a r c h  E x i t e d  V e h i c l e s");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jPanel3.setBackground(new java.awt.Color(221, 240, 255));

        tblVehicleOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No#", "Code#", "Plate#", "Lot#", "Name", "Entry Time", "Exit Time", "Duration", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVehicleOut.setRowHeight(35);
        tblVehicleOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehicleOutMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehicleOut);
        if (tblVehicleOut.getColumnModel().getColumnCount() > 0) {
            tblVehicleOut.getColumnModel().getColumn(0).setMinWidth(40);
            tblVehicleOut.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblVehicleOut.getColumnModel().getColumn(0).setMaxWidth(40);
            tblVehicleOut.getColumnModel().getColumn(1).setMinWidth(60);
            tblVehicleOut.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblVehicleOut.getColumnModel().getColumn(1).setMaxWidth(60);
        }

        jPanel1.setOpaque(false);

        pageOutVehicle.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pageOutVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pageOutVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Code:");
        jPanel2.add(jLabel1);

        txtCode.setColumns(3);
        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        jPanel2.add(txtCode);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("License Plate#:");
        jPanel2.add(jLabel2);

        txtPlate.setColumns(7);
        txtPlate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtPlate);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Name:");
        jPanel2.add(jLabel5);

        txtName.setColumns(13);
        txtName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtName);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Parking Lot#:");
        jPanel2.add(jLabel6);

        txtLot.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(txtLot);

        btnSearch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch);

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbHeader)
                .addGap(18, 18, 18)
                .addComponent(lbDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadDate(int page) {
        DefaultTableModel model = (DefaultTableModel) tblVehicleOut.getModel();
        model.setRowCount(0);
        int pageLimit = 10;
        int numberOfRecords = 0;

        try {
            String[] inputs = new String[]{Client.companyID, txtName.getText(), txtCode.getText(), txtPlate.getText(), txtLot.getText()};
            numberOfRecords = Client.stub.getTotalCount("exited", inputs);
            int totalPage = (int) Math.ceil(numberOfRecords / pageLimit);

            pageOutVehicle.setPagegination(page, totalPage);

            ArrayList<Object> arrayList = Client.stub.getRows("exited", inputs, page, pageLimit);
            for (Object row : arrayList) {
                /*For every row add it to the table */
                tblVehicleOut.addRow((Object[]) row);
            }
        } catch (Exception e) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
            PopUp.connectionError();
        }

    }

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadDate(1);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblVehicleOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehicleOutMouseClicked
        // When a record is clicked 
        DefaultTableModel model = (DefaultTableModel) tblVehicleOut.getModel();
        int selectedRowIndex = tblVehicleOut.getSelectedRow();
        id = model.getValueAt(selectedRowIndex, 8).toString();
        System.out.println(id);

        String[] inputs = new String[]{Client.companyID, txtName.getText(), txtCode.getText(), txtPlate.getText(), txtLot.getText(), id};

        try {
            ArrayList<Object> arrayList = Client.stub.getRows("exited", inputs, -1, 1);
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
                parkedFrom = (String) records[10];
                parkedTo = (String) records[11];
                duration = (String) records[12];

                Form_V_Out_Search_Detail.lbFullname.setText(fullName);
                Form_V_Out_Search_Detail.lbAddress.setText(address);
                Form_V_Out_Search_Detail.lbMobile.setText(mobileNo);
                Form_V_Out_Search_Detail.lbCode.setText(codeNo);
                Form_V_Out_Search_Detail.lbPlate.setText(licensePlate);
                Form_V_Out_Search_Detail.lbManufacturer.setText(manufacturer);
                Form_V_Out_Search_Detail.lbModel.setText(modelNo);
                Form_V_Out_Search_Detail.lbYear.setText(year);
                Form_V_Out_Search_Detail.lbParkingLotNo.setText(parkingLotNo);
                Form_V_Out_Search_Detail.lbParkingLotDesc.setText(parkingLotDesc);
                Form_V_Out_Search_Detail.lbParkedFrom.setText(parkedFrom);
                Form_V_Out_Search_Detail.lbParkedTo.setText(parkedTo);
                Form_V_Out_Search_Detail.lbDuration.setText(duration);

            }
            Client.setForm(vehicleOutDetail);
        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_Out_Search.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }
    }//GEN-LAST:event_tblVehicleOutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel buttonPanel;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHeader;
    private pms.pagination.Pagination pageOutVehicle;
    private pms.form.Table tblVehicleOut;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtLot;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPlate;
    // End of variables declaration//GEN-END:variables
}
