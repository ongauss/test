package section02;

import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a, b, c;
		System.out.print("실수형 데이터 2개를 입력하세요. >> ");
		a = input.nextDouble();
		b = input.nextDouble();
		c=a+b;
		System.out.printf("%7.2f + %7.2f = %7.2f ", a , b, c);
	}
}
