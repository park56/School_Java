package hs.kr.dgsw.java.dept23.d0414;

import java.util.Scanner;


public class PlusCalculator {
	
	protected final Scanner scanner;
	public int value1;
	public int value2;
	
	public PlusCalculator() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		/* �� ������ �Է¹޴´�. */
		this.inputNumbers();
		/* �� ������ ���. */
		int result = this.calculate(this.value1, this.value2);
		/* ��� ����� ���. */
		this.showResult(result);
		/* �ڿ��� ����. */
		this.scanner.close();
	}
	
	public void inputNumbers() {
		System.out.println("������ �� �� �Է��ϼ���");
		this.value1 = this.scanner.nextInt();
		this.value2 = this.scanner.nextInt();	
	}
	
	public int calculate(int value1, int value2) {
		return this.value1+this.value2;
	}
	
	public String getOperator() {
		return "+";
	}
	
	public void showResult(int n) {
		System.out.printf("%d %s %d = %d\n",this.value1,getOperator(),this.value2,n);
	}
	
	public static void main(String[] args) {
		PlusCalculator plus = new PlusCalculator();
		plus.execute();
	}
	
	
	
}
