
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swappingNumbers(10,20);
		factorial(5);
		palindrome(12321);

	}
	
	public static void swappingNumbers(int a,int b) {
		
		int x=a;
		a=b;
		b=x;
		System.out.println("First Value: "+a+"	Second Value: "+b);
		
	}
	public static void factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of: "+a+" is "+fact);
	}
	
	public static void palindrome(int a) {
		
		int palindrome, rev,temp;
		rev=0;
		palindrome=a;
		while(a!=0) {
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		if(palindrome==rev) {
			System.out.println("Given Number: "+palindrome+" is a palindrome Number");
		}else {
			System.out.println("Given Number: "+palindrome+" is not a palindrome Number");
		}
		
	}
	public void stringReverse(String str) {
		
	}


}
