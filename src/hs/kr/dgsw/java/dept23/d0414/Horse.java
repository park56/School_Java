package hs.kr.dgsw.java.dept23.d0414;

public class Horse extends Animal{
	public Horse(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("heheheheheh");
	}
	
	public static void main(String[] args) {
		Animal horse = new Horse("navi");
		horse.move();
		horse.eat("´ç±Ù");
		horse.makeSound();
	}
}
