package Java.BankSystem;

public class bankAccount {
    private String name;
    private double balance;

    public bankAccount(String name, double initialBalance){
        this.balance = initialBalance;
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }
}
