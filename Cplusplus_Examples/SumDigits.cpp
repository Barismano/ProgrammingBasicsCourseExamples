#include <iostream>



int main()
{
   int n;
   std::cin>>n;
   int result = 0;
   while(n!=0)
   {
    int digit = n%10;
    n=n/10;// n/=10;
    result=result+digit;//result+=digit;
   
   }
   std::cout<<result;


}
