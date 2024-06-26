package pms.login;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.Client;
import main.ClientRequests;
import pms.common.PopUp;

public class Login extends javax.swing.JFrame {
    
    public static String ip;
    public static String port;
    
    public Login() throws RemoteException {
        initComponents();
        connectToServer();
        initMoving(this);
        txtUsername.grabFocus();

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                //login();
            }
        }, 10);
    }

        public static String getServerIP() {
        String fileName = "Server-Address.txt"; // Read Server Address
        String addressFromFile = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((addressFromFile = reader.readLine()) != null) {
                System.out.println(addressFromFile);
                return addressFromFile;
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
        return addressFromFile;
    }
    
    public ClientRequests connectToServer() throws RemoteException {

        /* Define Ip address and Port number of the Server ** For login Service ONLY */
        ip = getServerIP();
        port = "3333";
        String host = "//" + ip + ":" + port + "/ClientRequest";
        ClientRequests stub = null;
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            stub = (ClientRequests) java.rmi.Naming.lookup(host);
        } catch (Exception e) {
            PopUp.showErrorMessage("Unalbe to connect to Server", "Connection Error");
        }
        System.out.println(host);
        return stub;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannelLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lbForgetPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        lbSetting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pannelLogin.setBackground(new java.awt.Color(177, 224, 224));
        pannelLogin.setLayout(new java.awt.GridLayout(2, 1));

        jLabel5.setBackground(new java.awt.Color(177, 224, 224));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PMS-ICON-medium.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pannelLogin.add(jLabel5);

        jLabel1.setBackground(new java.awt.Color(177, 224, 224));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" L O G I N ");
        pannelLogin.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("   U s e r n a m e");

        jPanel2.setBackground(new java.awt.Color(177, 224, 224));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("   P a s s w o r d");

        jPanel3.setBackground(new java.awt.Color(177, 224, 224));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(177, 224, 224));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnLogin.setText(" L O G I N ");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new java.awt.GridBagConstraints());

        lbForgetPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbForgetPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbForgetPassword.setText("Forget Password?");
        lbForgetPassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbForgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgetPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbForgetPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbForgetPasswordMouseExited(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(177, 224, 224));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnExit.setBackground(new java.awt.Color(135, 135, 135));
        btnExit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("E X I T");
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
        jPanel1.add(btnExit);

        lbSetting.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbSetting.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/setting-medl.png"))); // NOI18N
        lbSetting.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSettingMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pannelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbForgetPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSetting)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pannelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSetting)
                    .addComponent(lbForgetPassword))
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (PopUp.confirmationDialog("Are you sure you want to exit?", "Exit Confirmation") == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnExitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseDragged

    private void btnExitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseMoved
        btnExit.setBackground(new Color(117, 41, 41));
    }//GEN-LAST:event_btnExitMouseMoved

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(135, 135, 135));
    }//GEN-LAST:event_btnExitMouseExited

    private void lbForgetPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetPasswordMouseEntered
        lbForgetPassword.setText("<html><u> Forget Password?</u></html>");
    }//GEN-LAST:event_lbForgetPasswordMouseEntered

    private void lbForgetPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetPasswordMouseExited
        lbForgetPassword.setText("<html> Forget Password?</html>");
    }//GEN-LAST:event_lbForgetPasswordMouseExited

    private void lbForgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgetPasswordMouseClicked
        new ForgetPassword().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbForgetPasswordMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void lbSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseClicked
        new ServerSetting().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbSettingMouseClicked

    private void lbSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseEntered
        // TODO add your handling code here:
        lbForgetPassword.setText("<html><b><span style=\"color:gray; background-color: yellow;\"> Server Setting </span></b></html>");
    }//GEN-LAST:event_lbSettingMouseEntered

    private void lbSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseExited
        // TODO add your handling code here:
        lbForgetPassword.setText("<html> Forget Password?</html>");
    }//GEN-LAST:event_lbSettingMouseExited

    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        // automatic login for test
    }

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

    private void login() {
        if (txtUsername.getText().equals("")) {
            PopUp.showErrorMessage("Please enter user name", "Username is Empty!!!");
            txtUsername.grabFocus();

        } else if (txtPassword.getText().equals("")) {
            PopUp.showErrorMessage("Password cannot be blank", "Empty password!!!");
            txtPassword.grabFocus();

        } else {
            /* Both Username and Password Entered */
            try {
                //this.dispose();
                ArrayList<Object> loginResult = connectToServer().login(txtUsername.getText(), txtPassword.getText());

                if (loginResult.isEmpty()) {
                    PopUp.showErrorMessage("Wrong username or password", "Invalid Credential!!!");
                    txtPassword.setText("");
                } else {
                    Object[] result = (Object[]) loginResult.get(0);
                    System.out.println("temp ## -> " + result[5]);
                    if (result[5].equals("tempPassword")) {
                        /*If user logged in with temporary password -> execute mandatory password change*/
                        ChangePassword.id = (String) result[0];
                        PopUp.infoDialog("You need to change your password!", "Mandatory Password Change");
                        new ChangePassword().setVisible(true);
                        this.dispose();
                    } else if (result[4].equals("1")) {
                        /*If user is enabled*/
                        Client.id = (String) result[0];
                        Client.companyID = (String) result[1];
                        Client.username = (String) result[2];
                        Client.userRole = (String) result[3];
                        Client.companyName = (String) result[6];
                        new Client().setVisible(true);
                        this.dispose();
                    } else {
                        /* The user has been disabled */
                        PopUp.showWarningMessage("Dear " + (String) result[2] + ", your account has been Disabled!! Please Contact Your System Administrator!!", "!!! Disabled Account !!!");
                        txtUsername.setText("");
                        txtPassword.setText("");
                    }

                }
            } catch (RemoteException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbForgetPassword;
    private javax.swing.JLabel lbSetting;
    private javax.swing.JPanel pannelLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
