#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#include<assert.h>

//模拟实现strstr
//用法：
//strstr(str1, str2) 函数用于判断字符串str2是否是str1的子串。
//如果是，则该函数返回 str1字符串从 str2第一次出现的位置开始到 str1结尾的字符串；否则，返回NULL
//char *strstr( const char *string, const char *strCharSet );

char* my_strstr(const char *str1, const char *str2)
{
	assert(str1);
	assert(str2);
	const char*s1 = str1;
	const char*s2 = str2;
	const char*cp = str1;
	if (*s2=='\0')
	{
		return (char*)str1;//当字串为空的时候直接返回arr1的首元素地址
	}
	//当字符串不为空时
	while (*cp)
	{
		s1 = cp;//用来保留取得str1的相同字母的首元素地址
		s2 = str2;//用来每次循环初始化
		while (*s1 && *s2 && *s1== *s2)
		{
			s1++;
			s2++;
		}
		if (*s2 == '\0')//当str2遍历完了之后返回str1第一次出现的地址
		{
			return (char*)cp;
		}
		cp++;
	}

	return NULL;

}

int main()
{
	char arr1[] = "abbcdef";
	char arr2[] = "bcd";
	/*char* ret = strstr(arr1, arr2);
	printf("%s\n", ret);*/
	char* ret = my_strstr(arr1, arr2);
	printf("%s\n", ret);
	return 0;
}