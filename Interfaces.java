package com.company;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.IOException;
import java.io.*;
import java.security.cert.PolicyNode;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Apple implements Comparable<Apple>,adasha
{
    String name;
    int weight;
    int greenes;
    Apple(int w,int g)
    {
        weight=w;
        greenes=g;
    }
   public void lazy()
    {
        System.out.println(1);
    }
    @Override
    public String toString()
    {
        return "W: "+weight+" G: "+greenes+"   ";
    }
    public int compareTo(Apple other)
    {
        if(greenes  >other.greenes)
            return -1;
        else if(other.greenes>greenes)
            return 1;
        else
            return 0;
    }
}
class Pineapple implements adasha
{
    @Override
    public void lazy() {
        System.out.println(2);
    }
}
interface adasha
{
    void lazy();
}
public class Main {


    public static void main(String[] args)throws  FileNotFoundException, IOException
    {
        Apple a1 = new Apple(2,4);
        Pineapple p1 = new Pineapple();
        Max(a1);
        Max(p1);


        Apple[] arr = new Apple[5];
        arr[0]=new Apple(3,5);
        arr[1]=new Apple(1,9);
        arr[2]=new Apple(6,6);
        arr[3]=new Apple(99,0);
        arr[4]=new Apple(63,-5);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void Max(adasha r)
    {
        r.lazy();
    }

}