package pms.admin;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import main.Client;
import pms.common.PopUp;
import pms.pagination.EventPagination;
import pms.pagination.style.PaginationItemRenderStyle1;

public class Form_A_Search extends javax.swing.JPanel {

    public static Form_A_Search_Detail adminSearchDetail = new Form_A_Search_Detail();

    public static String fullName;
    public static String userName;
    public static String password;
    public static String role;
    public static String status;
    public static String company;

    public static String id;

    public Form_A_Search() {
        initComponents();
        //tblParking.addRow(new Object[]{"A01", "In front of the three floor white building"});
        pageUsers.setPaginationItemRender(new PaginationItemRenderStyle1());
        pageUsers.addEventPagination(new EventPagination() {
            @Override
            public void pageChanged(int page) {
                loadDate(page);
                System.out.println("page:: " + page);
            }
        });
        // hide ID column from the vehicle table
        TableColumnModel tcm = tblUserList.getColumnModel();
        tcm.removeColumn(tcm.getColumn(4));
    }

    private void loadDate(int page) {
        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        model.setRowCount(0);
        int pageLimit = 10;
        int numberOfRecords = 0;

        try {
            String[] inputs = new String[]{Client.username, txtUserName.getText(), txtFullName.getText(), txtCompany.getText()};
            numberOfRecords = Client.stub.getTotalCount("user", inputs);
            int totalPage = (int) Math.ceil(numberOfRecords / pageLimit);
            pageUsers.setPagegination(page, totalPage);

            ArrayList<Object> arrayList = Client.stub.getRows("user", inputs, page, pageLimit);
            for (Object row : arrayList) {
                /*For every row add it to the table */
                tblUserList.addRow((Object[]) row);
            }
        } catch (Exception e) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
            PopUp.connectionError();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenderGroup = new javax.swing.ButtonGroup();
        date = new pms.component.DateChooser();
        jScrollBar1 = new javax.swing.JScrollBar();
        outerPanel = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        lbDriver = new javax.swing.JLabel();
        driverPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pageUsers = new pms.pagination.Pagination();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserList = new pms.form.Table();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();

        date.setForeground(new java.awt.Color(85, 146, 85));

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("P a r k i n g  L o t  S e a r c h");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  P a r k i n g  L o t  I n f o r m a t i o n");

        driverPanel.setBackground(new java.awt.Color(232, 245, 255));

        jPanel3.setBackground(new java.awt.Color(221, 240, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setOpaque(false);

        pageUsers.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(pageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tblUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO#", "Username", "Full Name", "Company", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserList);
        if (tblUserList.getColumnModel().getColumnCount() > 0) {
            tblUserList.getColumnModel().getColumn(0).setMinWidth(50);
            tblUserList.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUserList.getColumnModel().getColumn(0).setMaxWidth(50);
            tblUserList.getColumnModel().getColumn(1).setMinWidth(200);
            tblUserList.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblUserList.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username");
        jPanel2.add(jLabel4);

        txtUserName.setColumns(7);
        txtUserName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtUserName);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Full Name");
        jPanel2.add(jLabel5);

        txtFullName.setColumns(13);
        txtFullName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtFullName);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Company");
        jPanel2.add(jLabel6);

        txtCompany.setColumns(8);
        txtCompany.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });
        jPanel2.add(txtCompany);

        btnSearch.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch);

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        javax.swing.GroupLayout outerPanelLayout = new javax.swing.GroupLayout(outerPanel);
        outerPanel.setLayout(outerPanelLayout);
        outerPanelLayout.setHorizontalGroup(
            outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(outerPanelLayout.createSequentialGroup()
                            .addGap(354, 354, 354)
                            .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 292, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        outerPanelLayout.setVerticalGroup(
            outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(driverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(outerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(outerPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbHeader)
                    .addGap(18, 18, 18)
                    .addComponent(lbDriver)
                    .addGap(679, 679, 679)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(outerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadDate(1);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void tblUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserListMouseClicked
        // When a record is clicked 
        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        int selectedRowIndex = tblUserList.getSelectedRow();
        id = model.getValueAt(selectedRowIndex, 4).toString();
        String[] inputs = new String[]{Client.username, txtUserName.getText(), txtFullName.getText(), txtCompany.getText(), id};

        try {
            ArrayList<Object> arrayList = Client.stub.getRows("user", inputs, -1, 1);
            Form_A_Search_Detail.setEditable(false);
            for (Object row : arrayList) {
                Object[] records = (Object[]) row;

                userName = (String) records[0];
                fullName = (String) records[1];
                role = (String) records[2];
                status = (String) records[3];
                company = (String) records[4];

                id = (String) records[15];
                System.out.println(fullName);
                Form_A_Search_Detail.txtUserName.setText(userName);
                Form_A_Search_Detail.txtPassword.setText(fullName);

                Form_A_Search_Detail.btnGroupEnableDisable.clearSelection();
                if (status.equals("")) {
                    Form_A_Search_Detail.rbEnabled.setSelected(true);
                } else if (status.equals("")) {
                    Form_A_Search_Detail.rbDisabled.setSelected(true);
                } else {
                    Form_A_Search_Detail.btnGroupEnableDisable.clearSelection();
                }

            }
            Client.setForm(adminSearchDetail);
        } catch (RemoteException ex) {
            Logger.getLogger(Form_A_Search.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }

    }//GEN-LAST:event_tblUserListMouseClicked

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGenderGroup;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel buttonPanel;
    private pms.component.DateChooser date;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDriver;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JPanel outerPanel;
    private pms.pagination.Pagination pageUsers;
    private pms.form.Table tblUserList;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
