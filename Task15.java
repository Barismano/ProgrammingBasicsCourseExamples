package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[2*n];
        for (int i = 0; i < n; i++)
            arr1[i] = Integer.parseInt(console.nextLine());
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = Integer.parseInt(console.nextLine());

        boolean temp=false;  
        for (int i = 0; i < arr1.length; i++) {
            if(!isElementPresentInArray(arr2,arr1[i]))
            {
                System.out.println("false");
                temp=true;
                break;
            }
        }

        if(!temp)
            System.out.println("True");



    }
    public static boolean isElementPresentInArray(int[] arr,int el)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==el)
                return true;
        }
        return false;
    }
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}

