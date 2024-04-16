package pms.form;

import java.awt.Color;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import main.Client;
import static main.Client.setForm;
import static main.Client.vehicleSearch;
import pms.common.PopUp;

public class Form_V_Search_Detail extends javax.swing.JPanel {

    static List<JTextField> txtFields;

    public Form_V_Search_Detail() {
        initComponents();
        System.out.println(txtFirstName.getText());
        /* Insert all inputs in array List */
        txtFields = new ArrayList<>();
        txtFields.add(txtFirstName);
        txtFields.add(txtMiddleName);
        txtFields.add(txtLastName);
        txtFields.add(txtEmail);
        txtFields.add(txtMobile);
        txtFields.add(txtDateOfBirth);
        txtFields.add(txtJobTitle);
        txtFields.add(txtTin);
        txtFields.add(txtCode);
        txtFields.add(txtLicensePlate);
        txtFields.add(txtManufacturer);
        txtFields.add(txtModel);
        txtFields.add(txtYear);
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
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnX = new javax.swing.JButton();

        date.setForeground(new java.awt.Color(85, 146, 85));
        date.setTextRefernce(txtDateOfBirth);

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("A u t o m o b i l e  D e t a i l");

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
        txtDateOfBirth.setText("2024-16-04");

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

        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEdit.setText("E D I T");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnDelete.setText("D E L E T E");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnX.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnX.setText("X");
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

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
                                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnX)
                                    .addComponent(vehiclePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84))))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnX)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* Delete or Cancel button Event handler */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (btnDelete.getText().equals("D E L E T E")) {
            if (PopUp.deleteConfirmation(txtFirstName.getText() + "'s Information?") == JOptionPane.YES_OPTION) {
                try {
                    Client.stub.deleteARecord("customer", new String[]{Form_V_Search.id});
                } catch (RemoteException ex) {
                    Logger.getLogger(Form_V_Search_Detail.class.getName()).log(Level.SEVERE, null, ex);
                    PopUp.connectionError();
                }

                changeBgToRed();
                setEditable(false);
                setBtnEnabled(false);
                PopUp.deleteSuccess(txtFirstName.getText() + "'s " + txtCode.getText() + "-" + txtLicensePlate.getText() + " Information");
            }
        } else if (btnDelete.getText().equals("C A N C E L")) {
            if (PopUp.cancelConfirmation() == JOptionPane.YES_OPTION) {
                Client.setForm(Client.vehicleSearch);
                changeButtonToEdit();
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    /* Edit or Save Button event handler */
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        if (btnEdit.getText().equals("E D I T")) {
            setEditable(true);
            changeButtonToSave();
        } else if (btnEdit.getText().equals("S A V E")) {
            if (txtFirstName.getText().equals(Form_V_Search.firstName) && txtMiddleName.getText().equals(Form_V_Search.middleName)
                    && txtLastName.getText().equals(Form_V_Search.lastName) && txtAddress.getText().equals(Form_V_Search.address)
                    && txtEmail.getText().equals(Form_V_Search.email) && txtMobile.getText().equals(Form_V_Search.mobileNo)
                    && txtDateOfBirth.getText().equals(Form_V_Search.dateOfBirth) && txtJobTitle.getText().equals(Form_V_Search.jobTitle)
                    && txtTin.getText().equals(Form_V_Search.tinNo) && txtCode.getText().equals(Form_V_Search.codeNo)
                    && txtLicensePlate.getText().equals(Form_V_Search.licensePlate) && txtManufacturer.getText().equals(Form_V_Search.manufacturer)
                    && txtModel.getText().equals(Form_V_Search.modelNo) && txtYear.getText().equals(Form_V_Search.year)
                    && getGender().equals(Form_V_Search.gender)) {
                PopUp.showErrorMessage("The information has not been changed", "Error");
            } else {
                /*update statement*/
                int result;
                try {
                    result = Client.stub.updateARecord("customer", new String[]{Form_V_Search.id, txtFirstName.getText(), txtMiddleName.getText(), txtLastName.getText(), getGender(), txtAddress.getText(), txtMobile.getText(),
                        txtDateOfBirth.getText(), txtJobTitle.getText(), txtTin.getText(), txtEmail.getText(), txtCode.getText(), txtLicensePlate.getText(), txtManufacturer.getText(), txtModel.getText(), txtYear.getText()});
                    System.out.println(result);
                    if (result > 0) {
                        changeButtonToEdit();
                        setEditable(false);
                        PopUp.updateSuccess("Customer's Information");
                    } else {
                        PopUp.showErrorMessage("Something is not right.. Please try again !!!", "Error");
                    }

                } catch (RemoteException ex) {
                    Logger.getLogger(Form_P_Search_Detail.class.getName()).log(Level.SEVERE, null, ex);
                    PopUp.connectionError();
                }

            }

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        changeBgToWhite();
        setBtnEnabled(true);
        changeButtonToEdit();
        setForm(vehicleSearch);
    }//GEN-LAST:event_btnXActionPerformed

    public static void setEditable(boolean x) {
        txtFirstName.setEditable(x);
        txtMiddleName.setEditable(x);
        txtLastName.setEditable(x);
        txtAddress.setEditable(x);
        txtEmail.setEditable(x);
        txtMobile.setEditable(x);
        txtDateOfBirth.setEditable(x);
        txtJobTitle.setEditable(x);
        txtTin.setEditable(x);
        rbMale.setEnabled(x);
        rbFemale.setEnabled(x);
        txtCode.setEditable(x);
        txtLicensePlate.setEditable(x);
        txtManufacturer.setEditable(x);
        txtModel.setEditable(x);
        txtYear.setEditable(x);

    }

    private String getGender() {
        if (rbMale.isSelected()) {
            return "Male";
        } else if (rbFemale.isSelected()) {
            return "Female";
        } else {
            return "";
        }
    }

    private void changeButtonToEdit() {
        btnEdit.setText("E D I T");
        btnDelete.setText("D E L E T E");
    }

    private void changeButtonToSave() {
        btnEdit.setText("S A V E");
        btnDelete.setText("C A N C E L");
    }

    private void setBtnEnabled(boolean x) {
        btnEdit.setEnabled(x);
        btnDelete.setEnabled(x);
    }

    public void changeBgToRed() {
        for (JTextField tf : txtFields) {
            tf.setBackground(new Color(252, 82, 82));
        }
    }

    public void changeBgToWhite() {
        for (JTextField tf : txtFields) {
            tf.setBackground(Color.WHITE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    public static javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnX;
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
    public static javax.swing.JRadioButton rbFemale;
    public static javax.swing.JRadioButton rbMale;
    public static javax.swing.JTextArea txtAddress;
    public static javax.swing.JTextField txtCode;
    public static javax.swing.JTextField txtDateOfBirth;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtFirstName;
    public static javax.swing.JTextField txtJobTitle;
    public static javax.swing.JTextField txtLastName;
    public static javax.swing.JTextField txtLicensePlate;
    public static javax.swing.JTextField txtManufacturer;
    public static javax.swing.JTextField txtMiddleName;
    public static javax.swing.JTextField txtMobile;
    public static javax.swing.JTextField txtModel;
    public static javax.swing.JTextField txtTin;
    public static javax.swing.JTextField txtYear;
    private javax.swing.JPanel vehiclePanel;
    // End of variables declaration//GEN-END:variables
}
