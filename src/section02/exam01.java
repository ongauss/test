package section02;

public class exam01 {
	public static void main(String[] args) {
		System.out.printf("#1234567891234567891234567890");
		System.out.printf("\n/%d/", 16); 
		System.out.printf("\n/%5d/", 16);//5�ڸ� ����    
		System.out.printf("\n/%-5d/",16);//5�ڸ� ���� �� ���� ����   
		System.out.printf("\n/%1d/", 16);//������ �ڸ����� ���õ�    
		System.out.printf("\n/%05d/", 16);//���� �� ������ 0���� ä��  
		System.out.printf("\n#1234567891234567891234567890");
		System.out.printf("\n/%5d%5d%5d%5d/", 1, 20, 30, 400);
		System.out.printf("\n/%-5d%-5d%-5d%-5d/\n", 1, 20, 30, 400);
	}
}
