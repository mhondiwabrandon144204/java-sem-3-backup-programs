
#include<stdio.h>
#define MAX 100

int stack[MAX],top=-1;
void push(char value);
char pop();

void main()
{

char str[20];
int i = 0;

printf("enter a string :");
gets(str);

while(str[i] !='\0')
{
    push(str[i]);
    i++;
}
while(top != -1)
{
   printf("\n %c",pop());
}



void push(char value)
{


if(top==MAX-1)
{
    printf("\n Stack Overflow");
}
else
{
    top++;
    stack[top]=value;
}
}
char pop()
{
    char val;
    if(top==-1)
    {
        printf("\n Underflow");
        return -1;
    }
    else
    {
        val = stack[top];
        top--;
        return val;

    }
    }
