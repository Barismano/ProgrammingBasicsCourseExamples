#include <iostream>

int main()
{
	const int rows=19;
	const int colls=19;
	int matrix[rows][colls];
	
	for(int i =0;i<rows;i++)
	{
		for(int j=0;j<colls;j++)
		{
			if(i==j||i==0||i==rows-1||j==0||j==colls-1||rows-1-j==i||i==rows/2||(rows%2==0&&i==rows/2-1)||j==colls/2||(colls%2==0&&j==colls/2-1))
				matrix[i][j]=1;
		
			else
				matrix[i][j]=0;
			if(i==rows/2&&j==colls/2)
			{
				matrix[i][j]=0;
				if(rows%2==0&&colls%2==0)
				{
					matrix[i-1][j-1]=0;
					matrix[i-1][j]=0;
					matrix[i][j-1]=0;
				}
			}
		}
	}
	
	for(int i =0;i<rows;i++)
	{
		for(int j=0;j<colls;j++)
		{
			std::cout<<matrix[i][j]<<" ";	
		}	
		std::cout<<std::endl;
	}
}
