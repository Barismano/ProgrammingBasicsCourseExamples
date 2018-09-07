#include <iostream>



int main()
{
   int n;
   std::cin>>n;
   int temp=n;
   int temp2=n;
   int count=0;
   while(temp!=0)
   {
       temp=temp/10;
       count++;
   }

   int powerOfTen =1;
   int t=1;
   while(t<=count-1)
   {
       powerOfTen=powerOfTen*10;
       t++;
   }




   int reverse = 0;
   while(temp2!=0)
   {
       int lastDigit = temp2%10;
       reverse = reverse + lastDigit*powerOfTen;
       powerOfTen=powerOfTen/10;
       temp2=temp2/10;
   }


   if(n==reverse)
    std::cout<<"Palindrome";
   else
    std::cout<<"No!";


}
