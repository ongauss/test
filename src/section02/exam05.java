package section02;

import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String greeting, name;
		System.out.print("�λ� ����  �Է��ϼ���.  >> ");
		greeting = input.nextLine();
		System.out.print("����̸���  �Է��ϼ���. >> ");
		name = input.nextLine();
		System.out.printf("�Է��� ���� : "+greeting +", " + name);
	}
}
