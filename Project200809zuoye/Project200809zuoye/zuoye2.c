#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

int Max(int x, int y)
{ 
	int z = x - y;
	return z;
}

int main()
{
	int num1 = 0;
	int num2 = 0;
	printf("输入两个整数从而得出较大值：\n");
	scanf("%d%d", &num1, &num2);
	//int sub = num1 - num2;
	int sub = Max(num1, num2);
	if (sub >= 0)
	{
		printf("%d\n",num1);
	}
	else
	{
		printf("%d\n",num2);
	}
	return 0;
}