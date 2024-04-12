// The program must accept an integer N as the input. The program must print YES if
// the following conditions are true.
// - If the first digit of the integer N represents the number of zeros in the integer N.
// - If the second digit of the integer N represents the number of ones in the integer
// N.
// If any of the condition is false, the program must print NO as the output.

// Boundary Condition(s):
// 100 < = N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 21400

// Output:
// YES

// Explanation:
// The first digit of the integer 21400 represents the number of zeros in the integer
// 21400.
// The second digit of the integer 21400 represents the number of ones in the
// integer 21400.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 11110

// Output:
// NO



import java.util.*;
public class Number_Of_Zeros_Ones 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        int f=Integer.valueOf(N[0])-'0',s=Integer.valueOf(N[1])-'0',z=0,fi=0;
        for(int i=0;i<N.length;i++)
            if(N[i]=='0')z++;
        for(int j=0;j<N.length;j++)
            if(N[j]=='1')fi++;
        System.out.print((z==f && fi==s)?"YES":"NO");
    }
}