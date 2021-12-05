import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
System.out.println("Enter the Two numbers-");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a;
a=b;
b=c;
System.out.println("a= "+a);
System.out.println("b= "+b);

}
}