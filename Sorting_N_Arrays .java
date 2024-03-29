// The program must accept the values for N integer arrays. The program must print the integers
// in all these N integer arrays in ascending order as the output.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Size of each integer array <= 50
// 1 <= Each integer value <= IO^5

// Input Format:
// The first line contains the integer N.
// The second line contains N integer values representing the size of each integer array separated
// by space(s).
// The next N+2 lines contain the values in the integer arrays (with the values separated by a
// space).

// Output Format:
// The first line contains all the integers in these N integer arrays in the ascending order
// separated by a space.

// Example Input/Output l:
// Input:
// 4
// 5 3 10 2
// 12 74 67 59 89
// 35 47 63
// 19 86 41 13 85 23 54 75 76 15
// 56 98

// Output:
// 12 13 15 19 23 35 41 47 54 56 59 63 67 74 75 76 85 86 89 98

// Explanation:
// There are 4 integer arrays of size 5, 3, 10 and 2.
// The first integer array integers are 12, 74, 67, 59 and 89.
// The second integer array integers are 35, 47 and 63.
// The third integer array integers are 19, 86, 41, 13, 85, 23, 54, 75, 76 and 15.
// The fourth integer array integers are is 56 and 98.
// Then these values are sorted in ascending order as
// 12, 13, 15, 19, 23, 35, 41, 47, 54, 56, 59, 63, 67, 74, 75, 76, 85, 86, 89 and 98.
// Hence the ouput is
// 12 13 15 19 23 35 41 47 54 56 59 63 67 74 75 76 85 86 89 98

// Example Input/Output 2:
// Input:
// 5
// 2 3 7 6 8
// 23 47
// 93 28 54
// 41 34 49 88 85 72 76
// 27 60 95 96 50 5
// 69 96 88 83 81 42 21 18

// Output:
// 5 18 21 23 27 28 34 41 42 47 49 50 54 60 69 72 76 81 83 85 88 88 93 95 96 96


import java.util.*;
public class Sorting_N_Arrays 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),sum=0;
        int[] size=new int[a];
        for(int i=0;i<a;i++)size[i]=obj.nextInt();
        for(int i=0;i<a;i++)sum=sum+size[i];
        int[] array=new int[sum];
        for(int i=0;i<sum;i++)array[i]=obj.nextInt();
        Arrays.sort(array);
        for(int i=0;i<sum;i++)System.out.print(array[i]+" ");
        
    }
}