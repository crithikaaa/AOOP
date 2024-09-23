package bank;

public class Transcation implements Runnable{
	private final BankAccount account;

    public Transcation(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(100);
            account.withdraw(50);
        }
    }

    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        Transcation transaction1 = new Transcation(sharedAccount);
        Transcation transaction2 = new Transcation(sharedAccount);

        Thread user1 = new Thread(transaction1, "User1");
        Thread user2 = new Thread(transaction2, "User2");

        user1.start();
        user2.start();
    }
}
