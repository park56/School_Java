package hs.kr.dgsw.java.dept23.d0407;

import java.util.Scanner;

public class FriendFind {

	private Scanner scanner;
	
	private String[] friend = {"������","������","����","����","��μ�","������","�ں���","�ڼ���","������","������","�տ�","����","����","������","������", "�̽¹�", "����ȣ","�ֹ���","�ѻ��"};
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public Scanner getScanner() {
		return this.scanner;
	}
	
	public void printFriend(int num) {
		if(num > friend.length || 0 >= num) {
			System.out.println("��ȣ�� �������� �ʽ��ϴ�");
		}
		else {
			String Friend = this.friend[num-1];
			System.out.println(Friend);
		}			
	}
	
	/*public void printFriend(String num) {
		for(int friends : friend) {
			if(num.equals(num)) {
				System.out.println(friends);
			}
		}
	}*/
	
	public static void main(String[] args) {
		FriendFind fin = new FriendFind();
		
		System.out.println("��ȣ�� �Է��ϼ���");
		
		fin.prepareScanner();
		Scanner mainScanner = fin.getScanner();
		
		int friendNum = mainScanner.nextInt();
		//String friendNum = mainScanner.next();
		fin.printFriend(friendNum);
	}
}
