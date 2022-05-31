package hs.kr.dgsw.java.dept23.d0519;

public class MyException extends Exception{

	private static final long serialVersionUID = -322722803975881757L;   //  그냥 오류를 지우기 위해서 (exception의 상위 클래스에대한 오류)
	
	public void method1() throws MyException{
		System.out.println("method1 호출됨");
		
		// 예외를 발생시켜 보자
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
