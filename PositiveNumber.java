import java.util.Scanner;
class PositiveNumber
{
public static void main(String agr[])
{
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number-");
	a=sc.nextInt();
	if(a>=0)
		System.out.println("Number is Positive");
	else
		System.out.println("Negative number");
}
}