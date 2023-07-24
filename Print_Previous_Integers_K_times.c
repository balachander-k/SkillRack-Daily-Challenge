// The program must accept an integer N and for each digit D, it must be printed the
// number of times the value of the digit following it. The last digit does not have
// any digit following it, so it must not be printed.

// Boundary condition(s):
// 1 <= N <= 10^7

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the digits as per the given conditions.

// Example Input/Output 1:
// Input:
// 1232

// Output:
// 1122233

// Explanation:
// The digit 1 has 2 after it. So 1 is repeated two times.
// The digit 2 has the digit 3 after it. So 2 is repeated 3 times.
// The digit 3 has the digit 2 before it. So 3 is repeated 2 times.
// The fourth digit 2 does not have any digit after it and hence is ignored.

// Example Input/Output 2:
// Input:
// 1546

// Output:
// 111115555444444


#include<stdio.h>
#include<string.h>
int main()
{
    char val[1000];
    scanf("%s",val);
    int len=strlen(val);
    for(int i=0;i<len-1;i++)
    {
        int curr=val[i]-48;
        int next=val[i+1]-48;
        for(int j=0;j<next;j++)
            printf("%d",curr);
    }
}