#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
////二分查找
////编写代码在一个整形有序数组中查找具体的某个数
////要求：找到了就打印数字所在的下标，找不到则输出：找不到
////1 2 3 4 5 6 7 8 9 10
//int main()
//{
//	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
//	/*int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d", &arr[i]);
//	}*/
//	int right = sizeof(arr)/sizeof(arr[0])-1;
//	int left = 0;
//	int mid = 0;
//	while ()
//
//	return 0;
//}






#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void menu()
{
	printf("**********************************\n");
	printf("***********   1.play   ***********\n");
	printf("***********   0.exit   ***********\n");
	printf("**********************************\n");
}
//TDD-测试驱动开发。
//RAND_MAX--rand函数能返回随机数的最大值。
void game()
{
	int random_num = rand() % 100 + 1;
	int input = 0;
	while (1)
	{
		printf("请输入猜的数字>:");
		scanf("%d", &input);
		if (input > random_num)
		{
			printf("猜大了\n");
		}
		else if (input < random_num)
		{
			printf("猜小了\n");
		}
		else
		{
			printf("恭喜你，猜对了\n");
			break;
		}
	}
}
int main()
{
	int input = 0;
	srand((unsigned)time(NULL));
	do
	{
		menu();
		printf("请选择>:");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
			break;
		default:
			printf("选择错误,请重新输入!\n");
			break;
		}
	} while (input);
	return 0;
}
