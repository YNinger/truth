#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
//
//int my_strlen(char*str)//char*atr代表首元素的地址
//{
//	int count = 0;
//	while (*str != '\0')//str是指针，要用解引用符才可以进行
//	{
//		count++;
//		str++;//str++对首元素地址加一得到第二个元素的地址与'\0'进行比较
//	}
//	return count;
//}
//
//int main()
//{
//	char arr[] = "abcdef";
//
//	int len = my_strlen(arr);//定义一个函数，用整型变量len修饰
//
//	printf("%d\n", len);
//
//	return 0;
//}


int my_strlen(char*str)//char*str代表首元素的地址
{
	char*start = str;  //start是数组arr首元素的地址
	while (*str != '\0')
	{
		str++;
	}
	return str - start;  //指针减指针。此时str='\0',表示为arr[6],start则为arr[0],两个相减得到的是中间元素的个数6-0=6
}

int main()
{
	char arr[] = "abcdef";

	int len = my_strlen(arr);//定义一个函数，用整型变量len修饰

	printf("%d\n", len);

	return 0;
}