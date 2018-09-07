package com.company;
import java.util.Arrays;
import java.util.Currency;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Object obj;

        Triangle tr = new Triangle(1,2,3,4,5,6);
        Rectangle rc = new Rectangle(1,2,3,4,5,6,7,8);
        Circle cr = new Circle(3,4,5);
        System.out.println(tr);
        System.out.println(rc);

        Figure[] arr = new Figure[3];
        arr[0]=tr;
        arr[1]=rc;
        arr[2]=cr;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].getPer());
        }
    }
}

 abstract  class Figure
{
    Point[] points;
    abstract double getPer();


}

class Triangle extends Figure
{
    Triangle(int p1x,int p1y,int p2x,int p2y,int p3x,int p3y)
    {
       points = new Point[3];
       points[0]=new Point(p1x,p1y);
       points[1]=new Point(p2x,p2y);
       points[2]=new Point(p3x,p3y);
    }
    @Override
    double getPer()
    {
        return points[0].Dist(points[1])+points[1].Dist(points[2])+points[0].Dist(points[2]);
    }
    @Override
   public String toString()
    {
        return "Zdrasti";
    }

}
class Rectangle extends Figure
{
    Rectangle(int p1x,int p1y,int p2x,int p2y,int p3x,int p3y,int p4x,int p4y)
    {
        points = new Point[4];
        points[0]=new Point(p1x,p1y);
        points[1]=new Point(p2x,p2y);
        points[2]=new Point(p3x,p3y);
        points[3]=new Point(p4x,p4y);

    }
    @Override
    double getPer()
    {
        return points[0].Dist(points[1])+points[1].Dist(points[2])+points[2].Dist(points[3])+points[3].Dist(points[0]);
    }
}
class Circle extends Figure
{
    int radius;
    Circle(int x,int y,int radius)
    {
        points = new Point[1];
        points[0]=new Point(x,y);
        this.radius=radius;
    }
    @Override
    double getPer()
    {
       return 2*radius*Math.PI;
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
    double Dist(Point p2)
    {
        int distByX = x-p2.x;
        int distByY = y-p2.y;
        return  Math.sqrt(distByX*distByX+distByY*distByY);
    }
}
