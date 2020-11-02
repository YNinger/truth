#define _CRT_SECURE_NO_WARNINGS 1
//计算联合体，共用空间大小，也有对齐
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


