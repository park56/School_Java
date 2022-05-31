package hs.kr.dgsw.java.dept23.d0526;

import java.util.Random;

public class SecondThread implements Runnable{	// 쓰레드를 생성하는 다른 방법 정재봉선생님은 항상 이 방법을 사용

	
	private final String name;
	
	public SecondThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {				
		
		for(int i = 0; i< 10; i++) {
			System.out.printf("%s : %s\n",name,i);
			
			try {
				Thread.sleep(new Random().nextInt(500) + 1000);				
			} catch (InterruptedException e) {}			
		}
	}
	
	public static void main(String[] args) {
		SecondThread nadal = new SecondThread("나달");
		SecondThread son = new SecondThread("손흥민");
		
		Thread nadalThread = new Thread(nadal);
		nadalThread.start();
		
		new Thread(son).start();
	}
}
