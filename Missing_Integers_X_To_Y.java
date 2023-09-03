// There is a sequence of integers containing the integers from X to Y. The program
// must accept N integers from the sequence (where X and Y are always present) as
// the input. The program must print the number of missing integers in the sequence
// as the output.

// Note: N is always less than or equal to total number of integers from X to Y.

// Boundary Condition(s):
// 2<= N < = 1O^4
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the number of missing integers.

// Example Input/Output 1:
// Input:
// 5
// 4 5 6 10 11

// Output:
// 3

// Explanation:
// Here the sequence of integers containing the integers from 4 to 11 is 4 5 6 7 8 9
// 10 11.
// So there are three missing integers 7, 8 and 9.
// Hence the output is 3

// Example Input/Output 2:
// Input:
// 4
// 10 13 12 8

// Output:
// 2

// Explanation:
// Here the sequence of integers containing the integers from 8 to 13 is 8 9 10 11
// 12 13.
// So there are two missing integers 9 and 11.
// Hence the output is 2

// Example Input/Output 3:
// Input:
// 5
// 7 5 6 4 8

// Output:
// 0

import java.util.*;
public class Missing_Integers_X_To_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0,j=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        Arrays.sort(arr);
        for(int i=arr[0];i<=arr[size-1];i++)
        {
            if(arr[j]==i)
                j++;
            else 
                count++;
        }
        System.out.print(count);
    }
}