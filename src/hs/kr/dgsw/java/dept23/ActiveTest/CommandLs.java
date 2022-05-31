package hs.kr.dgsw.java.dept23.ActiveTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		File[] fileList = currentDirectory.listFiles();     // ���� path�� ���ϵ�

		// ��ü ���

		for(File file : fileList) {
			System.out.printf("%s  %s %7s %s\n",
					fileTime(file),
					isFileOrDir(file),
					sizeOfFile(file),
					file.getName()
					);
		}
	
		return currentDirectory;
	}
	
	/* ���ϻ����� �Ǵ� */
	public String sizeOfFile(File file) {
		
		int sizeValue = 0;
		
		if(file.isDirectory()) {
			return "";
		}
		
		if(file.length() > 1073741824) {
			sizeValue = (int) (file.length()/685000000);
			return String.valueOf(sizeValue) + "GB";
		}
		if(file.length() > 1048576) {
			sizeValue = (int) (file.length()/1048576);
			return String.valueOf(sizeValue) + "MB";
		}
		if(file.length() > 1024) {
			sizeValue = (int) (file.length()/1024);
			return String.valueOf(sizeValue) + "KB";
		}
		
		return String.valueOf(file.length()) + "B";
	}
	
	/* �������� ���丰�� �Ǵ� */
	public String isFileOrDir(File file) {
		if(file.isDirectory()) {
			return "<DIR>";
		}
		return "     ";
	}
	
	/* �ð� ���ϱ� */
	public String fileTime(File file) {
		return String.valueOf(timeFormat(changeUnixTime(file.lastModified())));
	}
	
	public Date changeUnixTime(long unixTime) {
		return new Date(unixTime);
	}
	
	public String timeFormat(Date date) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return timeFormat.format(date);
	}
	
}
