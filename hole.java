package Code;

import java.io.IOException;
import java.util.Scanner;

class hole {
private static Scanner sc;
public static void main(String x []) throws IOException
{
	sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int count = 0;
		String text = sc.next();
		int len = text.length();
		for(int j=0;j<len;j++)
		{
			char ch = text.charAt(j);
			switch(ch)
			{
				case 'A' : 
				case 'D' : 
				case 'O' : 
				case 'P' : 	 
				case 'Q' : 	
				case 'R' : { count++; break; }	
				case 'B' : { count++;count++; break; }	
			}
		}
		System.out.println(count);
		}
	
}
}
