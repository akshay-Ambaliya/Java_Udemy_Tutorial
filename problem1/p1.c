/*
 * problem1.c
 *
 *  Created on: 17-Jul-2023
 *      Author: root
 */

#include<stdio.h>
#define size 5
int main()
{

	int array[size]={12,25,26,35,58};

	int *p,*q,j=size-1;

	p=array;
	q=array;

for(int i=0;i<size;i++,j--)
{
	printf("\n[ %d ][ %d ] : ",i,j);

	if((p+i)==(q+j))
	{
		printf("Same location : ");
	}
	else
	{
		printf("Not on same location : ");
	}
}

	return 0;
}
