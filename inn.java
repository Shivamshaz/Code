package Code;

import java.util.*;
 
class inn
{
 public static void main(String args[])
{
   //long startTime = System.currentTimeMillis();
   inversion in = new inversion();
   //long stopTime = System.currentTimeMillis();
   //long elapsedTime = stopTime - startTime;
   //System.out.println(elapsedTime);
}//end main
}// end class
 
class inversion
{
Scanner sc = new Scanner(System.in);
int a[],b[],count=0;
inversion() 
{
while(true)
{
 count =0;
 int num = sc.nextInt();
  if(num == 0)
  break;
  int size = num+1;
  a = new int[size];
  b = new int[size];
 for(int i=1;i<=num;i++)
 { 
  a[i] = sc.nextInt();
  b[a[i]] = i;
}
 for(int i=1;i<=num;i++)
{
  if(a[i] != b[i])
 {count =1;System.out.println("not ambiguous");break;}
}
if(count == 0)
{System.out.println("ambiguous");}
}//end while
}//end constructor
 
}// end class 
