#include <iostream>
#include <cmath>

class Figure
{
	public:
		Figure(int x,int y)
		{
			this->x=x;
			this->y=y;
		}
	int x;
	int y;
	virtual bool move(int x,int y) {}
	
	
};
class Rook : public Figure
{
	bool move(int x,int y)
	{
		std::cout<<"moving rook"<<std::endl;
		if(this->x!=x&&this->y!=y)
			return false;
		this->x=x;
		this->y=y;	
		return true;	
	}
};
class Bishop : public Figure
{
	bool move(int x,int y)
	{
		std::cout<<"moving bishop"<<std::endl;
		if(abs(x-this->x)!= abs(y-this->y))
			return false;
		this->x=x;
		this->y=y;
		return true;
	}
};
int main()
{
Bishop* b = new Bishop();
b->x=1;
b->y=1;
Rook* r = new Rook();
r->x=0;
r->y=2;

// int* arr = new int[10];
Figure** chess= new Figure*[3];
chess[0]=b;
chess[1]=r;
chess[0]->move(2,2);
chess[1]->move(0,7);
}
