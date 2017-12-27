
public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swappingNumbers(10,20);
		factorial(5);

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


}
