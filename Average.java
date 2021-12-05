import java.util.Scanner;
class Average
{
public static void main(String arg[])
{
	System.out.println("Enter three numbers-");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	float avg=(a+b+c)/3;
	System.out.println(avg);
}
}