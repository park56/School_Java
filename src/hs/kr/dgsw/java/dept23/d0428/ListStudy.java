package hs.kr.dgsw.java.dept23.d0428;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

	public void studyList() {
		List<String> list = new ArrayList<String>();
		//List<String> list = new LinkedList<String>();    대부분 위에 방식이 더 좋음
		
		String[] array = new String[5];
		
		// 저장하기
		array[0] = "blue";
		array[1] = "blaco";
		array[4] = "red";
		
		list.add("blue");
		list.add("black");
		list.add("red");
		list.add("pink");
		list.add("yellow");
		list.add("green");
		
		list.add(3,"white");  // 4번쨰 인덱스에 값 넣기
		
		// 읽어오기
		String color = array[1];
		color = list.get(1);
		
		// 크기
		int size = array.length;
		size = list.size();
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(i + " : "+list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		// 삭제하기
		String value = list.remove(1);
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(i + " : "+list.get(i));
		}
	}
	
	public static void main(String[] args) {
		ListStudy list = new ListStudy();
		list.studyList();
	}
}
