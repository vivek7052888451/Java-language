import java.util.Scanner;
class Swap2
{
	public static void main(String args[])
	{
		System.out.println("Enter two number-");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
	}
}