package section03;

public class Exam05 {
	public static void main(String[] args) {
		byte a = 51;        //..... a�� ���� ���� ��00110011�� �� �ȴ�. 
		byte b = 102 ;      //..... b�� ���� ���� ��01100110�� �� �ȴ�. 
		byte c ; 
		c = (byte) ~ a;     //..... c�� ���� ���� ��11001100�� ��, -54 �� �ȴ�. 
		System.out.println(c);
		c = (byte)(a & b);   //..... c�� ���� ���� ��00100010��, �� 34 �� �ȴ�. 
		System.out.println(c);
		c = (byte)(a >> 2);  //..... c�� ���� ���� ��00001100��, �� 12�� �ȴ�. 
		System.out.println(c);
		c = (byte)(b << 2);  //..... c�� ���� ���� ��10011000��, �� -104�� �ȴ�. 
		System.out.println(c);
		c = (byte)(a >>> 4); //..... c�� ���� ������00000011��, �� 3 �� �ȴ�. 
		System.out.println(c);
	}
}
