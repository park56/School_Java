package hs.kr.dgsw.java.dept23.d0324;

import java.util.Scanner;

public class Calculator {
	
	private final String operator;
	private final Scanner scanner;
	
	public Calculator(String operator) {    // 초기설정
		this.operator = operator;
		this.scanner = new Scanner(System.in);
	}
	
	public int	calculate(int operand1, int operand2) {          // 수 두개의 형식 알고 리턴 execute에 사용
		if ("+".equals(operator)) {
			return operand1 + operand2;
		}else if ("-".equals(operator)) {
			return operand1 - operand2;
		}else if ("*".equals(operator)) {
			return operand1 * operand2;
		}else if ("/".equals(operator)) {
			return operand1 / operand2;
		}else if ("%".equals(operator)) {
			return operand1 % operand2;
		}else {
			throw new RuntimeException("Unknown opertor");
		}
	}
	
	public void execute() {   // 수 받기 -> 계산(Calculate) -> 출력
		while(true) {
			System.out.println("정수를 두 개 입력하세요 : ");
			int operand1 = scanner.nextInt();
			int operand2 = scanner.nextInt();
			
			if (operand1 == 0 && operand2 == 0) {
				break;
			}
			
			int result = calculate(operand1, operand2);
			System.out.printf("%d %s %d = %d\n",operand1,operator,operand2,result);
		}
		
		scanner.close();
		System.out.println("시스템이 종료되었습니다");
	}
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("적용할 연산기호 입력");
			throw new RuntimeException();
			
		}
		Calculator calculator = new Calculator(args[0]);
		calculator.execute();
		
	}
}
