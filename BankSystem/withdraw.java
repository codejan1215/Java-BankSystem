package Java.BankSystem;

public class withdraw {

    public void withdrawProcess(bankAccount account, double amount){
        if (amount > 0 && amount <= account.getBalance()) {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            System.out.println("Withdrew: $" + amount);
        } else 
            System.out.println("Insufficient balance!");
        
    }
}
