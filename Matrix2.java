import java.util.Scanner;
class Matrix2
{
	public static void main(String args[])
	{
		int array[][]=new int [3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix numbers-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"   ");
			}
			System.out.println();
		}
	}
}