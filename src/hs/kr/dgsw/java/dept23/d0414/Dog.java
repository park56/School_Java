package hs.kr.dgsw.java.dept23.d0414;

public class Dog extends Animal{    // 부모클래스에 매개변수를 필요로하는 메소드가 있는경우
	public Dog(String name) {
		super(name);            // super를 이용해 부모클래스의 매개변수를 선언해야 함
	} 
	
	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
	
	public static void main(String[] args) {
		Animal dog = new Dog("happy");
		dog.move();
		dog.eat("사료");
		dog.makeSound();
	}
}
