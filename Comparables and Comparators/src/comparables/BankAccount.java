package comparables;

public class BankAccount implements Comparable<BankAccount> {

	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(BankAccount o) {
		if(balance > o.balance) {
			return 1;
		}
		
		if(balance < o.balance) {
			return -1;
		}
		return 0;
	}

}
