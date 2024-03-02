package pms.form;

import java.awt.Color;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Client;

public class Form_P_Registration extends javax.swing.JPanel {

    public Form_P_Registration() {
        initComponents();
    }

    private void clearForm() {
        txtLot.setText("");
        txtDescription.setText("");
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLot = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        buttonPanel1 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();

        date.setForeground(new java.awt.Color(85, 146, 85));

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("P a r k i n g  L o t  R e g i s t r a t i o n");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  P a r k i n g  L o t  I n f o r m a t i o n");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jPanel3.setBackground(new java.awt.Color(221, 240, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Parking Lot#:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Description:");

        txtLot.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLot.setToolTipText("");
        txtLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDescription.setRows(5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLot)
                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(221, 240, 255));

        buttonPanel1.setBackground(new java.awt.Color(221, 240, 255));

        btnReset.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnReset.setText("R E S E T");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSave.setText("S A V E");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanel1Layout = new javax.swing.GroupLayout(buttonPanel1);
        buttonPanel1.setLayout(buttonPanel1Layout);
        buttonPanel1Layout.setHorizontalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnReset)
                .addGap(111, 111, 111)
                .addComponent(btnSave)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        buttonPanel1Layout.setVerticalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(buttonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
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
                .addGap(20, 20, 20)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtLot.getText().length() == 0) {
                txtLot.setBackground(Color.RED);
                JOptionPane.showMessageDialog(jPanel3, "Please fill Parking Lot Number", "Error", JOptionPane.WARNING_MESSAGE);
                txtLot.setBackground(Color.WHITE);
                txtLot.grabFocus();
                
            } else {
                int result = Client.stub.registerParkingLot(Client.companyID, txtLot.getText(), txtDescription.getText());
                System.out.println(result);
                if (result == 1) {
                    JOptionPane.showMessageDialog(jPanel3, "Parking Lot has been Registered successfuly", "Success Registration", JOptionPane.INFORMATION_MESSAGE);
                    clearForm();
                } else {
                    JOptionPane.showMessageDialog(jPanel3, "Something Went Wrong please try again", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Form_P_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel buttonPanel1;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtLot;
    // End of variables declaration//GEN-END:variables
}
