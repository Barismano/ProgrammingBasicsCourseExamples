// Example program
#include <iostream>
#include <string>
void NumToBinary(int* arr,int len,int num);
void NumToBinary2(int* arr,int len,int num);
int main()
{
    int n = 1234;
  int len = 30;
  int* arr =new int[len];
  NumToBinary2(arr,len,n);
  for(int i =0;i<len;i++)
    std::cout<<arr[i]<<" ";
  
  delete[] arr;
}
void NumToBinary2(int* arr,int len,int num)
{
    int mask = 1;
    for(int i=len-1;i>=0;i--,mask*=2)
    {
        if((num&mask)==0)
            arr[i]=0;
        else
            arr[i]=1;
        
    }
}
void NumToBinary(int* arr,int len,int num)
{   
    int pos = len-1;
    while(num!=0)
    {
        int bit = num%2;
        num/=2;
        arr[pos]=bit;
        pos--;
    }
    for(int i = pos;i>=0;i--)
        arr[i]=0;
}
    

