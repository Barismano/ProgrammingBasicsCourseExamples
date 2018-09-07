// Example program
#include <iostream>
#include <string>
void MergeSort(int* arr, int len);
void Merge(int* arr1,int len1,int* arr2,int len2,int* result);
int main()
{
  int arr1[] = {9,1,5,3,19,0,-2,10,6,10};
    MergeSort(arr1,10);
    for(int i = 0;i<10;i++)
        std::cout<<arr1[i]<<" ";
}
void MergeSort(int* arr, int len)
{
    if(len==1)
        return;
    int mid = len/2;
    int* firstHalf = new int[mid];
    for(int i =0;i<mid;i++)
        firstHalf[i] = arr[i];
    int* secondHalf = new int[len-mid];
    for(int i = mid,j=0;i<len;i++,j++)
        secondHalf[j]=arr[i];
    MergeSort(firstHalf,mid);    
    MergeSort(secondHalf,len-mid);
    Merge(firstHalf,mid,secondHalf,len-mid,arr);
    delete[] firstHalf,secondHalf;
    
}
void Merge(int* arr1,int len1,int* arr2,int len2,int* result)
{
    int cursor1=0;
    int cursor2=0;
    int resultCursor=0;
    while(cursor1<len1&&cursor2<len2)
    {
        if(arr1[cursor1]<arr2[cursor2])
        {
            result[resultCursor]=arr1[cursor1];
            cursor1++;
        }
        else
        {   
            result[resultCursor]=arr2[cursor2];
            cursor2++;
        }
        resultCursor++;
    }
    while(cursor1<len1)
    {
        result[resultCursor]=arr1[cursor1];
        cursor1++;
        resultCursor++;
    }
    while(cursor2<len2)
    {
          result[resultCursor]=arr2[cursor2];
        cursor2++;
         resultCursor++;
    }
    
}
