// The program must accept N integers and two integers X and Y as the input. The
// program must print the integers which are having exactly X digits and also
// divisible by Y among the N integers as the output. If there is no such integer, the
// program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <=100
// 1 <= Each integer value <= 10^8
// 1 <= Y <=100

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains X and Y separated by a space

// Output Format:
// The first line contains the integer value(s) or -1.

// Example Input/Output 1:
// Input:
// 5
// 657 12 10 87 66
// 23

// Output:
// 12 87 66

// Explanation:
// Here X=2 and Y=3.
// The integers which are having exactly 2 digits and also divisible by 3 are 12, 87
// and 66.
// Hence the output is 12 87 66

// Example Input/Output 2:
// Input:
// 4
// 2245 6845 3214 214
// 3 5

// Output:
// -1

import java.util.*;
public class Integer_Divisible_By_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        int x=obj.nextInt(),s=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            int len=(int)Math.log10(arr[i])+1;
            if(len==x && arr[i]%s==0)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        if(count==0)System.out.print("-1");
    }
}