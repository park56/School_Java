package hs.kr.dgsw.java.dept23.d0331;

public class ChildClass extends AccessModifierStudy{
	
	public static void main(String[] args) {
		
		AccessModifierStudy study = new AccessModifierStudy();
		//ChildClass study = new ChildClass();
		
		study.publicValue = 5;
		study.privateValue = 5;
		
		study.protectedValue = 5;	// �θ𿡰�(AccesssModifierStudy) ��� �޾ұ� ������ ��밡��
		study.defaultValue = 5;		// ���� ��Ű�� �̱� ������ ��� ����
	}
}
