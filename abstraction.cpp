#include <iostream>
//Example for bad abstraction
class Line
{
	int xStart;
	int yStart;
	
	int xEnd;
	int yEnd;
}
//Example for good abstraction
class Point
{
	int x;
	int y;
}
class Line
{
	Point start;
	Point end;
}
int main()
{
	
}
