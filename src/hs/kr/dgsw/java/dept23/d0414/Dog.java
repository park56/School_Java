package hs.kr.dgsw.java.dept23.d0414;

public class Dog extends Animal{    // �θ�Ŭ������ �Ű������� �ʿ���ϴ� �޼ҵ尡 �ִ°��
	public Dog(String name) {
		super(name);            // super�� �̿��� �θ�Ŭ������ �Ű������� �����ؾ� ��
	} 
	
	@Override
	public void makeSound() {
		System.out.println("�۸�");
	}
	
	public static void main(String[] args) {
		Animal dog = new Dog("happy");
		dog.move();
		dog.eat("���");
		dog.makeSound();
	}
}
