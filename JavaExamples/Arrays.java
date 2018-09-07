package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr={1,7,2,6,4,8};
        System.out.println(IndexOfMax(arr));
    }
    public static boolean IsSaw(int[] arr)
    {
        if(arr.length==1)
            return true;
        boolean lastLessOrEqual =arr[0]<=arr[1];
        for (int i = 1; i < arr.length-1; i++) 
        {
            boolean currentComparioson = arr[i]<=arr[i+1];
            if(currentComparioson==lastLessOrEqual)
                return false;
            else
            {
                lastLessOrEqual=currentComparioson;
            }
        }
        return true;
    }
    
    public static int IndexOfMax(int[] arr)
    {
        int max = arr[0];
        int maxIndex=0;
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]>max)
            {
               max=arr[i];
               maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static int SumArr(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            sum+= arr[i];  //sum = sum+
        }
        return sum;
    }
    public static boolean Contains(int[] arr,int searched)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==searched)
                return true;

        }
        return false;
    }
}
