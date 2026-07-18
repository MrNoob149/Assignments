public class Main {

    private int accountNumber;
    private double balance;

    private static int TotalAccounts;
    private static int nextAccountNumber;

    public Main(double Initialbalance) {
        TotalAccounts++;
        accountNumber = nextAccountNumber++;
        balance = Initialbalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("error");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return TotalAccounts;
    }

    public static void main(String[] args) {
        Main account1 = new Main(1000);
        Main account2 = new Main(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + Main.getTotalAccounts());
    }
}