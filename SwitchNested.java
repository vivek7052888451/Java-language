import java.util.Scanner;
class SwitchNested
{
	public static void main(String args[])
	{
	System.out.println("Enter a number-");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a)
	{
		case 1:
		System.out.println("One");
		break;
		case 2:
		System.out.println("Two");
		System.out.println("Enter Day Number between 1-7-");
		int b=sc.nextInt();
		switch(b)
		{
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thirsday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Satrday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Invalid number");
			
		}
		break;
		case 3:
		System.out.println("Three");
		break;
		case 4:
		System.out.println("Four");
		break;
		case 5:
		System.out.println("Five");
		break;
		default:
		System.out.println("Invalid number");
		break;
		
		
	}
    }
}