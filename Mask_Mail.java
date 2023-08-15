// A string S representing the email of a user is passed as the input. The program
// must secure the email by masking vowels and digits with asterisk * and print the
// resulting masked string value M as the output.

// Boundary Condition(s):
// 5 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains M.

// Example Input/Output 1:
// Input:
// your5name_007@gmail.com

// Output:
// y**r*n*m*_***@gm**l.c*m

// Example Input/Output 2:
// Input:
// AS34DFq65werx7cm0v@red@rediffmail.com

// Output:
// *S**DFq**w*rx*cm*v@r*d@r*d*ffm**l.c*m

import java.util.*;
public class Mask_Mail
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        for(int i=0;i<a.length();i++)
            System.out.print((isVowel(a.charAt(i))) || (Character.isDigit(a.charAt(i)))?"*":a.charAt(i));
            
    }
}