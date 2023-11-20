// The program must accept a string S as the input. Some characters in the string S
// surrounded by anyone of the brackets (), [l and {l. The program must remove
// those brackets from the string S and print it as the output.

// Boundary Condition(s):
// 1 <= Length of S <=1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// Jac[k]po(t)

// Output:
// Jackpot

// Explanation:
// Here the string S is Jac[k]po(t)
// After removing the brackets [l and (), the string becomes Jackpot
// So Jackpot is printed as the output.

// Example Input/Output 2:
// Input:
// D(V)[O]{r}a[k]

// Output:
// Dvorak


import java.util.*;
public class Remove_Brackets
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        for(int i=0;i<s.length;i++)
            if(s[i]!='{'&&s[i]!='}'&&s[i]!='['&&s[i]!=']'&&s[i]!='('&&s[i]!=')')
                System.out.print(s[i]);
    }
}