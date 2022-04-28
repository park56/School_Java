package hs.kr.dgsw.java.dept23.d0428;

public class Multiplyer extends Calculator{
	@Override
	public int calculate() {
		return value1 * value2;
	}
	
	@Override
	public String getOperator() {
		return "*";
	}
	
	public static void main(String[] args) {
		Calculator calc = new Multiplyer();
		calc.execute();
	}
}
