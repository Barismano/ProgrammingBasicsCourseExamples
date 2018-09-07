
int main()
{
   int n;
   std::cin>>n;
   int result=1;
    int multiPlyer=2;
    while(multiPlyer<=n)
    {
        result=result*multiPlyer;
        multiPlyer++;
    }
    std::cout<<result;


}
