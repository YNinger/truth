#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>


//int main()
//{
//	unsigned i ;
//	for (i = 9; i >= 0; i--)
//	{
//		printf("%u\n", i);//当最后0变成-1后，-1的补码变成整数 1111111111111111111111111111111,即为输出
//		Sleep(1000);//中途休息一秒
//	}
//}


int main()
{
	char a[1000];//有符号char类型范围为-128 --- 127，当i=-129时，a[-129]=127？？？
	int i;
	for (i = 0; i < 1000; i++)
	{
		a[i] = -1 - i;
	}
	printf("%d\n", strlen(a));//
	return 0;
}