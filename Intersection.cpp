// Example program
#include <iostream>
#include <string>
#include <cmath>
bool Contains(int* arr,int len,int num)
{
    for(int i =0;i<len;i++)
    {
        if(arr[i]==num)
            return true;
    }
    return false;
}
int IntersectionSize(int* arr,int len,int* arr2,int len2)
{
     int resultArrLen=0;
     for (int i =0;i<len;i++)
     {
         if(Contains(arr2,len2,arr[i]))
             resultArrLen++;
     }
    return resultArrLen;
}
int* Intersection(int* arr,int len,int* arr2,int len2,int len3)
{

 int* arr3 = new int[len3];
 int cursor = 0;
 for(int i = 0;i<len;i++)
 {
    if(Contains(arr2,len2,arr[i]))
    {
        arr3[cursor]=arr[i];
        cursor++;
    }
 }
 return arr3;
}
int main()
{
     int len;
     std::cin>>len;
     int* arr = new int[len];
     for (int i =0;i<len;i++)
        std::cin>>arr[i];
    
     int len2;
     std::cin>>len2;
     int* arr2 = new int[len2];
     for (int i =0;i<len2;i++)
        std::cin>>arr2[i];
        
        std::cout<<"Result:"<<std::endl;
    int IntersectLen = IntersectionSize(arr,len,arr2,len2);
        std::cout<<IntersectLen <<std::endl;
    int* arr3 = Intersection(arr,len,arr2,len2,IntersectLen);    
    for (int i =0;i<IntersectLen;i++)
        std::cout<<arr3[i]<<" ";
    
}
