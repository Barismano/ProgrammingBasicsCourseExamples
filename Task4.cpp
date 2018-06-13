#include <iostream>

int main()
{
	int n;
	std::cin>>n;
	int* arr= new int[n];
	for(int i=0;i<n;i++)
		std::cin>>arr[i];
	int* arr2=new int[n];
	
	int cursor = n-1;
	for(int i =0;i<n;i++)
	{
		arr2[i]=arr[cursor];
		cursor--;
	}
	
	for(int i =0;i<n;i++)
	{
		std::cout<<arr2[i]<<" ";
	}

		
}
