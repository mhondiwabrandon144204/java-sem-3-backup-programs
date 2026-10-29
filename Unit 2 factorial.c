#include<stdio.h>
#define MAX 30

int stack[MAX],top=-1;
void push(int value);
int pop();

void main()
{
    //int factorial;
 //   do
   // {
   // printf("\n 1.Push");
   // printf("\n 2.pop");

   // }
    //while factorial = 1;
}
   // void push()
//{
   // int value;
  //  printf("\n Enter Value for factorial: ");
  //  scanf("%d",&value);

   /* if (factorial<1)
    {
        printf("\n fact is 1");

    }
    else
    {
        factorial = n*factorial(n-1);
        printf("\n factorial is %d :", factorial);
    }

}
{*/
   // int i,n=1;
   // long long factorial = 1;

    //printf("\n enter the value for factorial :");
   // scanf("%d",&n);

    for(i=1;i<=n;i++)
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
