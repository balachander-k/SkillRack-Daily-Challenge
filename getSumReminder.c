// You must implement the function getSumRemainder(int arr[], int N) which
// accepts an integer array arr and its size N as the input. The function must return
// the remainder when the sum of odd integers is divided by the sum of even
// integers in the array.

// Note: The array arr always has at least one odd integer and at least one even
// integer.

// Example Input/Output 1:
// Input:
// 5
// 1 2 3 4 5

// Output:
// Remainder: 3

// Explanation:
// The sum of odd integers in the given array is 9 (1+3+5).
// The sum of even integers in the given array is 6 (2+4).
// The remainder when 9 is divided by 6 is 3.
// Hence the output is Remainder: 3

// Example Input/Output 2:
// Input:
// 7
// 2 9 6 5 8 3 2

// Output:
// Remainder: 17

#include<stdio.h>
int getSumReminder(int arr[],int N)
{
    for(int i=0;i<N;i++)
    {
        if(arr[i]%2!=0)
            odd+=arr[i];
        else 
            even+=arr[i];
    }
    return (odd%even);
}
// int main()
// {
//     int N;
//     scanf("%d",&N);
//     int arr[N];
//     for(int index=0,index<N;index++)
//     {
//         scanf("%d",&arr[index]);
//     }
//     printf("Remainder: %d",getSumReminder(arr,N));
// }