package hs.kr.dgsw.java.dept23.BinarySearch;

public interface Searcher {

	/**
	 * �־��� ���ĵ� �迭���� �־��� ���� �����ϴ� ��ġ�� �ε����� �ǵ�����.
	 * 
	 * @param sortedValues ������������ ���ĵ� ���� �迭
	 * @param value ã�� ��
	 * @return value�� ��ġ�ϴ� �ε���, ���� �迭�� �־��� ���� ������ -1
	 */
	public int search(int[] sortedValues, int value);
}