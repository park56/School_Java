package hs.kr.dgsw.java.dept23.d0421;

public class Card {
	
	public int money;
	public String type;
	
	public Card(int money, String type) {
		this.money = money;
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public boolean canPaiable(int fee) {
		if(this.money >= fee) {
			return true;
		}
		return false;
	}
	
	public void payment(int fee) {
		this.money = this.money - fee;
	}
}
