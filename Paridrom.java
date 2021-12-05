class Paridrom
{
	public static void main(String args[])
	{
		int a=0,b=1;
		int n=10;
		int i=0;
		while(i<10)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+"+");
			i++;
			
		}
	}
}