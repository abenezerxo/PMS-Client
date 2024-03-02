package pms.form;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Client;
import pms.common.PopUp;

public class Form_V_Out extends javax.swing.JPanel {

    public static String parkingEntryId;
    public static String parkedFor;
    public static Form_V_Out_Advice advicePage = new Form_V_Out_Advice();

    public Form_V_Out() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHeader = new javax.swing.JLabel();
        lbDriver = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPlate = new javax.swing.JTextField();
        btnFetch = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lbCodeIn = new javax.swing.JLabel();
        lbPlateIn = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lbFullNameIn = new javax.swing.JLabel();
        lbMobileIn = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lbManuIn = new javax.swing.JLabel();
        lbModelIn = new javax.swing.JLabel();
        lbYearIn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDriver1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblModel1 = new javax.swing.JLabel();
        lbParkingLotNo = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lbParkingLotDesc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("E x i t  P a r k i n g  L o t");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  G e t  T h e  V e h i c l e");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vehicle Information");

        jPanel1.setBackground(new java.awt.Color(221, 240, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Code:");
        jPanel1.add(jLabel1);

        txtCode.setColumns(4);
        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtCode);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("License Plate#:");
        jPanel1.add(jLabel2);

        txtPlate.setColumns(8);
        txtPlate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtPlate);

        btnFetch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnFetch.setText("F e t c h");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });
        jPanel1.add(btnFetch);

        jPanel14.setBackground(new java.awt.Color(221, 240, 255));

        jPanel15.setBackground(new java.awt.Color(206, 218, 233));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        lbCodeIn.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbCodeIn.setText(" ");
        lbCodeIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.add(lbCodeIn);

        lbPlateIn.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbPlateIn.setText(" ");
        lbPlateIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.add(lbPlateIn);

        jPanel16.setBackground(new java.awt.Color(206, 218, 233));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        lbFullNameIn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbFullNameIn.setText(" ");
        jPanel16.add(lbFullNameIn);

        lbMobileIn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbMobileIn.setText(" ");
        jPanel16.add(lbMobileIn);

        jPanel17.setBackground(new java.awt.Color(206, 218, 233));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        lbManuIn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbManuIn.setText(" ");
        jPanel17.add(lbManuIn);

        lbModelIn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbModelIn.setText(" ");
        jPanel17.add(lbModelIn);

        lbYearIn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbYearIn.setText(" ");
        jPanel17.add(lbYearIn);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(221, 240, 255));

        lblDriver1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDriver1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDriver1.setText("Parked@");
        jPanel3.add(lblDriver1);

        jPanel18.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        lblModel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblModel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModel1.setText("Parking Lot#:");
        jPanel18.add(lblModel1);

        lbParkingLotNo.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbParkingLotNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbParkingLotNo.setText("  ");
        jPanel18.add(lbParkingLotNo);

        lbParkingLotDesc.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbParkingLotDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbParkingLotDesc.setText("  ");
        jPanel19.add(lbParkingLotDesc);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Parking Space");

        jPanel2.setBackground(new java.awt.Color(221, 240, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("P a r k e d  F o r :");
        jPanel2.add(jLabel3);

        jPanel5.setBackground(new java.awt.Color(201, 231, 255));

        lblTime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("  ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5);

        jPanel20.setBackground(new java.awt.Color(221, 240, 255));
        jPanel20.setLayout(new java.awt.GridBagLayout());

        btnExit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnExit.setText("E X I T  P A R K I N G");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel20.add(btnExit, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(driverPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDriver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbHeader)
                .addGap(18, 18, 18)
                .addComponent(lbDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (lbCodeIn.getText().equals(" ")) {
            PopUp.showErrorMessage("Please Select a Vehicle First?", "Error");
        } else {
            // Exit Parking Lot by Creating Advice
            String[] inputs = new String[]{Client.companyID, parkingEntryId};

            try {
                ArrayList<Object> arrayList = Client.stub.fetchACar("out_exit", inputs);
                if (arrayList.isEmpty()) {
                    PopUp.showErrorMessage("Something is not right!! Please try again", "!!! ERROR !!!");
                } else {
                    Object[] row = (Object[]) arrayList.get(0);
                    if (row.length >= 1) {
                        Form_V_Out_Advice.lbFullName.setText(row[0] == null ? " " : row[0].toString());
                        Form_V_Out_Advice.codeNo = (row[1] == null ? " " : row[1].toString());
                        Form_V_Out_Advice.plateNo = (row[2] == null ? " " : row[2].toString());
                        Form_V_Out_Advice.lbTinCustomer.setText(row[3] == null ? " " : row[3].toString());
                        Form_V_Out_Advice.lbRemark.setText(row[4] == null ? " " : row[4].toString());
                        Form_V_Out_Advice.lbCompanyName.setText(row[5] == null ? " " : row[5].toString());
                        Form_V_Out_Advice.lbTinCompany.setText(row[6] == null ? " " : row[6].toString());
                        Form_V_Out_Advice.lbAddress1.setText(row[7] == null ? " " : row[7].toString());
                        Form_V_Out_Advice.lbAddress2.setText(row[8] == null ? " " : row[8].toString());
                        Form_V_Out_Advice.lbFeePerHr.setText(row[9] == null ? " " : row[9].toString());
                        Form_V_Out_Advice.lbPhoneNo.setText(row[10] == null ? " " : row[10].toString());
                        Form_V_Out_Advice.lbRecepitNo.setText(parkingEntryId);

                        if (PopUp.confirmationDialog("Are you sure you want to Exit " + Form_V_Out_Advice.lbFullName.getText() + "'s "
                                + Form_V_Out_Advice.codeNo + "-" + Form_V_Out_Advice.plateNo
                                + " Vehicle?", "Exit Parking Lot") == JOptionPane.YES_OPTION) {
                            /*Redirecto to Advice Page */
                            Client.setForm(advicePage);
                        }
                    }
                }
            } catch (RemoteException ex) {
                Logger.getLogger(Form_V_Out.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        // preper the Parameters for search Code & License Plate
        String[] inputs = new String[]{Client.companyID, txtCode.getText(), txtPlate.getText()};
        try {
            ArrayList<Object> arrayList = Client.stub.fetchACar("out", inputs);
            if (arrayList.isEmpty()) {
                PopUp.showErrorMessage("Please Insert a correct PARKED Vehicle Plate number", "No Parked Vehicle Found");
            } else {
                Object[] row = (Object[]) arrayList.get(0);
                if (row.length >= 10) {
                    lbFullNameIn.setText(row[0] == null ? " " : row[0].toString());
                    lbMobileIn.setText(row[1] == null ? " " : row[1].toString());
                    lbCodeIn.setText(row[2] == null ? " " : row[2].toString());
                    lbPlateIn.setText(row[3] == null ? " " : row[3].toString());
                    lbManuIn.setText(row[4] == null ? " " : row[4].toString());
                    lbModelIn.setText(row[5] == null ? " " : row[5].toString());
                    lbYearIn.setText(row[6] == null ? " " : row[6].toString());

                    lbParkingLotNo.setText(row[7] == null ? " " : row[7].toString());
                    lbParkingLotDesc.setText(row[8] == null ? " " : row[8].toString());
                    lbYearIn.setText(row[9] == null ? " " : row[9].toString());
                    parkedFor = (row[10] == null ? " " : row[10].toString());
                    lblTime.setText(row[10] == null ? " " : row[10].toString());
                    parkingEntryId = row[11] == null ? " " : row[11].toString();
                    System.out.println("Parking ID: " + parkingEntryId);
                } else {

                }
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_In.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }
    }//GEN-LAST:event_btnFetchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFetch;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbCode1;
    private javax.swing.JLabel lbCodeIn;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbFullName1;
    private javax.swing.JLabel lbFullNameIn;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbManu;
    private javax.swing.JLabel lbManu1;
    private javax.swing.JLabel lbManuIn;
    private javax.swing.JLabel lbMobile;
    private javax.swing.JLabel lbMobile1;
    private javax.swing.JLabel lbMobileIn;
    private javax.swing.JLabel lbModel;
    private javax.swing.JLabel lbModel1;
    private javax.swing.JLabel lbModelIn;
    private javax.swing.JLabel lbParkingLotDesc;
    private javax.swing.JLabel lbParkingLotNo;
    private javax.swing.JLabel lbPlate;
    private javax.swing.JLabel lbPlate1;
    private javax.swing.JLabel lbPlateIn;
    private javax.swing.JLabel lbYear;
    private javax.swing.JLabel lbYear1;
    private javax.swing.JLabel lbYearIn;
    private javax.swing.JLabel lblDriver1;
    private javax.swing.JLabel lblModel1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtPlate;
    // End of variables declaration//GEN-END:variables
}
