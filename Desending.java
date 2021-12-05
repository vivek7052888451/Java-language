 import java.util.Scanner;
 class Desending
{
	public static void main(String args[])
	{
		int array[]=new int[6];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+array.length+"  numbers-");
		for(i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println("Your Desending order stored array-");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
	}
}