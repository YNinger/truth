#define _CRT_SECURE_NO_WARNINGS 1
//ָ��
#include<stdio.h>

//int main()
//{
//	int a = 10;
//	int*pa=&a;//��a��ֵȡ��ַ�ŵ�pa���ȥ����ʱ��*��paΪָ�����
//	*pa = 12;//*pa�ǽ����ò�����������a��ʼ��ֵΪ10����*pa��a��ֵ���¸�ֵΪ12
//	printf("%d\n", a);//��ʱ�����aΪ�¸�ֵ��
//	return 0;
//}



int main()
{
	char ch = 'b';
	char* pc = &ch;
	*pc = 'w';
	printf("%c\n", ch);

	//int a = 10;
	//int* pa = &a;
	//*pa = 0;//* - �����ò�����
	//
	//printf("%d\n", a);//10 -11?

	return 0;
}




///#define �����
//�ӷ��ĺ�
//#define ADD(X, Y) ((X)+(Y))
//
//
//int main()
//{
//	//int a = MAX;
//	//printf("%d\n", a);//100
//	int sum = ADD(3,5);
//	printf("sum = %d\n", sum);
//
//	return 0;
//}