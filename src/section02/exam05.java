package section02;

import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String greeting, name;
		System.out.print("인사 말을  입력하세요.  >> ");
		greeting = input.nextLine();
		System.out.print("사람이름을  입력하세요. >> ");
		name = input.nextLine();
		System.out.printf("입력한 내용 : "+greeting +", " + name);
	}
}
