package hs.kr.dgsw.java.dept23.d0414;

public class Child extends Parent {
	
	private int age;
	
	public void showAge() {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		System.out.println(child.age);
		System.out.println("name : "+child.name);
		child.sayHello();
		
		// int weight = child.weight;      private�� ��Ӱ��迩�� �������
		
		Parent parent = new Child();
		//Child child1 = new Parent();    child > parent�̱� ������ 
		Parent realParent = new Parent();
		
		parent.sayHello();
		//parent.showAge();
		
		System.out.println(parent + " " + parent.getClass());
		System.out.println(realParent+" "+realParent.getClass());
		
		Child child1 = (Child)parent;     // parent�� Child�� ����ȯ
		//Child child2 = (Child)realParent;
	}
}
