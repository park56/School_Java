package hs.kr.dgsw.java.dept23.d0526;

import java.util.Random;

public class FirstThread extends Thread {	// 상속을 받아야만 쓰레드로써 사용가능

	
	private final String name;
	
	public FirstThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {				// 쓰레드의 시작포인트 (쓰레드 클래스의 main)
		
		for(int i = 0; i< 10; i++) {
			System.out.printf("%s : %s\n",name,i);
			
			try {
				//Thread.sleep(1000);
				Thread.sleep(new Random().nextInt(500) + 1000);				// 쓰레드를 잠깐 멈춤
			} catch (InterruptedException e) {}			
		}
	}
	
	public static void main(String[] args) {
		FirstThread nadal = new FirstThread("나달");
		FirstThread son = new FirstThread("손흥민");
		
		/* 이건 그냥 절차식으로 진행됨 */
		//	nadal.run();
		//	son.run();
		
		/* 이렇게 해야 새 쓰레드가 생성됨 */
		nadal.start(); 
		son.start();
	}
}
