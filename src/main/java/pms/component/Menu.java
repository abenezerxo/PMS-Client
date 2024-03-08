package pms.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import main.Client;
import pms.event.EventMenuSelected;
import pms.model.Model_Menu;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenueSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenueSelected(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        if (Client.userRole.equals("Admin")) {
            listMenu1.addItem(new Model_Menu("20", "Dashboard", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("", "Users", Model_Menu.MenuType.TITLE));
            listMenu1.addItem(new Model_Menu("21", "Registration", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("22", "Search", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));

            listMenu1.addItem(new Model_Menu("", "Companies", Model_Menu.MenuType.TITLE));
            listMenu1.addItem(new Model_Menu("23", "Registration", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("24", "Search", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("25", "Setting", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("11", "Logout", Model_Menu.MenuType.MENU));

        } else {
            listMenu1.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("", "Vehicles", Model_Menu.MenuType.TITLE));
            listMenu1.addItem(new Model_Menu("2", "Registration", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("3", "Search", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("4", "In Vehicle", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("5", "Search", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("6", "Out Vehicle", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("7", "Search", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("", "Parking Lot", Model_Menu.MenuType.TITLE));
            listMenu1.addItem(new Model_Menu("8", "Registration", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("9", "Search", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
//            listMenu1.addItem(new Model_Menu("10", "View Reports", Model_Menu.MenuType.MENU));
            listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
            listMenu1.addItem(new Model_Menu("11", "Logout", Model_Menu.MenuType.MENU));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new pms.swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PMS-ICON4.png"))); // NOI18N
        jLabel1.setText("PMS");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gPaint;

        if (Client.userRole.equals("Admin")) {
            gPaint = new GradientPaint(0, 0, Color.decode("#f7f7d7"), 0, getHeight(), Color.decode("#dad07e"));
        } else {
            gPaint = new GradientPaint(0, 0, Color.decode("#eaf3fa"), 0, getHeight(), Color.decode("#4c4d49"));
        }

        g2.setPaint(gPaint);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private pms.swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
