#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int*p = arr;//p����Ԫ�ص�ַ
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d  ", *(p + i));//���ÿ�������Ԫ��
//		printf("%p ", p + i);//�ó�ÿ��Ԫ�ص�ַ
//		printf("%p\n", &arr[i]);//�ó�ÿ��Ԫ�ص�ַ
//	}
//	return 0;
//}

//�ṹ��

struct Book    //�൱��һ��ͼֽ����ռ�ռ�
{
	char name[20];//����
	short price;//�۸�

};

int main()
{
	struct Book b;//����һ����
	int price = 20;
	strcpy();
	printf("%s %d ", b.name, b.price);

	return 0;
} 