// The program must accept two integers N and X as the input. The program must reverse the last X digits in N. Then the program must print the modified value of N as the output.

// Boundary Condition(s);
// 1<= N <=10^15
// 1<= X <=15

// Input Format:
// The first line contains the integer N.
// The second line contains the integer X.

// Output Format:
// The first line contains the modified value of N.

// Example Input/Output 1:
// Input:
// 12345
// 3

// Output:
// 12543

// Explanation:
// The last 3 digits in 12345 is 345.
// The reverse of 345 is 543.
// Hence the output is 12543

// Example Input/Output 2:
// 6745424
// 4
// Output
// 7644245



import java.util.*;
public class Reverse_Last_X_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.next().toCharArray();
        int b=obj.nextInt();
        String temp="";
        int count=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(count==b)
                break;
            else 
                temp=temp+a[i];
            count++;
        }
        for(int i=0;i<a.length-b;i++)
            System.out.print(a[i]);
        System.out.print(temp);
    }
}