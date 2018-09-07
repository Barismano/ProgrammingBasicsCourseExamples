package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.omg.PortableInterceptor.DISCARDING;

public class Main {

    public static void main(String[] args)
    {

        int x1=3;
        int y1=4;
        int x2=4;
        int y2=19;
        int x3=1;
        int y3=4;
        int x4=3;
        int y4=19;
        double distByFirstAndSecond =Dist(x1,y1,x2,y2);
        if( distByFirstAndSecond==Dist(x2,y2,x3,y3)&& distByFirstAndSecond== Dist(x3,y3,x4,y4)&&distByFirstAndSecond==Dist(x4,y4,x1,y1))
        {
            if(Dist(x2,y2,x4,y4)==Dist(x1,y1,x3,y3))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
        //System.out.println(NumCount(12223,2)) ;

    }
    public static double Dist(int firstPointX, int firstPointY,int secondPointX,int secondPointy)
    {
        int diffByX= firstPointX-secondPointX;
        int diffByY=firstPointY-secondPointy;
        double dist =  Math.sqrt(diffByX*diffByX+diffByY*diffByY);
        return dist;
    }




    ////
    public static int SumNums(int num)
    {
     int sum=0;
     while(num!=0)
     {
         int lastDigit=num%10;
         sum+=lastDigit;
         num=num/10;
     }
     return sum;

    }

    public static int NumCount(int num,int digit)
    {
        int count=0;
        while(num!=0)
        {
            int lastDigit = num%10;
            if(lastDigit==digit)
                count++;
            num=num/10;
        }
        return count;
    }
    public static boolean isPrime(int n)
    {
        double temp = Math.sqrt(n);
        for (int i = 2; i <=  temp; i++)
        {
            if(n%i==0)
                return false;
        }
         return  true;
    }
}
