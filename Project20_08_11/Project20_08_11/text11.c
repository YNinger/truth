#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//�ϴ�ֵ�Ƚ�
//int get_max(int x, int y)//���ع����ĺ���int x��int y�����ڹ����ĺ�����
//{
//	int z = 0;
//	if (x > y)
//	{
//		z = x;
//	}
//	else
//	{
//		z = y;
//	}
//	return z;
//}
//int main()
//{
//	int a = 0;
//	int b = 0;
//	printf("���������������ó��ϴ�ֵ:\n");
//	scanf("%d%d", &a, &b);
//	int Max = get_max(a, b);
//	printf("%d\n", Max);
//	return 0;
//}


//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	printf("%d\n", arr[5]);
//	return 0;
//}


//int main()
//{
//	int arr[10] = { 1, 3, 5, 7, 9 };
//
//	arr[4] = 6;  //[]���±����ò�����
//		return 0;
//}

//�������������Ƚ����ֵ
int main()
{
	int a = 0;
	int b = 0;
	printf("���������������ó��ϴ�ֵ��\n");
	scanf("%d%d", &a, &b);
	int max = (a > b ? a : b);
	printf("%d\n", max);
		return 0;
}



//int main()
//{
//	int a = 10;
//	int b = a++;//a++ָ�����Ȱ�a��ֵ����b���ٰ�a������м�һ
//	printf("a=%d b=%d\n", a, b);//a�ȸ�b��b=10��a�ټ�һ��a=11
//	return 0;
//}

//int main()
//{
//	int a = 10;
//	int b = ++a;//++aָ�����Ȱ�a��һ���ٰ�a��ֵ��b
//	printf("a=%d b=%d\n", a, b);//a��һ��a=11���ٰ�a��b��b=11
//	return 0;
//}


//void text()  //void�ĺ���ֻ��Ҫ����һ�����text����������Ҫ����ֵ
//{
//	int a = 1;
//	a++;
//	printf("%d\n", a);//����ĳ���ֻ��Ҫ����ʮ�Σ����text����ÿ������ʱֻ�����a++��Ҳ����ʮ��2
//}
//int main()
//{
//	int i = 0;
//	//����ʮ��
//	while (i < 10)
//	{
//		text();
//		i++;
//	}
//
//	return 0;
//}
//static���÷� ������Ա�
//void text()  //void�ĺ���ֻ��Ҫ����һ�����text����������Ҫ����ֵ
//{
//	static int a = 1;  //������staticʱ�򣬱�ʾ��̬��Ҳ���Ǳ�����֮ǰ���е�a��ֵ
//	a++;
//	printf("%d\n", a);//����ĳ���ֻ��Ҫ����ʮ�Σ����text����ÿ������ʱֻ�����a++��Ҳ����2
//}
//int main()
//{
//	int i = 0;
//	//����ʮ��
//	while (i < 10)
//	{
//		text();
//		i++;
//	}
//
//	return 0;
//}

