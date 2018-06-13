#include <iostream>
#include <cmath>


class Point
{
	
	public:
		int x;
		int y;
	
	Point()
	{
		
		x=0;
		y=0;
	}
	Point(int xCoord, int yCoord)
	{
		x=xCoord;
		y=yCoord;
	}
	double getDist(Point p2)
	{
			return sqrt((x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y));
	}
};
class Rectangle
{
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	Rectangle(Point p1,Point p2, Point p3, Point p4)
	{
		this->p1=p1;
		this->p2=p2;
		this->p3=p3;
		this->p4=p4;	
	}
	double getArea()
	{
		double sideA = p1.getDist(p2);
		double sideB =p1.getDist(p4);
		return sideA*sideB;
	}
	double getPer()
	{
		double sideA = p1.getDist(p2);
		double sideB = p1.getDist(p4);
		return 2*(sideA+sideB);
	}
	
};
int main()
{
   	Point p(4,5);
   	Point p2(10,12);

   	std::cout<<p.getDist(p2);
   	std::cout<<p2.getDist(p);
}
