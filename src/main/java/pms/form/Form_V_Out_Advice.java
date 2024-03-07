package pms.form;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Client;
import pms.common.PopUp;


public class Form_V_Out_Advice extends javax.swing.JPanel {
    
    public static String codeNo;
    public static String plateNo;
    
    public Form_V_Out_Advice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        date = new pms.component.DateChooser();
        lbHeader = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbDriver1 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        panelAdvice = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbTinCompany = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbCompanyName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbAddress1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbAddress2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbPhoneNo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbDateTime = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbDriver7 = new javax.swing.JLabel();
        lbRecepitNo = new javax.swing.JLabel();
        lbDriver10 = new javax.swing.JLabel();
        lbFullName = new javax.swing.JLabel();
        lbDriver12 = new javax.swing.JLabel();
        lbTinCustomer = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbDriver15 = new javax.swing.JLabel();
        lbDriver27 = new javax.swing.JLabel();
        lbFeePerHr = new javax.swing.JLabel();
        lbCalulcation = new javax.swing.JLabel();
        lbDriver26 = new javax.swing.JLabel();
        lbFeeBeforeTax = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbDriver18 = new javax.swing.JLabel();
        lbFeeBeforeTax2 = new javax.swing.JLabel();
        lbDriver20 = new javax.swing.JLabel();
        lbTax = new javax.swing.JLabel();
        lbDriver22 = new javax.swing.JLabel();
        lbTotalFee = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lbDriver25 = new javax.swing.JLabel();
        lbRemark = new javax.swing.JLabel();

        date.setForeground(new java.awt.Color(85, 146, 85));

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("E x i t  P a r k i n g  L o t");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jPanel1.setBackground(new java.awt.Color(221, 240, 255));

        lbDriver1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbDriver1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDriver1.setText("A d v i c e");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDriver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDriver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        btnCancel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnCancel.setText("C A N C E L");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnComplete.setText("C O M P L E T E");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        panelAdvice.setBackground(new java.awt.Color(201, 231, 255));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        lbTinCompany.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbTinCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTinCompany.setText("TIN: 0005657455");
        jPanel2.add(lbTinCompany);

        jPanel3.setOpaque(false);

        lbCompanyName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCompanyName.setText("SINDU GEBERU PARKING FACILITY PLC");
        jPanel3.add(lbCompanyName);

        jPanel4.setOpaque(false);

        lbAddress1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbAddress1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddress1.setText("A.A. S/C KIRKOS W.08 H.NO 485/C");
        jPanel4.add(lbAddress1);

        jPanel6.setOpaque(false);

        lbAddress2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbAddress2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddress2.setText("KASSANCHIS MENEHARIA AREAD");
        jPanel6.add(lbAddress2);

        jPanel7.setOpaque(false);

