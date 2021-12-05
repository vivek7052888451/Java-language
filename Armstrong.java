import java.util.Scanner;
class Armstrong
{
	public static void main(String agr[])
	
	{
		int num,tmp,nod=0,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-");
		num=sc.nextInt();
		tmp=num;
		while(tmp>0)
		{
			nod++;
			tmp=tmp/10;
		}
		tmp=num;
		while(tmp>0)
		{
			rem=tmp%10;
			sum=sum+getPower(rem,nod);
			tmp=tmp/10;
		}
		if(sum==num)
		{
			System.out.println("number is Armstrong");
		}
		else
		{
			System.out.println("number is not Armstrong");
		}
		
	}
	public static int getPower(int num,int pow)
	{
		int power=1;
		for(int i=1;i<=pow;i++)
		{
			power=power*num;
		}
		return power;
	}
	
}