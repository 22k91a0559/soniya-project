package Encapsulation;
public class BankAccount {
    private double balance; 

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance amount");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1500.00);  // Setting balance
        System.out.println("Account balance: " + account.getBalance()); 

        account.setBalance(-500); 
    }
}

