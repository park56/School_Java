package hs.kr.dgsw.java.dept23.d0407;

import java.util.Arrays;

public class ArrayStudy {

	public void studyArray() {
		//int[] array1 = new int[10];
		int array2[];
		String[] names = new String[5];
		int[] array1 = new int[10];
		int[] values = {1,2,3,4,5};
		String[] colors = {"red","yellow","green","blue","pouple","black","white"};
	
		colors[4] = "pink";
		
		printLastValue(colors);
		printColors(colors);
		
		//String mycolor = colors[10];
		//System.out.println(mycolor);
		
		String[] colors2 = colors;          // colors�� �迭�� ����
		colors2[2] = "blue";
		//System.out.println(colors[2]);
		
		ArrayCopy arrayCopy = new ArrayCopy();        // �迭�� ���� ����
		String[] colors3 = arrayCopy.copy(colors);
		colors3[3] = "�ʷ�";
		//System.out.println(colors[3]);
		
		int[] intVal = arrayCopy.copy(values);
		
		
		System.out.println("colors1 : " + Arrays.toString(colors));
		System.out.println("colors2 : " + Arrays.toString(colors2));
		System.out.println("colors3 : " + Arrays.toString(colors3));
		System.out.println("colors3 : " + Arrays.toString(intVal));
		
	}
	
	public void printLastValue(String[] values) {
		int len = values.length;
		System.out.println(values[len-1]);
	}
	
	public void printColors(String[] colors) {
		// TODO colors�� ����ִ� ���� �ε��� - �� �������� ��� ���
		for(int i = 0; i<colors.length; i++) {   //���1
			System.out.printf("%d - %s\n",i,colors[i]);
		}
		
		for(String color : colors) {     // ���2 ind�� ��
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
		study.studyArray();
			
	}
}