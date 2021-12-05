import java.util.Scanner;
class Mark
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Hindi mark-");
		int H=sc.nextInt();
		System.out.println("Enter the English mark-");
		int E=sc.nextInt();
		System.out.println("Enter the Math mark-");
		int M=sc.nextInt();
		System.out.println("Enter the Physics mark-");
		int P=sc.nextInt();
		System.out.println("Enter the Drawing mark-");
		int D=sc.nextInt();
		System.out.println("Enter the Social Science mark-");
		int S=sc.nextInt();
		int total=H+E+M+P+D+S;
		double per=total/6;
		System.out.println("Total mark="+total);
		System.out.println("Precentege="+per);
		
		if(per>=60)
		{
		System.out.println("First Division");	
		}
		else if(per>=45)
		{
			System.out.println("Second Division");
		}
		else if(per>=33)
		{
			System.out.println("Third Division");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}