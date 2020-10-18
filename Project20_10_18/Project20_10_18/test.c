#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

////求Sn=a+aa+aaa+aaaa+aaaaa的前5项之和，其中a是一个数字，
////例如：2 + 22 + 222 + 2222 + 22222
////
//int main()
//{
//	int i = 0;
//	int a = 0;
//	int s = 0;
//	int sum = 0;
//	int n = 10;
//	scanf("%d", &a);
//	for (i = 0, n = 1; i < 5; i++, n *= 10)
//	{
//		int j = 0;
//		s += (a * n);
//		printf("%d ", s);
//		sum += s;
//			
//	}
//	    printf("\n");
//		printf("sum=%d\n", sum);
//
//	return 0;
//}



//打印水仙花数
//求出0～100000之间的所有“水仙花数”并输出。
//“水仙花数”是指一个n位数，其各位数字的n次方之和确好等于该数本身，如:153＝1 ^ 3＋5 ^ 3＋3 ^ 3，则153是一个“水仙花数”。
int main()
{
	int i = 0;
	
	for (i = 0; i <= 100000; i++)
	{
		int sum = 0;//不能在外边
		int tmp = i;//防止改变一次循环i的值
		int count = 1;//计算位数
		//1.打印位数
		while (tmp/10)
		{
			count++;
			tmp /= 10;
		}
		//2.计算每一位的次方和
		tmp = i;
		while (tmp)
		{
			sum += pow(tmp % 10, count);
			tmp /= 10;
		}
		//3.比较输出
		if (i == sum)
		{
			printf("%d ", i);
		}
	}
	return 0;
}

//1.打印位数
//2.计算每一位的次方和
//3.比较输出


////
////    *4
////   ***3
////  *****2
//// *******1
////*********0
//// *******
////  *****
////   ***
////    *
////打印菱形
//int main()
//{
//	//打印上半部分
//	int line = 0;
//	scanf("%d", &line);
//	int i = 0;
//	for (i = 0; i < line; i++)
//	{
//		//先打印空格
//		int j = 0;
//		for (j = 0; j < line - 1 - i; j++)//j<line-1-i
//		{
//			printf(" ");
//		}
//		//再打印*
//		for (j = 0; j < 2 * i + 1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	 //   1
//		//11
//		//111
//		//1111
//	//打印下半部分
//	// *******
//	//  *****
//	//   ***
//	//    *
//	for (i = 0; i < line - 1; i++)
//	{
//		//先打印空格
//		int k = 0;
//		for (k = 0; k <= i; k++)
//		{
//			printf(" ");
//		}
//		for (k = 0; k < 2 * (line-i-1) - 1; k++)
//		{
//			printf("*");
//		}
//
//		printf("\n");
//	}
//	return 0;
//}
