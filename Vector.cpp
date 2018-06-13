#include <iostream>
#include <cmath>

class vector
{
	public:
		vector(int a,int b)
		{
			x=a;
			y=b;
		}
		vector()
		{
			x=0;
			y=0;
		}
		int x;
		int y;	
};
int ScalarProduct(vector v1,vector v2)
{
	int result=	v1.x*v2.x+v1.y*v2.y;
	return result;
}
vector VectorWithScalar(vector v1,int n)
{
	int xCoord = v1.x*n;
	int yCoord = v1.y*n;
	vector result(xCoord,yCoord);
	return result;		
}
bool isParalell(vector v1,vector v2)
{
		
	double a = double(v1.x)/v2.x;
	double b = double(v1.y)/v2.y;
	if(abs(a-b)<0.01)
		return true;
	return false;
		
}
vector SumVectors(vector v1,vector v2)
{
    int xCoord =	v1.x+v2.x;
    int yCoord =    v1.y+v2.y;
    vector result(xCoord,yCoord);
    return result;
}
double vectorLength(vector v)
{
	return sqrt(v1.x*v1.x+v1.y*v1.y);
}
bool ExistTriangle(vector v1,vector v2,vector v3)
{
	if(vectorLength(v3)<vectorLength(v1)+vectorLength(v2)&&vectorLength(v2)<vectorLength(v1)+vectorLength(v3)&&(vectorLength(v1)<vectorLength(v2)+vectorLength(v3)))
	{
		if(!isParalell(v1,v2)&&!isParalell(v2,v3)&&!isParalell(v3,v1))
			return true;
	}
	return false;
}
int main()
{
	double a =0.01;

	double result=0;
	for(int i =0;i<100;i++)
		result = result+a;
	
	if(result==1.0d)
		std::cout<<"OK";
	else
		std::cout<<"Ne e ok";
}
