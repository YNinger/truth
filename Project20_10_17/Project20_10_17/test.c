#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
//写一个函数打印arr数组的内容，不使用数组下标，使用指针。
//arr是一个整形一维数组。

void print(int *pa,int sz)
{

	int i = 0;
	for (i = 0; i <= sz - 1; i++)
	{

		printf("%d ", *(pa++));

	}
	printf("\n");
}
int main()
{
	int arr[] = { 0, 1, 2, 3, 4, 5};

	int sz = sizeof(arr) / sizeof(arr[0]);

	print(arr,sz);

	return 0;
}

////写一个函数，可以逆序一个字符串的内容。
////注意：字符串和数组不一样 字符串的打印以及strlen的计算都是到'\o'才结束
//void get_resver(char *a)
//{
//	char *start = a;//此时的a指的是一个首元素的地址，start也是数组首元素的地址
//	char *end = a + strlen(a) - 1;//这个指的是该字符串最后一个元素的地址，end是最后一个元素的地址
//	while (start < end)//这个比较的是地址的大小
//	{
//		char tmp = *start;
//		*start = *end;
//		*end = tmp;
//		start++;
//		end--;
//	}
//	printf("%s\n",a);
//	/*printf("%p\n", &a);
//	printf("%p\n", a);
//	printf("%p\n", *a);*/
//}
//
//int main()
//{
//	char arr[] = "ABCDEF";
//	char *a = arr;
//	//printf("%s\n", str);
//	get_resver(arr);
//	return 0;
//}

