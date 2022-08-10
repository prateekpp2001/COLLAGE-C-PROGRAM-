#include<stdio.h>
int MAX SIZE=8;
int STACK[8];
int top =-1;
int is empty()
{
    if (top==-1)
    return 0;
}
int is full()
{
    if (top==MAX SIZE)
    return 1;
    else
    return 0;
}
int pack()
{
    return stack[top];
}
int pop()
{
    int data;
    if(! is empty())
    {
        data=stack[top];
        top=top1;
        return data;
        !else
        {
printf("could not retrive data,stack is empty,\n");
    }
}
int push(int data)
{
    if(! is full())
    {
        top=top+1
        stack[top]=data;
    }
    else
    {
printf("couldnot insert data,stack is full,\n");
    }
}
int main()
{
    push(3);
    push(5);
    push(9);
    push(1);
    push(12);
    push(15);
    printf("element at top of the stack:%d\n",peek());
    printf("element:\n");
    while(! is empty())
    {
        int data=pop();
        printf("%d\n",data);
        printf("stack full%s\n"is full()?"true":"false");
        printf("stack empty:%s\n",is empty()?"true":"false");
        return 0;
    }