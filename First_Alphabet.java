// The program must accept a string value S contains only alphabets as the input. The program must print an alphabet from S which has occurred first in the alphabetical order as the output. 
// Note: All alphabets are only lower-case in S.

// Boundary Condition(s);
// 1<= Length of S <= 100

// Input Format:
// The first line contains a string S.

// Output Format:
// The first line contains an alphabet from S which has occurred first in the alphabetical order.

// Example Input/Output 1:
// Input:
// qwerty

// Output:
// e

// Explanation:
// In  the word qwerty, the character 'e' has occurred first in the alphabetical order.
// Hence the output is e.

// Example Input/Output 2:
// Input:
// zxsvwu

// Output:
// s



import java.util.*;
public class First_Alphabet
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        Arrays.sort(b);
        System.out.print(b[0]);
    }
}