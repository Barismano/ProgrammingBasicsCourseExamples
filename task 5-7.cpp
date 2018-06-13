
#include <iostream>
int SumElements(int* arr,int n)
{
	int sum=0;
	for(int i= 0;i<n;i++)
		sum+=arr[i];
	return sum; 
}
double Average(int* arr, int n )
{
	double arrSize=n;
	return SumElements(arr,n)/arrSize;
}
int closest(int*arr,int n)
{
	double avv=Average(arr,n);
	int Mindist=9999;
	int closestNum=0;
	for(int i =0;i<n;i++)
	{
		int CurrentDist = arr[i]-avv;
		if(CurrentDist<0)
			CurrentDist*=-1;
		if(CurrentDist<Mindist)
		{
			Mindist=CurrentDist;
			closestNum=arr[i];
		}		
	}
	return closestNum;
		
}
void blaa(int arr[])
{
	
}
int main()
{
	int n;
	std::cin>>n;
	int* arr = new int[n];
	for(int i = 0;i<n;i++)
	{
		std::cin>>arr[i];
	}
	std::cout<<closest(arr,n);
	int arr2[3];
	blaa(arr2);
}


