#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
////�����Լ��
//int main()
//{
//	int a = 0;
//	int b = 0;
//	printf("��������������");
//	scanf("%d%d", &a, &b);
//	//շת�����
//	//������
//	//1.��a��b���ʱ�������Լ������a��b
//	//2.��a��b�����ʱ��
//
//	return 0;
//}

//int main()
//{
//	unsigned char a = 200;
//	unsigned char b = 100;
//	unsigned char c = 0;
//	c = a + b;
//	printf("%d %d", a + b, c);
//	return 0;
//}


//int main()
//{
//	char a[1000] = { 0 };
//	int i = 0;
//	for (i = 0; i<1000; i++)
//	{
//		a[i] = -1 - i;
//	}
//	printf("%d", strlen(a));
//	return 0;
//	//a���ַ������飬strlen�ҵ��ǵ�һ�γ���β�㣨��ֵΪ0����λ�á�
//	//���ǵ�a[i]��ʵ���ַ��ͣ����ҪΪ0������Ҫ-1-i�ĵͰ�λҪ��ȫ0��
//	//Ҳ��������򻯳��ˡ�Ѱ�ҵ�-1-i�Ľ����һ�γ��ֵͰ�λȫ��Ϊ0�����ʱ��i��ֵ������Ϊ�ַ������±�Ϊiʱ��һ�γ�����β�㣬���ַ������Ⱦ���i��
//	//ֻ���Ͱ�λ�Ļ�����ʱ-1�൱��255������i==255��ʱ��-1-i��255-255���ĵͰ�λȫ������0��Ҳ���ǵ�iΪ255��ʱ��a[i]��һ��Ϊ0������a[i]�ĳ��Ⱦ���255�ˣ���ѡC��



//����Ļ�ϴ�ӡ������ǡ�
//1
//1 1
//1 2 1
//1 3 3 1
//����
//    1
//   1 1
//  1 2 1
// 1 2 3 1
//1 3 5 3 1
int  main()
{
	int arr[100][100] = { 0 };
	int i = 0;
	int j = 0;
	int z = 0;
	int w = 0;
	int n = 0;
	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if (i == j)
				arr[i][j] = 1;
			if (j == 0)
				arr[i][j] = 1;
			if (i>=2 && j>=1)
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
		}
	}

	for (i = 0; i < n; i++)
	{
		for (j = 0; j <=i; j++)
		{
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	return 0;
}
