#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//较大值比较
//int get_max(int x, int y)//返回构建的函数int x，int y都放在构建的函数上
//{
//	int z = 0;
//	if (x > y)
//	{
//		z = x;
//	}
//	else
//	{
//		z = y;
//	}
//	return z;
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	printf("请输入两个整数得出较大值:\n");
//	scanf("%d%d", &a, &b);
//	int Max = get_max(a, b);
//	printf("%d\n", Max);
//	return 0;
//}


//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	printf("%d\n", arr[5]);
//	return 0;
//}


//int main()
//{
//	int arr[10] = { 1, 3, 5, 7, 9 };
//
//	arr[4] = 6;  //[]是下表引用操作符
//		return 0;
//}

//用条件操作符比较最大值
int main()
{
	int a = 0;
	int b = 0;
	printf("请输入两个整数得出较大值：\n");
	scanf("%d%d", &a, &b);
	int max = (a > b ? a : b);
	printf("%d\n", max);
		return 0;
}



//int main()
//{
//	int a = 10;
//	int b = a++;//a++指的是先把a的值代给b，再把a本身进行加一
//	printf("a=%d b=%d\n", a, b);//a先给b，b=10，a再加一，a=11
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	int b = ++a;//++a指的是先把a加一，再把a的值给b
//	printf("a=%d b=%d\n", a, b);//a加一，a=11，再把a给b，b=11
//	return 0;
//}


//void text()  //void的含义只需要运行一下这个text函数，不需要返回值
//{
//	int a = 1;
//	a++;
//	printf("%d\n", a);//后面的程序只需要运行十次，这个text函数每次运行时只需输出a++，也就是十个2
//}
//int main()
//{
//	int i = 0;
//	//运行十次
//	while (i < 10)
//	{
//		text();
//		i++;
//	}
//
//	return 0;
//}
//static的用法 和上面对比
//void text()  //void的含义只需要运行一下这个text函数，不需要返回值
//{
//	static int a = 1;  //当加了static时候，表示静态，也就是保留了之前运行的a的值
//	a++;
//	printf("%d\n", a);//后面的程序只需要运行十次，这个text函数每次运行时只需输出a++，也就是2
//}
//int main()
//{
//	int i = 0;
//	//运行十次
//	while (i < 10)
//	{
//		text();
//		i++;
//	}
//
//	return 0;
//}

