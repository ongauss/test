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
        System.out.println(" 문자 " + ch01 + "의 유니코드 : "  + intVar01);
        System.out.println(" 문자 " + ch02 + "의 유니코드 : "  + intVar02);
        System.out.println(" 문자 " + ch03 + "의 유니코드 : "  + intVar03);
        System.out.println(" 문자 " + ch04 + "의 유니코드 : "  + intVar04);
        System.out.println(" 문자 " + (char)('A'+1) + "의 유니코드 : "  + ('A'+1));
	}
}
