package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        System.out.println(isSquare(64));
    }
    public static boolean isSquare(int n)
    {
        if(n<0)
            return false;
        else
        {
            for (int i = 0; i < n; i++)
            {
                if(n==power(i,2))
                    return true;
            }
            return false;
        }
    }
    public static int power(int num,int pow)
    {
        int result =1;
        for (int i = 0; i < pow; i++)
        {
            result*=num;
        }
        return result;
    }


///
    public static int Fact(int n)
    {
        int result =1;
        for (int i = 2; i <= n; i++)
            result*=i;
        return result;
    }

}