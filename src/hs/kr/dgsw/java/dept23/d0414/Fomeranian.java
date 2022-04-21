package hs.kr.dgsw.java.dept23.d0414;

import java.util.Iterator;

public class Fomeranian extends Dog{
	public	Fomeranian() {
		super("포메라니안");
	}
	
	
	// 상속의 상속
	public static void main(String[] args) {
		Animal fomeranian = new Fomeranian();
		fomeranian.move();
		fomeranian.eat("개껌");
		fomeranian.makeSound();
		
		Object object = new Object();    // Object는 시조 클래스(모든 클래스는 오브젝트를 상속받음
	}
}

