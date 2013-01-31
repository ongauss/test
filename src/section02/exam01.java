package section02;

public class exam01 {
	public static void main(String[] args) {
		System.out.printf("#1234567891234567891234567890");
		System.out.printf("\n/%d/", 16); 
		System.out.printf("\n/%5d/", 16);//5자리 마련    
		System.out.printf("\n/%-5d/",16);//5자리 마련 후 왼쪽 정렬   
		System.out.printf("\n/%1d/", 16);//지정된 자리수가 무시됨    
		System.out.printf("\n/%05d/", 16);//왼쪽 빈 여백을 0으로 채움  
		System.out.printf("\n#1234567891234567891234567890");
		System.out.printf("\n/%5d%5d%5d%5d/", 1, 20, 30, 400);
		System.out.printf("\n/%-5d%-5d%-5d%-5d/\n", 1, 20, 30, 400);
	}
}
