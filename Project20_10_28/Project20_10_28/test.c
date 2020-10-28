#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>

////用函数实现strlen
//
//int my_strlen(char* arr)
//{
//	assert(arr);
//	int count = 0;
//	while (*arr)
//	{
//			count++;
//			arr++;
//	}
//	return count;
//}
//
//int main()
//{
//	char arr[] = "abcdef";
//	int ret = my_strlen(arr);
//	printf("%d\n", ret);
//	return 0;
//}


//模拟实现strcpy

char* my_strcpy(char* arr2, const char* arr1)
{
	assert(arr2);
	assert(arr1);
	char* ret = arr2;
	while (*arr2++ = *arr1++)
	{
		;
	}
	return ret;
}

int main()
{
	char arr1[] = "abcdef";
	char arr2[100] = { 0 };
	char* str = my_strcpy(arr2, arr1);
	printf("%s\n", *str);
	return 0;
}