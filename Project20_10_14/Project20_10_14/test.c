#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//��д������һ���������������в��Ҿ����ĳ����
//Ҫ���ҵ��˾ʹ�ӡ�������ڵ��±꣬�Ҳ�����������Ҳ�����
int main()
{
	int arr[10] = { 0 };
	int left = 0;
	printf("������ʮ������Ԫ��:\n");
	for (int i = 0; i < 10; i++)
	{
		scanf("%d", &arr[i]);
	}
	int right = sizeof(arr) / sizeof(arr[0]) - 1;
	int key = 0;
	int mid = 0;
	printf("������Ҫ���ҵ�����:\n");
	scanf("%d", &key);
	while (left <= right)  //ע�⡰=����Ҫ����
	{
		mid = (left + right) / 2;
		if (arr[mid]>key)
		{
			right = mid - 1;
		}
		else if (arr[mid] < key)
		{
			left = mid + 1;
		}
		else
			break;
	}
	//��ʱ�ϱ��Ѿ���ӡ������Ҫ�Ľ������������ж�
	if (left <= right)
	{
		printf("���ҵ����±�Ϊ:%d\n",mid );
	}
	else
		printf("û�ҵ�\n");

	return 0;
}




//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int left = 0;
//	int right = sizeof(arr) / sizeof(arr[0]) - 1;
//	int key = 0;
//	scanf("%d", &key);
//	int mid = 0;
//	while (left <= right)
//	{
//		mid = (left + right) / 2;
//		if (arr[mid] > key)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < key)
//		{
//			left = mid + 1;
//		}
//		else
//			break;
//	}
//	if (left <= right)
//		printf("�ҵ���,�±���%d\n", mid);
//	else
//		printf("�Ҳ���\n");
//}
