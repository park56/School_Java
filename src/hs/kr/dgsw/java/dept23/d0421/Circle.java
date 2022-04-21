package hs.kr.dgsw.java.dept23.d0421;

public class Circle extends Polygon{

	protected final int radius;  // 반지름
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String getType() {
		return "원";
	}
	
	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
}
