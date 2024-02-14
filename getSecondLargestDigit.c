// You must implement the function getSecondLargestDigit (int N) which accepts
// an integer N as the input. The function must return the second largest digit in N. If
// there is no such digit in N, the function must return -1.

// Boundary Condition(s):
// 10 <= N <=10^8

// Example Input/Output 1:
// Input:
// 24324

// Output:
// Second Largest Digit: 3

// Explanation:
// The 2nd largest digit in 24324 is 3.

// Example Input/Output 2:
// Input:
// 22

// Output:
// Second Largest Digit: -1

// include<stdio.h>
int getSecondLargestDigit(int num)
{
    int first=-1,second=-1;
    while(num!=0)
    {
        int temp=num%10;
        if(temp>first)
        {
            second=first;
            first=temp;
        }
        else if(temp>second && temp!=first)
            second=temp;
        num=num/10;
    }
    return second
}
// int main ()
// {
//   int N;
//   scanf ("%d", &N);
//   printf ("Second Largest Digit: %d", getSecondLargestDigit (N));

// }
