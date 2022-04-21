package hs.kr.dgsw.java.dept23.d0421;

public class CardReader {
	
protected int income;
	
	public CardReader() {     // 버스에 있는 돈 초기화
		this.income = 0;
	}
	
	public int getIncome() {     // 버스에 들어가는 돈
		return this.income;
	}
	
	public void contact(Card card) {     // 카드를 리더기에 찍었을 떄
		
		String type = card.getType();
		int fee = 0;
		
		if ("성인".equals(type)) {
			fee = 1500;
		} else if ("학생".equals(type)) {
			fee = 800;
		} else if ("어르신".equals(type)) {
			fee = 0;
		} else {
			throw new RuntimeException("잘못된 카드입니다.");
		}
		
		boolean enough = card.canPaiable(fee);
		
		if (enough) {
			card.payment(fee);
			income += fee;
			System.out.println(card.getType() + "입니다.");
		} else {
			System.out.println("잔액이 부족합니다. 당장 내리세요.");
		}
	}
	
	
	
	public static void main(String[] args) {
		CardReader reader = new CardReader();
		
		Card card = new Card(100,"학생");
		reader.contact(card);
		
		System.out.println("오늘의 수입은 " + reader.getIncome() + "원 입니다.");
	}
}
