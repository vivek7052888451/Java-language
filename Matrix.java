import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[][]mat=new int[2][2];
		int r,c;
		System.out.println("Enter Matrix of 2*2=");
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				mat[r][c]=sc.nextInt();	
			}	
		}
		for(r=0;r<2;r++)
		{
			for(c=0;c<2;c++)
			{
				System.out.print(mat[r][c]+" ");
				
			}
			System.out.println();
		}
	}
}