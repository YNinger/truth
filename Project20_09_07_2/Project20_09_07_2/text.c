#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<math.h>

//�������������Լ��
int main()
{
	int a = 0;
	int b = 0;
	int c = 0;
	scanf("%d%d", &a, &b);
	while (c = a%b)
	{
		a = b;
		b = c;
	}
	printf("���Լ����%d", b);
	return 0;
}


////����������Լ����
//int main()
//{
//	int a = 0;
//	int b = 0;
//	int i = 0;
//	int min = 0;
//	scanf("%d%d", &a, &b);
//	if (a > b)
//		min = b;
//	else
//		min = a;
//	for (i = min; i >= 1;i--)
//	{ 
//		if (a%i == 0 && b%i == 0)
//		{
//			printf("���Լ��=%d", i);
//			break;
//		}
//	}
//	return 0;
//}

//
//��100-200�������۰뷨  ���ú���sqrt���������ţ�i=a*b��a��bһ����i����
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 100;i <= 200; i++)
//	{
//		int flag = 1;//�����ʱ�����i�������ı�־
//		for (j = 2; j <=sqrt(i); j++)
//		{
//			if (i%j == 0)
//			{
//				flag = 0;
//				break;
//			}
//		}
//		if (flag == 1)
//		{
//			printf("%d ", i);
//			count++;
//		}
//	}
//	printf("\ncount=%d", count);
//	return 0;
//}

////�������Ż�����
//int main()
//{
//	int i = 0;
//	int j = 0;
//	int count = 0;
//	for (i = 101; i <= 200; i+=2)//����ż���������������Ȱ�����ż���ų�
//	{
//		int flag = 1;//�����ʱ�����i�������ı�־
//		for (j = 2; j <= sqrt(i); j++)
//		{
//			if (i%j == 0)
//			{
//				flag = 0;
//				break;
//			}
//		}
//		if (flag == 1)
//		{
//			printf("%d ", i);
//			count++;
//		}
//	}
//	printf("\ncount=%d", count);
//	return 0;
//}
