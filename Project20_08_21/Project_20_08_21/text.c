#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int day = 0;
	scanf("%d", &day);
	switch (day)
	{
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		printf("上班上班上班\n");
		break;
	case 6:
	case 7:
		printf("休息\n");
		break;
	default:
		printf("输入错误\n");
		break;
	}
	return 0;
}