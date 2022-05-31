package hs.kr.dgsw.java.dept23.d0526;

import java.util.Random;

public class JoinStudy implements Runnable{

	@Override
	public void run() {
		System.out.println("자식 쓰레드가 일을 시작합니다");
		try {
			Thread.sleep(new Random().nextInt(3000) + 1000);
		} catch (InterruptedException e) {}
		System.out.println("자식 쓰레드가 일을 끝냈습니다");
	}
	
	
	public static void main(String[] args) {
		System.out.println("메인 쓰레드가 시작합니다");
		
		Thread child = new Thread(new JoinStudy());
		
		//child.setDaemon(true);		부모가 죽는 순간 자식도 죽음
		child.setDaemon(false);
		child.start();
		
		/*try {
			child.join();
		} catch (InterruptedException e) {}*/
		
		
		System.out.println("메인 쓰레드가 종료됩니다");
	}
}
