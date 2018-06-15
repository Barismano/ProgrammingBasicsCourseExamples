// Example program
#include <iostream>
#include <string>
#include <cmath>
int DigitCount(int n)
{
   int count =0;
   while(n!=0)
    {
        n/=10;
        count++;
    }
    return count;
}

int Reverse(int n)
{
 int result = 0;
 int dc = DigitCount(n);
 dc--;
 int power = pow(10,dc);
 while(n!=0)
 {
  int lastDigit = n%10;
  result+=lastDigit*power;
  power/=10;
  n/=10;
 }
 return result;
}
int SumNumber(int n)
{
 int sum=0;
 while(n!=0)
 {
  int lastDigit = n%10;
  sum+=lastDigit;
  n=n/10;
 }
 return sum;
}
int main()
{
      std::cout<<SumNumber(4523);
}
