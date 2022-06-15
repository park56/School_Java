package hs.kr.dgsw.java.dept23.realTest;

import java.io.IOException;
import java.util.Scanner;

public class ManegePhoneBook {
	
	// 기본적으로 인설트와 딜리트를 할 때 로직
	
	private Main main = new Main();
	private SearchPhoneBook SPB = new SearchPhoneBook();
	
	private String value;
	
	// 입력을 요청받았을 때 핸들러
	public void InsertNum() throws IOException{
		
		main.prepareScanner();
		Scanner scanner = main.getScanner();
		
		System.out.println("이름과 번호를 공백을 기준으로 입력해주세요 : ");
		value = scanner.nextLine();
		
		String[] command = value.split(" ");
	
		if(command.length!=2) {
			System.out.println("이름과 전화번호를 모두 입력해주새요");
			return;
		}
		if(command[1].length() != 11) {
			System.out.println("전화번호가 11자리인지 확인해주세요");
			return;
		}
		
		//value = command[0] + "+" + command[1];
		value = command[0] + " " + command[1];
		
		InsertValue(value);
	}
	
	// 삭제를 요청받았을 때 핸들러
	public void DeleteNum() throws IOException{
	
		main.prepareScanner();
		Scanner scanner = main.getScanner();
		
		System.out.println("삭제할 이름이나 번호를 입력해주세요 : ");
		value = scanner.nextLine();
		
		int gN = SPB.GetNum(value);
		
		if(gN > 1) {
			SPB.OnlySearch(value);
			System.out.println("값이 여러개입니다");
			System.out.println("삭제할 전화번호를 정확히 입력해주세요 : ");
			value = scanner.nextLine();
			
			if(value.length() != 11) {
				System.out.println("정확한 번호를 입력하세요");
				return;
			}
			delNum(value);
		}else if(gN < 1) {
			System.out.println("존재하지 않는 번호입니다");
		}else {
			delNum(value);
		}
	}
	
	// 딜리트일 때 파일에 쓰기전 조건에 맞는 데이터를 제거하는 함수
	public void delNum(String value) throws IOException {
		
		SPB.getFileData();
		String lastData = "";
		
		for(String i : SPB.numData) {
			if(!(i.contains(value))) {
				lastData += i + "\n";
			}
		}
		SPB.writeFile(lastData);
	}
		
	// 데이터를 추가하는 함수
	public void InsertValue(String value) throws IOException {
		
		SPB.getFileData();
		String lastData = "";
		
		for(String i : SPB.numData) {
			lastData += i + "\n";
		}
		
		lastData += value;
		
		SPB.writeFile(lastData);
	}
}
