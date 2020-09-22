#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int*p = arr;//p是首元素地址
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d  ", *(p + i));//算出每个数组的元素
//		printf("%p ", p + i);//得出每个元素地址
//		printf("%p\n", &arr[i]);//得出每个元素地址
//	}
//	return 0;
//}

//结构体

struct Book    //相当于一份图纸，不占空间
{
	char name[20];//书名
	short price;//价格

};

int main()
{
	struct Book b;//创建一本书
	int price = 20;
	strcpy();
	printf("%s %d ", b.name, b.price);

	return 0;
} 