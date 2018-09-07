 Example program
#include iostream
#include cstring
using namespace std;
int getSumOfNums(const char temp);

int main()
{ 
 char temp = new char[100] ; aaaadasd344sdfd4%fg52sadsa;
cin.getline(temp,100);
coutgetSumOfNums(temp);

}
int getSumOfNums(const char temp)
{
    
    int len = strlen(temp);
    int sum = 0;
    int current = 0;
    int multiPlier=1;
    for(int i =len-1;i=0;i--)
    {
        if(temp[i]='0'&&temp[i]='9')
        {
            current += (temp[i] - '0')multiPlier;
            multiPlier=10;
        } 
        else
        {
            sum+=current;
            multiPlier=1;
            current=0;
        }
    }
    return sum;
}