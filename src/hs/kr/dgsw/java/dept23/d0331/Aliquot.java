package hs.kr.dgsw.java.dept23.d0331;

import java.util.Scanner;

public class Aliquot {
	
	private Scanner scanner;
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
 	public Scanner getScanner() {
 		return this.scanner;
 	}
 	
	public String findAliquots(int value){
		String ali = "";
		
		for(int i = 1; i<=value/2; i++) {
			if (value % i == 0) {
				ali+=Integer.toString(i)+",";
			}
		}
		ali+=Integer.toString(value);
		//ali = ali.substring(0,ali.length()-1);
		return ali;
	}
	
	public static void main(String[] args) {
		
		Aliquot  mainAli = new Aliquot();
		int basicInt;
		
		mainAli.prepareScanner();
		Scanner mainScanner =	mainAli.getScanner();
		basicInt = mainScanner.nextInt();
		
		String finalInt = mainAli.findAliquots(basicInt);
		System.out.printf(finalInt);	
	}
}
