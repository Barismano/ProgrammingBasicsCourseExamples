// Example program
#include <iostream>
#include <string>
#include <cmath>
int Fibb(int n)
{
 if(n==1||n==2)
    return 1;
 return Fibb(n-1)+Fibb(n-2);
}
int Fact(int n)
{
 if(n==0)
    return 1;
return Fact(n-1)*n;
}

int BinarySearch(int* arr,int len, int start,int end,int num)
{
    int mid = (start+end)/2;
    if(arr[mid]==num)
        return mid;
    if(arr[mid]>num)
        return BinarySearch(arr,len,0,mid-1,num);
    else
        return BinarySearch(arr,len,mid+1,end,num);
}
int main()
{
    int arr[] = {3,4,5,6,7,8,8,9,10,11};
    int len =10;
  
    std::cout<<BinarySearch(arr,len,0,len-1,5);
    
}
