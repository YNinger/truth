#define _CRT_SECURE_NO_WARNINGS 1
#include <string.h>
#include <stdio.h>

//书-声明了一个结构体类型
struct Book
{
	char name[20];//书名
	short price;  //定价
}b4,b5,b6;//全局变量

typedef struct Book
{
	char name[20];//书名
	short price;  //定价
}Book;

int main()
{
	//利用结构体类型创建结构体变量-局部变量
	struct Book b1;//创建一本书
	struct Book b2;//创建一本书
	struct Book b3;//创建一本书
	Book b4;
	Book b5;

	//字符串拷贝
	//把“C语言”拷贝到name数组中

	strcpy(b1.name, "C语言");
	b1.price = 55;
	
	printf("%s\n", b1.name);
	printf("%d\n", b1.price);

	return 0;
}