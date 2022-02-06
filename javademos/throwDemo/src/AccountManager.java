public class AccountManager {
    private double balance;

    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public void withdraw(double amout) throws BalanceInsufficentException {
        if (balance >=amout){
            balance = getBalance() - amout;
        }else {
            throw new BalanceInsufficentException("Bakiyeniz yetersizdir 2.");

        }


    }


    public double getBalance() {
        return balance;
    }
}
