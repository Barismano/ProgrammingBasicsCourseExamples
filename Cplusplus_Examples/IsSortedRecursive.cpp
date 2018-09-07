#include <iostream>

bool IsSortedRecursive(int* arr,int len)
{
    if(len==1||len==1)
        return true;
    return (arr[len-1]>=arr[len-2])&&IsSorted(arr,len-1);
}

int main()
{
  int arr[] = {1,2,3,4,5,6,7};
  std::cout<<IsSortedRecursive(arr,7);
}
