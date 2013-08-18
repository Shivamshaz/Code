package Code;

import java.io.IOException;
import java.util.Scanner;
class InfixtoPostfix {
	static int top= -1 ; // top variable to get the pointer of the array
	static char [] a = new char [50]; //array implementation of stack !!
	private static Scanner scanner;
	public static void main(String x []) throws IOException
	{
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		InfixtoPostfix obj = new InfixtoPostfix();
		for(int i=0;i<n;i++)
		{
			String text = scanner.next();
			String postfix = ""; //output String.
			int len = text.length();
			for(int j=0;j<len;j++)
			{
				char ch = text.charAt(j);
				if(ch == '+' || ch == '*' || ch == '/' || ch == '-')
				{
					if(top == -1)
					{
						obj.push(ch);
					}
					else 
					{
					if ( obj.get(ch) < obj.get(a[top]))
					{
						while(top != -1){
						char ch1 = obj.pop();
						postfix = postfix+ch1;	
					}
						obj.push(ch);
					}
					else 
					{
						obj.push(ch);
					}
					}
				}
				else
				{
					postfix = postfix+ch;
				}
			}
			while(top != -1){
				char ch1 = obj.pop();
				postfix = postfix+ch1;
			}
			System.out.println("Output is :" + postfix);
		}
	}
	
	void push(char x)
	{
		top++;
		a[top]=x;
	}
	
	char pop()
	{
		char element = a[top];
		top--;
		return element;
	}
	
	//function to get the values of operator precedences.
	public int get(char operator)
    	{
    	if(operator == '/')
    	{
    		return 4;
    	}
    	if(operator == '*')
    	{
    		return 3;
    	}
    	if(operator == '+')
    	{
    		return 2;
    	}
    	if(operator == '-')
    	{
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }
}


