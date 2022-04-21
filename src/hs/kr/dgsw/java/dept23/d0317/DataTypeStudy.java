package hs.kr.dgsw.java.dept23.d0317;

public class DataTypeStudy {
	
	public void studyInteger() {
		
		byte byteValue = 1;
		short shortValue = 1;
		int intValue = 1;
		long longValue = 3000000000L;  // Long ≈∏¿‘¿”¿ª «•Ω√
		
	}
	
	public void studyReal() {
		double doubleValue = 1.2345678901234567890;
		float floatValue = 1.2345678901234567890f;
		
		System.out.println(doubleValue);
		System.out.println(floatValue);	
	}
	
	public void studyboolean() {
		boolean bool = true;
		boolean bool2 = false;
	}
	
	public void studyChar() {
		char ch = 'A';
		char ch2 = 65;
		/*
		for(char i = 0; i < 256; i++) {
			System.out.printf("%04X %d - %c\n",(int)i,(int)i,i);
		}
		*/
		int a = '∞°';
		System.out.println(a);
		
		int count = '∆R' - '∞°';
		System.out.println(count);
		
		/*for(int i = '∞°'; i<'∞º'; i++) {
			System.out.printf("%d - %c\n",i,(char)i);
		}*/
	}
	
	public static void main(String[] args) {
		DataTypeStudy study = new DataTypeStudy();
		study.studyChar();
	}
 		
}
