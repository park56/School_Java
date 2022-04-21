package hs.kr.dgsw.java.dept23.d0414;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("mew");
	}
	
	public static void main(String[] args) {
		Animal cat = new Cat("navi");
		cat.move();
		cat.eat("»ý¼±");
		cat.makeSound();
	}
}

