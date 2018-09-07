#include <iostream>

int main()
{
	int n;
	std::cin >> n;
	int max = -1;//all numbers are positve, so we are going to override it.
	int sum = 0;
	for (int i = 0; i < n; i++)
	{
		int currentNum;
		std::cin >> currentNum;
		if (max < currentNum)
			max = currentNum;
		sum += currentNum;
	}
	if (sum == 2 * max)
		std::cout << "Yes, sum = " << max;
	else
		std::cout << "No, diff = " << abs(max - (sum-max));
	system("pause");
}