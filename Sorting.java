import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr1 = {2,1,5,99,1,0,33,99,10,34,2};

        System.out.println(Arrays.toString(MergeSort(arr1)));

    }

    public static void BubbleSort(int[] arr)
    {
        for (int j = 0; j <arr.length ; j++)
        {
            boolean isSwaped = false;
            for (int i = 0; i < arr.length - 1 - j; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    Swap(i, i + 1, arr);
                    isSwaped = true;
                }
            }
            if(!isSwaped)
            {
                break;
            }

        }
    }


    public static void SelectionSort(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int j = i; j <arr.length ; j++)
            {
                if(arr[j]<min)
                {
                    min = arr[j];
                    index = j;
                }
            }
            Swap(i,index,arr);
        }
    }


    public static void InsertionSort(int[] arr)
    {
        for (int i = 1; i <arr.length ; i++)
        {
            int el = arr[i];
            int cursor = i;
            while(cursor>=1 && el<arr[cursor-1])
            {
                arr[i] = arr[cursor-1];
                cursor--;
            }

            arr[cursor] = el;
        }
    }




    public static void Swap(int i,int j,int[] arr)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    public static int[] MergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] arrFirstHalf = new int[mid];
        for (int i = 0; i <mid ; i++)
        {
            arrFirstHalf[i] = arr[i];
        }

        int[] arrSecondHalf = new int[arr.length-mid];

        for (int i = mid; i <arr.length ; i++)
        {
            arrSecondHalf[i-mid] = arr[i];
        }

        arrFirstHalf = MergeSort(arrFirstHalf);
        arrSecondHalf = MergeSort(arrSecondHalf);

        return Merge(arrFirstHalf,arrSecondHalf);






    }




    public static int[] Merge(int arr1[],int arr2[])   //arrays are sorted
    {
        int[] result = new int[arr1.length + arr2.length];
        int arr1Pointer = 0;
        int arr2Pointer = 0;
        int resultPointer = 0;

        while(arr1Pointer<arr1.length && arr2Pointer<arr2.length)
        {
            if(arr1[arr1Pointer]<=arr2[arr2Pointer])
            {
                result[resultPointer] = arr1[arr1Pointer];
                arr1Pointer++;
            }
            else
            {
                result[resultPointer] = arr2[arr2Pointer];
                arr2Pointer++;
            }

            resultPointer++;
        }


        while(arr1Pointer<arr1.length)
        {
            result[resultPointer] = arr1[arr1Pointer];
            arr1Pointer++;
            resultPointer++;
        }


        while(arr2Pointer<arr2.length)
        {
            result[resultPointer] = arr2[arr2Pointer];
            arr2Pointer++;
            resultPointer++;
        }

        return result;
    }




}

