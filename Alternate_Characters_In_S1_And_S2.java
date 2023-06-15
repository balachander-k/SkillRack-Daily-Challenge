// The program must accept two string values Sl and S2 as the input. The program
// must print the first character in Sl, then the program must print the second
// character in S2, then the program must print the third character in Sl, then the
// program must print the fourth character in S2 and so on.

// Note: Both the string values are always having the same length.
// Boundary Condition(s):
// 1 <= Length of Sl and S2 <= 100

// Input Format:
// The first line contains the string Sl.
// The second line contains the string S2.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// lemon
// apple

// Output:
// lpmln

// Explanation:
// The first character in the sting lemon is l.
// The second character in the sting apple is p.
// The third character in the sting lemon is m.
// The fourth character in the string apple is I.
// The fifth character in the string lemon is n.
// Hence the output is lpmln

// Example Input/Output 2:
// Input:
// copy
// past

// Output:
// capt

import java.util.*;
public class Alternate_Characters_In_S1_And_S2
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),b=obj.next();
        for(int i=0;i<a.length();i++)
            System.out.print((i%2==0)?a.charAt(i):b.charAt(i));
    }
}