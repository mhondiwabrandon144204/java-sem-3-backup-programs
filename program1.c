#include<stdio.h>

void main()
{
    int a[5];
    int i,n,sum=0;
    float Average;

    for(i=0;i<5;i++)
    {
        printf("\n enter  values are %d :",i+1);
        scanf("%d",&a[i]);


        sum = sum + a[i];

    }
    Average = (float)sum/5;
    printf("\n entered values are as follows\n");
    for(i=0;i<5;i++)
    {

        printf("\n %d",a[i]);
    }

    printf("\n the sum is %d :",sum);

    printf("\n the average is %f :",Average);


}
