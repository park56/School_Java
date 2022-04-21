package hs.kr.dgsw.java.dept23.d0421;

public class Zoo {

	// 상속의 자식들은 부모의 형태로 저장이 되기 떄문에 pig와 duck을 미리 animal을 상속받아 놓고 animal로 받으면 자동으로 형변환 후 함수로 들어감 
	public void breed(Animal animal) {
		System.out.printf("%s가 %s웁니다\n",animal.getName(), animal.getSound());
	}
	
	/*public void breed(Pig pig) {
		System.out.printf("%s가 %s웁니다\n",pig.getName(), pig.getSound());
	}
	
	public void breed(Duck duck) {
		System.out.printf("%s가 %s웁니다\n",duck.getName(), duck.getSound());
	}*/
	
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Duck duck = new Duck();
		Pig pig = new Pig();
	
		zoo.breed(pig);
		zoo.breed(duck);
	}
}
