package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
		Point p = new Point(-3,4);
		System.out.println(p.GetDistTo00());
	}

}
class Triangle
{
	Point p1;
	Point p2;
	Point p3;
}
class Point
{
	int x;	
	int y;
	Point(int x, int y)
	{
	this.x=x;
	this.y=y;
	}
	double GetDistTo00()
	{
		return Math.sqrt((x*x+y*y));
	}
}
