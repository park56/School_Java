package hs.kr.dgsw.java.dept23.d0602;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Bank {
	
	
	private final Map<String, Account> accountMap = new HashMap<String,Account>();
	
	public void makeAccount(String name) {
		Account account = new Account(name);
		accountMap.put(name, account);			// 계좌 개설
	}
	
	public synchronized void deposit(String name, int amount) {			// 계좌에 돈을 추가   // synchronized - 동기화
		
	Account account = accountMap.get(name); 
		
	synchronized (account) {		// 부분 동기화
		if (account != null) {
			int balance = account.geBalance();
			System.out.printf("%s 잔액읽음 - %d\n",Thread.currentThread().getName(),balance);
			
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.printf("%s 적립시작 - %d\n",Thread.currentThread().getName(),balance);
			
			int newBalance = balance + amount;
			
			account.setBalance(newBalance);
			
			System.out.printf("%s 적립완료 - %d\n",Thread.currentThread().getName(),account.geBalance());
		}
	}
		
	}
		
	
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount("홍길동");
		
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
		
		Account account = bank.getAccount("홍길동");
		System.out.println(account.getName() + "계좌의 잔액은 "+account.geBalance() + "원 입니다.");
	}

}
