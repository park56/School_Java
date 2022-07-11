package hs.kr.dgsw.java.dept23.realTest;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	// 메인 로직
	// 인코딩 - UTF-8
	
	public Scanner scanner;
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public void closeScanner() {
		this.scanner.close();
	}
	
	public Scanner getScanner() {
		return this.scanner;
	}
	
	public static void main(String[] args) throws IOException{
		
		Main main = new Main();
		ManegePhoneBook MPB = new ManegePhoneBook();
		SearchPhoneBook SPB = new SearchPhoneBook();
		
		String commandLine = "";
		
		main.prepareScanner();

		Scanner scanner = main.getScanner();
		
		while(true) {
			System.out.println("입력,삭제,검색,종료 중 입력하세요 : ");
			commandLine = scanner.nextLine();
			
			commandLine = commandLine.trim();
			
			if(commandLine.equals("입력")) {
				MPB.insertNum();
			}else if(commandLine.equals("삭제")) {
				MPB.deleteNum();
			}else if(commandLine.equals("검색")) {
				SPB.searchNum();
			}else if(commandLine.equals("종료")) {
				System.out.println("프로그램을 종료합니다");
				return;
			}else {
				System.out.println("잘못된 명령어입니다");
			}
		}		
	}
}
