#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//实现一个函数，可以左旋字符串中的k个字符。
//例如：
//ABCD左旋一个字符得到BCDA
//ABCD左旋两个字符得到CDAB

//void left_move(char arr[], int k)
//{
//	int i = 0;
//	int len = strlen(arr);//计算字符串的长的
//	for (i = 0; i < k; i++)
//	{
//		char tmp = arr[0];//取数组首元素的字符
//		int j = 0;
//		for (j = 0; j < len - 1; j++)
//		{
//			arr[j] = arr[j + 1];
//		}
//		arr[len - 1] = tmp;
//	}
//}
//
//
//int main()
//{
//	int k = 0;
//	scanf("%d", &k);//输入左旋的字符的个数
//	char arr[] = "ABCDEF";//用char定义被转移字符
//	left_move(arr, k);
//	printf("%s\n", arr);//打印转移后的字符
//	return 0;
//}

//实现一个函数，可以左旋字符串中的k个字符。
//例如：
//ABCD左旋一个字符得到BCDA
//ABCD左旋两个字符得到CDAB

void left_move(char arr[], int k)
{
	int i = 0;
	int len = strlen(arr);
	for (i = 0; i < k; i++)//左移的循环次数
	{
		int j = 0;
		char tmp = arr[0];//保存字符串的第一个字符，留着最后

		for (j = 0; j <= len-1; j++)//此代码一次循环固定左旋一个字符，
		{
			arr[j] = arr[j + 1];

		}
		arr[len-1] = tmp;//将首字符移到最后一个字符空间
	}
}

int main()
{
	int k = 0;
	scanf("%d",&k);
	char arr[] = "ABCDEFG";
	left_move(arr,k);
	printf("%s\n", arr);
	return 0;
}