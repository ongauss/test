package section03;

public class Exam05 {
	public static void main(String[] args) {
		byte a = 51;        //..... a의 이진 값은 “00110011” 이 된다. 
		byte b = 102 ;      //..... b의 이진 값은 “01100110” 이 된다. 
		byte c ; 
		c = (byte) ~ a;     //..... c의 이진 값은 “11001100” 즉, -54 가 된다. 
		System.out.println(c);
		c = (byte)(a & b);   //..... c의 이진 값은 “00100010”, 즉 34 가 된다. 
		System.out.println(c);
		c = (byte)(a >> 2);  //..... c의 이진 값은 “00001100”, 즉 12가 된다. 
		System.out.println(c);
		c = (byte)(b << 2);  //..... c의 이진 값은 “10011000”, 즉 -104가 된다. 
		System.out.println(c);
		c = (byte)(a >>> 4); //..... c의 이진 값은“00000011”, 즉 3 이 된다. 
		System.out.println(c);
	}
}
