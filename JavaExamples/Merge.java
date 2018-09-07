package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
	
	}
	public static int[] Merge(int[] arr1,int[] arr2)
	{
		int[] result = new int[arr1.length+arr2.length];
		int cursor1 = 0;
		int cursor2=0;
		int resultCursor=0;
		while(cursor1<arr1.length&&cursor2<arr2.length)
		{
			if(arr1[cursor1]<arr2[cursor2])
			{
				result[resultCursor]=arr1[cursor1];
				cursor1++;
			}
			else
			{
				result[resultCursor]=arr2[cursor2];
				cursor2++;
			}
			resultCursor++;		
		}
		while(cursor1<arr1.length)
		{
			result[resultCursor]=arr1[cursor1];
			cursor1++;
			resultCursor++;
		}
		while(cursor2<arr2.length)
		{
			result[resultCursor]=arr2[cursor2];
			cursor2++;
			resultCursor++;
		}
		return result;
	}
}


