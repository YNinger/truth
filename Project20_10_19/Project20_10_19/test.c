#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
////求最大公约数
//int main()
//{
//	int a = 0;
//	int b = 0;
//	printf("请输入两个整数");
//	scanf("%d%d", &a, &b);
//	//辗转相除法
//	//两步走
//	//1.当a，b相等时，其最大公约数就是a或b
//	//2.当a，b不相等时，
//
//	return 0;
//}

//int main()
//{
//	unsigned char a = 200;
//	unsigned char b = 100;
//	unsigned char c = 0;
//	c = a + b;
//	printf("%d %d", a + b, c);
//	return 0;
//}


//int main()
//{
//	char a[1000] = { 0 };
//	int i = 0;
//	for (i = 0; i<1000; i++)
//	{
//		a[i] = -1 - i;
//	}
//	printf("%d", strlen(a));
//	return 0;
//	//a是字符型数组，strlen找的是第一次出现尾零（即值为0）的位置。
//	//考虑到a[i]其实是字符型，如果要为0，则需要-1-i的低八位要是全0，
//	//也就是问题简化成了“寻找当-1-i的结果第一次出现低八位全部为0的情况时，i的值”（因为字符数组下标为i时第一次出现了尾零，则字符串长度就是i）
//	//只看低八位的话，此时-1相当于255，所以i==255的时候，-1-i（255-255）的低八位全部都是0，也就是当i为255的时候，a[i]第一次为0，所以a[i]的长度就是255了，故选C。



//在屏幕上打印杨辉三角。
//1
//1 1
//1 2 1
//1 3 3 1
//……
//    1
//   1 1
//  1 2 1
// 1 2 3 1
//1 3 5 3 1
int  main()
{
	int arr[100][100] = { 0 };
	int i = 0;
	int j = 0;
	int z = 0;
	int w = 0;
	int n = 0;
	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (i == j)
				arr[i][j] = 1;
			if (j == 0)
				arr[i][j] = 1;
			if (i>=2 && j>=1)
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
		}
	}

	for (i = 0; i < n; i++)
	{
		for (j = 0; j <=i; j++)
		{
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	return 0;
}
