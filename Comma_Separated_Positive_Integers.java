// The program must accept N integers separated by a comma as the input. The program
// must print the positive integers separated by a comma among the N integers as the output.
// If there is no positive integer then the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <=100
// -999 <= Each integer value <= 999

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a comma.

// Output Format:
// The first line contains either the positive integers separated by a comma or -1.

// Example Input/Output 1:
// Input:
// 5
// 12,-10,78,-5,-99

// Output:
// 12,78

// Explanation:
// The positive integers are 12 and 78. So they are separated by a comma and printed as the
// output.

// Example Input/Output 2:
// Input:
// 6
// -41,-93,-91,-54,-59,-88

// Output:
// -1

import java.util.*;
public class Comma_Separated_Positive_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),count=0;
        String b=obj.next(),val="";
        String[] c=b.split(",");
        for(int i=0;i<c.length;i++)
        {
            int d=Integer.parseInt(c[i]);
            if(d>0)
            {
                val=val+String.valueOf(d)+",";
                count++;
            }
        }
        if(count==0)System.out.print("-1");
        else 
        {
            String[] f=val.split(",");
            for(int i=0;i<f.length;i++)
            {
                System.out.print(f[i]);
                if(i!=f.length-1)
                    System.out.print(",");
            }
        }
    }
}