package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int N = Integer.parseInt(console.nextLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i]=Integer.parseInt(console.nextLine());

        int sumOfElements = SumOfElementsOfArray(arr);

        for (int i = 2; i < sumOfElements; i++)
        {
            if(isPrime(i))
             {
                   if(sumOfElements%i==0)//devider
                   {
                        int temp = sumOfElements;
                        while(temp%i==0)
                        {
                            System.out.print(i+" ");
                            temp=temp/i;
                        }

                   }

             }
        }
    }

    public static int SumOfElementsOfArray(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
        return sum;
    }
    public static boolean isPrime(int a)
    {
        double temp = Math.sqrt(a);
        for (int i = 2; i <= temp; i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
}


