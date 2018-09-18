#include<iostream>
#include <cmath>

using namespace std;
bool isPrime(int n)
{
    double temp = sqrt(n);
    for(int i =2;i<=temp;i++)
    {
        if(n%i==0)
            return false;
    }
    return true;

}
int main()
{
    int n;
    cin>>n;
    for(int i = 6;i<=n;i+=6)
    {
        if(isPrime(i-1)&&isPrime(i+1))
            cout<<i-1<<" "<<i+1<<endl;
    }

}

