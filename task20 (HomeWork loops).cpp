#include <iostream>

int main()
{
	int n,m;
	std::cin>>n>>m;
	int count = 0;
	for(int i = n;i<=m;i++)
	{
		int numToCheck = i;
		while(numToCheck!=0)  
		{
			int lastDigit = numToCheck%10;
			if(lastDigit==5)
				count++;
			numToCheck=numToCheck/10;   
		}
	   
	}
	std::cout<<count;
		
}

