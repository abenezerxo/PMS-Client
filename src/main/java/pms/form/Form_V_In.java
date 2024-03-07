package pms.form;

import java.rmi.RemoteException;
import java.security.spec.NamedParameterSpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import main.Client;
import pms.common.PopUp;

public class Form_V_In extends javax.swing.JPanel {

    public static String vehicleId;
    public static String parkingLotId;

    public Form_V_In() {
        initComponents();
        fillDataJList(listParkingLot);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        date = new pms.component.DateChooser();
        entryTimePicker = new com.raven.swing.TimePicker();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbCode = new javax.swing.JLabel();
        lbPlate = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbFullName = new javax.swing.JLabel();
        lbMobile = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbManu = new javax.swing.JLabel();
        lbModel = new javax.swing.JLabel();
        lbYear = new javax.swing.JLabel();
        lbVehicle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listParkingLot = new javax.swing.JList<>();
        btnPark = new javax.swing.JButton();
        btnEntryTime = new javax.swing.JButton();
        txtEntryTime = new javax.swing.JTextField();

        date.setForeground(new java.awt.Color(85, 146, 85));

        entryTimePicker.setForeground(new java.awt.Color(113, 114, 29));
        entryTimePicker.setDisplayText(txtEntryTime);

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("P a r k  A  V e h i c l e");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  G e t  T h e  V e h i c l e");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vehicle Information");

