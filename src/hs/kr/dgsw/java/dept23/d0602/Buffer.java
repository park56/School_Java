package hs.kr.dgsw.java.dept23.d0602;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	private final Queue<Integer> queue = new LinkedList<Integer>();
	
	public synchronized void add(int value) {		// queue에 숫자 넣기
		queue.add(value);
		
		notify();   // 아무한테나 손님이 왔다고 알림
	}
	
	public Integer get() {
		return queue.poll();
		
	}
	
	public static void main(String[] args) {
		
		Buffer buffer = new Buffer();
		
		Producer producer = new Producer(buffer);
		Thread thread = new Thread(producer);
		thread.start();
		
		Consumer consumer = new Consumer(buffer);
		Thread consumerThread = new Thread(consumer);
		consumerThread.start();
	}
}
