// You must implement the function concatenateFirstAndLast)(Digits(int N, int X)
// which accepts two integers N and X as the input. The function must form an
// integer K by concatenating the first and the last X digits of N. Then the function
// must return the integer K.

// Example Input/Output 1:
// Input:
// 67817490 3

// Output:
// Integer. 678490

// Explanation:
// The first 3 digits of the integer 67817490 are 6 7 8.
// The last 3 digits of the integer 67817490 are 4 9 0.
// The integer K formed by concatenating the first and last 3 digits of 67817490 is
// 678490.

// Example Input/Output 2:
// Input:
// 2000 2

// Output:
// Integer. 2000

// Example Input/Output 3:
// Input:
// 67904 5

// Output:
// Integer. 6790467904





#include<stdio.h>
#define ULL unsigned long long int 

ULL concatenateFirstAndLastXDigits(int N,int X)
{
    int len=(int)log10(N)+1;
    int firsdigit=N/(int)pow(10,len-X);
    int lastdigit=N%(int)pow(10,X);
    long result=firsdigit*(long)pow(10,X)+lastdigit;
    return result;
    
}
int main()
{
    int N,X;
    scanf("%d %d",&N,&X);
    printf("Integer: %llu",concatenateFirstAndLastXDigits(N,X));
    return 0;
}