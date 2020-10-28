#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

////下面程序要求输出结构体中成员a的数据,以下不能填入横线处的内容是( )
////A.a.a
////B.*p.a//需要用->,或者先对指针解引用，取到指向的结构体类型的变量，再通过.访问
////C.p->a
////D.(*p).a
//struct S
//{
//	int a;
//	int b;
//};
//int main()
//{
//	struct S a, *p = &a;
//	a.a = 99;
//	printf("%d\n",________ );
//	return 0;
//}


struct stu
{
	int num;
	char name[10];
	int age;
};


void fun(struct stu *p)
{
	printf("%s\n", (*p).name);
	return;
}


int main()
{
	struct stu students[3] = { { 9801, "zhang", 20 },
	{ 9802, "wang", 19 },
	{ 9803, "zhao",18 }
	};
	fun(students + 1);
	return 0;
}

