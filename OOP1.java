package com.company;


import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Triangle t = new Triangle(-8,7,7,6,-3,-5);
        System.out.println(t.Per());


    }
}

class Triangle
{
    Point p1;
    Point p2;
    Point p3;
    Triangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        p1=new Point(x1,y1);
        p2=new Point(x2,y2);
        p3=new Point(x3,y3);
    }
    double Per()
    {
        return p1.Dist(p2)+p2.Dist(p3)+p3.Dist(p1);
    }
    
}
class Point
{
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    int x;
    int y;
     double Dist(Point p2)
     {
         int distByX = x-p2.x;
         int distByY = y-p2.y;
         return  Math.sqrt(distByX*distByX+distByY*distByY);
     }
     
}

class Student
{
Student (String name,int grade)
{
    this.name=name;
    this.grade=grade;

}

    void sayHello()
    {

        System.out.println("Hello i am"+name+" and i have achieved "+grade);
        System.out.println(this);

    }


String name;
int grade;


}
