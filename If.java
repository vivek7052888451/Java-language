import java.util.Scanner;
class If
{
public static void main(String arg[])
{
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number-");
	a=sc.nextInt();
	if(a>=18)
		System.out.println("You Can Vote");
	else
		System.out.println("You Can Not Vote");
}
}