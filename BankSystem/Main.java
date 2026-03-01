package Java.BankSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Name: ");
        String name = sc.nextLine();

        bankAccount myAccount = new bankAccount(name,1000.00);

        deposit dp = new deposit();
        withdraw wd = new withdraw();
        checkDeposit cd = new checkDeposit();
        int choice = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit");
            System.out.print("Choose a number: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Deposit Amount: $");
                double amount = sc.nextDouble();
                dp.depositProcess(myAccount, amount);
            } else if (choice == 2) {
                System.out.print("Enter Withdraw Amount: $");
                double amount = sc.nextDouble();
                wd.withdrawProcess(myAccount, amount);
            } else if (choice == 3) {
                cd.checkDepositProcess(myAccount);
            } else if (choice != 4) {
                System.out.println("Invalid number.");
            }
        }

        sc.close();
    }
}
