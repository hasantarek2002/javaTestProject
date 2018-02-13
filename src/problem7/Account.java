package problem7;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account() {
	}

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int credit(int amount) {
		balance = balance + amount;
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance.");
		}
		return balance;
	}

	public int transfertTo(Account account,int amount) {
		balance=account.getBalance()+amount;
		return balance;

	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
