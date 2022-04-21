package hs.kr.dgsw.java.dept23.d0407;

import java.util.Scanner;

public class FriendFind {

	private Scanner scanner;
	
	private String[] friend = {"정은서","강성훈","고용빈","기준","김민성","류지훈","박병관","박성한","박지건","박현우","손원","안찬","우상범","윤병훈","윤서준", "이승민", "이지호","최민재","한상빈"};
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public Scanner getScanner() {
		return this.scanner;
	}
	
	public void printFriend(int num) {
		if(num > friend.length || 0 >= num) {
			System.out.println("번호가 존재하지 않습니다");
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
		
		System.out.println("번호를 입력하세요");
		
		fin.prepareScanner();
		Scanner mainScanner = fin.getScanner();
		
		int friendNum = mainScanner.nextInt();
		//String friendNum = mainScanner.next();
		fin.printFriend(friendNum);
	}
}
