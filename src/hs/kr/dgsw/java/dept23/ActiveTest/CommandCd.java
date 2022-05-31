package hs.kr.dgsw.java.dept23.ActiveTest;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		String nextUrl = commandLine.replace("cd ", "").strip();   // command의 주소값 추출(앞뒤 공백제거)
		//File startFile = new File("C:\\");
		
		if (nextUrl.equals("..")) { 
			//if(currentDirectory == null) {
			if(currentDirectory.getParentFile() == null) {
				System.out.println("돌아갈 수 없음");
				return currentDirectory;
			}
			return currentDirectory.getParentFile();
		}
		else {
			File toUrl = new File(currentDirectory.getPath()+"/"+nextUrl);
				if(toUrl.exists()) {
					if(toUrl.isDirectory()) {
						return toUrl;					 
					}
					else {
						System.out.println("디렉토리가 아님");
					}
				}
				else {
					System.out.println("존재하지 않는 폴더");
				}
		}
		return currentDirectory;
	}
}
