// The program must accept a string S and two integers R, N as the input. The string S always
// contains Os and Is. The program must expand the string S based on the first R characters.
// - If the character is O, the program must insert 1 after O (O -> 01).
// - If the character is 1, the program must insert O after 1 (1 -> 10).
// Finally, the program must print the N character in the modified string S.

// Note: At least N characters are always present in the modified string S.
// Boundary Condition(s):

// 1 <= R <= Length of S <= 100
// 1 <= N <= 200

// Input Format:
// The first line contains S.
// The second line contains R and N separated by a space.

// Output Format:
// The first line contains the Nth character in the modified string S.

// Example Input/Output 1:
// Input:
// 101
// 2 3

// Output:
// 0

// Explanation:
// Here R = 2 and N = 3.
// The first character is 1, so 0 is inserted after 1.
// The second character is O, so 1 is inserted after O.
// Now the string becomes 10011.
// The 3rd character in the above string is O, which is printed as the output.

// Example Input/Output 2:
// Input
// 11
// 1 3
// Output:
// 1

// Example Input/Output 3:
// Input
// 11011
// 5 10

// Output:
// 0


import java.util.*;
public class Nth_Character_Binary_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int r=obj.nextInt(),n=obj.nextInt();
        String val="";
        for(int i=0;i<s.length;i++)
        {
            val+=s[i];
            if(i<r)
            {
                if(s[i]=='0')
                    val+="1";
                else 
                    val+="0";
            }
        }
        System.out.print(val.charAt(n-1));
    }
}