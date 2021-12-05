import java.util.Scanner;
class Fact
{
	public static void main(String ars[])
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number-");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
		fact=fact*i;
		}
		System.out.println(fact);
	}
	
}