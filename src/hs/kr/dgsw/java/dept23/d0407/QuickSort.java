package hs.kr.dgsw.java.dept23.d0407;

public class QuickSort {
	
	public int[] arr = {9,8,7,6,5};
	
	public void exe() {
		int cnt = 0;
		int temp = 0;
		
		for(int i = 1; i < arr.length; i++) {
			cnt = i;
			while(cnt > 0) {
				if(arr[cnt-1] > arr[cnt]) {
					temp = arr[cnt];
					arr[cnt] = arr[cnt-1];
					arr[cnt-1] = temp;
					cnt--;
				}
				else break;
			}
		}
		System.out.println(arr);
	}
	
	public static void main(String[] args) {
		QuickSort main = new QuickSort();
		main.exe();
	}
}
