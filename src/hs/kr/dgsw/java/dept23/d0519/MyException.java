package hs.kr.dgsw.java.dept23.d0519;

public class MyException extends Exception{

	private static final long serialVersionUID = -322722803975881757L;   //  �׳� ������ ����� ���ؼ� (exception�� ���� Ŭ���������� ����)
	
	public void method1() throws MyException{
		System.out.println("method1 ȣ���");
		
		// ���ܸ� �߻����� ����
		MyException exception = new MyException();
		throw exception;
	}
	
	public void method2() {
		try {
			method1();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method3() throw Exception;{
			MyRuntimeException exception = new MyRuntimeException();
	}
	
	
	public static void main(String[] args) {
		new ExceptionStudy().method2();
	}

}
