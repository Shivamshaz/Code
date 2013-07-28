package Code;

import java.util.Scanner;
public class byteland {
	
	public static void main (String c[])
	{
		byteland obj = new byteland();
		Scanner sc = new Scanner (System.in);
		int tc = sc.nextInt();
		while(tc>0)
		{
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] notes = new int[n];
		for(int i=0;i<n;i++)
		{
			notes[i] = sc.nextInt();
		}
		obj.check(notes,m,n);		
		tc--;
		}
		}


void check(int notes[],int m, int n)
{
	if(n == 0)
	{
		System.out.println("No");
	
	}
	else if (m == notes[n-1])
	{
		System.out.println("Yes");
	}
	else if (m > notes[n-1]) 
	{
			m=m-notes[n-1];
			n--;
			check(notes,m,n);
	}
	else
	{
		n--;
		check(notes,m,n);
	}

	}
}