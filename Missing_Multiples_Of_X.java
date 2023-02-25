// The program must accept two positive integers X and N. Then the program must accept N-1
// values which are multiples Of X in sequence With just one multiple M missing in the sequence.
// The program must then print the missing multiple M.
// Note: The first multiple (among these N multiples) will always be present.

// Boundary Condition(s):
// 1 <= x <= IO^5
// 1 <= N <= 100

// Input Format:
// The first line contains X and N separated by a space.
// The second line contains N-1 positive integer values.

// Output Format:
// The first line contains the missing multiple M.

// Example Input/Output I:
// Input:
// 2 10
// 12 14 16 20 22 24 26 28 30

// Output:
// 18
// Explanation:
// Here X=2 and N=IO. So the 10 multiples of 2 starting from 12 must be 12 14 16 18 20 22 24 26
// 28 30.
// As 18 is missing. it is printed as the output.


import java.util.*;
public class Missing_Multiples_Of_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),first=0;
        int[] array=new int[a];
        for(int i=0;i<b;i++)
        {
            try{
                array[i]=obj.nextInt();
            }
            catch(Exception e)
            {
                continue;
            }
        }
        first=array[0];
        for(int i=0;i<b;i++)
        {
            if(array[i]!=first)
            {
                System.out.print(first);
                break;
            }
            first=first+a;
        }
    }
}