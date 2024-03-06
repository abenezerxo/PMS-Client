package pms.form;

import javax.swing.ImageIcon;
import pms.model.Model_Card;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home(String[] result) {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/parking-in.png")), "In Vihcles", result[0]));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/parking-out.png")), "Out Vihcles", result[1]));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/parking-all.png")), "In & Out Vihcles", result[2]));
        
        lbPercent.setText(result[3] + "% Free");
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
        lbPercent = new javax.swing.JLabel();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(197, 227, 126));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(255, 207, 87));
        panel.add(card2);
        panel.add(card3);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("   A v a i l a b l e  P a r k i n g  S p a c e");

        jPanel1.setBackground(new java.awt.Color(223, 242, 222));
        jPanel1.setLayout(new java.awt.GridLayout());

        lbPercent.setBackground(new java.awt.Color(223, 242, 222));
        lbPercent.setFont(new java.awt.Font("Finale Copyist Text Ext", 0, 80)); // NOI18N
        lbPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPercent.setText("%");
        jPanel1.add(lbPercent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pms.component.Card card1;
    private pms.component.Card card2;
    private pms.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPercent;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
