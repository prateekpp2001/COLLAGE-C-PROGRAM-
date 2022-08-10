#include<stdio.h>
void main()
{
    int arr[100],size,i,sum=0;
    printf("Enter array size: ");
    scanf("%d",&size);
    printf("Enter array elements: ");
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<size;i++)
    {
        sum=sum+arr[i];
    }
    printf("sum of the array =%d\n",sum);
    
}

