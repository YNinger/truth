#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
//дһ��������ӡarr��������ݣ���ʹ�������±꣬ʹ��ָ�롣
//arr��һ������һά���顣

void print(int *pa,int sz)
{

	int i = 0;
	for (i = 0; i <= sz - 1; i++)
	{

		printf("%d ", *(pa++));

	}
	printf("\n");
}
int main()
{
	int arr[] = { 0, 1, 2, 3, 4, 5};

	int sz = sizeof(arr) / sizeof(arr[0]);

	print(arr,sz);

	return 0;
}

////дһ����������������һ���ַ��������ݡ�
////ע�⣺�ַ��������鲻һ�� �ַ����Ĵ�ӡ�Լ�strlen�ļ��㶼�ǵ�'\o'�Ž���
//void get_resver(char *a)
//{
//	char *start = a;//��ʱ��aָ����һ����Ԫ�صĵ�ַ��startҲ��������Ԫ�صĵ�ַ
//	char *end = a + strlen(a) - 1;//���ָ���Ǹ��ַ������һ��Ԫ�صĵ�ַ��end�����һ��Ԫ�صĵ�ַ
//	while (start < end)//����Ƚϵ��ǵ�ַ�Ĵ�С
//	{
//		char tmp = *start;
//		*start = *end;
//		*end = tmp;
//		start++;
//		end--;
//	}
//	printf("%s\n",a);
//	/*printf("%p\n", &a);
//	printf("%p\n", a);
//	printf("%p\n", *a);*/
//}
//
//int main()
//{
//	char arr[] = "ABCDEF";
//	char *a = arr;
//	//printf("%s\n", str);
//	get_resver(arr);
//	return 0;
//}

