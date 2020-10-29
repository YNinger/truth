#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#include<assert.h>

////模拟实现strcmp
//
//int my_strcmp(const char *str1, const char *str2)
//{
//	assert(str1);
//	assert(str2);
//	while (*str1++ != 0 && *str2++ != 0)
//	{
//		if (*str1 > *str2)
//		{
//			return 1;
//		}
//		else if (*str1 < *str2)
//		{
//			return -1;
//		}
//	}
//	return 0;
//
//}
//
//int main()
//{
//	char arr1[] = "abcdef";
//	char arr2[] = "abcdef";
//	//int ret = strcmp(arr1, arr2);
//	//printf("%d\n", ret);
//
//	int ret = my_strcmp(arr1,arr2);
//	printf("%d\n", ret);
//	return 0;
//}


//模拟实现strcat

char* my_strcat(char *arr1, const char *arr2)
{
	assert(arr1);
	assert(arr2);
	char* tmp = arr1;
	while (*arr1)
	{
		arr1++;
	}
	while (*arr1++ = *arr2++);
	{
		;
	}
	return tmp;
}

int main()
{
	char arr1[100] ="abcd";
	char arr2[] = "ef";
	//char* str = strcat(arr1, arr2);
	char*str = my_strcat(arr1, arr2);
	printf("%s\n", str);
	return 0;
}