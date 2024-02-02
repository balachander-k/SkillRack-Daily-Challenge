// You must implement the function concatenateDigitsWithTraiIingZeros(int arr[],
// int N) which accepts an integer array arr and its size N as the input. The function
// must form a new integer K by concatenating all the non zero integers in the order
// of their occurrence in the array arr. Then the function must concatenate all the
// zeros at the end of the new integer K. Finally, the function must return the new
// integer K.

// Boundary Condition(s):
// 1 <= N <=18
// 0 <= Each integer value <= 9

// Example Input/Output 1:
// Input:
// 4
// 6 7 0 2

// Output:
// Integer: 6720

// Explanation:
// After concatenating the non zero integers 6, 7 and 2, 672 is formed.
// After concatenating the only zero at the end of 672, 6720 is formed.

// Example Input/Output 2:
// Input:
// 6
// 5 2 0 3 0 0

// Output:
// Integer: 523000



#include <stdio.h>

int concatenateDigitsWithTrailingZeros(int arr[], int N) {
    int result = 0;
    int zeroCount = 0;

    for (int i = 0; i < N; i++) {
        if (arr[i] != 0) {
            result = result * 10 + arr[i];
        } else {
            zeroCount++;
        }
    }
    
    for (int i = 0; i < zeroCount; i++) {
        result = result * 10;
    }

    return result;
}

int main() {
    int N;

    printf("Enter the size of the array: ");
    scanf("%d", &N);
    int arr[N];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    int result = concatenateDigitsWithTrailingZeros(arr, N);
    printf("Integer: %d\n", result);

    return 0;
}