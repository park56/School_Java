package hs.kr.dgsw.java.dept23.BinarySearch;

import java.util.Random;
import java.util.Scanner;

public class SearchExecutor {

	public static final int SIZE = 1000;
	
	public static int[] makeSampleData() {
		int[] array = new int[SIZE];
		Random random = new Random(System.currentTimeMillis());
		
		int value = 0;
		for (int i = 0 ; i < array.length ; i++) {
			value += random.nextInt(3) + 1;
			array[i] = value;
		}
		
		return array;
	}
	
	public void doSearch(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ã�� ���� (������) �Է��ϼ���.");
		int value = scanner.nextInt();

		/*for (int a : array) {
			System.out.println(a);
		}*/
		
		Searcher searcher = new BinarySearch();  // TODO �� �κ��� �����ϼ���.
		int index = searcher.search(array, value);
		
		if (index >= 0) {
			System.out.printf("�迭���� ���� %d�� %d ��ġ�� �����մϴ�.", value, index);
		} else {
			System.out.printf("�迭���� ���� %d�� �������� �ʽ��ϴ�.", value);
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		SearchExecutor searchExecutor = new SearchExecutor();
		int[] sampleData = SearchExecutor.makeSampleData();
		
		searchExecutor.doSearch(sampleData);
	}
	
}