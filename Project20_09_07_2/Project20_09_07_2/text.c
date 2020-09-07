#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

//求两个数的最大公约数
int main()
{
	int a = 0;
	int b = 0;
	int c = 0;
	scanf("%d%d", &a, &b);
	while (c = a%b)
	{
		a = b;
		b = c;
	}
	printf("最大公约数：%d", b);
	return 0;
}


////暴力求解最大公约数发
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int i = 0;
//	int min = 0;
//	scanf("%d%d", &a, &b);
//	if (a > b)
//		min = b;
//	else
//		min = a;
//	for (i = min; i >= 1;i--)
//	{ 
//		if (a%i == 0 && b%i == 0)
//		{
//			printf("最大公约数=%d", i);
//			break;
//		}
//	}
//	return 0;
//}

//
//求100-200素数的折半法  运用函数sqrt（）开根号，i=a*b，a或b一定＜i开方
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 100;i <= 200; i++)
//	{
//		int flag = 1;//定义此时输入的i是素数的标志
//		for (j = 2; j <=sqrt(i); j++)
//		{
//			if (i%j == 0)
//			{
//				flag = 0;
//				break;
//			}
//		}
//		if (flag == 1)
//		{
//			printf("%d ", i);
//			count++;
//		}
//	}
//	printf("\ncount=%d", count);
//	return 0;
//}

////求素数优化方法
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 101; i <= 200; i+=2)//所有偶数都不是素数，先把所有偶数排除
//	{
//		int flag = 1;//定义此时输入的i是素数的标志
//		for (j = 2; j <= sqrt(i); j++)
//		{
//			if (i%j == 0)
//			{
//				flag = 0;
//				break;
//			}
//		}
//		if (flag == 1)
//		{
//			printf("%d ", i);
//			count++;
//		}
//	}
//	printf("\ncount=%d", count);
//	return 0;
//}
