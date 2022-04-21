package hs.kr.dgsw.java.dept23.d0414;

public class MultiflyCalculator extends PlusCalculator{

	public int calculate(int value1, int value2) {
		return this.value1*this.value2;
	}
	
	public String getOperator() {
		return "*";
	}
	
	
	public static void main(String[] args) {
		MultiflyCalculator multi = new MultiflyCalculator();
		multi.execute();
	}
		
}
