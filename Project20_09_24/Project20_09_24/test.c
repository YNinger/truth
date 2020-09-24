#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//求两个数二进制中不同位的个数
//题目内容：
//编程实现：两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
//输入例子 :
//1999 2299
//输出例子 : 7
//
//11
//00000000000000000000000000001010
//00000000000000000000000000000001
//00000000000000000000000000000001
int get_diff_bit(int m, int n)
{
	int i = 0;
	int count = 0;
	int tmp = m^n;//统计tmp中有几个1就可以了
	while (tmp)
	{
		tmp = tmp&(tmp - 1);
		count++;
	}
	return count;
}


int main()
{
	int m = 0;
	int n = 0;

	//输入
	scanf("%d%d", &m, &n);
	//求出m和n的二进制的每一位，然后比较计数
	int count = get_diff_bit(m, n);

	//输出
	printf("%d\n", count);
	return 0;
}