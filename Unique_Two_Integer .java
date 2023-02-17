// The program must accept N integers as the input. The program must print yes as the output
// if every two integers are unique. Else the program must print no as the output.
// Note: N is always even.

// Boundary Condition(s):
// 1 N 1000
// 1 <= Each integer value <= IOA8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space.

// Output Format:
// The first line contains yes or no

// Example Input/Output 1:
// Input
// 4
// 39 622 64 39

// Output:
// yes

// Explanation:
// The integers 39 and 622 are unique.
// The integers 64 and 39 are also unique.
// So the output is yes.

// Example Input/Output 2:
// Input:
// 6
// 12 65 23 1445 45

// Output:
// no

// Explanation:
// The last two integers 45 and 45 are not unique so no is printed.


import java.util.*;
public class Unique_Two_Integer 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),count=0,len=a/2;
        for(int i=0;i<len;i++)
        {
            int b=obj.nextInt();
            int c=obj.nextInt();
            if(b==c)count++;
        }
        if(count==0)System.out.print("yes");
        else System.out.print("no");
    }
}