// The program must accept N integers and an integer K as the input. The program
// must invert the sign of the last K integers among the N integers. Then the
// program must print the modified values of N integers as the output.
// Boundary Condition(s):
// 1 <= N <=1000
// 1 <= K <= N

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space(s).
// The third line contains K.

// Output Format:
// The first line contains the modified values of N integers separated by a space.

// Example Input/Output 1:
// Input:
// 5
// 20 40 56 -50 -40
// 3

// Output:
// 20 40 -56 50 40

// Explanation:
// The last three integers are 56 -50 and -40.
// Then invert the sign of those integers as -56 50 and 40.
// Hence the output is 20 40-56 50 40

// Example Input/Output 2:
// Input:
// 7
// 30 83 48 61 55 48 58
// 7

// Output:
// -30 -83 -48 -61 -55 -48 -58


import java.util.*;
public class Invert_Sign_Last_K_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] array=new int[a];
        for(int i=0;i<a;i++)array[i]=obj.nextInt();
        int c=obj.nextInt(),count=0,temp=0;
        for(int i=a-1;i>=0;i--)
        {
            if(count==c)
                break;
            else 
            {
                if(array[i]<0)
                {
                    temp=Math.abs(array[i]);
                    array[i]=temp;
                }
                else 
                {
                    temp=-array[i];
                    array[i]=temp;
                }
                count++;
            }
        }
        for(int i=0;i<a;i++)System.out.print(array[i]+" ");
    }
}