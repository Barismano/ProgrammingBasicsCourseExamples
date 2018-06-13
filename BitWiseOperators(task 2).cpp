#include <iostream>


int pow(int num,int power)
{
	int result = 1;
	for(int i =1;i<=power;i++)
	{
		result*=num;
	}
	return result;
}
int main()
{
	
	int num;
	std::cin>>num;
	
	int power=0;
	int result=0;
	while(num>0)
	{
		int lastDigit = num%10;
		num/=10;
		result+=lastDigit*pow(2,power);
		power++;
	}
	std::cout<<result;
	
	
}

