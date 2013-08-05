package Code;

import java.util.ArrayList;
import java.util.Scanner;

class numgame {
	public static ArrayList al = new ArrayList();
    static int x,count=0;
    static numgame o = new numgame();
	
	public static void main(String c[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		o.check(n);
	}
	
	void check(int n)
	{
		o.set_divisors(n);
		x = o.get_divisor();
		
		if( x == 0 && count%2 == 0)
		{
		System.out.println("Bob");
		}
		else if( x == 0 && count%2 != 0)
		{
		System.out.println("Alice");
		}
		else
		{
			n=n-x;
			al.clear();
			check(n);
			count++;
		}
	
	}
	
	void set_divisors(int n)
	{
		  
		for(int i=2;i<n;i++)
		{
			if(n%i == 0){
				al.add(i);
			}
			
		}
	}

	int get_divisor()
	{
		int a = (int)al.get(0);
				
		if (al.isEmpty())
		{
			return 0;
		}
		else
		{
		return a;
		}
		}
}
