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
            int min = arr[i];
            int index = i;

            for (int j = i+1; j <arr.length ; j++)
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
	public static void Swap(int i,int j,int[] arr)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
