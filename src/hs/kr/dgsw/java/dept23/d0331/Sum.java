package hs.kr.dgsw.java.dept23.d0331;

import java.util.Scanner;

public class Sum {
	
	private Scanner scanner;
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
 	public Scanner getScanner() {
 		return this.scanner;
 	}
 	
	public int allSumInt(int n) {
		int sumValue = 0;
		for(int i =0;i<=n;i++) {
			sumValue += i;
		}
		return sumValue;
	}
	
	public int allSumInt(int n,int m) {
		int sumValue = 0;
		for(int i =n;i<=m;i++) {
			sumValue += i;
		}
		return sumValue;
	}
	
	public void howValue() {
		System.out.printf("값을 입력하세요 : ");
	}
		
	public static void main(String[] args) {
		Sum mainSum = new Sum();
		int gotValue = 0;
		int gotValue1 = 0;
		
		mainSum.prepareScanner();
		Scanner mainScanner = mainSum.getScanner();
		
		mainSum.howValue();
		gotValue = mainScanner.nextInt();
		System.out.println(mainSum.allSumInt(gotValue));
		
		mainSum.howValue();
		gotValue = mainScanner.nextInt();
		gotValue1 = mainScanner.nextInt();
		System.out.println(mainSum.allSumInt(gotValue,gotValue1));
	}
}