        lbPhoneNo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPhoneNo.setText("09123456789/09987456321");
        jPanel7.add(lbPhoneNo);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        lbDateTime.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbDateTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDateTime.setText("07/02/2024 08:12AM");
        jPanel8.add(lbDateTime);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(3, 2, 15, 5));

        lbDriver7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver7.setText("Receipt No:");
        jPanel9.add(lbDriver7);

        lbRecepitNo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbRecepitNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbRecepitNo.setText("00000001");
        jPanel9.add(lbRecepitNo);

        lbDriver10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver10.setText("TO:");
        jPanel9.add(lbDriver10);

        lbFullName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbFullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFullName.setText("Abeneze Desta");
        jPanel9.add(lbFullName);

        lbDriver12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver12.setText("TIN:");
        jPanel9.add(lbDriver12);

        lbTinCustomer.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbTinCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTinCustomer.setText("0002212121");
        jPanel9.add(lbTinCustomer);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridLayout(2, 3, 0, 10));

        lbDriver15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver15.setText("Parking for 1hr");
        jPanel12.add(lbDriver15);

        lbDriver27.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDriver27.setText("      -------------------");
        jPanel12.add(lbDriver27);

        lbFeePerHr.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbFeePerHr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFeePerHr.setText("8.5 ETB");
        jPanel12.add(lbFeePerHr);

        lbCalulcation.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbCalulcation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCalulcation.setText("15 x 8.5");
        jPanel12.add(lbCalulcation);

        lbDriver26.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDriver26.setText("      -------------------");
        jPanel12.add(lbDriver26);

        lbFeeBeforeTax.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbFeeBeforeTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFeeBeforeTax.setText("127.5 ETB");
        jPanel12.add(lbFeeBeforeTax);

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.GridLayout(3, 2, 0, 10));

        lbDriver18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver18.setText("Amount:");
        jPanel13.add(lbDriver18);

        lbFeeBeforeTax2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbFeeBeforeTax2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFeeBeforeTax2.setText("127.5 ETB");
        jPanel13.add(lbFeeBeforeTax2);

        lbDriver20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver20.setText("Tax(15%):");
        jPanel13.add(lbDriver20);

        lbTax.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTax.setText("19.13 ETB");
        jPanel13.add(lbTax);

        lbDriver22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbDriver22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDriver22.setText("Total:");
        jPanel13.add(lbDriver22);

        lbTotalFee.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbTotalFee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTotalFee.setText("146.6 ETB");
        jPanel13.add(lbTotalFee);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        lbDriver25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbDriver25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDriver25.setText("Remark:");
        jPanel17.add(lbDriver25);

        lbRemark.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lbRemark.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbRemark.setText("Parking Fee for 8.5hrs");
        jPanel17.add(lbRemark);

        javax.swing.GroupLayout panelAdviceLayout = new javax.swing.GroupLayout(panelAdvice);
        panelAdvice.setLayout(panelAdviceLayout);
        panelAdviceLayout.setHorizontalGroup(
            panelAdviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdviceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAdviceLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdviceLayout.createSequentialGroup()
                        .addGroup(panelAdviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAdviceLayout.setVerticalGroup(
            panelAdviceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdviceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(panelAdvice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelAdvice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnComplete)
                        .addGap(69, 69, 69)
                        .addComponent(btnCancel)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbHeader)
                .addGap(5, 5, 5)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Client.setForm(Client.vehicleOut);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        try {
            // TODO add your handling code here:
            
            if (Client.stub.updateARecord("exit_parking_lot", new String[]{Client.companyID, Form_V_Out.parkingEntryId}) > 0) {
                PopUp.infoDialog("Transaction has completed Successfully! ", "Success");
                /*Redirecto to Vehicle Out Page */
                Client.vehicleOut = new Form_V_Out();
                Client.setForm(Client.vehicleOut);
            } else {
                PopUp.showGenericError();
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Form_V_Out_Advice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnComplete;
    private javax.swing.ButtonGroup btnGenderGroup;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JLabel lbAddress1;
    public static javax.swing.JLabel lbAddress2;
    public static javax.swing.JLabel lbCalulcation;
    public static javax.swing.JLabel lbCompanyName;
    public static javax.swing.JLabel lbDateTime;
    private javax.swing.JLabel lbDriver1;
    private javax.swing.JLabel lbDriver10;
    private javax.swing.JLabel lbDriver12;
    private javax.swing.JLabel lbDriver15;
    private javax.swing.JLabel lbDriver18;
    private javax.swing.JLabel lbDriver20;
    private javax.swing.JLabel lbDriver22;
    private javax.swing.JLabel lbDriver25;
    private javax.swing.JLabel lbDriver26;
    private javax.swing.JLabel lbDriver27;
    private javax.swing.JLabel lbDriver7;
    public static javax.swing.JLabel lbFeeBeforeTax;
    public static javax.swing.JLabel lbFeeBeforeTax2;
    public static javax.swing.JLabel lbFeePerHr;
    public static javax.swing.JLabel lbFullName;
    private javax.swing.JLabel lbHeader;
    public static javax.swing.JLabel lbPhoneNo;
    public static javax.swing.JLabel lbRecepitNo;
    public static javax.swing.JLabel lbRemark;
    public static javax.swing.JLabel lbTax;
    public static javax.swing.JLabel lbTinCompany;
    public static javax.swing.JLabel lbTinCustomer;
    public static javax.swing.JLabel lbTotalFee;
    private javax.swing.JPanel panelAdvice;
    // End of variables declaration//GEN-END:variables
}
