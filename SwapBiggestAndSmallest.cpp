// Example program
#include <iostream>
#include <string>
#include <cmath>
int GetMaxOrMin(int* arr,int len,bool isMax)
{
    int currentMaxOrMinIndex=0;
    int currentMaxOrMin = arr[0];
    for(int i=1;i<len;i++)
    {
           if(isMax)
           {
                if(arr[i]>currentMaxOrMin)
                {
                    currentMaxOrMin=arr[i];
                    currentMaxOrMinIndex=i;
                }
           }
           else
           {
                if(arr[i]<currentMaxOrMin)
                {
                    currentMaxOrMin=arr[i];
                    currentMaxOrMinIndex=i;
                } 
           }
    }
    return currentMaxOrMinIndex;
}
void Swap(int* arr,int firstIndex,int secondIndex)
{
    int temp = arr[firstIndex];
    arr[firstIndex]=arr[secondIndex];
    arr[secondIndex]=temp;
        
}
int main()
{
     int len;
     std::cin>>len;
     int* arr = new int[len];
     for (int i =0;i<len;i++)
        std::cin>>arr[i];
    int maxIndex = GetMaxOrMin(arr,len,true);
    int minIndex = GetMaxOrMin(arr,len,false);    
    Swap(arr,minIndex,maxIndex);
    
   for (int i =0;i<len;i++)
        std::cout<<arr[i];
}
