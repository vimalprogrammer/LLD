package adapter;

public interface BankAPI {

    int fetchBalance(BankAccount account);

    void doTransaction(BankAccount sender, BankAccount reciever, int amount);
}
