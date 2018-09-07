// Example program
#include <iostream>
#include <cstring>
int StringLength(const char* str)
{
 
 int len =0;
 int ind=0;
 while(str[ind]!='\0')
 {
     len++;
     ind++;
 }
 return len;
 
}
void StringCopy(const char* string, char* Dest)
{
    int currIndex=0;
    while(string[currIndex]!='\0')
    {
     Dest[currIndex]=string[currIndex];
     currIndex++;
    }
    Dest[currIndex]='\0';
}
int StringCompare(const char* str1,const char* str2)
{
    int index=0;
    while(str1[index]!='\0'&&str2[index]!='\0')
    {
        int value = str1[index]-str2[index];
        if(value!=0)
            return value;
        index++;
    }
    return 0;
}  
void StringConcat(char* str1,const char* str2)//Not sure!!! 
{
    int termPos= StringLength(str1);
    int str2len= StringLength(str2);
    int ind = 0;
    for(int i = 0;i<str2len;i++,termPos++)
    {
         str1[termPos]=str2[i];
    }
    str1[termPos]='\0';
}
int main()
{
char* string = new char[30];
string[0]='P';
string[1]='r';
string[2]='o';
string[3]='b';
string[4]='a';

char* temp = new char[30];
StringCopy(string,temp);
StringConcat(string,string);
StringConcat(string,string);
StringConcat(string,string);
StringConcat(string,string);

 std::cout<<string;
}


    

