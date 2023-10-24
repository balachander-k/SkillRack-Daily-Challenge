// The program must accept N integers as the input. The program must remove the
// tenth digit of all the N integers. Then the program must print the sum of N
// modified integers as the output.

// Boundary Condition(s):
// 1 <=N < = 100
// 10 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the sum of N modified integers.

// Example Input/Output 1:
// Input:
// 4
// 180 212 5295 5001

// Output:
// 1058

// Explanation:
// After removing the tenth digit of all the four integers, the integer values become
// 10 22 525 501.
// so the sum is 1058 (10+22+525+501).
// Hence the output is 1058

// Example Input/Output 2:
// Input:
// 7
// 4483 61 141 79 814 4937 3174

// Output:
// 1359


import java.util.*;
public class Sum_Remove_Tenth_Digit 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),sum=0;
        for(int i=0;i<n;i++)
        {
            char[] temp=obj.next().toCharArray();
            String con="";
            for(int j=0;j<temp.length;j++)
                if(j!=temp.length-2)
                    con=con+temp[j];
            sum=sum+Integer.valueOf(con);
        }
        System.out.print(sum);
    }
}