#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

////�������Ҫ������ṹ���г�Աa������,���²���������ߴ���������( )
////A.a.a
////B.*p.a//��Ҫ��->,�����ȶ�ָ������ã�ȡ��ָ��Ľṹ�����͵ı�������ͨ��.����
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

