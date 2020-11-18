#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

#include<stdio.h>
#include<math.h>

//课设代码
//int main()
//{
//	unsigned int AD_dat;
//	unsigned char Temp_dat;
//	unsigned char BCD_s, BCD_g, BCD_dat;
//	FILE *pf;
//	pf = fopen("mim256x8.bin", "w");
//	for (AD_dat = 0; AD_dat < 256; AD_dat++){
//		Temp_dat = ((AD_dat * 100) / 255);
//		BCD_s = Temp_dat / 10;
//		BCD_g = Temp_dat % 10;
//		BCD_dat = ((BCD_s << 4) + BCD_g);
//		fputc(BCD_dat, pf);
//	}
//	fclose(pf);
//}

//统计文件的字符数
//int main()
//{
//	long num = 0;
//	FILE *fp = NULL;
//	if ((fp = fopen("fname.dat", "r")) == NULL)
//	{
//		printf("Can’t open the file! ");
//		exit(0);
//	}
//	while (fgetc(fp) != EOF)
//	{
//		num++;
//	}
//	printf("num=%d\n", num);
//	fclose(fp);
//	return 0;
//}


//题目有多组输入数据，每一行输入三个a，b，c(0<a,b,c<1000)，作为三角形的三个边，用空格分隔。
/*针对每组输入数据，输出占一行，如果能构成三角形，
等边三角形则输出“Equilateral triangle!”，
等腰三角形则输出“Isosceles triangle!”,
其余的三角形则输出“Ordinary triangle!”，
反之输出“Not a triangle!”。*/

int main()
{
	int a = 0;
	int b = 0;
	int c = 0;
	while (scanf("%d%d%d", &a, &b, &c)!=EOF)
	{
		if ((a + b > c) && (a + c > b) && (b + c > a))
		{
			if (a == b&&a == c)
			{
				printf("Equilateral triangle!\n");
			}
			else if ((a == b) || (a == c) || (b == c))
			{
				printf("Isosceles triangle!\n");
			}
			else
			{
				printf("Ordinary triangle!\n");
			}
		}
		else
		{
			printf("Not a triangle!\n");
		}
	}
	return 0;
}