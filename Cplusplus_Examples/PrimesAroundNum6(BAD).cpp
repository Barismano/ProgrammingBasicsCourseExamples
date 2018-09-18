#include<iostream>
#include <cmath>

using namespace std;
int main()
{
    int n;
    cin>>n;

    for(int i =6;i<n;i+=6)
    {
    int firstNumber=i-1;
    double temp = sqrt(firstNumber);
    bool isPrime=true;
    for(int j=2;j<=temp;j++)
    {
        if(firstNumber%j==0)
        {
            isPrime=false;
            break;
        }
    }
    if(!isPrime)
        continue;

    isPrime = true;
    int secondNumber=i+1;
    double temp2= sqrt(secondNumber);
    for(int j=2;j<=temp2;j++)
    {
        if(secondNumber%j==0)
        {
            isPrime=false;
            break;
        }

    }
    if(isPrime)
        cout<<firstNumber<<" "<<secondNumber<<endl;
    }
}
