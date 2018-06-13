#include <iostream>
using namespace std;
int main()
{
	int n;
	int prev;
	bool ok=true;
	cin>>n;
	while(n!=0)
	{
		if(!(n>=prev))
		ok=false;
		prev=n;
		cin>>n;
	
	
	}	

	if(ok)
	cout<<"Yes"<<endl;
	else
	cout<<"No"<<endl;

}











		

