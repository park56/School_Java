package hs.kr.dgsw.java.dept23.d0616;


public class Simple<T, Q> {		// 관례상 한글자로 함
	
	
	// generic(제네릭) 타입

	private T value;
	private Q value2;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Simple<Integer,String> simple = new Simple<Integer,String>();				// Simple 의 T값이 모두 integer로 변경됨
		simple.setValue(1311);
		
		Simple<String, Integer> simple2 = new Simple<String, Integer>();
		simple2.setValue("hello");
		
		//Integer intValueInteger = 3; // Integer = 맵핑 클래스 int를 덮어 씌운다. int와 거의 일치함(같다고 생각해도 OK)
		
		
		Simple raw = new Simple();
		Integer valueInteger = (Integer)raw.getValue();
			
	}
}
