import java.util.Scanner;
class Year
{
public static void main(String arg[])
{
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number-");
	a=sc.nextInt();
	if(a%4==0)
		System.out.println("Year is leap");
	else
		System.out.println("Year is not leap");
}
}