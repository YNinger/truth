#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
#include<assert.h>


////ģ��ʵ��strlen
//size_t my_strlen(const char *str)
//{
//	assert(str);
//	int count = 0;
//	while (*str++ != 0)
//	{
//		count++;
//	}
//	return count;
//}
//
//int main()
//{
//	char arr[] = "abcdef";
//	//int ret = strlen(arr);
//	int ret = my_strlen(arr);
//	printf("%d\n", ret);
//	return 0;
//}

//ģ��ʵ�ֿ⺯��strcpy

//char *strcpy(char *str2, const char *str1)
//{
//	assert(str2);
//	assert(str1);
//
//}
//
//
//
//int main()
//{
//	char arr1[] = "abcdef";
//	char arr2[100] = { 0 };
//	//char* ret = strcpy(arr2, arr1);
//	char* ret = my_strcpy(arr2, arr1);
//	printf("%s\n", ret);
//	return 0;
//}

void mul(int i){
	int row = 0; //����
	int col = 0;//����
	for (row = 1; row <= i; row++){
		for (col = 1; col <= row; col++){
			printf("%d*%d=%2d ", row, col, row*col);
		}
		printf("\n");
	}
}
int main(){
	int i;
	printf("������Ҫ��ӡ���˼��ھ���:");
	scanf_s("%d", &i);
	mul(i);




	system("pause");
	return 0;
}
