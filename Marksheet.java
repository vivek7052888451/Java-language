import java.util.Scanner;
class Marksheet
{
	public static void main(String arg[])
	{
		System.out.println("Enter the subject values-");
		Scanner sc=new Scanner(System.in);
		int hindi=sc.nextInt();
		int english=sc.nextInt();
		int math=sc.nextInt();
		int science=sc.nextInt();
		int chemestry=sc.nextInt();
		int total=hindi+english+math+science+chemestry;
		float percentage=total/6;
		System.out.println("Total mark="+total);
		System.out.println("Percentage="+percentage);
	}
}