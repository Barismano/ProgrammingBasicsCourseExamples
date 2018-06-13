#include <iostream>
using namespace std;
int main()
{
	int n,m;
	cin>>n>>m;
	while(m!=0)
	{
		int reminder=n%m;
		n=m;
		m=reminder;
		
	
	}	
	cout<<n;
	
}
