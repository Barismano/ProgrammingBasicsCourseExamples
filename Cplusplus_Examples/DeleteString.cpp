// Example program
#include <iostream>
#include <cstring>
void PushBack(char* source, int start,int pushCount) //push symbols pushCount time, after the Start index
{
    int len = strlen(source);
 for(int i = start;i<=len;i++)
       source[i-pushCount]=source[i];
 
}
int SearchString(char* source,const char* Searched)//return the index of the last char of the searched String
{
    int sourceLen = strlen(source);
    int SearchedLen = strlen(Searched);
    int SearchCursor=0;
    for(int i =0;i<sourceLen;i++)
    {
        if(source[i]==Searched[SearchCursor])
        {
            SearchCursor++;
            if(SearchCursor==SearchedLen)
                return i;
        }
        else
            SearchCursor=0;
    }
    return -1;
}

void RemoveString(char* source, const char* toDelete)
{
    int index = SearchString(source,toDelete);
    int lenToDel=strlen(toDelete);
    while(index!=-1)
    {
     PushBack(source,index+1,lenToDel);
     index= SearchString(source,toDelete);
    }
}

int main()
{
    char arr[] ="zdraveybr babo , kak si babo, az sam dobre";
    char word[] = "babo";
    RemoveString(arr, word);
    std::cout<<arr;

}
