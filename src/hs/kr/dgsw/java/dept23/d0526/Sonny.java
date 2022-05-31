package hs.kr.dgsw.java.dept23.d0526;

public class Sonny implements Job{
	@Override
	public void work() {
		System.out.println("º’»ÔπŒ¿Ã ∞Ò¿ª ≥÷Ω¿¥œ¥Ÿ");
	}
	
	@Override
	public int getPrice() {
		return 1000000;
	}
	
	public static void main(String[] args) {
		Job abcd = new Sonny();
	}
}
