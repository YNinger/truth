#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		if (i == 5)
//		{
//			break;//永久终止循环
//		}
//		printf("%d ", i);
//		i++;
//	}
//	return 0;
//}


//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		if (i == 5)
//		{
//			continue;//终止本次循环,跳回上边while循环，不再进行i++ 1234后再死循环
//		}
//		printf("%d ", i);
//		i++;
//	}
//	return 0;
//}

int main()
{
	int i = 0;
	for (i = 0; i < 10; i++)
	{

		printf("%d ", i);
	}
	return 0;
}


//int main()
//{
//	int day = 0;
//	scanf("%d", &day);
//	switch (day)
//	{
//	case1:
//	case2 :
//	case3 :
//	case4 :
//	case5 :
//			  printf("工作日\n", day);
//		  break;
//	  case6:
//	  case7 :
//		  printf("休息日\n", day);
//			break;
//	default :
//		printf("输入有误\n");
//	}
//	return 0;
//}