package hs.kr.dgsw.java.dept23.d0526;

import java.util.Random;

public class FirstThread extends Thread {	// ����� �޾ƾ߸� ������ν� ��밡��

	
	private final String name;
	
	public FirstThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {				// �������� ��������Ʈ (������ Ŭ������ main)
		
		for(int i = 0; i< 10; i++) {
			System.out.printf("%s : %s\n",name,i);
			
			try {
				//Thread.sleep(1000);
				Thread.sleep(new Random().nextInt(500) + 1000);				// �����带 ��� ����
			} catch (InterruptedException e) {}			
		}
	}
	
	public static void main(String[] args) {
		FirstThread nadal = new FirstThread("����");
		FirstThread son = new FirstThread("�����");
		
		/* �̰� �׳� ���������� ����� */
		//	nadal.run();
		//	son.run();
		
		/* �̷��� �ؾ� �� �����尡 ������ */
		nadal.start(); 
		son.start();
	}
}
