package com.company;


import javax.swing.*;
import java.util.ArrayList;

//Point()
public class Main
{

    public static void main(String[] args)
    {

    }

}
class point
{
    int x;      
    int y;
    static int a;
    
    point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Rect
{
     point p1;
     point p2;
     point p3;
     point p4;
    Rect(int x1,int y1,int x2,int y2)
    {
        p1=new point(x1,y1);
        p2=new point(x2,y2);
        p3=new point(x1,y2);
        p4=new point(x2,y1);
    }
 static boolean hasIntersection(Rect first,Rect second)
 {
        if(isPointInRect(first.p1,second)||isPointInRect(first.p2,second)||isPointInRect(first.p3,second)||isPointInRect(first.p4,second))
            return true;
        return false;
 }
    public static boolean isPointInRect(point p1, Rect r) {
        boolean isByYOK = p1.y >= Math.min(r.p1.y, r.p2.y) && (p1.y <= Math.max(r.p1.y, r.p2.y));
        boolean isByXOK = p1.x >= Math.min(r.p1.x, r.p2.x) && (p1.x <= Math.min(r.p1.x, r.p2.x));

        if (isByXOK && isByYOK)
            return true;
        return false;
    }
}

