#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	//��ӡһ������
	int line = 0;
	int i = 0;
	scanf("%d", &line);
	for (i = 0; i < line; i++)
	{
		//��ӡһ��
		//�ȴ�ո��ڴ�ӡ*
		int j = 0;
		for (j = 0; j < line - 1 - i; j++)
		{
			printf(" ");
		}
		for (j = 0; j < 2 * i + 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}

	for (int i = 0; i < line - 1;i++)
	{
		int j = 0;
		for (j = 0; j <= i; j++)
		{
			printf(" ");
		}
		for (j = 0; j < (line - 1-i) * 2 - 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}