package hs.kr.dgsw.java.dept23.d0428;

public abstract class Animal {     // abstract �߻�Ŭ���� �����
	
	
	public abstract String getName();   // �ڽ�Ŭ������ �� �Լ�,������ ������ ������ ����ؾ���
	
	/*public String getName() {
		return "����";
	}*/
	
	public abstract String makeSound();   // "abstract" �ڽ�Ŭ������ �� �Լ�,������ ������ ������ ����ؾ���
	
	/*public String makeSound() {
		return "zzz";
	}*/
	
	public void move() {
		System.out.printf("%s�� %s �Ҹ��� ���� �����Դϴ�.\n",getName(),makeSound());
	}
	
	public static void main(String[] args) {
		// �߻�Ŭ������ �߻����� �͵鸸 �������� ������ ��ӹ��� Ŭ�������� �ѱ�� ���� ����
		// Animal animal = new Animal();  �߻� Ŭ�����δ� ������Ʈ�� ������ ����
		
		Animal animal = new Horse();   // ����� �̿��� ���𰡴� 
		animal.move();
	
	}
	
}
