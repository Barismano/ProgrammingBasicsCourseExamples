#include <iostream>

int main()
{
	int N;
	std::cin>>N;
	int* arr = new int[N+1];

	for(int i = 0;i<N;i++)
	{
		std::cin>>arr[i];
	}
	int numToPut;
	std::cin>>numToPut;
	int index;
	std::cin>>index;
	for(int i = Nb-1;i>index;i--)
		arr[i]=arr[i-1];
	arr[index]=numToPut;
	for(int i = 0;i<N;i++)
		std::cout<<arr[i]<<" ";
	
	
	
	

}