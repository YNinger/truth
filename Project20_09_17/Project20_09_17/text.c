#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>

int my_strlen(char* arr)
{
	int count = 0;
	while (arr != \0)
	{
		count++;

	}
	return count;
}

int main()
{
	char arr[] = "abcdef";

	int len = my_strlen(arr);

	printf("%d\n", len);

	return 0;
}