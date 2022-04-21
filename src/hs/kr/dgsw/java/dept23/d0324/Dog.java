package hs.kr.dgsw.java.dept23.d0324;

import java.util.Scanner;

public class Dog {
	
	private Scanner scanner;
	private String name;
	
	public void prepareScanner() {
		this.scanner = new Scanner(System.in);
	}
	
 	public void closeSca() {
 		this.scanner.close();
 	}
 	
 	public Scanner getScanner() {
 		return this.scanner;
 	}
 	
 	public void sayHello() {
		System.out.println("Hello "+this.name);
	}
 	
 	public static void main(String[] args) {
 		Dog sc = new Dog();
 		sc.prepareScanner();
 		
 		while(true) {
 			Scanner ani = sc.getScanner();
 			sc.name = ani.next();
 			
 			if(sc.name.equals("quit")) {
 				break;
 			}
 			sc.sayHello();
 		}
 		sc.closeSca();
 	}
}

















//package hs.kr.dgsw.java.dept23.d0324;
//
//public class Dog {
//	
//	private final String name;
//	private int age;
//	
//	public Dog() {   
//	//	System.out.println("before");   // ������ �������̵��� �������̵�ȣ���� ���� ���� ���;���
//		this("Cons1");
//		System.out.println("Cons1 After");
//	}
//	
//	public Dog(String name) {    // �޼ҵ� �̸��� �Լ��� ������ �����ڷ� �ڵ��Ǵ� /\ ������ ����
//		this.name = name;
//		System.out.println("Cons2 " + name);
//	}
//	
//	public void sayHello() {
//		System.out.println("Hello "+this.name);
//	}
//
//	
//	public static void main(String[] args) {
//				
//		Dog puppy = new Dog();
//		Dog happy = new Dog("����");
//		Dog poppy = new Dog("����");
//				
//		System.out.println("args Count : "+args.length);  // .length ���̱��ϱ�
//		for(int i = 0; i<args.length; i++) {
//			Dog dog = new Dog(args[i]);
//			dog.sayHello();
//		}
//		
//	}
//	
//}