package pms.login;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.ClientRequests;
import pms.common.PopUp;
import static pms.login.Login.ip;
import static pms.login.Login.port;

public class ServerSetting extends javax.swing.JFrame {

    public ServerSetting() {
        initComponents();
        initMoving(this);
        txtIpAddress.setText(Login.getServerIP());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannelLogin = new javax.swing.JPanel();
        lbDriver = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        buttonPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();
        txtIpAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pannelLogin.setBackground(new java.awt.Color(177, 224, 224));

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        lbDriver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDriver.setText(" S e r v e r   S e t t i n g  ");

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jPanel5.setOpaque(false);

        buttonPanel1.setBackground(new java.awt.Color(221, 240, 255));
        buttonPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnEdit.setBackground(new java.awt.Color(255, 249, 224));
        btnEdit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEdit.setText(" E D I T ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        buttonPanel1.add(btnEdit);

        btnDefault.setBackground(new java.awt.Color(255, 249, 224));
        btnDefault.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnDefault.setText(" D E F A U L T ");
        btnDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultActionPerformed(evt);
            }
        });
        buttonPanel1.add(btnDefault);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(buttonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        txtIpAddress.setEditable(false);
        txtIpAddress.setColumns(20);
        txtIpAddress.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        txtIpAddress.setText("localhost");
        txtIpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpAddressActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("S e r v e r   A d d r e s s ");

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("P a r k i n g  M a n a g e m e n t   S y s t e m ");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setToolTipText("");

        javax.swing.GroupLayout pannelLoginLayout = new javax.swing.GroupLayout(pannelLogin);
        pannelLogin.setLayout(pannelLoginLayout);
        pannelLoginLayout.setHorizontalGroup(
            pannelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelLoginLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txtIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addComponent(lbHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pannelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pannelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(pannelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelLoginLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(47, 47, 47)))
        );
        pannelLoginLayout.setVerticalGroup(
            pannelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pannelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelLoginLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(pannelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelLoginLayout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(177, 224, 224));

        btnExit.setBackground(new java.awt.Color(135, 135, 135));
        btnExit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("C A N C E L");
        btnExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnExitMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnExitMouseMoved(evt);
            }
        });
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pannelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            // TODO add your handling code here:
            new Login().setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(ServerSetting.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(new Color(135, 135, 135));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseMoved
        // TODO add your handling code here:
        btnExit.setBackground(new Color(117, 41, 41));
    }//GEN-LAST:event_btnExitMouseMoved

    private void btnExitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseDragged

    private void txtIpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpAddressActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (btnEdit.getText().equals(" E D I T ")) {
            changeBtnToSave();
        } else {
            changeServerAddress();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultActionPerformed
        if (btnDefault.getText().equals(" D E F A U L T ")) {
            // Check if the current IP address is the local machines
            if (txtIpAddress.getText().equals("localhost") || txtIpAddress.getText().equals("127.0.0.1")) {
                PopUp.infoDialog("The current Server ip address is already the local machines!", "Default IP`");
            } else {
                if (PopUp.confirmationDialog("Are you sure you want the server address to be localhost?", "Change Server Address to `localhost`") == JOptionPane.YES_OPTION) {
                    // Revert back to localhost
                    txtIpAddress.setText("localhost");
                    changeServerAddress();
                }
            }
        } else {
            // when cancel is clicked
            txtIpAddress.setText(Login.getServerIP());
            changeBtnToEdit();
        }
    }//GEN-LAST:event_btnDefaultActionPerformed

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        pannelLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

        });
        pannelLogin.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }

        });
    }

    private void changeBtnToEdit() {
        btnEdit.setText(" E D I T ");
        btnDefault.setText(" D E F A U L T ");
        txtIpAddress.setEditable(false);
    }

    private void changeBtnToSave() {
        btnEdit.setText(" S A V E ");
        btnDefault.setText(" C A N C E L ");
        txtIpAddress.setEditable(true);
    }

    private void changeServerAddress() {
        if (txtIpAddress.getText().isBlank()) {
            txtIpAddress.setBackground(Color.red);
            PopUp.showErrorMessage("Server Address can not be blank.", "Blank Server Address");
            txtIpAddress.setBackground(Color.WHITE);
        } else if (txtIpAddress.getText().equals(ip)) {
            txtIpAddress.setBackground(Color.BLUE);
            PopUp.showErrorMessage("Address has not been changed.", "No Change");
            txtIpAddress.setBackground(Color.WHITE);
        } else {

            /* Before chaning Server IP check the connection with the new address First */
            String newHost = "//" + txtIpAddress.getText() + ":" + port + "/ClientRequest";
            try {
                LocateRegistry.getRegistry(newHost);
                ClientRequests stub = (ClientRequests) java.rmi.Naming.lookup(newHost);
            } catch (Exception e) {
                PopUp.showErrorMessage("Unalbe to connect to Server, Please insert a valid address", "Connection Error");
                return;
            }

            /*Update the Server Ip ** Write to the Server-Address.txt. file */
            String fileName = "Server-Address.txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                // Write content to the file
                writer.write(txtIpAddress.getText());
                PopUp.infoDialog("Server Address has been updated", "Server Address Update");
                changeBtnToEdit();
            } catch (IOException e) {
                PopUp.showGenericError();
                System.err.println("Error writing to the file: " + e.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel buttonPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JPanel pannelLogin;
    public static javax.swing.JTextField txtIpAddress;
    // End of variables declaration//GEN-END:variables
}
