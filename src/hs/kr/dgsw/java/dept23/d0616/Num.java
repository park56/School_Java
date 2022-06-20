package hs.kr.dgsw.java.dept23.d0616;

public class Num<T extends Number> {	// Number를 상속받은 클래스만 호출이 가능함(제한을 거는것)
	
	private T value;
	
	public void print() {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		Num<Integer> num1 = new Num<Integer>();
		Num<Double> num2 = new Num<Double>();
		Num<Short> num3 = new Num<Short>();
		//Num<String> num4 = new Num<String>();	 불가능
	}
	
	

}
