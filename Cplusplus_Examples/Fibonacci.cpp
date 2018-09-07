#include <iostream>



int main()
{
   int n;
   std::cin>>n;
   int prev =1;
   int current=1;
   if(n==1||n==2)
    std::cout<<1;
   else
   {
       int count =2;
       while(count<n)
       {
           int next=prev+current;
           prev=current;
           current=next;
           count++;
       }
       std::cout<<current;
   }

}
