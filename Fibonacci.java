

import java.lang.Math; 
import java.util.Scanner;
public class HelloWorld
{

  public static void main(String[] args)
  {
    int n =8; //hardcoded
    
    if(n==1)
    {
     System.out.println(1); 
    }
    else if(n==2)
    {
       System.out.println(1); 
       System.out.println(1); 
    }
    else
    {
       int a =1;
       int b =1;
       System.out.println(a); 
       System.out.println(b);
      int FibNum;
      int count=2;
      while(count<n)
      {
     	FibNum=a+b;
        System.out.println(FibNum);
        a=b;
        b=FibNum;
        count++;
      }
    }
  }
}


