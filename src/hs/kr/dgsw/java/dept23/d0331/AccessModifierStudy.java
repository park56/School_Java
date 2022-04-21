package hs.kr.dgsw.java.dept23.d0331;

public class AccessModifierStudy {  
	
	public int publicValue;    // 제한 없음 
	
	private int privateValue;	// 개인만 사용
	
	protected int protectedValue;   // 부모와 상속 관계일 때 사용 /같은 패키지냐 아니냐에 따라 접근법이 달라짐
	
	int defaultValue;	// 같은 패키지일때 사용가능  /같은 패키지냐 아니냐에 따라 접근법이 달라짐

}
