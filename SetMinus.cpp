#include <iostream>
#include <string>
#include <cmath>
bool Contains(int* arr,int len,int num) //check if an element is in an array
{
    for(int i =0;i<len;i++)
    {
        if(arr[i]==num)
            return true;
    }
    return false;
}
int SetMinusSize(int* arr,int len,int* arr2,int len2)//check how will be the size of the result array
{
     int resultArrLen=0;
     for (int i =0;i<len;i++)
     {
         if(!Contains(arr2,len2,arr[i])) 
             resultArrLen++;
     }
    return resultArrLen;
}
int* SetMinus(int* arr,int len,int* arr2,int len2,int len3)
{

 int* arr3 = new int[len3];
 int cursor = 0; //first empty position
 for(int i = 0;i<len;i++)
 {
    if(!Contains(arr2,len2,arr[i])) //check if the element from the array is NOT in the other array
    {
        arr3[cursor]=arr[i]; //if yes-> save it.
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
    int SetMinusLen = SetMinusSize(arr,len,arr2,len2);
  
    int* arr3 = SetMinus(arr,len,arr2,len2,SetMinusLen);    
    for (int i =0;i<SetMinusLen;i++)
        std::cout<<arr3[i]<<" ";
    
}