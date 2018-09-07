package Jyly6th;
import java.util.Arrays;
import java.util.Scanner;
class ArrUprZad6 
{

	public static void main(String[] args) 
	{
		/* BAD
		 Point p = new Point();
		Point p1= new Point(2,3);
		Point p2 = new Point(1,1);
		Triangle tr = new Triangle(p,p1,p2);
		*/
	
		Triangle tr2= new Triangle(1,2,5,2,0,1);
		
	}
	
	

}
class Triangle
{
	Point p1;
	Point p2;
	Point p3;
	/* BAD CONSTR.  BAD ABSTRACTION
	Triangle(Point p1, Point p2,Point p3)
	{
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	*/ 
	Triangle(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		p1=new Point(x1,y1);
		p2=new Point(x2,y2);
		p3=new Point(x3,y3);
		
		
				
	}	
	boolean isValidTriangle()
	{
		double dist1 = Point.GetDist(p1, p2);
		double dist2 = Point.GetDist(p2, p3);
		double dist3 = Point.GetDist(p3, p1);
		if((dist1==dist2+dist3)||(dist2==dist1+dist3)||(dist3==dist1+dist2))
			return false;
		return true;
	}
	double GetPer()
	{
		return Point.GetDist(p1, p2)+Point.GetDist(p2, p3)+Point.GetDist(p3, p1);
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
	Point()
	{
		this.x=0;
		this.y=0;
	}
	
	public static double GetDist(Point p1, Point p2)
	{
		int distByX=p1.x-p2.x;
		int distByY=p1.y-p2.y;
		return Math.sqrt(distByX*distByX+distByY*distByY);
	}
}





