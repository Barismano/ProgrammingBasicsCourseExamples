// Example program
#include <iostream>
#include <cstring>
bool IsPalindrome(char* string, int l,int r);
void LongestPalindrom(char *string,char* dest);

int main()
{
    char dasd[] = "qwqeaasaa";
    char arr[100];
    LongestPalindrom(dasd,arr);
    std::cout<<arr;
} 
void LongestPalindrom(char *string,char* dest)
{
    int StringLen = strlen(string);
   int l =0;
   int r = StringLen-1;

   int diff=1;
   while(true)
   {
       if(IsPalindrome(string,l,r))
         break;
       
        if(r==StringLen-1)
        {   
                l=0;
                r=StringLen-1-diff;
                diff++;
        }
        else
        {
         l++;
         r++;
        }
   }
   int cursor = 0;
   for(int i = l;i<=r;i++,cursor++)
   {
       dest[cursor]=string[i];
   }
   dest[cursor]='\0';
}
bool IsPalindrome(char* string, int l,int r)
{
  
    while(l<r)
    {
       
        if(string[l]!=string[r])
            return false;
        l++;
        r--;
    }
    return true;
}