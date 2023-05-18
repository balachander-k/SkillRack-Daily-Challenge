// The program must accept N integers as the input. The program must print the
// single digit integers among N integers and then print the two digit integers
// among N integers as the output. If there is no single digit integer then print -1
// and if there is no two digit integer then print -1 as the output.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Each integer value <= 9999

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains single digit integers separated by a space or -1.
// The second line contains two digit integers separated by a space or -1.

// Example Input/Output 1:
// Input:
// 8
// 23 4 78 7 989 73 65 654

// Output:
// 4 7
// 23 78 73 65


// Explanation:
// The single digit integers are 4 and 7. So they are printed in the first line.
// The two digits integers are 23 78 73 and 65. So they are printed in the second
// line.

// Example Input/Output 2:
// Input:
// 5
// 632 456 824 778 856

// Output:
// -1
// -1


import java.util.*;
public class Single_Integer_And_Two_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),single=0,two=0;
        String[] arr=new String[a];
        for(int i=0;i<a;i++)
            arr[i]=obj.next();
        for(int i=0;i<a;i++)
        {
            if(arr[i].length()==1)
            {
                System.out.print(arr[i]+" ");
                single++;
            }
            if(single!=0 && i==a-1)
                System.out.println();
        }
        if(single==0)
            System.out.println(-1);
        for(int i=0;i<a;i++)
        {
            if(arr[i].length()==2)
            {
                System.out.print(arr[i]+" ");
                two++;
            }
        }
        if(two==0)
            System.out.println(-1);
    }
}