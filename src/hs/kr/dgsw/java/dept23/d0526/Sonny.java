package hs.kr.dgsw.java.dept23.d0526;

public class Sonny implements Job{
	@Override
	public void work() {
		System.out.println("������� ���� �ֽ��ϴ�");
	}
	
	@Override
	public int getPrice() {
		return 1000000;
	}
	
	public static void main(String[] args) {
		Job abcd = new Sonny();
	}
}
