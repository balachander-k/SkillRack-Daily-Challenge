Fill in the missing lines of code so that the program accepts an integer N (whose
value can be positive or negative) and prints if N is odd or even.

Code:
#include<stdio.h>
int main()
{
    int N;
    scanf("%d",&N);
    if(N%2==1 || (N%2!=0 && N<0))
        printf("Odd");
    else 
        printf("Even");
    
}