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
import java.awt.*;

public class BalancePanel extends JPanel {
    private JLabel balanceLabel;
    private JTextField amountField;
    private JButton purchaseButton, saleButton;
    private DigitalWallet digitalWallet;

    public BalancePanel(DigitalWallet digitalWallet) {
        this.digitalWallet = digitalWallet;
        setLayout(new FlowLayout());

        balanceLabel = new JLabel("Balance: $" + digitalWallet.getBalance());
        amountField = new JTextField(10);
        purchaseButton = new JButton("Purchase");
        saleButton = new JButton("Sale");

        add(balanceLabel);
        add(new JLabel("Amount:"));
        add(amountField);
        add(purchaseButton);
        add(saleButton);

        purchaseButton.addActionListener(e -> processTransaction('P'));
        saleButton.addActionListener(e -> processTransaction('S'));
    }

    private void processTransaction(char type) {
        try {
            double amount = Double.parseDouble(amountField.getText());

            if (amount < 0) {
                JOptionPane.showMessageDialog(this, "Amount cannot be negative");
                return;
            }

            if (type == 'P') {
                if (digitalWallet.getBalance() >= amount) {
                    digitalWallet.setBalance(digitalWallet.getBalance() - amount);
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient funds");
                    return;
                }
            } else {
                digitalWallet.setBalance(digitalWallet.getBalance() + amount);
            }

            digitalWallet.addTransaction(type, amount);
            amountField.setText(""); // Clear the text field
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid amount");
        }
    }

    public void updateBalanceLabel() {
        balanceLabel.setText("Balance: $" + String.format("%.2f", digitalWallet.getBalance()));
    }
}


