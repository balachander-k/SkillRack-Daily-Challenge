// The program must accept N alphabets as the input. The program must print the
// alphabet position of each alphabet in reverse order as the output.
// Boundary Condition(s):
// 1 <= N <= 10^5
// Input Format:
// The first line contains the integer N.
// The second line contains N characters separated by space(s).
// Output Format:
// The first line contains the alphabet position of N alphabets in the reverse order.

// Example Input/Output 1:
// Input:
// 5
// j a e E b

// Output:
// 2 5 5 1 10

// Explanation:
// The alphabet position of j is 10 in the alphabetical order.
// The alphabet position ofa is 1 in the alphabetical order.
// The alphabet position of e is 5 in the alphabetical order.
// The alphabet position of E is 5 in the alphabetical order.
// The alphabet position of b is 2 in the alphabetical order.
// In the reverse order, the alphabets position are 2 5 5 1 IO
// Hence the output is 2 5 5 1 10

// Example Input/Output 2:
// Input:
// 4
// L f V d 

// Output:
// 4 22 6 12

import java.util.*;
public class Alphabets_Position_Reversed
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            char val=obj.next().charAt(0);
            char ch=Character.toLowerCase(val);
            arr[i]=(int)ch-96;
        }
        for(int i=size-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}