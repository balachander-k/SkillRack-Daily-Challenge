// The program must accept N integers and an integer X as the input. The program
// must print the sum of all the integers which are not having X digits as the output. If
// there is no such integer then the program must print -1 as the output.
// Boundary Condition(s):

// 1 <= N <=1000
// 1 <= Each integer value <= IO^8

// Input Format:
// The first line contains the values Of N and X separated by a space.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains either the sum of all the integers which are not having X digits
// or -1

// Example Input/Output 1:
// Input:
// 53
// 10 525 6 1080 720

// Output:
// 1096

// Explanation:
// The integers which are not having 3 digits are 10, 6 and 1080.
// so their sum is 1096 (10 + 6 + 1080).
// Hence the output is 1096

// Example Input/Output 2:
// Input:
// 62
// 12 45 78 56 32 80

// Output:
// -1

import java.util.*;
public class Sum_Of_Integers_Not_With_X_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),b=obj.nextLong(),count=0,sum=0;
        for(long i=0;i<a;i++)
        {
            String c=obj.next();
            if(c.length()!=b)
            {
                count++;
                sum=sum+Long.parseLong(c);
            }
        }
        if(count==0)System.out.print("-1");
        else System.out.print(sum);
    }
}