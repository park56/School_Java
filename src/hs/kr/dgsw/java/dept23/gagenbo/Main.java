package hs.kr.dgsw.java.dept23.gagenbo;

import java.util.Scanner;

public class Main {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
	
		while (true) {
			
			System.out.println("���������� �߿� �Է��ϼ��� : ");
			String choice = scanner.nextLine().trim();
			
			if(choice.equals("����")||choice.equals("����")||choice.equals("��")) {
				new Opponent().makeRandom(choice);
			}else if(choice.equals("quit")){
				new Referee().quitHandle();
				System.out.println("���α׷��� �����մϴ�");
				return;
			}else {
				System.out.println("����� �Է��� �ּ���");
			}			
		}
	}
}
