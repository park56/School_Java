package hs.kr.dgsw.java.dept23.d0616;


public class Simple<T, Q> {		// ���ʻ� �ѱ��ڷ� ��
	
	
	// generic(���׸�) Ÿ��

	private T value;
	private Q value2;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Simple<Integer,String> simple = new Simple<Integer,String>();				// Simple �� T���� ��� integer�� �����
		simple.setValue(1311);
		
		Simple<String, Integer> simple2 = new Simple<String, Integer>();
		simple2.setValue("hello");
		
		//Integer intValueInteger = 3; // Integer = ���� Ŭ���� int�� ���� �����. int�� ���� ��ġ��(���ٰ� �����ص� OK)
		
		
		Simple raw = new Simple();
		Integer valueInteger = (Integer)raw.getValue();
			
	}
}
