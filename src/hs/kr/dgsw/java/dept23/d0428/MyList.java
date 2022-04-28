package hs.kr.dgsw.java.dept23.d0428;

import java.util.ArrayList;
import java.util.List;

public class MyList extends ArrayList<String>{

	@Override
	public boolean add(String e) {
		
		boolean added = false;
		for(int i = 0; i<size(); i++) {
			if(e.compareTo(get(i)) < 0) {     // compareTo  =  string형 크기 비교
				add(i,e);
				added = true;
				break;
			}
		}
		
		if(!added) {
			return super.add(e);      // 그냥 add를 할 경우 자가 호출이 되기떄문에 부모 add가져옴
		} else {
			return true;
		}		
}
	
	public static void main(String[] args) {
		
		List<String> list = new MyList();
		
		list.add("red");
		list.add("pink");
		list.add("blue");
		list.add("black");
		list.add("yellow");
	
		
		for(String color : list) {
			System.out.println(color);
		}
	}
}
