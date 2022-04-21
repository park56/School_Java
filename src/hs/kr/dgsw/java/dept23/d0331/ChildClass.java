package hs.kr.dgsw.java.dept23.d0331;

public class ChildClass extends AccessModifierStudy{
	
	public static void main(String[] args) {
		
		AccessModifierStudy study = new AccessModifierStudy();
		//ChildClass study = new ChildClass();
		
		study.publicValue = 5;
		study.privateValue = 5;
		
		study.protectedValue = 5;	// 부모에게(AccesssModifierStudy) 상속 받았기 때문에 사용가능
		study.defaultValue = 5;		// 같은 패키지 이기 때문에 사용 가능
	}
}
