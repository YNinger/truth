#define _CRT_SECURE_NO_WARNINGS 1
//����������ȥ��
#include<stdio.h>
int main()
{
	int arr[1000] = { 0 };
	int n = 0;
	scanf("%d", &n);
	int i = 0;
	for (i = 1; i <= n; i++)
	{
		scanf("%d", &arr[i]);
		int j = 0;
		for (j = 1; j<i; j++)
		{
			//���ж������Ԫ����֮ǰ����һ��ʱ����������Ԫ��
			if (arr[i] == arr[j])
			{
				--i;
				--n;
			}
		}
	}
	for (i = 1; i <= n; i++)
	{
		printf("%d ", arr[i]);
	}
	return 0;
}