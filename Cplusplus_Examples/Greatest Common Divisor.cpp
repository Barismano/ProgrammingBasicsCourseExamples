#include <iostream>
#include <cmath>
int main()
{
	int a,b,c,d;
	std::cin>>a>>b>>c>>d;	
	
	for(int i =a ;i>=1;i--)
	{
		if((a%i==0)&&(b%i==0)&&(c%i==0)&&(d%i==0))
		{
			std::cout<<i;
			break;
		}
		
	}
	
			
}

