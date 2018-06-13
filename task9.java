package com.company;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(console.nextLine());
            if(arr[i]<min)
                min=arr[i];
        }
        for (int i = 2; i < min; i++)
        {
            boolean isiDeviderToAllElementsInArray=true;
            for (int j = 0; j < arr.length; j++)
            {
                if(arr[j]%i!=0) {
                    isiDeviderToAllElementsInArray=false;
                    break;
                }
            }
            if(isiDeviderToAllElementsInArray)
                System.out.print(i);

        }


    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}