        jPanel1.setBackground(new java.awt.Color(221, 240, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Code:");

        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("License Plate#:");

        txtPlate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnFetch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnFetch.setText("F e t c h");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnFetch))
                .addGap(9, 9, 9))
        );

        jPanel3.setBackground(new java.awt.Color(221, 240, 255));

        jPanel4.setBackground(new java.awt.Color(206, 218, 233));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        lbCode.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbCode.setText(" ");
        lbCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(lbCode);

        lbPlate.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbPlate.setText(" ");
        lbPlate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(lbPlate);

        jPanel6.setBackground(new java.awt.Color(206, 218, 233));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        lbFullName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbFullName.setText(" ");
        jPanel6.add(lbFullName);

        lbMobile.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbMobile.setText(" ");
        jPanel6.add(lbMobile);

        jPanel5.setBackground(new java.awt.Color(206, 218, 233));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        lbManu.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbManu.setText(" ");
        jPanel5.add(lbManu);

        lbModel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbModel.setText(" ");
        jPanel5.add(lbModel);

        lbYear.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbYear.setText(" ");
        jPanel5.add(lbYear);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(driverPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(139, 139, 139)))
                        .addContainerGap())))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lbVehicle.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbVehicle.setText("  C h o o s e  P a r k i n g  S p o t");

        jPanel2.setBackground(new java.awt.Color(232, 245, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Parking Lot#:");

        listParkingLot.setBackground(new java.awt.Color(255, 255, 204));
        listParkingLot.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        listParkingLot.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        listParkingLot.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listParkingLot.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listParkingLot.setVisibleRowCount(4);
        jScrollPane1.setViewportView(listParkingLot);

        btnPark.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnPark.setText("P A R K");
        btnPark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParkActionPerformed(evt);
            }
        });

        btnEntryTime.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEntryTime.setText(" E N T R Y  T I M E");
        btnEntryTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntryTimeActionPerformed(evt);
            }
        });

        txtEntryTime.setBackground(new java.awt.Color(255, 255, 204));
        txtEntryTime.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        txtEntryTime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEntryTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntryTime, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntryTime, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnPark, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEntryTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEntryTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbHeader)
                .addGap(18, 18, 18)
                .addComponent(lbDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbVehicle)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnParkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParkActionPerformed
        if (lbCode.getText().equals(" ")) {
            PopUp.showErrorMessage("Please Select a Vehicle?", "Error");
        } else if (listParkingLot.isSelectionEmpty()) {
            PopUp.showErrorMessage("Please Select a Parking Spot Also?", "Error");
        } else {
            // Park the car here
            parkingLotId = listParkingLot.getSelectedValue();
            try {
                int result = Client.stub.parkACar(Client.companyID, vehicleId, parkingLotId, getEntryTime());
                if (result > 0) {
                    PopUp.infoDialog("The Vehicle of " + lbFullName.getText() + " " + lbCode.getText() + "-" + lbPlate.getText() + " has been parked Sucessfuly", "Parking Completed");
                    resetInputs();
                } else {
                    PopUp.showErrorMessage("Something is not right!! Please try again", "!!! ERROR !!!");
                }
            } catch (RemoteException ex) {
                Logger.getLogger(Form_V_In.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnParkActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        // preper the Parameters for search Code & License Plate
        String[] inputs = new String[]{txtCode.getText(), txtPlate.getText()};
        try {
            ArrayList<Object> arrayList = Client.stub.fetchACar("in", inputs);
            if (arrayList.isEmpty()) {
                PopUp.showErrorMessage("Please Insert correct a Correct Vehicle Plate number", "Vehicle Not Found");
            } else {
                Object[] row = (Object[]) arrayList.get(0);
                if (row.length >= 6) {
                    lbFullName.setText(row[0] == null ? " " : row[0].toString());
                    lbMobile.setText(row[1] == null ? " " : row[1].toString());
                    lbCode.setText(row[2] == null ? " " : row[2].toString());
                    lbPlate.setText(row[3] == null ? " " : row[3].toString());
                    lbManu.setText(row[4] == null ? " " : row[4].toString());
                    lbModel.setText(row[5] == null ? " " : row[5].toString());
                    lbYear.setText(row[6] == null ? " " : row[6].toString());
                    vehicleId = row[7] == null ? " " : row[7].toString();
                    System.out.println(vehicleId);
                } else {

                }
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_In.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }

    }//GEN-LAST:event_btnFetchActionPerformed

    private void btnEntryTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntryTimeActionPerformed
        // TODO add your handling code here:
        entryTimePicker.showPopup(this, 580, 200);
    }//GEN-LAST:event_btnEntryTimeActionPerformed

    private String getEntryTime() {
        // convert AM/PM to 24hr time stamp
        String time = txtEntryTime.getText();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = ft.format(new Date());

        if (time.contains("AM")) {
            return currentDate + " " + time.replace(" AM", "");

        } else if (time.contains("PM")) {
            String timeOnly = time.replace(" PM", "");
            return currentDate + " " + (Integer.parseInt((timeOnly.split(":"))[0]) + 12) + ":" + (timeOnly.split(":"))[1];
        }
        return time;
    }

    public void fillDataJList(JList jlist) {
        DefaultListModel model = new DefaultListModel();
        String[] inputs = new String[]{Client.companyID, "%", "%"};
        try {
            // Bring all parking lot spaces
            ArrayList<Object> parkingLots = Client.stub.getRows("parking_lot", inputs, 1, 10000);
            if (parkingLots.isEmpty()) {
            } else {
                for (Object parkingLot : parkingLots) {
                    model.addElement(((Object[]) parkingLot)[1]);
                }
                jlist.setModel(model);
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_In.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void resetInputs(){
        txtCode.setText("");
        txtPlate.setText("");
        
        lbCode.setText(" ");
        lbPlate.setText(" ");
        lbFullName.setText(" ");
        lbMobile.setText(" ");
        lbManu.setText(" ");
        lbModel.setText(" ");
        lbYear.setText(" ");
        
        listParkingLot.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntryTime;
    private javax.swing.JButton btnFetch;
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnPark;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private com.raven.swing.TimePicker entryTimePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbManu;
    private javax.swing.JLabel lbMobile;
    private javax.swing.JLabel lbModel;
    private javax.swing.JLabel lbPlate;
    private javax.swing.JLabel lbVehicle;
    private javax.swing.JLabel lbYear;
    private javax.swing.JList<String> listParkingLot;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEntryTime;
    private javax.swing.JTextField txtPlate;
    // End of variables declaration//GEN-END:variables
}
