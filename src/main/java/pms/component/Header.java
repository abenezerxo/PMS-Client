package pms.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import main.Client;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
        setOpaque(false);
        lbCompany.setText(Client.companyName);
        lbRole.setText(Client.userRole);
    }
    
    public void setlbFirstName(String firstName){
        lbFirstName.setText(firstName);
    }
    
    public void setlbGreeting(String good){
        lbGreeting.setText(good);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbGreeting = new javax.swing.JLabel();
        lbFirstName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbCompany = new javax.swing.JLabel();
        lbSeprator = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 233, 233));

        jPanel1.setLayout(new java.awt.GridLayout());

        jPanel2.setBackground(new java.awt.Color(243, 233, 233));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lbGreeting.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbGreeting.setText("Good Morning,");
        jPanel2.add(lbGreeting);

        lbFirstName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbFirstName.setText("FirstName");
        jPanel2.add(lbFirstName);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(243, 233, 233));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        lbCompany.setBackground(new java.awt.Color(0, 0, 0));
        lbCompany.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbCompany.setForeground(new java.awt.Color(84, 84, 158));
        lbCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCompany.setText("Company Name");
        jPanel3.add(lbCompany);

        lbSeprator.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbSeprator.setText("|");
        jPanel3.add(lbSeprator);

        lbRole.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        lbRole.setForeground(new java.awt.Color(140, 140, 15));
        lbRole.setText("Role");
        jPanel3.add(lbRole);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCompany;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbGreeting;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbSeprator;
    // End of variables declaration//GEN-END:variables
}
