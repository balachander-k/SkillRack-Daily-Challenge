// The program must accept a string P representing a password as the input. The password
// rules are given below.
// Rule 1: The password must have at least 8 characters.
// Rule 2: The password must have at least one upper case and one lower case alphabet.
// Rule 3: The password must have at least one digit.
// Rule 4: The password must have at least one special character.
// The program must print the output based on the following conditions.
// - If only Rule 1 is satisfied or none of the rules satisfied, print WEAK as the output.
// - If two rules (Rule 1 and any one rule from 2 to 4) are satisfied, print MEDIUM as the
// output.
// - If three rules (Rule 1 and any two rules from 2 to 4) are satisfied, print GOOD as the
// output.
// - If all four rules are satisfied, print STRONG as the output.

// Boundary Condition(s):
// 1 <= Length of P <= 100

// Input Format:
// The first line contains P.

// Output Format:
// The first line contains a string value based on the given conditions.

// Example Input/Output 1:
// Input:
// Qwerty@123

// Output:
// STRONG

// Explanation:
// Here the password Qwerty@123 satisfied all the four rules.
// So STRONG is printed as the output.

// Example Input/Output 2:
// Input:
// Q$la

// Output:
// WEAK

import java.util.*;
public class Password_Rules_And_Strength
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] p=obj.next().toCharArray();
        int passlength=(p.length>=8)?1:0;
        int lower=0,upper=0,digit=0,special=0;
        for(int i=0;i<p.length;i++)
        {
            if(Character.isAlphabetic(p[i]))
            {
                if(Character.isLowerCase(p[i]))
                    lower++;
                if(Character.isUpperCase(p[i]))
                    upper++;
            }
            else if(Character.isDigit(p[i]))
                digit++;
            else 
                special++;
        }
        if(passlength==1)
        {
            int c=0;
            if(upper!=0 && lower!=0)
                c+=1;
            if(digit!=0)
                c+=1;
            if(special!=0)
                c+=1;
            if(c==1)System.out.print("MEDIUM");
            if(c==2)System.out.print("GOOD");
            if(c==3)System.out.print("STRONG");
            if(c==0)System.out.print("WEAK");
        }
        else 
            System.out.print("WEAK");
    }
}