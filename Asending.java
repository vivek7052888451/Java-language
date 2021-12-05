import java.util.Scanner;
class Asending
{
	public static void main(String args[])
	{
		int[]num=new int[10];
		int i,j,tem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+num.length+" Numbers-");
		for(i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(i=0;i<num.length;i++)
		{
			for(j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					tem=num[i];
					num[i]=num[j];
					num[j]=tem;
				}
			}
		}
		System.out.println("Asending Array=");
		for(i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"  ");
		}
		
	}
}