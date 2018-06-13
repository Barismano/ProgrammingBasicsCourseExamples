#include <iostream>

int main()
{
	int N;
	std::cin>>N;
	int* arr = new int[N];
	int min = 9999999;
	for(int i = 0;i<N;i++)
	{
		std::cin>>arr[i];
		if(arr[i]<min)
			min==arr[i];		
	}
	for(int i =2;i<=min;i++)
	{
		bool isDevisor=true; 
		for(int j=0;j<N;j++)
		{
			if(arr[j]%i!=0)
			{
				isDevisor=false;
				break;
			}
		}
		if(isDevisor)
			std::cout<<i<<" ";
			
	}
}