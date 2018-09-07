// Example program
#include <iostream>
#include <string>

int EvenCount(int* arr, int len)
{
 if(len==0)
    return 0;
 if(arr[len-1]%2==0)
    return EvenCount(arr,len-1)+1;
else
    return EvenCount(arr,len-1);
}
int Max(int a,int b)
{
 if(a>b)
    return a;
 else
    return b;
}
int MaxOfArray(int* arr,int len)
{
    if(len==1)
        return arr[0];
    return Max(arr[len-1],MaxOfArray(arr,len-1));
}
int main()
{
int arr[] = {1,2,3,4,5,6};
std::cout<<EvenCount(arr,6);
}
