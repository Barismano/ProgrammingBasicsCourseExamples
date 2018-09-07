 #include <iostream>

 int main()
 {
 	int N;
 	std::cin>>N;
	int mask = 1073741824;
	for(int i =0;i<31;i++)
	{
		int result = N&mask;
		if(result==0)
			std::cout<<0;
		else
			std::cout<<1;
		mask=mask>>1;
	}
	
	
 }
 
