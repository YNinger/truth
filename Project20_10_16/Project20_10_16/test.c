#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//将数组A中的内容和数组B中的内容进行交换。（数组一样大）
//void get_change(int arr1[], int arr2[])
//{
//	int j = 0;
//	for (j = 0; j < 5;j++)
//	{
//		int temp = arr1[j];
//		arr1[j] = arr2[j];
//		arr2[j] = temp;
//
//	}
//	for (j = 0; j < 5; j++)
//	{
//		printf("%d ", arr1[j]);
//	}
//	printf("\n");
//	for (j = 0; j < 5; j++)
//	{
//		printf("%d ", arr2[j]);
//	}
//
//}
//
//int main()
//{
//	int i = 0;
//	int arr1[] = { 1, 2, 3, 4, 5 };
//	int arr2[] = { 6, 7, 8, 9, 10 };
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", arr1[i]);
//	}
//	printf("\n");
//	for (i = 0; i < 5; i++)
//	{
//		printf("%d ", arr2[i]);
//	}
//	printf("\n");
//	get_change(arr1,arr2);
//
//
//
//	return 0;
//}


int main()
{
	int arr[] = { 1, 2, 3, 4, 5 };
	short *p = (short*)arr;
	int i = 0;
	for (i = 0; i<4; i++)
	{
		*(p + i) = 0;
	}

	for (i = 0; i<5; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}
