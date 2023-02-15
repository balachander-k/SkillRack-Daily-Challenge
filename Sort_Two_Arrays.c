// You must implement the function sortTwoArrays. The function accepts two integer arrays of size M and N. The funciton must sort the arrays in descending order and store the largest M integers of both arrays in the first array and the remaining N integers in the second array. The final values in the arrays must also be sorted in descending order.
// Note: Modify the arrays and do not print anything in the function.

// Example Input/Output 1:
// Input:
// 3 4
// 2 6 12
// 1 4 13 8

// Output:
// Array1: 13 12 8
// Array2: 6 4 2 1

// Explanation:
// The size of the array1 is 3 so the largest 3 integers are sorted in descending and stored in array1.
// The remaining integers are stored in array2 in desceding order.




void sortTwoArrays(int array1[],int M, int array2[],int N)
{
    int size=M+n,j=0,t=0,temp=0,y=0,g=0;
    int array3[size];
    for(int i=0;i<M;i++)
    {
        array3[j]=array1[i];
        j++;
    }
    for(int i=j;i<size;i++)
    {
        array3[i]=array2[t];
        t++;
    }
    for(int i=0;i<size;i++)
    {
        for(int q=i+1;q<size;q++)
        {
            if(array3[i]<array3[q])
            {
                temp=array3[i];
                array3[i]=array3[q];
                array3[q]=temp;
            }
        }
    }
    for(int i=0;i<M;i++)
    {
        array1[i]=array3[y];
        y++;
    }
    for(int i=y;i<size;i++)
    {
        array2[g]=array3[i];
        g++;
    }
}