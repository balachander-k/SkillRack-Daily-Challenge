// The program must accept N integers and a nonzero digit D as the input The
// program must print the sum of integers starting with the digit D among the N
// integers as the output.

// Boundary Condition(s):
// 1 <= N < = 100
// 1 <= Each integer value <=10^7
// 1 <= D <= 9

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains D.

// Output Format:
// The first line contains the sum of integers starting with the digit D among the N
// integers.

// Example Input/Output 1:
// Input:
// 5
// 15 78 12 17 511
// 1

// Output:
// 44

// Explanation:
// Integers starting with the digit 1 are 15, 12 and 17. So their sum 44 is printed as
// the output.

// Example Input/Output 2:
// Input:
// 4
// 54 298 121 657
// 7

// Output:
// 0

import java.util.*;
public class Sum_Of_Integers_Starts_With_D 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),sum=0;
        String[] arr=new String[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=obj.next();
        char digit=obj.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            char[] val=arr[i].toCharArray();
            if(val[0]==digit)
                sum=sum+Integer.parseInt(arr[i]);
        }
        System.out.print(sum);
    }
}