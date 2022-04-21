package hs.kr.dgsw.java.dept23.d0407;

public class ArrayCopy {
	/*
	 * 주어진 src배열을 복사해 리턴
	 * @param src
	 * @return
	 */
	
	public String[] copy(String[] src) {
		String[] result = new String[src.length];
		for(int i = 0; i<src.length; i++) {
			result[i] = src[i];
		}
		return result;
	}
	
	
	public int[] copy(int[] src) {
		int[] result = new int[src.length];
		for(int i = 0; i<src.length; i++) {
			result[i] = src[i];
		}
		return result;
	}
}
