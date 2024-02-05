// You must implement the function getArrayOfRightSmaIlerCount(int arr[l, int N)
// which accepts an integer array arr and its size N as the input. The function must
// form a new integer array of size N and fill the values based on the following
// conditions.

// - For each integer X in the array arr, the function must count the integers C which
// are on the right side of X and smaller than X. Then the function must store the
// count C in the corresponding position of the new integer array.
// - The last integer in array arr does not have any integers on its right side, so O will
// be stored in the last position of the new array.
// Finally, the function must return the new integer array.

// Example Input/Output 1:
// Input:
// 5
// 10 7 6 3 9

// Output:
// Array: 4 2 1 O O

// Explanation:
// The integers present on the right side of the integer 10 are 7, 6, 3 and 9. Here the
// integers 7, 6, 3 and 9 are less than 10. So the count is 4.
// The integers present on the right side of the integer 7 are 6, 3 and 9. Here the
// integers 6 and 3 are less than 7. So the count is 2.
// The integers present on the right side of the integer 6 are 3 and 9. Here the
// integer 3 is less than 9. So the count is 1.
// The integer present on the right side of the integer 3 is 9. Here the integer 9 is not
// less than 3. So the count is O.
// There are no integers present on the right side of the integer 9. So the count is O.

// Example Input/Output 2:
// Input:
// 7
// 2 19 7 10 5 15 4

// Output:
// Array: 0 5 2 2 1 1 0


#include<stdio.h>
int *getArrayOfRightSmallerCount(int arr[],int N)
{
    for(int i=0;i<N-1;i++)
    {
        int count=0;
        for(int j=0;j<N;j++)
            if(arr[j]<arr[i])
                count++;
        arr[i]=count;
    }
    arr[N-1]=0;
    return arr;
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
//     int *newArr=getArrayOfRightSmallerCount(arr,N);
//     printf("Array: ");
//     for(int index=0;index<N;index++)
//     {
//         printf("%d ",newArr[index]);
//     }
//     return 0;
// }