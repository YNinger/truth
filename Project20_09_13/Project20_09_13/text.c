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
//	int c = a++&&b++;//逻辑与运算，如果&&左边为0，右边就不用继续再算
//	printf("a=%d b=%d c=%d", a, b, c);//此时输出为110，并不是120
//	return 0;
//}


//int main()
//{
//	int a = 1;
//	int b = 1;
//	int d = 3;
//	int c = a++||b++||++d;//逻辑或运算，如果||左边为1，右边就不用继续再算
//	printf("a=%d b=%d c=%d d=%d", a, b, c,d);
//	return 0;
//}

int main()
{
	char a = 3;
	char b = 127;//整形提升，先将3和127用二进制数表示，在进行相加，得到补码，最后转换成原码
	char c = a + b;
	printf("%d\n", c);
	return 0;
}