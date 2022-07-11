package hs.kr.dgsw.java.dept23.ActiveTest;

import java.io.File;
import java.util.Scanner;

public class ProcessOfRemove extends AbstractCommand {
	
	protected final Scanner scanner;

	public ProcessOfRemove(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
		this.scanner = new Scanner(System.in);
	}
	
	
	@Override
	public File executeCommand() {
		
		String rmData = commandLine.replace("rm ", "").strip();
		File file = new File(currentDirectory.getAbsolutePath()+"/"+rmData);
		
		if(!file.exists()) {
			System.out.println("������ ã�� �� �����ϴ�");
			return this.currentDirectory;
		}
		
		System.out.println("������ �����Ͻðڽ��ϱ�? �Ͻ÷��� Y�� y�� �Է��� �ֽʽÿ�");
		
		String answer = this.scanner.nextLine();
		
		if(answer.equals("Y") || answer.equals("y")) {
			;
		}else {
			System.out.println("�����ϴµ� �����߽��ϴ�");
			return currentDirectory;
		}
		
		boolean isdelete = file.delete();
		
		if(isdelete) {
			System.out.println(rmData+"�� ���������� ���� �Ǿ����ϴ�");
		}else {
			System.out.println(rmData+"�� �������� �ʾҽ��ϴ�");
		}
					
		return this.currentDirectory;
	}
}
