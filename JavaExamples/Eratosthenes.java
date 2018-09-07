package com.company;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    Eratosthenes(50);
    }

    public static void Eratosthenes(int n)
    {
        boolean[] arr = new boolean[n+1];

        for (int i = 2; i <= n; i++)
        {
               if(!arr[i]) // arr[i]==false
               {
                   System.out.print(i+" ");
                   int temp=i+i;
                   while(temp<=n)
                   {
                       arr[temp]=true;
                       temp+=i;
                   }
               }
        } 
    }


}


