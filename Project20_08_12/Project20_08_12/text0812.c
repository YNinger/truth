#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

//int sum(int a)
//{
//	int c = 0;
//	static int b = 3;//这个static充分运用其功能，每次循环的时候保留b的值大小
//	c += 1;
//	b += 2;
//	return (a + b + c);//？？？？为什么定义return（a+b+c）
//}
//int main()
//{
//	int i;
//	int a = 2;
//	for (i = 0; i < 5; i++) //循环五次，所以输出五个值
//	{
//		printf("%d,", sum(a));//输出的值为sum（a）
//	}
//}


//关于数组
//数据如果初始化，可以不指定数组的大小？？？？有点难懂
int main()
{
	//int arr[10] = { 0 };
	//int n = 10; int arr[n] = { 0 };//这个是错误的，int定义的是变量函数，【】里边应该是常量
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	char ch[10] = "hello bit";
	return 0;
}



