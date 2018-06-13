#include <iostream>

int main()
{
   char command;
   int number;
   int result=0;
   std::cin>>command;
   while(command!='E')
   {

       if(command=='+')
       {
           std::cin>>number;
           result+=number; //result = result+number;
       }
       else if(command=='-')
       {
           std::cin>>number;
           result-=number;
       }
       else if(command=='*')
       {
           std::cin>>number;
           result*=number;
       }
      std::cin>>command;
   }
   std::cout<<result;
}
