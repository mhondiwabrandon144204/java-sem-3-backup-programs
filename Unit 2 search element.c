#include<stdio.h>

void main()
{
    int a[20],n,i,search,f=0;
    printf("\n enter limit : ");
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        printf("\n Enter number %d : ",i+1);
        scanf("%d",&a[i]);


    }
    printf("\n Enter value to be search : ");
    scanf("%d",&search);



     for(i=0;i<n;i++)
     {


    if(search==a[i])
    {
        f=1;
        printf("\n %d is found on position : %d",search,i+1);
        break;

    }
     }
    if(f==0)
    {
        printf("\n value is not found");
    }

}


