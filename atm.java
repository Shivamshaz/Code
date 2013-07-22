package Code;

import java.util.Scanner;

class atm {
	private static Scanner sc;

	public static void main(String x [])
	
	{
	try
	{
		sc = new Scanner(System.in);
		float amt = sc.nextFloat();
		int wd = sc.nextInt();
		
		if(wd <= (amt-0.5) && wd%5 == 0 )
		{
		System.out.printf("Output:"+"%.2f", (float)(amt - wd - 0.50));
		}
		
		else
		{
			System.out.printf("Output : "+"%.2f",amt);
		}
	}
	catch(Exception e)
	{
		
	}
		
	}

}
