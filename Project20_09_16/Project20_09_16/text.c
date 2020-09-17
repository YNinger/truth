#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
int i;
int main()
{
	i--;
	
	if (i > sizeof(i))
	{
		printf(">\n");
	}
	else
	{
		printf("<\n");
	}
	printf("%d\n", i);
	printf("%d\n", sizeof(i));
	return 0;
}

//#include <stdio.h>
//int main()
//{
//	int a, b, c;
//	a = 5;
//	c = ++a;
//	b = ++c, c++, ++a, a++;
//	b += a++ + c;
//	printf("a = %d b = %d c = %d\n:", a, b, c);
//	return 0;
//}