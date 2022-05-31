package hs.kr.dgsw.java.dept23.d0526;

public class Thread_EX implements Runnable{
	
	private final String name;
	private final double record;
	
	public Thread_EX(String name,double record ) {
		this.name = name;
		this.record = record;
	}
	
	public void run() {
		
		/*for(int i =0; i < 14; i++) {
			System.out.printf("%s가 뛰고있습니다\n",name);
			try {
				Thread.sleep((int)record*100);
			} catch (InterruptedException e) {}
		}
		System.out.printf("%s의 경기가 끝났습니다.\n",name);*/
		
		int times = 0;
		double distance = 0;
		while(true)
		{
			distance = times * (100 / record);
			System.out.printf("%s 선수가 %d초 동안 %.2f를 달렸습니다\n",name, times, distance);
			
			if(distance >= 100) {
				break;
			}
			
			times++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		
		Thread_EX UB = new Thread_EX("UB",9.58);
		Thread_EX Kim = new Thread_EX("김국영",10.07);
		Thread_EX Ji = new Thread_EX("JiGun",12.56);
		Thread_EX gen = new Thread_EX("general",12.02);
		
		new Thread(UB).start();
		new Thread(Kim).start();
		new Thread(Ji).start();
		new Thread(gen).start();
		
	}
	

}
