package hs.kr.dgsw.java.dept23.d0414;

import java.util.Iterator;

public class Fomeranian extends Dog{
	public	Fomeranian() {
		super("���޶�Ͼ�");
	}
	
	
	// ����� ���
	public static void main(String[] args) {
		Animal fomeranian = new Fomeranian();
		fomeranian.move();
		fomeranian.eat("����");
		fomeranian.makeSound();
		
		Object object = new Object();    // Object�� ���� Ŭ����(��� Ŭ������ ������Ʈ�� ��ӹ���
	}
}

