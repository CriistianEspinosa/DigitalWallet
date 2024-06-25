/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalwalletproject;

/**
 *
 * @author espin
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TransactionPanel extends JPanel {
    private JTable transactionTable;
    private DefaultTableModel tableModel;

    public TransactionPanel() {
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Type", "Amount", "Date"};
        tableModel = new DefaultTableModel(columnNames, 0);
        transactionTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(transactionTable);

        add(scrollPane, BorderLayout.CENTER);
    }

    public void addTransaction(int id, String type, double amount, String date) {
        tableModel.addRow(new Object[]{id, type, amount, date});
    }
}

