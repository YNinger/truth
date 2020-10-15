#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//int main()
//{
//	int arr[] = { 1, 2, (3, 4), 5 };
//	printf("%d\n", sizeof(arr));//arr里边一个元素占的空间大小为四个字节，现在有四个元素，占的大小为16字节
//	return 0;
//}

//int main()
//{
//	char str[] = "hello bit";
//	printf("%d %d\n", sizeof(str), strlen(str));//用“""”表示时且数组没有被初始化时，后面跟了一个“\0”，多了一个字符。
//	return 0;
//}

//
////实现一个对整形数组的冒泡排序
//int main()
//{
//	int i = 0;
//	int arr[5] = { 3,6,2,7,11 };
//	int sz = 0;
//	int temp = 0;
//	sz = sizeof(arr) / sizeof(arr[0]) - 1;
//	for (i = 0; i < sz; i++)
//	{
//		int j = 0;
//		for (j = 0; j<sz-1; j++)//j<sz-i是重点，每次将一个数进行一次循环后，最后一个数一定是最大的，sz-1是为了少计算一次
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//		
//	}
//	for (i = 0; i <= sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//
//	return 0;
//}


//创建一个整形数组，完成对数组的操作
//1.实现函数init() 初始化数组为全0
//2.实现print()  打印数组的每个元素
//3.实现reverse()  函数完成数组元素的逆置。
//要求：自己设计以上函数的参数，返回值。

void init(int arr[])
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{
		arr[i] = 0;
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void print(int arr[])
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void reverse(int arr[],int sz)
{
	int left = 0;
	int right = sz;
	while (left < right)
	{
		int temp = arr[left];
		arr[left]= arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
	for (int i = 0; i <= sz; i++)
	{
		printf("%d ", arr[i]);
	}
}
int main()
{
	
	int arr[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int sz = sizeof(arr) / sizeof(arr[0]) - 1;

	//init(arr);
	//print(arr);
	reverse(arr,sz);

	return 0;
}
