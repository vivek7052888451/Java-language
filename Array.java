import java.util.Scanner;
class Array
{
public static void main(String args[])
{
	int[]a=new int[10];
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter "+a.length+"  Numbers-");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("Entered Numbers Are-");
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
}
}