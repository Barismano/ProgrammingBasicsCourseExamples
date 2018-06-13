#include <iostream>

int main()
{
	int N;
	std::cin>>N;
	int* arr = new int[N];
	for(int i = 0;i<N;i++)
		std::cin>>arr[i];
	for(int i= 0;i<N;i++)
	{
		if(arr[i]%5==0&&arr[i]>5)
			std::cout<<arr[i]<<" ";
	}
}