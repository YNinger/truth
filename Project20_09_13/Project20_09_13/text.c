#define _CRT_SECURE_NO_WARNINGS 1

//#include<stdio.h>
//int main()
//{
//	int a = 10;
//	printf("%d\n", ++a);
//	return 0;
//}

//int main()
//{
//	int a = 0;
//	int b = 1;
//	int c = a++&&b++;//�߼������㣬���&&���Ϊ0���ұ߾Ͳ��ü�������
//	printf("a=%d b=%d c=%d", a, b, c);//��ʱ���Ϊ110��������120
//	return 0;
//}


//int main()
//{
//	int a = 1;
//	int b = 1;
//	int d = 3;
//	int c = a++||b++||++d;//�߼������㣬���||���Ϊ1���ұ߾Ͳ��ü�������
//	printf("a=%d b=%d c=%d d=%d", a, b, c,d);
//	return 0;
//}

int main()
{
	char a = 3;
	char b = 127;//�����������Ƚ�3��127�ö���������ʾ���ڽ�����ӣ��õ����룬���ת����ԭ��
	char c = a + b;
	printf("%d\n", c);
	return 0;
}