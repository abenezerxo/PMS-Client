package pms.form;

import java.awt.Color;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Client;

public class Form_V_Registration extends javax.swing.JPanel {

    public Form_V_Registration() {
        initComponents();
    }

    public void clearForm() {
        txtFirstName.setText("");
        txtMiddleName.setText("");
        txtLastName.setText("");
        txtAddress.setText("");
        btnGenderGroup.clearSelection();
        txtEmail.setText("");
        txtMobile.setText("");
        txtDateOfBirth.setText("");
        txtJobTitle.setText("");
        txtTin.setText("");

        txtCode.setText("");
        txtLicensePlate.setText("");
        txtManufacturer.setText("");
        txtModel.setText("");
        txtYear.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        date = new pms.component.DateChooser();
        lbHeader = new javax.swing.JLabel();
        lbDriver = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextArea();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        txtMobile = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtJobTitle = new javax.swing.JTextField();
        txtTin = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbVehicle = new javax.swing.JLabel();
        vehiclePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtLicensePlate = new javax.swing.JTextField();
        txtManufacturer = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        date.setForeground(new java.awt.Color(85, 146, 85));
        date.setDateFormat("yyyy-MM-dd");
        date.setTextRefernce(txtDateOfBirth);

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("A u t o m o b i l e  R e g i s t r a t i o n");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  D r i v e r  I n f o r m a t i o n");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Middle Name:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Mobile #:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("tin#:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Job Title:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Gender:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Email:");

        txtFirstName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtMiddleName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setAutoscrolls(false);

        btnGenderGroup.add(rbMale);
        rbMale.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        btnGenderGroup.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        txtMobile.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtDateOfBirth.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDateOfBirth.setText("");
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });

        txtJobTitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtTin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFemale)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtMiddleName)
                            .addComponent(txtFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(txtDateOfBirth)
                    .addComponent(txtJobTitle)
                    .addComponent(txtTin)
                    .addComponent(txtEmail))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lbVehicle.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbVehicle.setText("  V e h i c l e  I n f o r m a t i o n");

        vehiclePanel.setBackground(new java.awt.Color(232, 245, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Code#:");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("License Plate#:");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Manufacturer:");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Model:");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Year:");

        txtCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtLicensePlate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtManufacturer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtModel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtYear.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout vehiclePanelLayout = new javax.swing.GroupLayout(vehiclePanel);
        vehiclePanel.setLayout(vehiclePanelLayout);
        vehiclePanelLayout.setHorizontalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtManufacturer)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(571, Short.MAX_VALUE))
        );
        vehiclePanelLayout.setVerticalGroup(
            vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(vehiclePanelLayout.createSequentialGroup()
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(vehiclePanelLayout.createSequentialGroup()
                                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehiclePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnReset)
                .addGap(111, 111, 111)
                .addComponent(btnSave)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(lbVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String firstName = txtFirstName.getText();
        String middleName = txtMiddleName.getText();
        String lastName = txtMiddleName.getText();
        String gender;
        if (rbMale.isSelected()) {
            gender = "Male";
        } else if (rbFemale.isSelected()) {
            gender = "Female";
        } else {
            gender = "";
        }
        String address = txtAddress.getText();
        String mobile = txtMobile.getText();
        String dateOfBirth = txtDateOfBirth.getText().length() == 0 ? dateOfBirth = "null" : "'" + txtDateOfBirth.getText() + "'";
        String jobTitle = txtJobTitle.getText();
        String tin = txtTin.getText();
        String email = txtEmail.getText();

        String code = txtCode.getText();
        String license_plate = txtLicensePlate.getText();
        String manufacturer = txtManufacturer.getText();
        String model = txtModel.getText();
        String year = txtYear.getText();

        try {
            if (txtCode.getText().length() == 0 && txtLicensePlate.getText().length() == 0) {
                txtCode.setBackground(Color.RED);
                txtLicensePlate.setBackground(Color.RED);
                JOptionPane.showMessageDialog(driverPanel, "Please fill License Plate Code and Number", "Error", JOptionPane.WARNING_MESSAGE);
                txtCode.setBackground(Color.WHITE);
                txtLicensePlate.setBackground(Color.WHITE);
                txtCode.grabFocus();

            } else if (txtCode.getText().length() == 0) {
                txtCode.setBackground(Color.RED);
                JOptionPane.showMessageDialog(driverPanel, "Please fill License Plate Code", "Error", JOptionPane.WARNING_MESSAGE);
                txtCode.setBackground(Color.WHITE);
                txtCode.grabFocus();

            } else if (txtLicensePlate.getText().length() == 0) {
                txtLicensePlate.setBackground(Color.RED);
                JOptionPane.showMessageDialog(driverPanel, "Please fill License Plate Number", "Error", JOptionPane.WARNING_MESSAGE);
                txtLicensePlate.setBackground(Color.WHITE);
                txtLicensePlate.grabFocus();

            } else {
                int result = Client.stub.registerClient(firstName, middleName, lastName, gender, address, mobile, dateOfBirth, jobTitle, tin, email, code, license_plate, manufacturer, model, year);
                System.out.println(result);
                if (result == 1) {
                    JOptionPane.showMessageDialog(driverPanel, "Client Information Registered", "Success Registration", JOptionPane.INFORMATION_MESSAGE);
                    clearForm();
                } else {
                    JOptionPane.showMessageDialog(driverPanel, "Something Went Wrong please try again" + " -- " + txtDateOfBirth.getText(), "Error", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (RemoteException ex) {
            Logger.getLogger(Form_P_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel buttonPanel;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbVehicle;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtJobTitle;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtTin;
    private javax.swing.JTextField txtYear;
    private javax.swing.JPanel vehiclePanel;
    // End of variables declaration//GEN-END:variables
}
