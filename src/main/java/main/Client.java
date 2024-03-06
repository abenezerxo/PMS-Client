package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pms.admin.Form_A_Home;
import pms.admin.Form_A_Registration;
import pms.admin.Form_A_Search;
import pms.admin.Form_C_Registration;
import pms.admin.Form_C_Search;
import pms.common.PopUp;
import pms.event.EventMenuSelected;
import pms.form.Form_Home;
import pms.form.Form_P_Registration;
import pms.form.Form_P_Search;
import pms.form.Form_V_In;
import pms.form.Form_V_In_Search;
import pms.form.Form_V_Out;
import pms.form.Form_V_Out_Search;
import pms.form.Form_V_Registration;
import pms.form.Form_V_Search;
import pms.login.Login;

public class Client extends javax.swing.JFrame /*implements Serializable*/ {

    private Form_Home dashboard;
    private Form_V_Registration vehicleRegistration;
    public static Form_V_Search vehicleSearch;
    private Form_V_In vehicleIn;
    public static Form_V_In_Search VehicleInSearch;
    public static Form_V_Out vehicleOut;
    private Form_V_Out_Search vehicleOutSearch;
    private Form_P_Registration parkingRegistration;
    public static Form_P_Search parkingSearch;

    public static Form_A_Home adminDashboard;
    public static Form_A_Registration userRegistration;
    public static Form_A_Search userSearch;
    public static Form_C_Registration companyRegistration;
    public static Form_C_Search companySearch;

    public static String id;
    public static String companyID;
    public static String username;
    public static String userRole = "Admin";

    /* Define Ip address and Port number of the Server */
    private static final String ip = "127.0.0.1";
    private static final String port = "3333";
    private static final String host = "//" + ip + ":" + port + "/ClientRequest";
    public static ClientRequests stub;

    public Client() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        // initiate connection with the server
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            /*ClientRequests*/ stub = (ClientRequests) Naming.lookup(host);
            String response = stub.registerClient();
            System.out.println(response);

            /*get In Vehicles + Out Vehicles + in & out Vehicles count for today*/
            if (userRole.equals("Admin")) {
                adminDashboard = new Form_A_Home(stub.getDashboardAdmin(Integer.parseInt(companyID)));
                userRegistration = new Form_A_Registration();
                userSearch = new Form_A_Search();
                companyRegistration = new Form_C_Registration();
                companySearch = new Form_C_Search();

                setForm(adminDashboard);

            } else {
                /* Create Agent Pages*/
                dashboard = new Form_Home(stub.getDashboardInfo(Integer.parseInt(companyID)));
                vehicleRegistration = new Form_V_Registration();
                vehicleSearch = new Form_V_Search();
                vehicleIn = new Form_V_In();
                VehicleInSearch = new Form_V_In_Search();
                vehicleOut = new Form_V_Out();
                vehicleOutSearch = new Form_V_Out_Search();
                parkingRegistration = new Form_P_Registration();
                parkingSearch = new Form_P_Search();

                setForm(dashboard);
            }

            /*Construct the header*/
            mainHeader.setlbGreeting(stub.greeting((int) LocalDateTime.now().getHour()));
            mainHeader.setlbFirstName(username);

        } catch (Exception e) {
            e.printStackTrace();
        }

        menu.initMoving(Client.this);
        menu.addEventMenueSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.println(index);
                if (userRole.equals("Admin")) {
                    switch (index) {
                        case 0:
                            try {
                                adminDashboard = new Form_A_Home(stub.getDashboardAdmin(Integer.parseInt(companyID)));
                            } catch (RemoteException ex) {
                                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            setForm(adminDashboard);
                            break;

                        case 3:
                            setForm(userRegistration);
                            break;
                        case 4:
                            setForm(userSearch);
                            break;
                        case 7:
                            setForm(companyRegistration);
                            break;
                        case 8:
                            setForm(companySearch);
                            break;
                        case 11:
                            if (PopUp.confirmationDialog("Do you want to logout?", "Logout") == JOptionPane.YES_OPTION) {
                                try {
                                    new Login().setVisible(true);
                                    dispose();
                                } catch (RemoteException ex) {
                                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        default:
                            break;
                    }
                } else {
                    switch (index) {
                        case 0:
                            setForm(dashboard);
                            break;
                        case 3:
                            setForm(vehicleRegistration);
                            break;
                        case 4:
                            setForm(vehicleSearch);
                            break;
                        case 6:
                            setForm(vehicleIn);
                            break;
                        case 7:
                            setForm(VehicleInSearch);
                            break;
                        case 9:
                            setForm(vehicleOut);
                            break;
                        case 10:
                            setForm(vehicleOutSearch);
                            break;
                        case 13:
                            setForm(parkingRegistration);
                            break;
                        case 14:
                            setForm(parkingSearch);
                            break;
                        case 17:
                            if (PopUp.confirmationDialog("Do you want to logout?", "Logout") == JOptionPane.YES_OPTION) {
                                try {
                                    new Login().setVisible(true);
                                    dispose();
                                } catch (RemoteException ex) {
                                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                            break;
                        default:
                            break;
                    }
                }

            }
        });
    }

    public static void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new pms.swing.PanelBorder();
        menu = new pms.component.Menu();
        mainHeader = new pms.component.Header();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(217, 217, 217));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(mainHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Client().setVisible(true);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pms.component.Header mainHeader;
    public static javax.swing.JPanel mainPanel;
    private pms.component.Menu menu;
    private pms.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
