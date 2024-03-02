package pms.admin;

import pms.form.*;
import java.awt.Color;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Client;
import static main.Client.parkingSearch;
import static main.Client.setForm;
import pms.common.PopUp;

public class Form_A_Search_Detail extends javax.swing.JPanel {

    public Form_A_Search_Detail() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnGroupEnableDisable = new javax.swing.ButtonGroup();
        driverPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        comboCompany = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rbEnabled = new javax.swing.JRadioButton();
        rbDisabled = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        buttonPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbAdminAgen = new javax.swing.JLabel();
        lbDriver = new javax.swing.JLabel();

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));
        driverPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(221, 240, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Company");

        txtUserName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Full Name");

        txtFullName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Role");

        comboRole.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Password");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        comboCompany.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Account Status");

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btnGroupEnableDisable.add(rbEnabled);
        rbEnabled.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbEnabled.setText("Enabled");
        rbEnabled.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rbEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnabledActionPerformed(evt);
            }
        });
        jPanel5.add(rbEnabled);

        btnGroupEnableDisable.add(rbDisabled);
        rbDisabled.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbDisabled.setText("Disabled");
        rbDisabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDisabledActionPerformed(evt);
            }
        });
        jPanel5.add(rbDisabled);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        jPanel2.setBackground(new java.awt.Color(221, 240, 255));

        buttonPanel1.setBackground(new java.awt.Color(221, 240, 255));

        btnDelete.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnDelete.setText("D E L E T E");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEdit.setText("E D I T");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanel1Layout = new javax.swing.GroupLayout(buttonPanel1);
        buttonPanel1.setLayout(buttonPanel1Layout);
        buttonPanel1Layout.setHorizontalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addContainerGap())
        );
        buttonPanel1Layout.setVerticalGroup(
            buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(buttonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(15, 15, 15))
        );

        btnX.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(btnX)
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(buttonPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnX)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new java.awt.GridBagLayout());

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("U s e r   M a n a g e m e n t");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 767;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 0, 29, 0);
        jPanel4.add(lbHeader, gridBagConstraints);

        lbAdminAgen.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbAdminAgen.setText("Agent / Admin");
        jPanel1.add(lbAdminAgen);

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  U s e r  I n f o r m a t i o n");
        jPanel1.add(lbDriver);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals("S A V E")) {
            System.out.println("save button cli");
            if (txtFullName.getText().equals(Form_V_Search.fullName) && txtFullName.getText().equals(Form_V_Search.fullName)) {
                JOptionPane.showMessageDialog(this, "The information has not been changed", "Error", JOptionPane.WARNING_MESSAGE);
            } else {

                /*update statement*/
//                int result;
//                try {
//                    result = Client.stub.updateARecord("parking_lot", new String[]{Client.companyID, Form_A_Search.parkingLotNo, txtUserName.getText(), txtDescription.getText()});
//                    System.out.println(result);
//                    if (result > 0) {
//                        changeButtonToEdit();
//                        setEditable(false);
//                        PopUp.updateSuccess("Parking Lot");
//                    } else {
//                        PopUp.showErrorMessage("Something is not right.. Please try again !!!", "Error");
//                    }
//
//                } catch (RemoteException ex) {
//                    Logger.getLogger(Form_A_Search_Detail.class.getName()).log(Level.SEVERE, null, ex);
//                    PopUp.connectionError();
//                }

            }

        } else {
            setEditable(true);
            changeButtonToSave();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        changeBgToWhite();
        setBtnEnabled(true);
        changeButtonToEdit();
        setForm(parkingSearch);
    }//GEN-LAST:event_btnXActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (btnDelete.getText().equals("C A N C E L")) {
            changeButtonToEdit();
            setForm(parkingSearch);
        } else if (btnDelete.getText().equals("D E L E T E")) {
//            int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + Form_A_Search.parkingLotNo + " - " + Form_A_Search.description, "Delete Confirmation", JOptionPane.YES_NO_OPTION);
//            if (choice == JOptionPane.YES_OPTION) {
//                try {
//                    /*Delete sql*/
//                    int result = Client.stub.deleteARecord("parking_lot", new String[]{Client.companyID, Form_A_Search.parkingLotNo});
//                    System.out.println(result);
//                    if (result > 0) {
//                        changeBgToRed();
//                        btnEdit.setEnabled(false);
//                        btnDelete.setEnabled(false);
//                        JOptionPane.showMessageDialog(driverPanel, "Record has been Deleted", "Record Deleted", JOptionPane.INFORMATION_MESSAGE);
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Something is not right.. Please try again !!!", "Error", JOptionPane.WARNING_MESSAGE);
//                    }
//
//                } catch (Exception ex) {
//                    Logger.getLogger(Form_A_Search_Detail.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            } else {
//
//            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void rbEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnabledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEnabledActionPerformed

    private void rbDisabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDisabledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDisabledActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void changeButtonToEdit() {
        btnEdit.setText("E D I T");
        btnDelete.setText("D E L E T E");
    }

    private void changeButtonToSave() {
        btnEdit.setText("S A V E");
        btnDelete.setText("C A N C E L");
    }

    public void changeBgToRed() {
        txtUserName.setBackground(new Color(252, 82, 82));
        txtFullName.setBackground(new Color(252, 82, 82));
        txtPassword.setBackground(new Color(252, 82, 82));
        comboRole.setBackground(new Color(252, 82, 82));
        comboCompany.setBackground(new Color(252, 82, 82));
    }

    public void changeBgToWhite() {
        txtUserName.setBackground(Color.WHITE);
        txtFullName.setBackground(Color.WHITE);
        txtPassword.setBackground(Color.WHITE);
        comboRole.setBackground(Color.WHITE);
        comboCompany.setBackground(Color.WHITE);
    }

    private void setBtnEnabled(boolean x) {
        btnEdit.setEnabled(x);
        btnDelete.setEnabled(x);
    }

    public static void setEditable(boolean x) {
        txtUserName.setEditable(x);
        txtFullName.setEditable(x);
        txtPassword.setEditable(x);
        comboRole.setEditable(x);
        comboCompany.setEditable(x);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    public static javax.swing.ButtonGroup btnGroupEnableDisable;
    private javax.swing.JButton btnX;
    private javax.swing.JPanel buttonPanel1;
    public static javax.swing.JComboBox<String> comboCompany;
    public static javax.swing.JComboBox<String> comboRole;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbAdminAgen;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHeader;
    public static javax.swing.JRadioButton rbDisabled;
    public static javax.swing.JRadioButton rbEnabled;
    public static javax.swing.JTextField txtFullName;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
