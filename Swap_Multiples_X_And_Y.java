// The program must accept N integers and two integers X and Y as the input. The
// program must swap the first occurring mutiple of X and the last occurring multiple
// of Y among the N integers. Then the program must print modified values of the N
// integers as the output.

// Note:
// At least one multiple of X and Y are always present in the N integers.

// Boundary Condition(s):
// 2 <= N <=100
// 1 <= x, Y <=100
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains the value of N.
// The second line contains the value of N integers separated by space(s).
// The third line contains the value of X and Y separated by space(s).

// Output Format:
// The first line contains the modified value of N integers as per the conditions.

// Example Input/Output 1:
// Input:
// 10
// 13 28 76 34 86 77 18 92 57 10
// 7 11

// Output:
// 13 77 76 34 86 28 18 92 57 10

// Example Input/Output 2:
// Input:
// 7
// 234 435 75 2345 6 435 875
// 55

// Output:
// 234 875 75 2345 6 435 435

import java.util.*;
public class Swap_Multiples_X_And_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),c=0,d=0,in1=0,in2=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        int first=obj.nextInt(),last=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]%first==0 && c==0)
            {
                in1=i;
                c++;
            }
        }
        for(int i=size-1;i>=0;i--)
        {
            if(arr[i]%last==0 && d==0)
            {
                in2=i;
                d++;
            }
        }
        for(int i=0;i<size;i++)
        {
            if(i==in1)
                System.out.print(arr[in2]+" ");
            else if(i==in2)
                System.out.print(arr[in1]+" ");
            else 
                System.out.print(arr[i]+" ");
        }
    }
}