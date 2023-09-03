// A string S and an integer P denoting the position of the starting character in S are
// passed as the input. The program must print the alternate characters in S starting
// from the position P.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 P < = Length of <= S

// Input Format:
// The first line contains S.
// The second line contains P.

// Output Format:
// The first line contains the alternate characters in S starting from the position P.

// Example Input/Output 1:
// Input:
// abcdefghijkl
// 4

// Output:
// dfhjl

// Explanation:
// The 4th character in the string abc efghijkl is
// So the alternate characters from the character d are printed as the output.

// Example Input/Output 2:
// Input:
// operations
// 3

// Output:
// eain

import java.util.*;
public class Alternate_Characters_From_P
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.next();
        int pos=obj.nextInt();
        for(int i=pos-1;i<s1.length();i=i+2)
            System.out.print(s1.charAt(i));
    }
}