package hs.kr.dgsw.java.dept23.gagenbo;

import java.util.Random;

public class Opponent {
	
	public void makeRandom(String userValue) {
		String randValue = getRandomValue();
		new Referee().judgeWin(userValue, randValue);
	}
	
	public String getRandomValue() {
		int randNum = new Random().nextInt(3) + 1;
		String randString  = toString(randNum);
		return randString;
	}
	
	public String toString(int randNum) {
		
		String randString;
		
		if(randNum == 1) {
			randString = "가위";
		}else if(randNum == 2) {
			randString = "바위";
		}else {
			randString = "보";
		}	
		return randString;
	}	
}
