#include <iostream>



int main()
{
   int n;
   std::cin>>n;
   int m;
   std::cin>>m;
   int result =1;
   int power=0;
   while(power<m)
   {
       result=result*n;
       power++;
   }
   std::cout<<result;

}
