#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
//
//int my_strlen(char*str)//char*atr������Ԫ�صĵ�ַ
//{
//	int count = 0;
//	while (*str != '\0')//str��ָ�룬Ҫ�ý����÷��ſ��Խ���
//	{
//		count++;
//		str++;//str++����Ԫ�ص�ַ��һ�õ��ڶ���Ԫ�صĵ�ַ��'\0'���бȽ�
//	}
//	return count;
//}
//
//int main()
//{
//	char arr[] = "abcdef";
//
//	int len = my_strlen(arr);//����һ�������������ͱ���len����
//
//	printf("%d\n", len);
//
//	return 0;
//}


int my_strlen(char*str)//char*str������Ԫ�صĵ�ַ
{
	char*start = str;  //start������arr��Ԫ�صĵ�ַ
	while (*str != '\0')
	{
		str++;
	}
	return str - start;  //ָ���ָ�롣��ʱstr='\0',��ʾΪarr[6],start��Ϊarr[0],��������õ������м�Ԫ�صĸ���6-0=6
}

int main()
{
	char arr[] = "abcdef";

	int len = my_strlen(arr);//����һ�������������ͱ���len����

	printf("%d\n", len);

	return 0;
}