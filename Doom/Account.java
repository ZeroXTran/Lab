import java.text.NumberFormat;

public class Account {
	private final double RATE = 0.035; // interest rate of 3.5%

	private long acctNumber;
	private double balance;
	private String name;

	public Account(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

	public Account(String owner) {
		name = owner;
		acctNumber = (long) (Math.random() * Math.pow(10, 5));
		balance = 0;
	}

	public Account(long account) {
		name = "";
		acctNumber = account;
		balance = 0;
	}

	public Account(double initBal, String owner) {
		balance = initBal;
		name = owner;
		acctNumber = (long) (Math.random() * Math.pow(10, 5));
	}

	public static void close(Account account) {
		account.name = account.name + " CLOSED";
		account.balance = 0;
	}

	public static Account join(Account acct1, Account acct2) {
		long n = (long) (Math.random() * Math.pow(10, 5));
		Account newAcct = new Account(acct1.name + "&" + acct2.name, n, acct1.balance + acct2.balance);
		close(acct1);
		close(acct2);
		return newAcct;
	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	public double withdraw(double amount, double fee) {
		balance = balance - amount - fee;
		return balance;
	}

	public double addInterest() {
		balance += (balance * RATE);
		return balance;
	}

	public double addInterest(double rate) {
		balance += (balance * rate);
		return balance;
	}

	public double addInterest(float rate) {
		balance = 1000000;
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}

	/*
	 * public void test() { Transactions.accountsOutput(this, new Account("Tim"),
	 * new Account("Bob")); }
	 */

	public static void reset(Account a1) {
		a1.name = "";
		a1.acctNumber = 0;
		a1.balance = 0;
	}
}