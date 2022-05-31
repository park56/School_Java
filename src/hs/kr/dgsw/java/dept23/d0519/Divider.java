package hs.kr.dgsw.java.dept23.d0519;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
	
	// 예외처리 예제
	// 런타임 이셉션 클래스를 상속받았다면 오류가능성이 있어도 예외처리가 필요없지만 그 외에는 모두 예외처가 필수 
	
	private final Scanner scanner;
	
	public Divider() {
		this.scanner = new Scanner(System.in);
	}
	
	private int calculate(int value1, int value2) {
		return value1 / value2;
	}
	
	private boolean saveResult(String filePath,int value1,int value2,int result) {
		
		File file = new File(filePath);
		//String finalValue = value1 + " / " + value2 + " = " + result;
		String finalValue = String.format("%d / %d = %d", value1,value2,result);

		OutputStream os = null;
		
		try {
			FileWriter fw = new  FileWriter(file);
			//PrintWriter pw = new PrintWriter(fw);			// 방법 1
			//pw.write(finalValue);
			//pw.close();
			
			os = new FileOutputStream(file);
			os.write(finalValue.getBytes());
			
			System.out.println("파일 저장 성공");
			return true;
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않음");
		} finally {											// 에러가 일어나든 정상적으로 끝나든 무조건 실행, 심지어 앞에 리턴이 일어나도 실행되고 리턴됨
			System.out.println("자원을 해제합니다");
			if (os != null){
				try{
					os.close();						  				// 중요!
				}catch(IOException e) {}
			}			
		}
		
		return false;
	}
	
	public void execute() {
		
		try {						// 시도 해보고 예외가 발생하면
			System.out.println("두 정수를 입력하세요 : ");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int result = calculate(value1, value2);
			
			System.out.printf("%d / %d = %d\n",value1, value2, result);
			
			// 계산식 결과를 파일에 저장한다.
			saveResult("D:\\studyschool\\java\\test.txt",value1, value2, result);
			
			System.out.println("시스템을 종료합니다");

		} catch(InputMismatchException e) {					// 에러가 Inpur~~과 같으면 케치함
			System.out.println("숫자를 입력하세요");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
		} finally {
			System.out.println("스케너 자원을 해제합니다");
			scanner.close();
		}
		
		
		/*catch(Exception e) {		// 이 코드을 실행해라
			
			//System.out.println("예외가 발생했습니다");
			//System.out.println(e);		
		
			if(e instanceof InputMismatchException) {
				System.out.println("문자가 아닌 숫자를 입력하세요");
			}else if(e instanceof  ArithmeticException) {
				System.out.println("0으로는 나눌 수 없습니다");
			}
		}*/
	}
	
	public static void main(String[] args) {
		new Divider().execute();
	}
	
}
