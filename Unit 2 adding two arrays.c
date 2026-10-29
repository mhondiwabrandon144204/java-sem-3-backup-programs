#include<stdio.h>

void main()

{
    int a[5],b[5],c[10],i,j,f=0;

    printf("\n enter value of an array A\n");

    for(i=0;i<5;i++)
    {
        printf("\n Enter value %d : ",i+1);
        scanf("%d",&a[i]);

    }
        printf("\n Enter value of array B\n");

        for(i=0;i<5;i++)
        {
           printf("\n Enter value %d : ",i+1);
            scanf("%d \n",&b[i]);
        }

        for(i=0;i<5;i++)
        {


          c[i] =a[i]+b[i];

        }

        printf("Summation :");

        for(i=0;i<5;i++)
        {

          printf("\n \n %d",c[i]);
        }
}
