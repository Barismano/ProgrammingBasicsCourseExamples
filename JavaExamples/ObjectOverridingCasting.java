package com.company;

import java.util.Arrays;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Point p1=new Point(1,2);
        System.out.println(p1);
        Point p2 = new Point(1,2);
        String pronto = "asdsad";
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(pronto));
    }
}
class Point
{
    int x;
    int y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString()
    {
        return "Point :"+x+" "+y;
    }
    @Override
    public boolean equals(Object obj)
    {
        Point p = (Point)obj;
        return x==p.x&&y==p.y;
    }
}
