#include <iostream>
#include <cmath>
int main()
{

    for(int i =0;i<10000;i++)
    {
        int temp = i;

        int sum=0;
        while(temp!=0)
        {
            int lastDigit = temp%10;
            sum+=lastDigit;
            temp/=10; // temp = temp/10;
        }

        if(sum==5)
            std::cout<<i<<std::endl;
     }
}
