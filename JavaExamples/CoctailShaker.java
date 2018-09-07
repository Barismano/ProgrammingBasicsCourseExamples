package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
int[] arr = {8,7,4,2,1,4};
ShakerSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ShakerSort(int[] arr)
    {
        for (int j = 0; j < arr.length/2; j++)
        {
            boolean isSwapped=false;
            for (int i = j; i < arr.length - 1-j; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    swap(arr, i, i + 1);
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                break;
            isSwapped=false;
            for (int i = arr.length-1-j; i > j; i--)
            {
                if (arr[i] < arr[i - 1])
                {
                    swap(arr, i, i - 1);
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                break;
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
