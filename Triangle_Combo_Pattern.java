// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// coding

// Output:
// ggggggc
// nnnnnoo
// iiiiddd
// dddiiii
// oonnnnn
// cgggggg


// Example Input/Output 2:
// Input:
// SKILL

// Output:
// LLLLLS
// LLLLKK
// IIIIII
// KKLLLL
// SLLLLL

import java.util.*;
public class Triangle_Combo_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        int rev=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
                System.out.print(a.charAt(i));
            for(int j=0;j<=rev;j++)
                System.out.print(a.charAt(rev));
            rev++;
            System.out.println();
        }
    }
}