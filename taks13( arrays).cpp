#include <iostream>
#include <cmath>
int Sum(int* arr,int N);
bool isPrime(int num);
int main()
{
	int N;
	std::cin>>N;
	int* arr = new int[N+1];

	for(int i = 0;i<N;i++)
		std::cin>>arr[i];
	
	int sum = Sum(arr,N);
	std::cout<<"sum: "<<sum<<std::endl;
	for(int i = 2;i<=sum;i++)
	{
		if(sum%i==0&&isPrime(i)) //chisloto e prosto i delitel
		{
			int temp = sum/i;
			if(temp%i!=0) //prostiqt delitel  e unikalen
			{
				std::cout<<i;
			}	
		} 
	}
	
	
	
	

}
bool isPrime(int num)
{
	double temp = sqrt(num);
	for(int i =2;i<=temp;i++)
	{
		if(num%i==0)
			return false;
	}
	return true;
}
int Sum(int* arr,int N)
{
	int sum = 0;
	for(int i = 0;i<N;i++)
		sum+=arr[i];
	return sum;
}
