// Example program
#include <iostream>
#include <string>
void QuickSort(int*arr,int l,int r);
int Partition(int* arr,int l,int r);
void swap(int* arr, int i ,int j);
int main()
{
     int arr[] = {9,1,4,6,1,0,33,12,7,10,2};
    QuickSort(arr,0,10);
     for(int i =0;i<11;i++)
        std::cout<<arr[i]<<" ";
} 
void QuickSort(int*arr,int l,int r)
{
    if(l<r)
    {
        int pivot= Partition(arr,l,r);
        QuickSort(arr,l,pivot-1);
        QuickSort(arr,pivot+1,r);
    }
}
int Partition(int* arr,int l,int r)
{
    int pivot = arr[l];
    int i =l;
    int j = r;

    while(true)
    {
    while(arr[i]<pivot)
        i++;
    while(arr[j]>pivot)
        j--;
    if(i<j)
      { 
        swap(arr,i,j);
        i++;
        j--;
      }
    else
        break;
    }
    return j;
}
void swap(int* arr, int i ,int j)
{
 int temp = arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
}