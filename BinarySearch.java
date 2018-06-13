package com.company;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {


        int[] arr ={3,4,5,6,7,11,13};
        long startTime = System.nanoTime();
        System.out.println(BinarySearchIterative(arr,3));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
        startTime=System.nanoTime();
        System.out.println(BinarySearchRecursive(arr,0,arr.length-1,3));
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
    public static int BinarySearchIterative(int[] arr,int n)
    {
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<=endIndex)
        {
            int midIndex=(startIndex+endIndex)/2;
            int elementInTheMid=arr[midIndex];
            if(n==elementInTheMid)
                return midIndex;
            if(n>elementInTheMid)
                startIndex=midIndex+1;
            else
                endIndex=midIndex-1;

        }
        return -1;
    }
    public static int BinarySearchRecursive(int[] arr,int start,int end,int elToSearch)
    {
        int mid = (start+end)/2;
        if(elToSearch==arr[mid])
            return mid;
        else if(start>mid)
            return -1;
        if(elToSearch>arr[mid])
            return BinarySearchRecursive(arr,mid+1,end,elToSearch);
        else
            return BinarySearchRecursive(arr,start,mid-1,elToSearch);
    }






}


