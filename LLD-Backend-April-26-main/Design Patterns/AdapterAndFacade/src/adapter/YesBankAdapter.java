package adapter;

import java.util.UUID;

public class YesBankAdapter implements BankAPI {

    private YesBankAPI yesBankAPI;

    public YesBankAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public int fetchBalance(BankAccount account) {
        return yesBankAPI.checkBalance(account);
    }

    @Override
    public void doTransaction(BankAccount sender, BankAccount reciever, int amount) {
        String token = UUID.randomUUID().toString();
        yesBankAPI.sendMoney(sender,reciever,amount, token);
    }
}
