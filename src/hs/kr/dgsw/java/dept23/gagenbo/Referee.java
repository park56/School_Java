package hs.kr.dgsw.java.dept23.gagenbo;

public class Referee {
	
	private static int win = 0;
	private static int lose = 0;
	private static int same = 0;
	
	public void judgeWin(String userValue, String randomValue) {
		
		int result = getResult(userValue,randomValue);
		
		if (result == -1){
			System.out.printf("%s vs %s ; ����� �й��Ͽ����ϴ�\n",userValue,randomValue);
			lose++;
		}else if(result == 0){
			System.out.printf("%s vs %s ; ���º� �Դϴ�\n",userValue,randomValue);
			same++;
		}else {
			System.out.printf("%s vs %s ; ����� �¸��Ͽ����ϴ�\n",userValue,randomValue);
			win++;
		}
		
		System.out.printf("���� : %d�� %d�� %d��\n",win,same,lose);
	}
	
	public void quitHandle() {
		System.out.printf("�� ���� : %d�� %d�� %d��\n",win,same,lose);
	}
	
	private int getResult(String userValue, String randomValue) {
		
		int result = 0;
		
		if (userValue.equals(randomValue)) {
			;
		}else {
			if(userValue.equals("����")&&randomValue.equals("��")) {
				result = 1;
			}else if(userValue.equals("����")&&randomValue.equals("����")) {
				result = 1;
			}else if(userValue.equals("��")&&randomValue.equals("����")) {
				result = 1;
			}else {
				result = -1;
			}
		}
		
		return result;
	}
}
