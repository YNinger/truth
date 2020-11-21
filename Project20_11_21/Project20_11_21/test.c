#define _CRT_SECURE_NO_WARNINGS 1
//序列中整数去重
#include<stdio.h>
int main()
{
	int arr[1000] = { 0 };
	int n = 0;
	scanf("%d", &n);
	int i = 0;
	for (i = 1; i <= n; i++)
	{
		scanf("%d", &arr[i]);
		int j = 0;
		for (j = 1; j<i; j++)
		{
			//当判断输入的元素与之前的有一样时，重新输入元素
			if (arr[i] == arr[j])
			{
				--i;
				--n;
			}
		}
	}
	for (i = 1; i <= n; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}