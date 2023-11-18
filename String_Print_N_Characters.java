// The program must accept an integer N as the input. The program must print N
// characters from the string "abcd" circularly in the clockwise direction as the
// output.

// Boundary Condition(s):
// 1 <= N <=10^5

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains a string denoting the N characters.

// Example Input/Output 1:
// Input:
// 5

// Output:
// abcda

// Explanation:
// Here N=5.
// So 5 characters from the string "abcd" are printed circularly in the clockwise
// direction.
// Hence the output is abcda

// Example Input/Output 2:
// Input:
// 10

// Output:
// abcdabcdab


import java.util.*;
public class String_Print_N_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),count=0;
        char t='a';
        for(int i=1;i<=n;i++)
        {
            if(count>=4)
            {
                t='a';
                count=0;
            }
            System.out.print(t++);
            count++;
        }
    }
}