package hs.kr.dgsw.java.dept23.d0526;

import java.util.Random;

public class SecondThread implements Runnable{	// �����带 �����ϴ� �ٸ� ��� ������������� �׻� �� ����� ���

	
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
		SecondThread nadal = new SecondThread("����");
		SecondThread son = new SecondThread("�����");
		
		Thread nadalThread = new Thread(nadal);
		nadalThread.start();
		
		new Thread(son).start();
	}
}