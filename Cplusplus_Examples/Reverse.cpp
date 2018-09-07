// Example program
#include <iostream>
#include <string>

void swap(int* arr, int i , int j)
{
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
void Reverse(int* arr,int len)
{

    for(int i =0;i<len/2;i++)
     swap(arr,i,len-1-i);   
}
int main()
{
int arr[] = {1,2,3,4,5,6,7};
Reverse(arr,7);
for(int i =0;i<7;i++)
    std::cout<<arr[i]<<" ";
}


    

