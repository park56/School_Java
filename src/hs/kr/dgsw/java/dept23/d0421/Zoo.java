package hs.kr.dgsw.java.dept23.d0421;

public class Zoo {

	// ����� �ڽĵ��� �θ��� ���·� ������ �Ǳ� ������ pig�� duck�� �̸� animal�� ��ӹ޾� ���� animal�� ������ �ڵ����� ����ȯ �� �Լ��� �� 
	public void breed(Animal animal) {
		System.out.printf("%s�� %s��ϴ�\n",animal.getName(), animal.getSound());
	}
	
	/*public void breed(Pig pig) {
		System.out.printf("%s�� %s��ϴ�\n",pig.getName(), pig.getSound());
	}
	
	public void breed(Duck duck) {
		System.out.printf("%s�� %s��ϴ�\n",duck.getName(), duck.getSound());
	}*/
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Duck duck = new Duck();
		Pig pig = new Pig();
	
		zoo.breed(pig);
		zoo.breed(duck);
	}
}
