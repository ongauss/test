package section03;

public class Exam04 {
	public static void main(String[] args) {
		boolean a,b,result; 
		a=true; 
		b=false; 

		result=a&&b; 
		System.out.println(a+" && "+b+" --> "+result); 
		
		result=a||b; 
		System.out.println(a+" || "+b+" --> "+result); 
		
		result=!a; 
		System.out.println(a+" ! "+b+" --> "+result); 
	}
}
