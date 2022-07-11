package hs.kr.dgsw.java.dept23.gagenbo;

import java.util.Scanner;

public class Main {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
	
		while (true) {
			
			System.out.println("가위바위보 중에 입력하세요 : ");
			String choice = scanner.nextLine().trim();
			
			if(choice.equals("가위")||choice.equals("바위")||choice.equals("보")) {
				new Opponent().makeRandom(choice);
			}else if(choice.equals("quit")){
				new Referee().quitHandle();
				System.out.println("프로그램을 종료합니다");
				return;
			}else {
				System.out.println("제대로 입력해 주세요");
			}			
		}
	}
}
