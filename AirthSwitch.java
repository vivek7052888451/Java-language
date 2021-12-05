import java.util.Scanner;
class AirthSwitch
{
	public static void main(String arg[])
	{
		System.out.println("Enter the (+,-,*,/,%)-");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		int first=sc.nextInt();
		int second=sc.nextInt();
		switch(a)
		{
			case '+':
			System.out.println("Enter the value first and second=");
			
			int add=first+second;
			System.out.println("Addition="+add);
			break;
			
			case '-':
			System.out.println("Enter the value first and second=");
			
			int sub=first-second;
			System.out.println("Substration="+sub);
			break;
			
			case '*':
			System.out.println("Enter the value first and second=");
			int multi=first*second;
			System.out.println("Multiplication="+multi);
			break;
			
			case '/':
			System.out.println("Enter the value first and second=");
			
			int div=first/second;
			System.out.println("Divid="+div);
			break;
			
			case '%':
			System.out.println("Enter the value first and second=");
			
			int rem=first%second;
			System.out.println("Remender="+rem);
			break;
		}
	}
}
