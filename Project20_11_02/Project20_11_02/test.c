#define _CRT_SECURE_NO_WARNINGS 1
//���������壬���ÿռ��С��Ҳ�ж���
union Un
{
	char c[5];//1
	int i;//4
};

union U
{
	short s[7];//14
	int i;//4
};

int main()
{
	union Un u = {0};
	printf("%d\n", sizeof(u));
	printf("%p\n", &u);
	printf("%p\n", &(u.c));
	printf("%p\n", &(u.i));
	printf("%d\n", sizeof(union U));///16
	return 0;
}


