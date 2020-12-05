#define _CRT_SECURE_NO_WARNINGS 1
//Ä£ÄâÊµÏÖ
//char *strstr( const char *string, const char *strCharSet );
#include<stdio.h>
#include<string.h>
#include<assert.h>

char *strstr(const char *str1, const char *str2)
{
	assert(str1);
	assert(str2);

}

int main()
{
	char *arr1 = "beijing huanying ni";
	char *arr2 = "huan";
	//char *str=strstr(arr1, arr2);
	char *str = my_strstr(arr1, arr2);
	printf("%s\n",str);
	return 0;
}