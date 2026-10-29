#include<stdio.h>

void main()
{
    int a[5],b[5],c[10],i,j=0;



    printf("\n Enter value of Array A\n");



    for(i=0;i<5;i++)
    {
        printf("\n Enter value %d : ",i+1);
        scanf("%d",&a[i]);
    }
    printf("\n Enter Value of Array B\n");
    for(i=0;i<5;i++)
    {
        printf("\n Enter value %d: ",i+1);
        scanf("%d",&b[i]);
    }
    for(i=0;i<5;i++)
    {

        c[j]=a[i];
        j++;
}
    for(i=0;i<5;i++)
    {
        c[j]=b[i];
        j++
    }
}
