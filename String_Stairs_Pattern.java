// The program must accept a string S containing only alphabets as the input. The
// must print the string S for (L*2)-1 times (where L is the length of the string S) bé
// following conditions.
// - In line 1, the program must print L-1 hyphens and the first alphabet in S.
// - In line 2, the program must print L-2 hyphens and the first two alphabets in S.
// - Similarly, the program prints the first L lines as the output.
// - In line L+l, the program must print the string S except the first alphabet.
// - In line L+2, the program must print the string S except the first two alphabets.
// - Similarly, the program prints the remaining lines as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first (L*2)-1 lines containing the string values based on the given conditions

// Example Input/Output 1:
// Input:
// receiving

// Output:
// -------re
// ------rec
// -----rece
// ----recei
// ---receiv
// --receivi
// -receivin
// receiving
// eceivinq
// ceiving
// eiving
// iving
// ving
// ing
// ng
// g

// Explanation:
// The length of the given string receiving is 9. So the pattern contains (9*2)-1 lines.
// In line 1, 8 hyphens and the first alphabet in S are printed.
// In line 2, 7 hyphens and the first two alphabets in S are printed.
// In line 3, 6 hyphens and the first three alphabets in S are printed.
// Similarly, the first 9 lines are printed.
// -----re
// ------rec
// -----rece
// ----recei
// ---receiv
// --receivi
// -receivin
// receiving
// In line IO, the string S is printed except the first alphabet.
// In line 11, the string S is printed except the first two alphabets.
// In line 12, the string S is printed except the first three alphabets.
// Similarly, the remaining lines are printed.
// eceivi ng
// ceiving
// eiving
// iving
// ving
// ing 
// ng 
// g

// Example Input/Output 2:
// Input
// ZERO

// Output:
// --ZE
// -ZER
// ZERO
// ERO
// RO
// o

// Example Input/Output 3:
// Input
// KeyBoard

// Output:
// -----Key
// ----KeyB
// -KeyBo
// --KeyBoa
// -KeyBoar
// KeyBoard
// eyBoard
// yBoard
// Board
// oard
// ard
// rd
// d

import java.util.*;
public class String_Stairs_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int hypen=s.length-1;
        for(int i=1;i<=s.length;i++)
        {
            for(int j=hypen;j>0;j--)
                System.out.print("-");
            for(int j=0;j<i;j++)
                System.out.print(s[j]);
            hypen--;
            System.out.println();
        }
        for(int i=1;i<s.length;i++)
        {
            for(int j=i;j<s.length;j++)
                System.out.print(s[j]);
            System.out.println();
        }
    }
}