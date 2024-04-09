// You must implement the function multiplesToBeginning(int arr[], int N) which
// accepts an integer array arr and its size N as the input. The function must modify
// the array arr by moving all the multiples of 10 to the beginning of the array arr.
// Note: The header files and main function are already defined.

// Example Input/Output 1:
// Input:
// 5
// 10 85 41 50 30

// Output:
// Array. 10 50 30 85 41

// Explanation:
// In the given 5 integers, the multiples of 10 are 10, 50 and 30.
// After moving the 3 integers to the beginning of the array, the integers become
// 10 50 30 85 41.
// Hence the output is
// Array. 10 50 30 85 41

// Example Input/Output 2:
// Input:
// 4
// 48 87 15 6

// Output:
// Array. 48 87 15 6

// #include <stdio.h>
void multiplesToBeginning(int arr[], int N) 
{
    int temp[N],sub[N],h=0,w=0,q=0;
    for(int i=0;i<N;i++)
    {
        if(arr[i]%10==0)
        {
            temp[h++]=arr[i];
            arr[i]=-1;
        }
    }
    for(int i=0;i<N;i++)if(arr[i]!=-1)sub[w++]=arr[i];
    for(int i=0;i<h;i++)
        arr[i]=temp[i];
    for(int j=h;j<N;j++)
        arr[j]=sub[q++];
}

// int main() {
//     int N;
//     scanf("%d", &N);
//     int arr[N];
//     for (int i = 0; i < N; i++) {
//         scanf("%d", &arr[i]);
//     }
//     multiplesToBeginning(arr, N);
//     printf("Array. ");
//     for (int i = 0; i < N; i++) {
//         printf("%d ", arr[i]);
//     }
//     return 0;
// }