#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#include<assert.h>

//ģ��ʵ��strstr
//�÷���
//strstr(str1, str2) ���������ж��ַ���str2�Ƿ���str1���Ӵ���
//����ǣ���ú������� str1�ַ����� str2��һ�γ��ֵ�λ�ÿ�ʼ�� str1��β���ַ��������򣬷���NULL
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
		return (char*)str1;//���ִ�Ϊ�յ�ʱ��ֱ�ӷ���arr1����Ԫ�ص�ַ
	}
	//���ַ�����Ϊ��ʱ
	while (*cp)
	{
		s1 = cp;//��������ȡ��str1����ͬ��ĸ����Ԫ�ص�ַ
		s2 = str2;//����ÿ��ѭ����ʼ��
		while (*s1 && *s2 && *s1== *s2)
		{
			s1++;
			s2++;
		}
		if (*s2 == '\0')//��str2��������֮�󷵻�str1��һ�γ��ֵĵ�ַ
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