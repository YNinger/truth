#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//ʵ��һ�����������������ַ����е�k���ַ���
//���磺
//ABCD����һ���ַ��õ�BCDA
//ABCD���������ַ��õ�CDAB

//void left_move(char arr[], int k)
//{
//	int i = 0;
//	int len = strlen(arr);//�����ַ����ĳ���
//	for (i = 0; i < k; i++)
//	{
//		char tmp = arr[0];//ȡ������Ԫ�ص��ַ�
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
//	scanf("%d", &k);//�����������ַ��ĸ���
//	char arr[] = "ABCDEF";//��char���屻ת���ַ�
//	left_move(arr, k);
//	printf("%s\n", arr);//��ӡת�ƺ���ַ�
//	return 0;
//}

//ʵ��һ�����������������ַ����е�k���ַ���
//���磺
//ABCD����һ���ַ��õ�BCDA
//ABCD���������ַ��õ�CDAB

void left_move(char arr[], int k)
{
	int i = 0;
	int len = strlen(arr);
	for (i = 0; i < k; i++)//���Ƶ�ѭ������
	{
		int j = 0;
		char tmp = arr[0];//�����ַ����ĵ�һ���ַ����������

		for (j = 0; j <= len-1; j++)//�˴���һ��ѭ���̶�����һ���ַ���
		{
			arr[j] = arr[j + 1];

		}
		arr[len-1] = tmp;//�����ַ��Ƶ����һ���ַ��ռ�
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