package Java.BankSystem;

public class deposit {
    
    public void depositProcess(bankAccount account, double amount){
        if (amount > 0) {
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println("Deposited: $" + amount);
        } else System.out.println("Invalid deposit amount.");
    }
}
