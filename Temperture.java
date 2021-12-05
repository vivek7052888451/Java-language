import java.util.Scanner;
class Temperture
{
public static void main(String args[])
{
System.out.println("Enter the values of Farenheight=");
Scanner sc=new Scanner(System.in);
double fare=sc.nextDouble();
double cel=((fare-32)*5/9);
System.out.println("Celcius values="+cel);
}
}