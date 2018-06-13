#include <iostream>



int main()
{
int* arr = new int[1001];

for(int i = 0;i<500;i++)
	arr[i]=i;
arr[500]=999;
for(int i =1;i<=500;i++)
	arr[500+i]=i-1;		

int num=0;
for(int i =0;i<1001;i++)
	num=arr[i]^num;
std::cout<<num;
	
	
}


