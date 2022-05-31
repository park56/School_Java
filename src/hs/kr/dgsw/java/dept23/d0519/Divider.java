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
	
	// ����ó�� ����
	// ��Ÿ�� �̼��� Ŭ������ ��ӹ޾Ҵٸ� �������ɼ��� �־ ����ó���� �ʿ������ �� �ܿ��� ��� ����ó�� �ʼ� 
	
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
			//PrintWriter pw = new PrintWriter(fw);			// ��� 1
			//pw.write(finalValue);
			//pw.close();
			
			os = new FileOutputStream(file);
			os.write(finalValue.getBytes());
			
			System.out.println("���� ���� ����");
			return true;
		} catch (IOException e) {
			System.out.println("������ �������� ����");
		} finally {											// ������ �Ͼ�� ���������� ������ ������ ����, ������ �տ� ������ �Ͼ�� ����ǰ� ���ϵ�
			System.out.println("�ڿ��� �����մϴ�");
			if (os != null){
				try{
					os.close();						  				// �߿�!
				}catch(IOException e) {}
			}			
		}
		
		return false;
	}
	
	public void execute() {
		
		try {						// �õ� �غ��� ���ܰ� �߻��ϸ�
			System.out.println("�� ������ �Է��ϼ��� : ");
			
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			int result = calculate(value1, value2);
			
			System.out.printf("%d / %d = %d\n",value1, value2, result);
			
			// ���� ����� ���Ͽ� �����Ѵ�.
			saveResult("D:\\studyschool\\java\\test.txt",value1, value2, result);
			
			System.out.println("�ý����� �����մϴ�");

		} catch(InputMismatchException e) {					// ������ Inpur~~�� ������ ��ġ��
			System.out.println("���ڸ� �Է��ϼ���");
		} catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�");
		} finally {
			System.out.println("���ɳ� �ڿ��� �����մϴ�");
			scanner.close();
		}
		
		
		/*catch(Exception e) {		// �� �ڵ��� �����ض�
			
			//System.out.println("���ܰ� �߻��߽��ϴ�");
			//System.out.println(e);		
		
			if(e instanceof InputMismatchException) {
				System.out.println("���ڰ� �ƴ� ���ڸ� �Է��ϼ���");
			}else if(e instanceof  ArithmeticException) {
				System.out.println("0���δ� ���� �� �����ϴ�");
			}
		}*/
	}
	
	public static void main(String[] args) {
		new Divider().execute();
	}
	
}
