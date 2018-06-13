#include <iostream>

int main()
{
 int n ;
 std::cin>>n;

 while(n!=0)
 {
     int lastDigit= n%10;
     std::cout<<lastDigit;
     n/=10;
 }

}
