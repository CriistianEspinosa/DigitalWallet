![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/e404ffd7-1dd9-4a70-b727-844c147cac71)![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/c4ae1762-e11d-4130-833f-6785d0c13975)


# DIGITAL WALLET
Welcome to this program, which works as a digital wallet that can handle numerical entries through two different options: one to make payments and another to make sales. Depending on the option selected, the wallet balance will increase or decrease. You will start with an initial balance of $100. Each operation carried out must be registered with a unique identifier, the date and time of execution, as well as the amount involved. For this purpose, the "Apache NetBeans IDE" version 22 development environment will be used, along with Java version 17.

## MEMBERS:
* Cristian Espinosa
* Carlos Chiluisa

## PROGRAM STRUCTURE
The program is organized into three main classes:

* DigitalWallet class:
This is the main class that extends JFrame, representing the main window of the application.
Configure the graphical interface using a BorderLayout to arrange different components.
It has methods to manage balance and transactions.
Contains the main method that starts the application by creating a DigitalWallet instance and making it visible.

* Class Balance Dashboard:
Represents the top panel of the graphical interface within DigitalWallet.
Contains labels (JLabel) to display the current balance and labels to describe the amount entry (JLabel and JTextField).
It has buttons (JButton) to make purchases (Purchase) and sales (Sale).
Handles button events to make transactions and dynamically updates the balance label after each transaction.

* Class transaction panel:
It is responsible for displaying the transactions carried out in a table within the graphical interface.
Use a JTable with a DefaultTableModel to display the ID, Type, Amount, and Date columns for each transaction.
Provides a method to add new rows to the table when a new transaction is made.


## PROGRAM OPERATION
* Application Start:
The DigitalWallet main method is the entry point. Use SwingUtilities.invokeLater() to ensure that the GUI is built on the Swing event thread.
Creates a DigitalWallet instance, which initializes the main window and all its components.

* Graphic interface:
BalancePanel displays the current balance and provides input fields (amountField) for the user to enter the amount to buy or sell.
The buttons (purchaseButton and saleButton) in BalancePanel allow the user to make transactions. Clicking these buttons activates the processTransaction(char type) method in DigitalWallet.

* Transaction Processing:
In DigitalWallet, the processTransaction(char type) method handles the transaction logic.
Verify that the amount entered is valid (non-negative and numerical).
Check if there is enough balance for the transaction. If it is a purchase ('P'), the amount is deducted from the balance; if it is a sale ('S'), it is added to the balance.
Update the balance by calling setBalance(double balance) and add the transaction by calling addTransaction(char type, double amount).

* Graphical Interface Update:
After each transaction, BalancePanel dynamically updates the balance label by calling updateBalanceLabel(), reflecting the updated balance.
TransactionPanel adds a new row to the transaction table using addTransaction(int id, String type, double amount, String date).

* Transaction Management:
TransactionPanel handles the display of all transactions made in the table, displaying the randomly generated unique ID, transaction type ('P' for purchase and 'S' for sale), amount and date of the transaction.

## HOW TO RUN THE PROGRAM
### To run the DigitalWallet program that we have described, you need to follow these steps:

Previous requirements
Make sure you have Java Development Kit (JDK) installed on your system. You can verify the installation by opening a terminal (in Windows, Command Prompt, or PowerShell) and running the command:
### Steps to Run the Program
1. Download the Code: If you don't have the DigitalWallet program code yet, copy it from the previous answer or make sure you have access to it.

2. Save the Code: Save the code in a file with a .java extension, for example, DigitalWallet.java.

3. Compile the Code: Open a terminal and navigate to the directory where you saved the DigitalWallet.java file. To compile the code, run the following command: javac DigitalWallet.java

4. Run the Program: Once compiled correctly, run the program with the following command: java DigitalWallet

5. Interact with the Application: Once the application is up and running, you can interact with it:

   * Enter an amount in the Amount field.
   * Click Purchase to simulate a purchase or Sale to simulate a sale.
   * Notice how the balance at the top is dynamically updated and the transaction is recorded in the transaction table in the center of the window.

6. Close the Application: To close the application, you can click on the close button of the window or close the terminal from where it was started.


## SCREENSHOTS OF THE RUNNING PROGRAM:

* ## Purchase or sale button
![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/fe8578bb-7b97-49a5-bffd-b3943f56f2b6)

![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/4a9d413e-8f18-4318-82d2-37a3c75ae980)


* ## Insufficient funds
![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/377299f9-8692-40f0-99cd-2d303254dd60)


* ## Negative values
![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/e5390764-9e7c-4b98-a04b-51164ffc369d)


* ## Incorrect values
![image](https://github.com/CriistianEspinosa/DigitalWallet/assets/169914497/829c5d9a-c440-4567-b1da-c8cac913fb6c)


