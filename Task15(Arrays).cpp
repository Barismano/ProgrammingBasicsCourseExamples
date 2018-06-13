 #include <iostream>
 bool Contains(int* arr,int length, int numToSearch)
 {
 	for(int i =0;i<length;i++)
 	{
 			if(arr[i]==numToSearch)
 				return true;
	}
	return false;
 }
 int main()
 {
 	int N;
 	std::cin>>N;
 	int* arr1  = new int[N];
 	int* arr2 = new int[2*N];
 	for(int i =0;i<N;i++)
 		std::cin>>arr1[i];
 	for(int i =0;i<2*N;i++)
 		std::cin>>arr2[i];
 	
 	bool isSubSet=true;
 	for(int i =0;i<N;i++)
 	{
 		if(!Contains(arr2,2*N,arr1[i]))
		 {
			isSubSet=false;
			break; 	
		 }	
	}
	std::cout<<isSubSet;
	
 }
 