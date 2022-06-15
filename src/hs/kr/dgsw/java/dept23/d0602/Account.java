package hs.kr.dgsw.java.dept23.d0602;

public class Account {
	
	private final String name;
	private int balance;
	
	public Account(String name) {
		this.name = name;
		this.balance = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int geBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
