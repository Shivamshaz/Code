package Code;

import java.util.Scanner;

public class primepalin {

	public static void main(String c[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =0;
		primepalin obj = new primepalin();
		
		while(true)
		{
			
		int pr = obj.check_prime(n);
		int pa = obj.check_palin(n);
		
		if(pr == 1 && pa == 1)
		{
			m=n;
			System.out.println(m);
			break;
		}
			n=n+1;
		}
}
	
	int check_prime(int n){
		int flag=0;
		for (int i=2;i<n;i++){
			if(n%i == 0){
				flag = 1;
			}
		}
		if (flag == 1 ){
			return 0;
		}

		else {
			return 1;
		}
	}



	int check_palin(int n){
		int flag=0;
		String s = new Integer(n).toString();
		int len = s.length();
		for(int i=0;i<len;i++)
		{
		if(s.charAt(i) == s.charAt(len-i-1)){
				flag=1;
			}
		}
		if (flag == 1 ){
			return 1;
		}

		else {
			return 0;
		}
	}
}
