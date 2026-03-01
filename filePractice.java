package Java;
import java.util.*;

public class filePractice {
    private double balance;
    private String owner;

    public filePractice(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance += amount;
        System.out.println("Withdrew: $" + amount);
    }

    public void checkBalance() {
        System.out.println(owner + "'s Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        filePractice account = new filePractice("John", 1000.0);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Deposit amount: $");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Withdraw amount: $");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                account.checkBalance();
            } else if (choice != 4) {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}

