import java.util.Scanner;
class SimpleI
{
	public static void main(String args[])
	{
		int time;
		float p,rate,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of time,princple,and rate-");
		time=sc.nextInt();
		p=sc.nextFloat();
		rate=sc.nextFloat();
		si=(p*rate*time)/100;
		System.out.println("Simple Interest= "+si);
		
	}
}