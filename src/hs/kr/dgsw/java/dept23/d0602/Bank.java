package hs.kr.dgsw.java.dept23.d0602;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Bank {
	
	
	private final Map<String, Account> accountMap = new HashMap<String,Account>();
	
	public void makeAccount(String name) {
		Account account = new Account(name);
		accountMap.put(name, account);			// ???? ????
	}
	
	public synchronized void deposit(String name, int amount) {			// ???¿? ???? ?߰?   // synchronized - ????ȭ
		
	Account account = accountMap.get(name); 
		
	synchronized (account) {		// ?κ? ????ȭ
		if (account != null) {
			int balance = account.geBalance();
			System.out.printf("%s ?ܾ????? - %d\n",Thread.currentThread().getName(),balance);
			
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.printf("%s ???????? - %d\n",Thread.currentThread().getName(),balance);
			
			int newBalance = balance + amount;
			
			account.setBalance(newBalance);
			
			System.out.printf("%s ?????Ϸ? - %d\n",Thread.currentThread().getName(),account.geBalance());
		}
	}
		
	}
		
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount("ȫ?浿");
		
		Thread thread1 = new Thread(new DepositThread(bank, 50000));
		thread1.start();
		
		Thread thread2 = new Thread(new DepositThread(bank, 30000));
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Account account = bank.getAccount("ȫ?浿");
		System.out.println(account.getName() + "?????? ?ܾ??? "+account.geBalance() + "?? ?Դϴ?.");
	}

}
