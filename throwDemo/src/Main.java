public class Main {

    public static void main(String[] args) throws Exception {
	    AccountManager accountManager = new AccountManager();
        System.out.println("Hesap = " + accountManager.getBalance());
        accountManager.deposite(100);
        System.out.println("Hesap = " + accountManager.getBalance());
        try
        {
            accountManager.withdraw(90);
        }
        catch (BalanceInsufficentException exception)
        {
           System.out.println(exception.getMessage());
        }

        System.out.println("Hesap = " + accountManager.getBalance());

        try
        {
            accountManager.withdraw(20);
        }
        catch (BalanceInsufficentException exception)
        {
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap = " + accountManager.getBalance());
    }
}
