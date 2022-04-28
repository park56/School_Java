package hs.kr.dgsw.java.dept23.d0428;

public class Adder extends Calculator{

	public int calculate() {
		return this.value1 + this.value2;
	}
	
	public String getOperator() {
		return "+";
	}
	
	public static void main(String[] args) {
		Calculator calc = new Adder();
		calc.execute();
	}
}
