package com.company;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] arr1 = {2, 1, 7, 4, 9, 5, 4, 0, 1};

       arr1= CountSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] CountSort(int[] arr)
    {
        int[] help= new int[10];

        for (int i = 0; i < arr.length; i++)
            help[arr[i]]++;
        for (int i = 1; i < help.length; i++)
            help[i]+=help[i-1];
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
          int newPosition = help[arr[i]]-1;
          newArr[newPosition]=arr[i];
          help[arr[i]]--;
        }

        return newArr;



    }

    public static void QuickSort(int[] arr, int start,int end)
    {
        //median of 3
       int pivot= arr[(start+end)/2];
       int pivotIndex=(start+end)/2;
       pivotIndex = partion(arr,start,end,pivotIndex);
        if(pivotIndex>start)
            QuickSort(arr,start,pivotIndex-1);
        if(pivotIndex<end)
            QuickSort(arr,pivotIndex+1,end);
    }
    public static int partion(int[] arr, int start,int end,int pivotIndex)
    {
        int pivot= arr[pivotIndex];

        while(start<end)
        {
            while(arr[start]<pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<end)
            {
                if(pivotIndex==start)
                    pivotIndex=end;
                else if(pivotIndex==end)
                    pivotIndex=start;
                swap(arr, start, end);
                if(start!=pivotIndex)
                    start++;
                if(end!=pivotIndex)
                 end--;
            }
        }
        return pivotIndex;

    }
    public static void swap(int[] arr,int ind,int ind2)
    {
        int temp = arr[ind];
        arr[ind]= arr[ind2];
        arr[ind2]=temp;
    }


}