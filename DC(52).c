// jumbled program

// The program given below performs a certain logic but the line are jumbled. Reorder the lines so that the program runs successfully.

// #include<stdio.h>
// {
// 	if(product % sum == 0)
// 	{
// 		int main()
// 	}
// 	else
// 	{
// 		product*= N % 10;
// 		printf("No");
// 	}
// }
// int N, sum = 0, product = 1;
// while(N > 0)
// {
// 	printf("Yes");
// 	sum+=N % 10;
// }
// if(N%2 == 0)
// {
// 	N/=10;
// }
// else
// {
// 	scanf("%d", &N);
// }


#include<stdio.h>
int main()
{
    int N,sum=0,product=1;
    scanf("%d",&N);
    while(N>0)
    {
        if(N%2==0)
        {
            product*=N%10;
        }
        else
        {
            sum+=N%10;
        }
        N/=10;
    }
    if(product%sum==0)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
}

