class Average2
{
	public static void main(String args[])
	{
		int array[]={4,2,5,22,44};
		int sum=0;
		double avg;
		for(int a:array)
		{
			System.out.println(a);
			sum+=a;	
		}
		int length=array.length;
		avg=(double)sum/(double)length;
		System.out.println("Total= "+sum);
		System.out.println("Avg= "+avg);
	}
}