package hs.kr.dgsw.java.dept23.d0414;

public class DivisionCalculator extends PlusCalculator{
	
	public int calculate(int value1, int value2) {
		return this.value1/this.value2;
	}
	
	public String getOperator() {    // �������̵� : �θ� �ڽ� ���迡�� ������Ʈ�� ���� �����̿� �ִ� �޼ҵ尡 ����Ǵ°�  �������̵� : �̸��� ���� �Լ��� �Ű������� ���� ���� �޶���
		return "/";
	}
	
	public static void main(String[] args) {
		DivisionCalculator divi = new DivisionCalculator();
		divi.execute();
	}
}
