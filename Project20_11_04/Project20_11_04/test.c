#define _CRT_SECURE_NO_WARNINGS 1

#include<stdio.h>
#include<stdlib.h>
//struct S
//{
//	int num;
//	char arr[];//[]��߲�д����д0��ʱ���ǡ��������顱
//};
//
//int main()
//{
//	struct S* p = (struct S*)malloc(sizeof(struct S) + 6);//����һ��ռ䣬�ֽڴ�СΪ4+6
//	p->num = 100;
//	int i = 0;
//	for (i = 0; i < 6; i++)
//	{
//		p->arr[i] = 'a'+ i;
//	}
//	for (i = 0; i < 6; i++)
//	{
//		printf("%c\n",p->arr[i]);
//	}
//	struct S* ptr = (struct S*)realloc(p, 14);//�����ڴ�ռ��С
//	if (p != NULL)
//	{
//		p = ptr;
//	}
//	for (i = 0; i < 10; i++)
//	{
//		p->arr[i] = 'x';
//	}
//	for (i = 0; i < 10; i++)
//	{
//		printf("%c\n", p->arr[i]);
//	}
//	free(p);
//	p = NULL;
//
//	return 0;
//}


struct S2
{
	int num;
	char* arr;
};
int main()
{
	struct S2* ps=(struct S2*)malloc(sizeof(struct S2));
	ps->num = 100;
	ps->arr = (char*)malloc(6*sizeof(char));
	int i = 0;
	for (i = 0; i < 6; i++)
	{
		ps->arr[i] = 'a' + i;
	}

	for (i = 0; i < 6; i++)
	{
		printf("%c ", ps->arr[i]);
	}
	printf("\n");
	char* ptr = (char*)realloc(ps->arr, 10);
	if (ptr != NULL)
	{
		ps->arr = ptr;
	}
	for (i = 0; i < 10; i++)
	{
		ps->arr[i] = 'a' + i;
	}
	for (i = 0; i < 10; i++)
	{
		printf("%c ",ps->arr[i]);
	}

	return 0;
}