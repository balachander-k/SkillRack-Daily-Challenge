// The program must accept an integer N as the input. The program must form a string S
// based on the following conditions.

// - Initially, the string S will be empty.
// - The program find the remainder R when N is divided by 26 and then the program must
// append the (R+l)th upper case alphabet in the English alphabet set to the string S. Then the
// program must replace the value of N with the quotient when N is divided by 26.
// - The program must repeat the above above process untill N becomes O.
// Finally, the program must print the reverse of S as the output.

// Boundary Condition(s):
// 1 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the reverse of the string S.

// Example Input/Output 1:
// Input:
// 58

// Output:
// CG

// Explanation:
// Here N = 58.
// Iteration 1: R = 58 % 26 = 6. So the 7 upper case alphabet is G.
// Now N becomes 2 (58 / 26).
// Iteration 2: R = 2 % 26 = 2. So the 3 upper case alphabet is C.
// Now N becomes O (2 / 26).
// The string S becomes GC.
// So the reverse of S is printed as the output.

// Example Input/Output 2:
// Input:
// 1000

// Output:
// BMM

// Explanation:
// Here N = 1000.
// Iteration 1: R = 1000 % 26 = 12. So the 13th upper case alphabet is M.
// Now N becomes 38 (1000 / 26).
// Iteration 2: R = 38 % 26 = 12. So the 13 upper case alphabet is M.
// Now N becomes 1 (38 / 26).
// Iteration 3: R = 1 % 26 = 1. So the 2 upper case alphabet is B.
// Now N becomes O (1 / 26).
// The string S becomes MMB.
// So the reverse of S is printed as the output.

import java.util.*;
public class Convert_Integer_TO_Alphabet 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        String s="";
        while(N!=0)
        {
            int rem=N%26;
            char ch=(char)(rem+'A');
            s=ch+s;
            N/=26;
        }
        System.out.print(s);
    }
}