#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<assert.h>

void* my_memcpy(void*dest, const void*src, size_t count)
{
	void*ret = dest;
	assert(dest);
	assert(src);

	while (count--)
	{
		//拷贝一个字节
		*(char*)dest = *(char*)src;
		dest = (char*)dest+1;
		src = (char*)src+1;
	}
	return ret;
}

void* my_memmove(void* dest, const void* src, size_t count)
{
	assert(dest);
	assert(src);
	if (dest < src)
	{
		//前->后
		while (count--)
		{
			*(char*)dest = *(char*)src;
			dest = (char*)dest + 1;
			src = (char*)src + 1;
		}
	}
	else
	{
		//后->前
		while (count--)
		{
			*((char*)dest + count) = *((char*)src + count);
		}
	}
}

int main()
{
	int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	my_memcpy(arr1+2, arr1, 16);
	my_memmove(arr1+2, arr1, 16);

	////01 00 00 00 02 00 00 00 03 00 00 00 ...
	////
	//strcpy();//

	
	return 0;
}

