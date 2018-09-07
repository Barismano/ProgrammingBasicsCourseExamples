package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int n = 100;
        for(int i = 6;i<=n;i+=6)
        {
            int firstNum = i-1;
            double temp = Math.sqrt(firstNum);
            boolean isPrime=true;
            for (int j = 2; j <= temp; j++)
            {
                if(firstNum%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime)
                continue;

            int secondNum=i+1;
            double temp2 = Math.sqrt(secondNum);
            isPrime=true;
            for (int j = 2; j <= temp2; j++)
            {
                if(secondNum%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(firstNum+" "+secondNum);
        }
    }
}
