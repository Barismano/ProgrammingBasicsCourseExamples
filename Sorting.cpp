void swap(int* arr, int ind1, int ind2)
{
	int temp = arr[ind1];
	arr[ind1] = arr[ind2];
	arr[ind2] = temp;
}
void BubbleSort(int* arr, int len)
{
	for (int j = 0; j < len; j++)
	{
		bool isSwapped = false;
		for (int i = 0; i < len-1-j; i++)
		{
			if (arr[i] > arr[i + 1])
			{
				swap(arr, i, i + 1);
				isSwapped = true;
			}
		}
		if (!isSwapped)
			return;
	}
}
void SelectionSort(int* arr, int len)
{
	for (int i = 0; i < len; i++)
	{
		int min = arr[i];
		int minIndex = i;
		for (int j = i+1; j < len; j++)
		{
			if (arr[j] < min)
			{
				min = arr[j];
				minIndex = j;
			}
		}
		swap(arr, i, minIndex);
	}
}
void InsertionSort(int* arr, int len)
{
	for (int i  = 1; i < len; i++)
	{
		int element = arr[i];
		int cursor = i - 1;
		while (cursor >= 0 && element < arr[cursor])
		{
			arr[cursor + 1] = arr[cursor];
			cursor--;
		}
		if (cursor < 0)
			cursor = 0;
		arr[cursor] = element;
	}
}
int main()
{

	int* arr = new int[5];
	arr[0] = 9;
	arr[1] = 5;
	arr[2] = 4;
	arr[3] = 3;
	arr[4] = 2;
	InsertionSort(arr, 5);
	for (int i = 0; i < 5; i++)
	{
		cout << arr[i]<<" ";
	}
	return 0;
}