package pms.form;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {

    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("Century Gothic", 1, 14));
        setForeground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(230, 230, 230));
        g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }

}
