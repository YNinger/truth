#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//int main()
//{
//	int arr[] = { 1, 2, (3, 4), 5 };
//	printf("%d\n", sizeof(arr));//arr���һ��Ԫ��ռ�Ŀռ��СΪ�ĸ��ֽڣ��������ĸ�Ԫ�أ�ռ�Ĵ�СΪ16�ֽ�
//	return 0;
//}

//int main()
//{
//	char str[] = "hello bit";
//	printf("%d %d\n", sizeof(str), strlen(str));//�á�""����ʾʱ������û�б���ʼ��ʱ���������һ����\0��������һ���ַ���
//	return 0;
//}

//
////ʵ��һ�������������ð������
//int main()
//{
//	int i = 0;
//	int arr[5] = { 3,6,2,7,11 };
//	int sz = 0;
//	int temp = 0;
//	sz = sizeof(arr) / sizeof(arr[0]) - 1;
//	for (i = 0; i < sz; i++)
//	{
//		int j = 0;
//		for (j = 0; j<sz-1; j++)//j<sz-i���ص㣬ÿ�ν�һ��������һ��ѭ�������һ����һ�������ģ�sz-1��Ϊ���ټ���һ��
//		{
//			if (arr[j]>arr[j + 1])
//			{
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//		
//	}
//	for (i = 0; i <= sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//
//	return 0;
//}


//����һ���������飬��ɶ�����Ĳ���
//1.ʵ�ֺ���init() ��ʼ������Ϊȫ0
//2.ʵ��print()  ��ӡ�����ÿ��Ԫ��
//3.ʵ��reverse()  �����������Ԫ�ص����á�
//Ҫ���Լ�������Ϻ����Ĳ���������ֵ��

void init(int arr[])
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{
		arr[i] = 0;
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void print(int arr[])
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void reverse(int arr[],int sz)
{
	int left = 0;
	int right = sz;
	while (left < right)
	{
		int temp = arr[left];
		arr[left]= arr[right];
		arr[right] = temp;
		left++;
		right--;
	}
	for (int i = 0; i <= sz; i++)
	{
		printf("%d ", arr[i]);
	}
}
int main()
{
	
	int arr[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int sz = sizeof(arr) / sizeof(arr[0]) - 1;

	//init(arr);
	//print(arr);
	reverse(arr,sz);

	return 0;
}
