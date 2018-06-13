package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int index =0;
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(console.nextLine());
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }

        for (int i = index+1; i < arr.length; i++)
        {
            if(arr[i]%2==0)
                arr[i]++;
            else
                arr[i]--;
        }
        printArr(arr);


    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}

