package hs.kr.dgsw.java.dept23.d0428;

public abstract class Animal {     // abstract 추상클래스 만들기
	
	
	public abstract String getName();   // 자식클래스는 이 함수,변수는 빚으로 무조건 사용해야함
	
	/*public String getName() {
		return "동물";
	}*/
	
	public abstract String makeSound();   // "abstract" 자식클래스는 이 함수,변수는 빚으로 무조건 사용해야함
	
	/*public String makeSound() {
		return "zzz";
	}*/
	
	public void move() {
		System.out.printf("%s가 %s 소리를 내며 움직입니다.\n",getName(),makeSound());
	}
	
	public static void main(String[] args) {
		// 추상클래스는 추상적인 것들만 만들어놓고 구현은 상속받은 클래스에게 넘기기 위해 존재
		// Animal animal = new Animal();  추상 클래스로는 오브젝트를 만들지 못함
		
		Animal animal = new Horse();   // 상속을 이용해 선언가능 
		animal.move();
	
	}
	
}
