package Code;

import java.util.Scanner;

class permutations {

	private static Scanner sc;

	public static void main (String c [])
	{
		permutations obj = new permutations();
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int limit = sc.nextInt();
			int [] a = new int[limit];
			for(int j=0;j<limit;j++)
			{
			a[j]=sc.nextInt();
			}
			String output = obj.check(a,limit);
		}
	}
	
	String check(int [] a,int n)
	{
		
		int count = a[0];
		
		for(int i=0;i<n;i++)
		{
			if(count == a[0])
			{
				count++;
			}
			else
			{
				
			}
		}
		
		return "default";
	}
	
	
	
}
