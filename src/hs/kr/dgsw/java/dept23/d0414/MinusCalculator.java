package hs.kr.dgsw.java.dept23.d0414;


public class MinusCalculator extends PlusCalculator{
	
	
	public int calculate(int value1, int value2) {
		return this.value1-this.value2;
	}
	
	
	/*public void showResult(int n) {
		System.out.printf("%d - %d = %d\n",this.value1, this.value2,n);
	}*/
	
	public String getOperator() {    // �������̵� : �θ� �ڽ� ���迡�� ������Ʈ�� ���� �����̿� �ִ� �޼ҵ尡 ����Ǵ°�  �������̵� : �̸��� ���� �Լ��� �Ű������� ���� ���� �޶���
		return "-";
	}
	
	public static void main(String[] args) {
		MinusCalculator min = new MinusCalculator();
		min.execute();
	}
}
