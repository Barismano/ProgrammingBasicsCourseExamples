// Example program
#include <iostream>
#include <string>

int main()
{
  int len = 13;
  int arr[] = {3,1,8,20,17,3,8,1,15,17,12,15,20};
  int temp=0;
  for(int i =0;i<len;i++)
  {
    temp = temp^arr[i];    
  }
  std::cout<<temp;
}

    

