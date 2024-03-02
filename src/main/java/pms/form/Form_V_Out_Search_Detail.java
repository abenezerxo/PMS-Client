package pms.form;

import main.Client;

public class Form_V_Out_Search_Detail extends javax.swing.JPanel {

    public Form_V_Out_Search_Detail() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        date = new pms.component.DateChooser();
        lbHeader = new javax.swing.JLabel();
        lbDriver = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        lbPlate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDriver3 = new javax.swing.JLabel();
        lbFullname = new javax.swing.JLabel();
        lblDriver = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        lblDriver4 = new javax.swing.JLabel();
        lbMobile = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblDriver7 = new javax.swing.JLabel();
        lbManufacturer = new javax.swing.JLabel();
        lblDriver9 = new javax.swing.JLabel();
        lbModel = new javax.swing.JLabel();
        lblDriver11 = new javax.swing.JLabel();
        lbYear = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblDriver15 = new javax.swing.JLabel();
        lbParkingLotNo = new javax.swing.JLabel();
        lblDriver16 = new javax.swing.JLabel();
        lbParkingLotDesc = new javax.swing.JLabel();
        lblDriver17 = new javax.swing.JLabel();
        lbParkedFrom = new javax.swing.JLabel();
        lblDriver18 = new javax.swing.JLabel();
        lbParkedTo = new javax.swing.JLabel();
        lblDriver19 = new javax.swing.JLabel();
        lbDuration = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnFetch = new javax.swing.JButton();

        date.setForeground(new java.awt.Color(85, 146, 85));

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("E x i t e d  V e h i c l e");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("         C u s t o m e r  I n f o r m a t i o n");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("                 V e h i c l e");

        jPanel1.setBackground(new java.awt.Color(221, 240, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("License Plate");
        jPanel1.add(jLabel1);

        lbCode.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbCode.setText("Code");
        lbCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbCode);

        lbPlate.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbPlate.setText("Plate");
        lbPlate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbPlate);

        jPanel3.setBackground(new java.awt.Color(221, 240, 255));
        jPanel3.setLayout(new java.awt.GridLayout(3, 2, 20, 5));

        lblDriver3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver3.setText("Full Name:");
        jPanel3.add(lblDriver3);

        lbFullname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbFullname.setText("Surafel Tadesse");
        jPanel3.add(lbFullname);

        lblDriver.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver.setText("Address:");
        jPanel3.add(lblDriver);

        lbAddress.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbAddress.setText("Ferensay Legasion");
        jPanel3.add(lbAddress);

        lblDriver4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver4.setText("Mobile#:");
        jPanel3.add(lblDriver4);

        lbMobile.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbMobile.setText("0977423120");
        jPanel3.add(lbMobile);

        jPanel4.setBackground(new java.awt.Color(221, 240, 255));
        jPanel4.setLayout(new java.awt.GridLayout(3, 2, 20, 10));

        lblDriver7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver7.setText("Manufacturer:");
        jPanel4.add(lblDriver7);

        lbManufacturer.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbManufacturer.setText("Surafel Tadesse");
        jPanel4.add(lbManufacturer);

        lblDriver9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver9.setText("Model:");
        jPanel4.add(lblDriver9);

        lbModel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbModel.setText("Black SUV");
        jPanel4.add(lbModel);

        lblDriver11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver11.setText("Year:");
        jPanel4.add(lblDriver11);

        lbYear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbYear.setText("2020");
        jPanel4.add(lbYear);

        jPanel5.setBackground(new java.awt.Color(221, 240, 255));
        jPanel5.setLayout(new java.awt.GridLayout(5, 2, 20, 10));

        lblDriver15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver15.setText("Parking Lot#:");
        jPanel5.add(lblDriver15);

        lbParkingLotNo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbParkingLotNo.setText("Surafel Tadesse");
        jPanel5.add(lbParkingLotNo);

        lblDriver16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver16.setText("Description");
        jPanel5.add(lblDriver16);

        lbParkingLotDesc.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbParkingLotDesc.setText("Infrom of the 3rd floor building");
        jPanel5.add(lbParkingLotDesc);

        lblDriver17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver17.setText("Parked From:");
        jPanel5.add(lblDriver17);

        lbParkedFrom.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbParkedFrom.setText("6-Feb-2024");
        jPanel5.add(lbParkedFrom);

        lblDriver18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver18.setText("To:");
        jPanel5.add(lblDriver18);

        lbParkedTo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbParkedTo.setText("06-Feb-2024");
        jPanel5.add(lbParkedTo);

        lblDriver19.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDriver19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDriver19.setText("Duration");
        jPanel5.add(lblDriver19);

        lbDuration.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbDuration.setText("5hrs");
        jPanel5.add(lbDuration);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("                 D r i v e r");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("                 P a r k i n g  L o t");

        btnFetch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnFetch.setText("E X I T");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(driverPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFetch)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(driverPanelLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jLabel5)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driverPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbHeader)
                .addGap(20, 20, 20)
                .addComponent(lbDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        Client.setForm(Client.VehicleInSearch);
    }//GEN-LAST:event_btnFetchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFetch;
    private javax.swing.ButtonGroup btnGenderGroup;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel lbAddress;
    public static javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbDriver;
    public static javax.swing.JLabel lbDuration;
    public static javax.swing.JLabel lbFullname;
    private javax.swing.JLabel lbHeader;
    public static javax.swing.JLabel lbManufacturer;
    public static javax.swing.JLabel lbMobile;
    public static javax.swing.JLabel lbModel;
    public static javax.swing.JLabel lbParkedFrom;
    public static javax.swing.JLabel lbParkedTo;
    public static javax.swing.JLabel lbParkingLotDesc;
    public static javax.swing.JLabel lbParkingLotNo;
    public static javax.swing.JLabel lbPlate;
    public static javax.swing.JLabel lbYear;
    private javax.swing.JLabel lblDriver;
    private javax.swing.JLabel lblDriver11;
    private javax.swing.JLabel lblDriver15;
    private javax.swing.JLabel lblDriver16;
    private javax.swing.JLabel lblDriver17;
    private javax.swing.JLabel lblDriver18;
    private javax.swing.JLabel lblDriver19;
    private javax.swing.JLabel lblDriver3;
    private javax.swing.JLabel lblDriver4;
    private javax.swing.JLabel lblDriver7;
    private javax.swing.JLabel lblDriver9;
    // End of variables declaration//GEN-END:variables
}
