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
			System.out.println("파일을 찾을 수 없습니다");
			return this.currentDirectory;
		}
		
		System.out.println("정말로 삭제하시겠습니까? 하시려면 Y나 y를 입력해 주십시오");
		
		String answer = this.scanner.nextLine();
		
		if(answer.equals("Y") || answer.equals("y")) {
			;
		}else {
			System.out.println("삭제하는데 실패했습니다");
			return currentDirectory;
		}
		
		boolean isdelete = file.delete();
		
		if(isdelete) {
			System.out.println(rmData+"가 정상적으로 삭제 되었습니다");
		}else {
			System.out.println(rmData+"가 삭제되지 않았습니다");
		}
					
		return this.currentDirectory;
	}
}
