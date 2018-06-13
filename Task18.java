package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(console.nextLine());
        }
        int max = 0;
        int maxOccurNum=-1;
        for (int i = 0; i < n; i++)
        {
            int numInArr = howManyTimesIntInArr(arr,arr[i]);
            if(numInArr>=max)
            {
                max=numInArr;
                maxOccurNum=arr[i];
            }
        }
        System.out.println(maxOccurNum);
    }
    public static int howManyTimesIntInArr(int[] arr,int x)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
                count++;
        }
        return count;
    }
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}

