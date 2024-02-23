// You must implement the function addWithPrevious(int arr[l, int N) which
// accepts an integer array arr and its size N as the input. The function must modify
// the integer array arr by replacing each integer X by adding with its previous
// integer. The first integer in the array arr has no integers on its left side, so it
// remains the same.

// Example Input/Output 1:
// Input:
// 5
// 10 20 30 40 50

// Output:
// Array. 10 30 50 70 90

// Explanation:
// The first integer in the array has no integers on its left side, so it remains the same.
// The previous integer of 20 is 10. So their sum 30 (20+10) is replaced.
// The previous integer of 30 is 20. So their sum 50 (30+20) is replaced.
// The previous integer of 40 is 30. So their sum 70 (40+30) is replaced.
// The previous integer of 50 is 40. So their sum 90 (50+40) is replaced.
// Now the array becomes 10 30 50 70 90.

// Example Input/Output 2:
// Input:
// 4
// 1234

// Output:
// Array: 1 3 5 7


// #include<stdio.h>
void addWithPrevious(int arr[],int N)
{
    int prev[N];
    for(int i=1;i<N;i++)
        prev[i]=arr[i-1];
    for(int i=1;i<N;i++)
        arr[i]+=prev[i];
}
// int main()
// {
//     int N;
//     scanf("%d",&N);
//     int arr[N];
//     for(int index=0;index<N;index++)
//     {
//         scanf("%d",&arr[index]);
//     }
//     addWithPrevious(arr,N);
//     printf("Array: ");
//     for(int index=0;index<N;index++)
//     {
//         printf("%d ",arr[index]);
//     }
//     return 0;
// }