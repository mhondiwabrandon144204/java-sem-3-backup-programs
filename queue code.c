#include<stdio.h>
#define MAX 5

int front=-1,rear=-1;
int queue[MAX];
void insert();
void delete_elements();
void display();
void main()
{
    int op;
    do
    {

    printf("\n 1. Insert");
    printf("\n 2. Delete");
    printf("\n 3. Display");
    printf("\n 4. Exit");
    printf("\n Enter your choice:");
    scanf("%d",&op);

    switch(op)
    {
        case 1:
            insert();
            break;
        case 2:
            delete_elements();
            break;
        case 3:
            display();
            break;

    default:
        printf("\n Invalid choice..");
        break;
    }

    }while(op!=4);

}



void insert()
{
    int num;
    printf("\n enter the value need to be inserted..:" );
    scanf("%d",&num);

    if(front==MAX-1)
    {
        printf("\n Overflow");
        return;
    }
    if(front==-1 && rear==-1)
    {
        front=rear=0;
    }
    else
    {
        rear=rear+1;
    }
    queue[rear]=num;
}

void delete_elements()
{
    int val;

    if(front==-1 || front>rear)
    {
        printf("\n Underflow..");
        return;
    }
    else
    {
        val=queue[front];
        printf("\n the value need to be deleted is : %d",val);


        if(front==rear)
        {
            front=rear=-1;
            return;

        }
        front++;
    }


 }
void display()
{
   int i;
   for(i=front;i<=rear;i++)
   {
       printf("\t %d",queue[i]);
   }
}

