package bank;

public class BankAccount {

    private String ownerName;
    private double balance;
    public int rateOfInterest;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 10000) {
            throw new RuntimeException("Invalid deposit amount");
        }
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    private void deposit(double amount) {
        balance += amount;
        System.out.println("Owner name"+ ownerName);
        System.out.println("Updated balance: "+balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Updated balance: "+balance);
    }
}
