package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] arr = new int[n+1];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(console.nextLine());

        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        for (int i = arr.length-1; i >y ; i--)
            arr[i]=arr[i-1];
        arr[y]=x;
        printArr(arr);

    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}

