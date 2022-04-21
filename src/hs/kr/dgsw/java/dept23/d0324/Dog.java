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
//	//	System.out.println("before");   // 생성자 오버라이딩은 오버라이딩호출이 가장 먼저 나와야함
//		this("Cons1");
//		System.out.println("Cons1 After");
//	}
//	
//	public Dog(String name) {    // 메소드 이름이 함수와 같으면 생성자로 자동판단 /\ 리턴이 없음
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
//		Dog happy = new Dog("해피");
//		Dog poppy = new Dog("포피");
//				
//		System.out.println("args Count : "+args.length);  // .length 길이구하기
//		for(int i = 0; i<args.length; i++) {
//			Dog dog = new Dog(args[i]);
//			dog.sayHello();
//		}
//		
//	}
//	
//}