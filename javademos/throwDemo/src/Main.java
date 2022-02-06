public class Main {

    public static void main(String[] args) {
	    AccountManager manager = new AccountManager();
        System.out.println("Bakiye = "+  manager.getBalance());
        manager.deposit(1000);
        System.out.println("1000 Tl para yatırıldı");

        System.out.println("Bakiye = "+  manager.getBalance());
        try {
            manager.withdraw(500);
            System.out.println("500 Tl para çekildi");
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        try {
            manager.withdraw(800);
            System.out.println("800 Tl para çekildi");
        }catch (BalanceInsufficentException exception){
            System.out.println("800 Tl para çekilemedi");
            System.out.println(exception.getMessage());
        }
        System.out.println("Bakiye = "+  manager.getBalance());
    }
}
