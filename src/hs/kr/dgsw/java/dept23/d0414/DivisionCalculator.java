package hs.kr.dgsw.java.dept23.d0414;

public class DivisionCalculator extends PlusCalculator{
	
	public int calculate(int value1, int value2) {
		return this.value1/this.value2;
	}
	
	public String getOperator() {    // 오버라이딩 : 부모 자식 관계에서 실행파트와 가장 가까이에 있는 메소드가 실행되는것  오버라이드 : 이름이 같은 함수가 매개변수에 따라 값이 달라지
		return "/";
	}
	
	public static void main(String[] args) {
		DivisionCalculator divi = new DivisionCalculator();
		divi.execute();
	}
}
