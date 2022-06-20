package hs.kr.dgsw.java.dept23.d0616;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionStudy {

	
	public void studyMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�����ֶ�", 1592);
		map.put("�����Ǳ�", 1392);
		map.put("�Ŵ���߰�", 1492);
		map.put("������������", 1789);
		map.put("���θ����", 476);
		
		Integer year = map.get("�����ֶ�");
		System.out.println(year);
		
		year = map.get("����ź��");
		System.out.println(year);
		
		
		Set<String> keySet = map.keySet();
		Collection<Integer> values = map.values();
	}
	
	public void studyQueue() {
		Queue<String> queue = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		
		queue.add("korea");
		queue.add("japan");
		queue.add("china");
		queue.add("USA");
		
		while(queue.size() > 0) {
			System.out.println(queue.poll());
		}
	}
	
	public void studySet() {
		
		Set<String> set = new HashSet<String>();		// set = ����, �ߺ� ����, ���� ����
		
		set.add("korea");
		set.add("japan");
		set.add("china");
		set.add("USA");
		
		for(String str : set) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		new CollectionStudy().studyMap();
	}
}
