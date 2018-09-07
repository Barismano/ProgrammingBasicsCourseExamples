#include <iostream>



int main()
{
  int n ;
  std::cin>>n;
   int a;
   std::cin>>a;
   int b;
  std::cin>>b;
  bool wasLastLessOrEqual = a<=b;
  bool isChainSaw=true;
  while(n>2)
  {
      int c;
      std::cin>>c;
      if(wasLastLessOrEqual&&b>=c || !wasLastLessOrEqual&&b<=c)
      {
          wasLastLessOrEqual=!wasLastLessOrEqual;
          b=c;
      }
      else
      {
          isChainSaw=false;
          break;

      }
      n--;
  }
  if(isChainSaw)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}
