package hs.kr.dgsw.java.dept23.d0324;

import hs.kr.dgsw.java.dept23.d0331.AccessModifierStudy;

public class Exmaples extends AccessModifierStudy{
	
	public static void main(String[] args){
		
		AccessModifierStudy study = new AccessModifierStudy();
		//Exmaples study = new Exmaples();
		
		study.publicValue = 5;
		study.privateValue = 5;
		
		study.protectedValue = 5;	
		study.defaultValue = 5;		// 다른 패키지라서 사용 불가
	}
	
}

