#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//编写代码在一个整形有序数组中查找具体的某个数
//要求：找到了就打印数字所在的下标，找不到则输出：找不到。
int main()
{
	int arr[10] = { 0 };
	int left = 0;
	printf("请输入十个数组元素:\n");
	for (int i = 0; i < 10; i++)
	{
		scanf("%d", &arr[i]);
	}
	int right = sizeof(arr) / sizeof(arr[0]) - 1;
	int key = 0;
	int mid = 0;
	printf("请输入要查找的数字:\n");
	scanf("%d", &key);
	while (left <= right)  //注意“=”，要加上
	{
		mid = (left + right) / 2;
		if (arr[mid]>key)
		{
			right = mid - 1;
		}
		else if (arr[mid] < key)
		{
			left = mid + 1;
		}
		else
			break;
	}
	//此时上边已经打印出所需要的结果，下面进行判断
	if (left <= right)
	{
		printf("已找到，下标为:%d\n",mid );
	}
	else
		printf("没找到\n");

	return 0;
}




//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int left = 0;
//	int right = sizeof(arr) / sizeof(arr[0]) - 1;
//	int key = 0;
//	scanf("%d", &key);
//	int mid = 0;
//	while (left <= right)
//	{
//		mid = (left + right) / 2;
//		if (arr[mid] > key)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < key)
//		{
//			left = mid + 1;
//		}
//		else
//			break;
//	}
//	if (left <= right)
//		printf("找到了,下标是%d\n", mid);
//	else
//		printf("找不到\n");
//}
