package code2;

import java.util.Scanner;

public class recepie {
private static int com;

public static void main(String c [])
{
  Scanner sc = new Scanner(System.in);
	//no. of test cases
	int tc = sc.nextInt();
	
	while(tc>0)
	{
		//limit n
		int n = sc.nextInt();
		int [] input = new int[n];
		int common=1;
		int min=32765;
		// n inputs
		for(int i=0;i<n;i++)
		{
		input[i] = sc.nextInt();
		}
		//finding gcd of list,first finding min of the list
		for(int i=0;i<n;i++)
		{
			if(input[i] < min)
			{
				min=input[i];
			}
		}

		//if min is gcd
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(input[i]%min == 0)
			{
				count++;
			}
		}
		if(count == n)
		{
		common = min ;
		}
		
		//min is not the gcd
		else
		{
			for(int j=2;j<min;j++)
			{
				count=0;
				
			for(int i=0;i<n;i++)
			{
				if(input[i]%j == 0)
				{
					count++;
				}
				if (count == n)
				{
					common = j;
					break;
				}
			}
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			
		System.out.println(input[i]/common);
		}
		
		
		tc--;
	}
	
	
	
}
}
