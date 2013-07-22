package Code;
import java.math.BigInteger;
import java.util.Scanner;
public class sfact {
	private static Scanner scanner;
	public static void main(String c[]) throws Exception {
		 System.out.println("Enter the value of n: ");
		 scanner = new Scanner(System.in);
	   	 int n = scanner.nextInt();
		 int num;
		 BigInteger fact = BigInteger.ONE;
		 for(int i=0;i<n;i++) {
			 System.out.println("Enter the number:");
			 num = new Scanner(System.in).nextInt();
			 for(int j=1;j<=num;j++) {
				 fact=fact.multiply(BigInteger.valueOf(j));
			 }
			 System.out.println("factorial:"+fact);
			 fact= BigInteger.ONE;
		 }
	 }
	 }
