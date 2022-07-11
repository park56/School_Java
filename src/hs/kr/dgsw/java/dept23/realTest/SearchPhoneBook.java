package hs.kr.dgsw.java.dept23.realTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchPhoneBook {
	
	// 파일 검색의 결과를 보여주거나 파일에 직접 쓰고 읽기를 담당

	private Main main = new Main();
	
	public String value;
	public String[] numData;		// 실질적으로 사용하는 데이터
	
	// 검색을 요청받았을 때 핸들러
	public void searchNum() throws IOException{
		
		main.prepareScanner();
		Scanner scanner = main.getScanner();
		
		System.out.println("이름이나 번호를 입력해주세요 : ");
		value = scanner.nextLine();
		
		if (getNum(value) < 1){
			System.out.println("존재하지 않습니다");
			return;
		}
		
		getFileData();
		
		for(String i : numData) {
			if(i.contains(value)) {
				System.out.println(i);
			}
		}
	}
	
	// 입력을 받지 않고 파일을 검색 할 때
	public void onlySearch(String value) throws IOException{
		
		main.prepareScanner();
		
		getFileData();
		
		for(String i : numData) {
			if(i.contains(value)) {
				System.out.println(i);
			}
		}
	}

	// 파일안에 있는 값을의 총 개수를 반환
	public int getNum(String value) throws IOException{
		
		getFileData();
		int j = 0;
		
		for(String i : numData) {
			if(i.contains(value)) {
				j++;
			}
		}
		
		return j;
	}	
	
	// 파일의 데이터를 끌어와 반환
	public void getFileData() throws IOException{
		
		FileReader reader = new FileReader("C:\\Users\\DGSW\\phonebook.txt");
		String fileData;
		
		int ret;
		fileData = "";
		
		while((ret = reader.read())!= -1) {
			fileData += Character.toString((char)ret);
		}

		String[] numDataStrings = fileData.split("\n");

		// 정렬
		List<String> telephones = new ArrayList<>(List.of(numDataStrings));
		Collections.sort(telephones);
		this.numData = telephones.toArray(new String[numDataStrings.length]);
	}
	
	// 인자를 받아 파일에 쓰는 함수
	public void writeFile(String writeValue) throws IOException {
		
		File file = new File("C:\\Users\\DGSW\\phonebook.txt");
		
		FileWriter fW = new FileWriter(file,false);
		
		fW.write(writeValue);
		fW.close();
	}
}
