package section01;

public class exam03 {
	public static void main(String[] args) {
		char ch01='A';
		char ch02='\u0041';
		char ch03='\0';
		char ch04=' ';
		int intVar01=ch01;
		int intVar02=ch02;
		int intVar03=ch03;
		int intVar04=ch04;
        System.out.println(" ���� " + ch01 + "�� �����ڵ� : "  + intVar01);
        System.out.println(" ���� " + ch02 + "�� �����ڵ� : "  + intVar02);
        System.out.println(" ���� " + ch03 + "�� �����ڵ� : "  + intVar03);
        System.out.println(" ���� " + ch04 + "�� �����ڵ� : "  + intVar04);
        System.out.println(" ���� " + (char)('A'+1) + "�� �����ڵ� : "  + ('A'+1));
	}
}
