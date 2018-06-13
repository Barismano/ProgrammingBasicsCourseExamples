#include <iostream>
#include <cmath>
int main()
{
	int n;
	std::cin>>n;	
	bool isPrime=true;
	for(int i = 2;i<sqrt(n);i++)
	{
		if(n%i==0)
		{
			isPrime=false;
			break;
		}
	}

	std::cout<<isPrime;
		
}

