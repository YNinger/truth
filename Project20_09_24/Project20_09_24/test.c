#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//���������������в�ͬλ�ĸ���
//��Ŀ���ݣ�
//���ʵ�֣�����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��
//�������� :
//1999 2299
//������� : 7
//
//11
//00000000000000000000000000001010
//00000000000000000000000000000001
//00000000000000000000000000000001
int get_diff_bit(int m, int n)
{
	int i = 0;
	int count = 0;
	int tmp = m^n;//ͳ��tmp���м���1�Ϳ�����
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

	//����
	scanf("%d%d", &m, &n);
	//���m��n�Ķ����Ƶ�ÿһλ��Ȼ��Ƚϼ���
	int count = get_diff_bit(m, n);

	//���
	printf("%d\n", count);
	return 0;
}