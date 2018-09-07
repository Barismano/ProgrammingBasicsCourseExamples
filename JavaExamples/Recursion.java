package com.company;

public class Main {

    public static void main(String[] args)
    {

        System.out.println(Power(2,8));
    }
    public static  int Fibb(int n)
    {
        if(n==1||n==2)
            return 1;
        return Fibb(n-1)+Fibb(n-2);
    }
    public static int Fact(int n)
    {
        if(n==0)
            return 1;
        return n*Fact(n-1);
    }
    public static int Power(int n, int m)
    {
        if(m==0)
            return 1;
        return Power(n,m-1)*n;
    }

}