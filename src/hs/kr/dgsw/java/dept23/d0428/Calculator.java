package hs.kr.dgsw.java.dept23.d0428;

import java.util.Scanner;

public abstract class Calculator {
	
	protected final Scanner scanner;
	
	protected int value1 = 1;
	
	protected int value2 = 1;
	
	public Calculator () {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		
		while(this.value1 != 0 && this.value2 != 0) {
		// �������� �Է¹޴´�
		this.inputValues();
		/*if(getOperator().equals("/")) {
			if(value2 == 0) {
				break;
		}else{
			if(this.value1 == 0 && this.value2 == 0) {
				break;				
			}
		}
		}*/
		if(isExit()) {
			break;
		}
		
		// ����� �����Ѵ�
		int result = this.calculate();
		// ����� ����Ѵ�
		this.showResult(result);
		}
		
		this.scanner.close();
		System.out.println("���α׷��� ��ȿ�մϴ�");
	}
	
	
	public void inputValues() {
		System.out.println("�� ������ �Է��ϼ���");
		
		this.value1 = this.scanner.nextInt();
		this.value2 = this.scanner.nextInt();
		}
	
	public abstract int calculate();
	public abstract String getOperator();
	
	public boolean isExit() {
		return (value1 == 0 && value2 == 0);
	}
	
	public void showResult(int result) {
		System.out.printf("%d %s %d = %d\n",value1, getOperator(),value2,result);
	}
	
}
