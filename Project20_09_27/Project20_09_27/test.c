#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>


//int main()
//{
//	unsigned i ;
//	for (i = 9; i >= 0; i--)
//	{
//		printf("%u\n", i);//�����0���-1��-1�Ĳ��������� 1111111111111111111111111111111,��Ϊ���
//		Sleep(1000);//��;��Ϣһ��
//	}
//}


int main()
{
	char a[1000];//�з���char���ͷ�ΧΪ-128 --- 127����i=-129ʱ��a[-129]=127������
	int i;
	for (i = 0; i < 1000; i++)
	{
		a[i] = -1 - i;
	}
	printf("%d\n", strlen(a));//
	return 0;
}