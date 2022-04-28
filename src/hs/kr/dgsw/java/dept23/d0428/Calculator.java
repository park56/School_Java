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
		// 두정수를 입력받는다
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
		
		// 계산을 수행한다
		int result = this.calculate();
		// 결과를 출력한다
		this.showResult(result);
		}
		
		this.scanner.close();
		System.out.println("프로그램을 종효합니다");
	}
	
	
	public void inputValues() {
		System.out.println("두 정수를 입력하세요");
		
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
