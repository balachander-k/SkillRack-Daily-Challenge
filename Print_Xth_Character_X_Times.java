// The program must accept a string S and an integer X as the input. The program
// must replace the character in S by repeating it X times. Then the program must
// print the modified string S as the output.

// Boundary Condition(s):
// 1 X <= Length of S <= 1000

// Input Format:
// The first line contains S.
// The second line contains X.

// Output Format:
// The first line contains the modified S.

// Example Input/Output 1:
// Input:
// skillrack
// 5

// Output:
// skilllllrack

// Explanation:
// The 5th character in string skillrack is I. So I is replaced by repeating it five times.

// Example Input/Output 2:
// Input:
// Environment
// 4

// Output:
// Enviiiironment


import java.util.*;
public class Print_Xth_Character_X_Times
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int x=obj.nextInt();
        for(int i=0;i<s.length();i++)
        {
            if(x-1==i)
            {
                String r=String.valueOf(s.charAt(i));
                System.out.print(r.repeat(x-1));
            }
            System.out.print(s.charAt(i));
        }
    }
}