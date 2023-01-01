// The program must accept an integer N as the input. The program must replace each digit D by repeating it for D times. Finally, the program must print the modified value of N as the output.
// If the digit is 0 then the digit is not printed.

// Boundary Condition(s);
// 1<= N <=10^8

// Input Format:
// The first line contains the value of N.

// Ouptut Format:
// The first line contains the modified value of N.

// Example Input/Output 1:
// Input:
// 253

// Output:
// 2255555333

// Explanation:
// The first digit is 2.So replace the digit 2 by  repeating it for 2 times.
// The second digit is 5. So replace the digit 5 by repeating it for 5 times.
// The third digit is 3. So replace the digit 3 by repeating it for 3 times.
// Hence the output  is 2255555333

// Example Input/Output 2:
// Input:
// 9012

// Output:
// 999999999122



import java.util.*;
public class Expand_Number 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] c=a.toCharArray();
        int val=0;
        for(int i=0;i<a.length();i++)
        {
            val=Integer.parseInt(String.valueOf(c[i]));
            for(int j=0;j<val;j++)
            {
                System.out.print(val);
            }
        }
    }
}