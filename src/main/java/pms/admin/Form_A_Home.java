package pms.admin;

import javax.swing.ImageIcon;
import pms.model.Model_Card;

public class Form_A_Home extends javax.swing.JPanel {

    public Form_A_Home(String[] result) {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/active-user.png")), "Active Users", result[0]));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/disabled-user.png")), "Disabled users", result[1]));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/all-users.png")), "All Users", result[2]));
        
        lbCompanies.setText(result[3]);
        lbParkingLot.setText(result[4]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new pms.component.Card();
        card2 = new pms.component.Card();
        card3 = new pms.component.Card();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbCompanies = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbParkingLot = new javax.swing.JLabel();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(197, 227, 126));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(255, 207, 87));
        panel.add(card2);
        panel.add(card3);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("  P a r k i n g  F a c i l i t i e s  a n d  S p a c e s  ( T o t a l )");

        jPanel1.setBackground(new java.awt.Color(209, 197, 197));

        jPanel2.setBackground(new java.awt.Color(182, 170, 170));
        jPanel2.setLayout(new java.awt.GridLayout());

        jLabel4.setFont(new java.awt.Font("JetBrains Mono Light", 0, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("C o m p a n i e s #");
        jPanel2.add(jLabel4);

        lbCompanies.setFont(new java.awt.Font("JetBrains Mono Light", 0, 80)); // NOI18N
        lbCompanies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCompanies.setText("5");
        jPanel2.add(lbCompanies);

        jPanel3.setBackground(new java.awt.Color(182, 170, 170));
        jPanel3.setLayout(new java.awt.GridLayout());

        jLabel3.setFont(new java.awt.Font("JetBrains Mono Light", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("P a r k i n g  L o t #");
        jPanel3.add(jLabel3);

        lbParkingLot.setFont(new java.awt.Font("JetBrains Mono Light", 0, 80)); // NOI18N
        lbParkingLot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbParkingLot.setText("20");
        jPanel3.add(lbParkingLot);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pms.component.Card card1;
    private pms.component.Card card2;
    private pms.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCompanies;
    private javax.swing.JLabel lbParkingLot;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
