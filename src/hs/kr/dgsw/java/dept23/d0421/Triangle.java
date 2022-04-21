package hs.kr.dgsw.java.dept23.d0421;

public class Triangle extends Rectangle{
	
	public  Triangle(int width, int height) {
		super(width, height);
	}
	
	public String getType() {
		return "»ï°¢Çü";
	}
	
	@Override
	public double getArea() {
		return super.getArea()/2;
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle(8, 7);
		
		tri.print();
	}
}
