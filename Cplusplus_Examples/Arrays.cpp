#include <iostream>
#include <cmath>

using namespace std;


bool isSortedAscending(int* arr,int len)
{
    for(int i = 0;i<len-1;i++)
    {
        if(arr[i]>arr[i+1])
            return false;
    }
    return true;
 
}

bool isSymetric(int* arr,int len)
{
    for (int i =0;i<len/2;i++)
    {
        if(arr[i]!=arr[length-1-i])
            return false;
    }
    return true;
    
}
bool HasOnlyOneElement(int* arr , int len)
{
    return isSortedAscending(arr,len)&&isSymetric(arr,len);
}
int Search(int* arr,int len, int el)
{
    for(int i =0;i<len;i++)
    {
        if(arr[i]==el)
            return i;
    }
    return -1;
    
}
int Count(int*  arr,int len;int el)
{
    int count = 0;
    for(int i =0;i<len;i++)
    {
        if(arr[i]==el)
            count++;
    }
    return count;
    
}
int Sum(int* arr, int len)
{
    int sum = 0;
    for(int i =0;i<len;i++)
        sum+=arr[i];
    return sum;
}
int main()
{
int d = 3;
Magic(&d);

}

