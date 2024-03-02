package pms.form;

import javax.swing.ImageIcon;
import pms.model.Model_Card;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home(String[] result) {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/parking-in.png")), "In Vihcles", result[0]));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/parking-out.png")), "Out Vihcles", result[1]));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Dashboard/parking-all.png")), "In & Out Vihcles", result[2]));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card2 = new pms.component.Card();
        card1 = new pms.component.Card();
        card3 = new pms.component.Card();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        card_Circle1 = new pms.component.Card_Circle();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card2.setColor1(new java.awt.Color(255, 207, 87));
        panel.add(card2);

        card1.setColor1(new java.awt.Color(197, 227, 126));
        panel.add(card1);
        panel.add(card3);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("  P a r k i n g  S p a c e");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("  T o t a l  I n c o m e");

        card_Circle1.setBackground(new java.awt.Color(255, 221, 221));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(card_Circle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_Circle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pms.component.Card card1;
    private pms.component.Card card2;
    private pms.component.Card card3;
    private pms.component.Card_Circle card_Circle1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane panel;
    // End of variables declaration//GEN-END:variables
}
