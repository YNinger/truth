#define _CRT_SECURE_NO_WARNINGS 1
#include <string.h>
#include <stdio.h>

//��-������һ���ṹ������
struct Book
{
	char name[20];//����
	short price;  //����
}b4,b5,b6;//ȫ�ֱ���

typedef struct Book
{
	char name[20];//����
	short price;  //����
}Book;

int main()
{
	//���ýṹ�����ʹ����ṹ�����-�ֲ�����
	struct Book b1;//����һ����
	struct Book b2;//����һ����
	struct Book b3;//����һ����
	Book b4;
	Book b5;

	//�ַ�������
	//�ѡ�C���ԡ�������name������

	strcpy(b1.name, "C����");
	b1.price = 55;
	
	printf("%s\n", b1.name);
	printf("%d\n", b1.price);

	return 0;
}