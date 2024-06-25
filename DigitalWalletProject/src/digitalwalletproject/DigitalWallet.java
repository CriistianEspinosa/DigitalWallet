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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DigitalWallet extends JFrame {
    private BalancePanel balancePanel;
    private TransactionPanel transactionPanel;
    private double balance = 100.00; // Saldo inicial
    private Random random = new Random();

    public DigitalWallet() {
        setTitle("Simple Wallet");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        balancePanel = new BalancePanel(this); // Pasamos la instancia de DigitalWallet al BalancePanel
        transactionPanel = new TransactionPanel();

        add(balancePanel, BorderLayout.NORTH);
        add(transactionPanel, BorderLayout.CENTER);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        balancePanel.updateBalanceLabel(); // Actualiza el label del balance en el BalancePanel
    }

    public void addTransaction(char type, double amount) {
        int id = 10000 + random.nextInt(90000);
        String typeStr = (type == 'P') ? "P" : "S";
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        transactionPanel.addTransaction(id, typeStr, amount, date);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DigitalWallet wallet = new DigitalWallet();
            wallet.setVisible(true);
        });
    }
}
