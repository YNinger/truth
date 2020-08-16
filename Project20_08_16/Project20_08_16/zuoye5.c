#define _CRT_SECURE_NO_WARNINGS 1
//打印1-100之间所有3的倍数的数字

int main()
{
	int i = 0;
	while (i <= 100)
	{
		if (i % 3 == 0)
			printf("%d ", i);
		i++;
	}
	return 0;
}