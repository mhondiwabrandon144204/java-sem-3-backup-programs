
#include<stdio.h>
#define MAX 30

int stack[MAX],top=-1;
void push(int value);
int pop();

void main()
{

int n,fact=1;
printf("\n enter the value for factorial :");
scanf("%d",&n);


for(int i=1;i<=n;i++)
    {
        push(i);
    }
    while(top!=1)
    {

        fact = fact*pop();
    }

    printf(" factorial of : %d ",fact);

}
void push(int value)
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
int pop()
{
    int val;
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
