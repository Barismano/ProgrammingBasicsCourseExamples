package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(console.nextLine());

        int elToBeDeleted = Integer.parseInt(console.nextLine());
        int deleted=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==elToBeDeleted)
            {
                for (int j = i+1; j < arr.length; j++)
                    arr[j-1]=arr[j];
                deleted++;

            }
        }
        for (int i = 0; i < arr.length-deleted; i++) {
            System.out.print(arr[i]+" ");
        }



    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}

