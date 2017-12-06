package com.company;


import sun.text.resources.vi.CollationData_vi;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static int swapsMade=0;
    public static int comparisonsMade = 0;
    public static void main(String[] args)
    {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);


        BubbleSort(arr);
        System.out.println("Bubble Sort:    "+Arrays.toString(arr)  +"Comparisons: "+comparisonsMade+"  "+ "Swaps: "+swapsMade );
        swapsMade=0;
        comparisonsMade=0;
        int[] arr2={10,9,8,7,6,5,4,3,2,1};
        InsertionSort(arr2);
        System.out.println("Insertion Sort: "+Arrays.toString(arr2)  +"Comparisons: "+comparisonsMade+"  "+ "Swaps: "+swapsMade );
        swapsMade=0;
        comparisonsMade=0;
        int[] arr3={10,9,8,7,6,5,4,3,2,1};
        SelectionSort(arr3);
        System.out.println("Selection Sort: "+Arrays.toString(arr3)  +"Comparisons: "+comparisonsMade+"  "+ "Swaps: "+swapsMade );
        swapsMade=0;
        comparisonsMade=0;





    }
    public static boolean linearSearch(int[] arr,int el)
    {

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==el)
                return  true;
        }
        return  false;
    }
    public static void BubbleSort(int[] arr)
    {
        for (int j = 0; j < arr.length ; j++) {

            boolean isSwapped=false;
            for (int i = 0; i < arr.length - 1-j; i++) {
                comparisonsMade++;
                if (arr[i] > arr[i + 1])
                {
                    swap(arr, i, i + 1);
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                return;
        }
    }
    public static void SelectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++)
        {

            int min = arr[i];
            int minIndex =i;
            for (int j = i; j < arr.length; j++) {
                comparisonsMade++;
                if(arr[j]<arr[minIndex])
                {
                    min=arr[j];
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void InsertionSort(int[] arr)
    {

        for (int i = 1; i < arr.length; i++)
        {
            int index = i;
            comparisonsMade++;
            while(index>=1&&arr[index]<arr[index-1])
            {
                comparisonsMade++;
                swap(arr,index,index-1);
                index--;
            }
        }
    }

    public static void swap(int[] arr,int ind1,int ind2)
    {
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        swapsMade++;

    }
   
   


}
