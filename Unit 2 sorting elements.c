#include<stdio.h>


void main()
{
    int s[10],i,j,temp;
    for(i=0;i<10;i++)
    {
        printf("\n Enter value %d : ",i+1);
        scanf("%d",&s[i]);
    }
for(i=0;i<10;i++)
    {
        for(j=i+1;j<10;j++)
        {
            if(s[i]>s[j])
            {
                temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        }
    }
    printf("\n Sorted elements are as follows \n");
    for(i=0;i<10;i++)
    {
        printf("\n %d",s[i]);
    }
}
