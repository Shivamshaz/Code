 package Code;

import java.util.ArrayList;
import java.util.Scanner;
 
class pie {

public static void main (String c[])
{
	Scanner sc = new Scanner(System.in);
	int tc= sc.nextInt();
	int a1,b1,flag=0,count=0,k=0,temp;
	while(tc>0)
	{
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a1 = sc.nextInt();
			a.add(a1);
		}
		for(int i=0;i<n;i++)
		{
			b1 = sc.nextInt();
			a.add(b1);
		}
		for(int i=0;i<n;i++)
		{
			
			temp = b.get(0);
			System.out.println(temp);

			for(int j=0;j<n;j++)
			{
				if(a.get(i) <= b.get(j) && b.get(j)< temp)
				{
				temp = b.get(j);
				flag = 1;
				k = j;
				System.out.println(k);

				}
			}
			if(flag == 1 )
			{
			count++;
			b.set(k, 0);
			}
		
	}
		System.out.println(count);
		tc--;
	}
	
}
}
