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

public class Form_C_Search extends javax.swing.JPanel {

    public static Form_A_Search_Detail companyDetail = new Form_A_Search_Detail();

    public static String companyName;
    public static String tinNumber;
    public static String address1;
    public static String address2;
    public static String feePerHr;
    public static String phoneNo;

    public static String id;

    public Form_C_Search() {
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
        TableColumnModel tcm = tblCompanyList.getColumnModel();
        tcm.removeColumn(tcm.getColumn(4));
    }

    private void loadDate(int page) {
        DefaultTableModel model = (DefaultTableModel) tblCompanyList.getModel();
        model.setRowCount(0);
        int pageLimit = 10;
        int numberOfRecords = 0;

        try {
            String[] inputs = new String[]{txtCompanyName.getText(), txtTin.getText(), txtPhone.getText()};
            numberOfRecords = Client.stub.getTotalCount("company", inputs);
            int totalPage = (int) Math.ceil(numberOfRecords / pageLimit);
            pageUsers.setPagegination(page, totalPage);

            ArrayList<Object> arrayList = Client.stub.getRows("company", inputs, page, pageLimit);
            for (Object row : arrayList) {
                /*For every row add it to the table */
                tblCompanyList.addRow((Object[]) row);
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
        tblCompanyList = new pms.form.Table();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();

        date.setForeground(new java.awt.Color(85, 146, 85));

        lbHeader.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("P a r k i n g   F a c i l i t y   S e a r c h");

        lbDriver.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbDriver.setText("  P a r k i n g  C o m p a n i e s");

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

        tblCompanyList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO#", "Company Name", "Tin Number", "Address", "Fee/hr", "Phone#", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompanyList.setRowHeight(35);
        tblCompanyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompanyListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCompanyList);
        if (tblCompanyList.getColumnModel().getColumnCount() > 0) {
            tblCompanyList.getColumnModel().getColumn(0).setMinWidth(50);
            tblCompanyList.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblCompanyList.getColumnModel().getColumn(0).setMaxWidth(50);
            tblCompanyList.getColumnModel().getColumn(1).setMinWidth(200);
            tblCompanyList.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCompanyList.getColumnModel().getColumn(1).setMaxWidth(200);
            tblCompanyList.getColumnModel().getColumn(4).setMinWidth(60);
            tblCompanyList.getColumnModel().getColumn(4).setPreferredWidth(60);
            tblCompanyList.getColumnModel().getColumn(4).setMaxWidth(60);
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
        jLabel4.setText("Company Name");
        jPanel2.add(jLabel4);

        txtCompanyName.setColumns(7);
        txtCompanyName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtCompanyName);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tin#");
        jPanel2.add(jLabel5);

        txtTin.setColumns(13);
        txtTin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTinActionPerformed(evt);
            }
        });
        jPanel2.add(txtTin);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Phone#");
        jPanel2.add(jLabel6);

        txtPhone.setColumns(8);
        txtPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel2.add(txtPhone);

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

    private void txtCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyNameActionPerformed

    private void txtTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTinActionPerformed

    private void tblCompanyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompanyListMouseClicked
        // When a record is clicked 
        DefaultTableModel model = (DefaultTableModel) tblCompanyList.getModel();
        int selectedRowIndex = tblCompanyList.getSelectedRow();
        id = model.getValueAt(selectedRowIndex, 4).toString();
        String[] inputs = new String[]{Client.username, txtCompanyName.getText(), txtTin.getText(), txtPhone.getText(), id};

        try {
            ArrayList<Object> arrayList = Client.stub.getRows("user", inputs, -1, 1);
            Form_A_Search_Detail.setEditable(false);
            for (Object row : arrayList) {
                Object[] records = (Object[]) row;

                companyName = (String) records[0];
                tinNumber = (String) records[1];
                address1 = (String) records[2];
                address2 = (String) records[3];
                feePerHr = (String) records[4];
                phoneNo = (String) records[5];
                
                id = (String) records[6];
                System.out.println(companyName);
                
                Form_C_Search_Detail.txtCompanyName.setText(companyName);
                Form_C_Search_Detail.txtTin.setText(tinNumber);
                Form_C_Search_Detail.txtAddress1.setText(address1);
                Form_C_Search_Detail.txtAddress2.setText(address2);
                Form_C_Search_Detail.spinFeePerHr.setValue(Integer.parseInt(feePerHr));
                Form_C_Search_Detail.txtPhone.setText((phoneNo));

            }
            Client.setForm(companyDetail);
        } catch (RemoteException ex) {
            Logger.getLogger(Form_C_Search.class.getName()).log(Level.SEVERE, null, ex);
            PopUp.connectionError();
        }

    }//GEN-LAST:event_tblCompanyListMouseClicked

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

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
    private pms.form.Table tblCompanyList;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtTin;
    // End of variables declaration//GEN-END:variables
}
