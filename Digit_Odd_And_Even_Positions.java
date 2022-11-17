// The program must accept an integer N as the input. The program must print the digits which are present at the odd positions in N. Then the program must print the digits which are present at the even positions in N as the output.

// Boundary Condition(s);
// 10<= N <= 10^15

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the digits which are present at the odd positions in N separated by a space.
// The second line contains the digits which are present at the even positions in N separated by a space.

// Example Input/Output 1:
// Input:
// 32768

// Output:
// 3 7 8 
// 2 6

// Explanation:
// The digits which are present at the odd positions in 32768 are 3,7 and 8.
// The digits which are present at the even positions in 32768 are 2 and 6.
// Hence the output is
// 3 7 8
// 2 6

// Example Input/Output 2:
// Input:
// 102700

// Ouput:
// 1 2 0
// 0 7 0



import java.util.*;
public class Digit_Odd_And_Even_Positions
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            if(i%2==0)
                System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length();i++)
        {
            if(i%2==1)
                System.out.print(b[i]+" ");
        }
    }
}