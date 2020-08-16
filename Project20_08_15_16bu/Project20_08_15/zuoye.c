#define _CRT_SECURE_NO_WARNINGS 1

//1
#include <stdio.h>
//
//int main()
//{
//	int i = 0;
//	for (i = 0; i<10; i++)
//	{
//		if (i = 5)  //注意此时的“=”不是等于的意思，是赋值！！！
//			printf("%d ", i);
//	}
//	return 0;
//}



int main()
{
	int a = 0;
	int b = 0;
	int c = 0;
	scanf("%d%d%d", &a, &b, &c);
	if (a >= b && a >= c)
	{
		if (b >= c)
			printf("%d %d %d\n", a, b, c);
		else
			printf("%d %d %d\n", a, c, b);

	}
	else if(b >= a&&b >= c)
	{
		if (a >= c)
			printf("%d %d %d\n", b, a, c);
		else
			printf("%d %d %d\n", b, c, a);

	}

	else if (c >= a&&c >= b)
	{
		if (b >= a)
			printf("%d %d %d\n", c, b, a);
		else
			printf("%d %d %d\n", c, a, b);

	}
		return 0;
}