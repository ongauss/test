package section02;

import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a, b, c;
		System.out.print("������ ������ 2���� �Է��ϼ���. >> ");
		a = input.nextInt();
		b = input.nextInt();
		c=a+b;
		System.out.printf("%3d + %3d = %4d ", a , b, c);
	}
}
