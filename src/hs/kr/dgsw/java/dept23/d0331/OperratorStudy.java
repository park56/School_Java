package hs.kr.dgsw.java.dept23.d0331;

public class OperratorStudy {
	
public void studyArithmeticOperators() {
	int value;
	
	value = 3 + 4;
	value = 3 - 4;
	value = 3 * 4;
	value = 3 / 4;
	value = 3 % 4;
	
	value += 3;
	value -= 3;
	value *= 3;
	value /= 3;
	value %= 3;
	
	int value1 = ++value;
	value1 = value--;
	}

	public void studyComparisionOperators() {
		boolean flag;
		
		flag = 3 > 4;
		flag = 3 < 4;
		flag = 3 >= 4;
		flag = 3 <= 4;
		
		flag = 3 == 4;
		flag = 3 != 4;
	}

	public void studyLogicalOperators() {
		int value;
		value = 3 & 2;  // 2������ ��ȯ�� ����
		value = 3 | 2;
		value = 3 ^ 2;
		
		value = 10 << 1;    // int���� *2�� ȿ��
		value = 10 >> 1;    // int���� /2�� ȿ��
		
		byte value1 = -128;
		
		byte result = (byte)((byte)value1 >> 1);    // �������� ��Ʈ ������ �ϸ� ��ȣ�� �����Ǳ� ���� �ֻ��� ��Ʈ�� ���� ���� ����
		
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		OperratorStudy study = new OperratorStudy();
		study.studyLogicalOperators();
		
		int a = 40;
		int b = 25;
		
		int max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		max = (a>b) ? a:b;
	}
}
