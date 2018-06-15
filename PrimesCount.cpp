// Example program
#include <iostream>
#include <string>
#include <cmath>
bool IsPrime(int n)
{
    if(n==1)
        return false;
    double temp = sqrt(n);
    for(int i=2;i<=temp;i++)
    {
        if(n%i==0)
            return false;
    }
    return true;
}
int main()
{
     int len;
     std::cin>>len;
     int* arr = new int[len];
     for (int i =0;i<len;i++)
        std::cin>>arr[i];
    
    int count = 0;
    for(int i=0;i<len;i++)
    {
        if(IsPrime(arr[i]))
           {
               std::cout<<arr[i]<<" ";
               count++;
           }
    }
        std::cout<<count;
    
}
