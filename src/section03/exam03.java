package section03;

import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a, b;
		boolean result; 

		System.out.print("정수형 데이터 2개를 입력하세요. >> ");
		a = input.nextInt();
		b = input.nextInt();
		result=a>b; 
		System.out.println(a+" > "+b+" --> "+result); 
		result=a>=b; 
		System.out.println(a+" >= "+b+" --> "+result); 
		result=a<b; 
		System.out.println(a+" < "+b+" --> "+result); 
		result=a<=b; 
		System.out.println(a+" <= "+b+" --> "+result); 
		result=a==b; 
		System.out.println(a+" == "+b+" --> "+result); 
		result=a!=b; 
		System.out.println(a+" != "+b+" --> "+result); 
	}
}
