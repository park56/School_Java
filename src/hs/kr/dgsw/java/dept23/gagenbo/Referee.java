package hs.kr.dgsw.java.dept23.gagenbo;

public class Referee {
	
	private static int win = 0;
	private static int lose = 0;
	private static int same = 0;
	
	public void judgeWin(String userValue, String randomValue) {
		
		int result = getResult(userValue,randomValue);
		
		if (result == -1){
			System.out.printf("%s vs %s ; 당신이 패배하였습니다\n",userValue,randomValue);
			lose++;
		}else if(result == 0){
			System.out.printf("%s vs %s ; 무승부 입니다\n",userValue,randomValue);
			same++;
		}else {
			System.out.printf("%s vs %s ; 당신이 승리하였습니다\n",userValue,randomValue);
			win++;
		}
		
		System.out.printf("전적 : %d승 %d무 %d패\n",win,same,lose);
	}
	
	public void quitHandle() {
		System.out.printf("총 전적 : %d승 %d무 %d패\n",win,same,lose);
	}
	
	private int getResult(String userValue, String randomValue) {
		
		int result = 0;
		
		if (userValue.equals(randomValue)) {
			;
		}else {
			if(userValue.equals("가위")&&randomValue.equals("보")) {
				result = 1;
			}else if(userValue.equals("바위")&&randomValue.equals("가위")) {
				result = 1;
			}else if(userValue.equals("보")&&randomValue.equals("바위")) {
				result = 1;
			}else {
				result = -1;
			}
		}
		
		return result;
	}
}
