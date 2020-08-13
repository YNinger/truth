#define _CRT_SECURE_NO_WARNINGS 1
//指针
#include<stdio.h>

//int main()
//{
//	int a = 10;
//	int*pa=&a;//将a的值取地址放到pa里边去，此时带*的pa为指针变量
//	*pa = 12;//*pa是解引用操作符，尽管a初始赋值为10，但*pa将a的值重新赋值为12
//	printf("%d\n", a);//此时输出的a为新赋值的
//	return 0;
//}



int main()
{
	char ch = 'b';
	char* pc = &ch;
	*pc = 'w';
	printf("%c\n", ch);

	//int a = 10;
	//int* pa = &a;
	//*pa = 0;//* - 解引用操作符
	//
	//printf("%d\n", a);//10 -11?

	return 0;
}




///#define 定义宏
//加法的宏
//#define ADD(X, Y) ((X)+(Y))
//
//
//int main()
//{
//	//int a = MAX;
//	//printf("%d\n", a);//100
//	int sum = ADD(3,5);
//	printf("sum = %d\n", sum);
//
//	return 0;
//}