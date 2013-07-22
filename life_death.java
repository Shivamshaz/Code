package Code;
import java.util.Scanner;

public class life_death {
	
private static Scanner scanner;

public static void main (String c[])
{
	
	System.out.println("Enter the numbers:");
	scanner = new Scanner(System.in);
	String name = scanner.next();
	int i = Integer.parseInt(name);

	
while(i!=42)
{
System.out.println("Number:"+i);
System.out.println("Enter the numbers:");
scanner = new Scanner(System.in);
name = scanner.next();
i = Integer.parseInt(name);

}

}
}