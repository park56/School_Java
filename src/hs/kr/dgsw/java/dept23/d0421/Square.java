package hs.kr.dgsw.java.dept23.d0421;

public class Square extends Rectangle{
	
	@Override
	public String getType() {
		return "정사각형";
	}
	
	public Square(int width) {
		super(width, width);
	}
	
}
