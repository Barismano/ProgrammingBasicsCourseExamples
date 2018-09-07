package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
		
	}
	public static int BinarySearch(int[] arr,int l,int r,int searched)
	{
		if(l>r)
			return -1;
		int mid = (l+r)/2;
		if(arr[mid]==searched)
			return mid;
		if(arr[mid]>searched)
			return BinarySearch(arr,l,mid-1,searched);
		else
			return BinarySearch(arr,mid+1,r,searched);
	}
	public static int MaxOfArray(int[] arr,int len)
	{
		if(len==1)
			return arr[0];
		return Max(arr[len-1], MaxOfArray(arr,len-1));
		
	}
	public static int Max(int a,int b)
	{
		if(a>b)
			return a;
		return b;
	}
	

}



