#include<stdio.h>

void main()
{
    int stack[30], dec, rem, top = 0;
    printf("Enter a decimal number: ");
    scanf("%d", &dec);
    while(dec!=0)
{
    rem = dec%2;
    top++;
    stack[top]=rem;
    dec = dec/2;
}
    printf("The equivalent binary number is ");
    for(;top>0;top--)
{
    printf("%d",stack[top]);
}
    return 0;
}