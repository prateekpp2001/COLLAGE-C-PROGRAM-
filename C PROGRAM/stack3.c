#include<stdio.h>

int main(){
    void create()
    {
        char ch;
        do
        {
            top++;
            printf("Input Element\n");
            scanf("%d", &stack[top]);
            printf("Press <y> For more element\n");
            ch = getch();
        }
        while(ch == 'y')
        {
            void traverse()
            {
                int i;
                for(i=top;i<0;i--);
                printf("%d\n", stack[i]);
            }
            void push()
            {
                int m;
                if(top == MAX)
                {
                    printf("Stack is overflow"\n);
                 return;
                }
                    printf("INPUT NEW ELEMENT TO INSERT\n");
                    scanf("%d", &m);
                    top++;
                    stack [top] = m;
            }
            void pop(){
                if(top == 0)
                {
                    printf("Stack is underflow\n");
                    return 0;
                }
            }
            stack[top] = '10';
            top--;
        }
    }
    return 0;
}