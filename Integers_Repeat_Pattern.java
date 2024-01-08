// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <= 100

// Input Format:
// The first line contains N.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3

// Output:
// 3333
// 4414
// 5525
// 6636
// 3333

// Example Input/Output 2:
// Input:
// 4

// Output:
// 44444
// 55515
// 66626
// 77737
// 88848
// 44444

import java.util.*;
public class Integers_Repeat_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=N+1;
        String r=String.valueOf(N);
        System.out.println(r.repeat(N+1));
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=N+1;j++)
            {
                if(j!=N)
                    System.out.print(t);
                else 
                    System.out.print(i);
            }
            t++;
            System.out.println();
        }
        System.out.println(r.repeat(N+1));
    }
}