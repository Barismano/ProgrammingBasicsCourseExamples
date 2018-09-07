package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int n = 100;
        for (int i = 6; i <=n ; i+=6)
        {
            if(isPrime(i-1)&&isPrime(i+1))
                System.out.println(i-1+" "+(i+1));
        }

    }
    public static boolean isPrime(int n)
    {
        double temp = Math.sqrt(n);
        for (int i = 2; i <= temp; i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }


}
