package hs.kr.dgsw.java.dept23.BinarySearch;

public class BinarySearch implements Searcher {
	
	@Override
	public int search(int[] sortedValues, int value) {
		
		int startNum = 0;
		int endNum = sortedValues.length;
		
		while(startNum <= endNum){
			
			int mid = (startNum + endNum) / 2;
			
			if(sortedValues[mid] == value) {
				return mid;
			}else if(sortedValues[mid] > value) {
				endNum = mid - 1;
			}else {
				startNum = mid + 1;
			}
		}
		
		if(sortedValues[(startNum+endNum)/2] == value) {
			return ((startNum+endNum)/2) ;
		}else {
			return -1;			
		}
	}
}
