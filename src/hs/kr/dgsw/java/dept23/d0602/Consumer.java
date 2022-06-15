package hs.kr.dgsw.java.dept23.d0602;

import java.io.BufferedReader;

public class Consumer implements Runnable {

	private final Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		while(true) {

			synchronized (buffer) {
				try {
					buffer.wait();
					int value = buffer.get();;
					System.out.println("숫자 " + value + "을 처리합니다");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
			}
		}
	}
}


