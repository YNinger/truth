#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

////计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值，打印出结
//int main()
//{
//	double i = 1.0;
//	double sum = 0.0;
//	double j = 1.0;
//	for (i = 1.0; i <= 100.0; i++)
//	{
//		sum = sum +  j*(1.0/ i);
//		j = -j;
//	}
//	printf("%f", sum);
//	return 0;
//}



////打印100-200之间的素数
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		int flag = 1;//定义flag=1时，i为素数
//			for (j = 2; j < i; j++)
//			{
//				if (i % j == 0)
//				{
//					flag = 0;
//					break;
//				}
//			}
//			if (flag == 1)
//			{
//				printf("%d ",i);
//				count++;
//			}
//	}
//	printf("\ncount=%d", count);
//	return 0;
//}



////判断year是不是闰年
//int main()
//{
//	int i = 0;
//	int year = 0;
//	scanf("%d", &year);
//	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) || (year % 3200 == 0 && year % 172800 == 0))
//	{
//		printf("闰年\n");
//	}
//	else
//		printf("不是闰年\n");
//
//	return 0;
//}



//交换两个整数的值
//int cha(int *px, int *py)
//{
//	int z = *px;
//	*px = *py;
//	*py = z;
//}
//
//int main()
//{
//	int a = 0;
//	int b = 0;
//	scanf("%d%d", &a, &b);
//	int change = cha(&a, &b);
//	printf("%d %d",a,b);
//	return 0;
//}


//实现一个函数，打印乘法口诀表，口诀表的行数和列数自己指定，如：输入9，输出9 * 9口诀表，输出12，输出12 * 12的乘法口诀表。

int main()
{
	int a = 0;
	int b = 0;
	for (a = 1; a <= 9; a++)
	{
		for (b = 1; b <= a; b++)
		{
			printf("%d*%d=%d ", a, b, a*b);
		}
		printf("\n");
	}
	return 0;
}

