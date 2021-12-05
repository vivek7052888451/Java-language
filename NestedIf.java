import java.util.Scanner;
class NestedIf
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers-");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater Number");
			}
			else
			{
				System.out.println("C is Greater Number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is greater Number");
			}
			else
			{
				System.out.println("C is greater Number");
			}
		}
	}
}