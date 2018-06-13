#include <iostream>
int Contains(int* arr,int N,int num);
int main()
{
	int N;
	std::cin>>N;
	int* arr = new int[N];

	for(int i = 0;i<N;i++)
	{
		std::cin>>arr[i];
	}
	int numToDelete=0;
	std::cin>>numToDelete;
	int countOfNum = Contains(arr,N,numToDelete);	
	int* arr2= new int[N-countOfNum];
	int cursor=0;
	for(int i=0;i<N;i++)
	{
		if(arr[i]!=numToDelete)
		{
			arr2[cursor]=arr[i];
			cursor++;
		}
	}
	for(int i =0;i<(N-countOfNum);i++)
	{
		std::cout<<arr2[i]<<" ";
	}
}
int Contains(int* arr,int N,int num)
{
	int count =0;
	for(int i = 0;i<N;i++)
	{
		if(arr[i]==num)
			count++;
	}
	return count;
}