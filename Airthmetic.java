import java.util.Scanner;
class Airthmetic
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values a and b-");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Addition= "+(a+b));
		System.out.println("Substraction= "+(a-b));
		System.out.println("Multiplication= "+(a*b));
		System.out.println("Dividetion= "+(a/b));
		System.out.println("Remender= "+(a%b));
		
		
	}
}