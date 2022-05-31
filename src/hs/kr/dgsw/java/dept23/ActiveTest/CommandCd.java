package hs.kr.dgsw.java.dept23.ActiveTest;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		String nextUrl = commandLine.replace("cd ", "").strip();   // command�� �ּҰ� ����(�յ� ��������)
		//File startFile = new File("C:\\");
		
		if (nextUrl.equals("..")) { 
			//if(currentDirectory == null) {
			if(currentDirectory.getParentFile() == null) {
				System.out.println("���ư� �� ����");
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
						System.out.println("���丮�� �ƴ�");
					}
				}
				else {
					System.out.println("�������� �ʴ� ����");
				}
		}
		return currentDirectory;
	}
}
