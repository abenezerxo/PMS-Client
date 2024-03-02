package pms.form;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setShowVerticalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(25);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                header.setHorizontalAlignment(JLabel.CENTER);

                return header;
            }

        });
        /* this can be removed */
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if (isSelected){
                    com.setForeground(new Color(15, 89, 140));
                } else {
                    com.setForeground(Color.BLACK);
                }
                return com;
            }
            
        });
    }
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
