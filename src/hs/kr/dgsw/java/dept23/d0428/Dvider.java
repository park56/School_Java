package hs.kr.dgsw.java.dept23.d0428;

public class Dvider extends Calculator{
	
	@Override
	public int calculate() {
		
		return value1 / value2;
	}
	
	@Override
	public String getOperator() {
		return "/";
	}
	@Override
	public boolean isExit() {
		return(value2 == 0);
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Dvider();
		calc.execute();
	}
}
