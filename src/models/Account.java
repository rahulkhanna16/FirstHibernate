package models;

import javax.persistence.Entity;
//import javax.persistence.Id;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private int account_no;
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	
}
