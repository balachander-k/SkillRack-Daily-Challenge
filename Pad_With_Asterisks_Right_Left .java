// Two string values Sl and S2 are passed as input to the program. The program
// must pad Sl with asterisks on the right (when the length of S2 is greater than the
// length of Sl) and must pad S2 with asterisks on the left (when the length of Sl is
// greater than the length of S2).

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains a string based on the given conditions.
// The second line contains a string based on the given conditions.

// Example Input/Output 1:
// Input:
// lemon
// rainbowcolor

// Output:
// lemon******
// rainbowcolor

// Explanation:
// The length of the string lemon is 5.
// The length of the string rainbowcolor is 12.
// Here the length of S2 is greater than the length of Sl.
// So the string lemon is padded with asterisks on the right side.
// Hence the output is
// lemon******
// rainbowcolor

// Example Input/Output 2:
// Input:
// maintain
// pen

// Output:
// maintain
// *****pen

import java.util.*;
public class Pad_With_Asterisks_Right_Left
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.next(),s2=obj.next();
        int j=0;
        if(s1.length()>s2.length())
        {
            int len=Math.abs(s1.length()-s2.length());
            System.out.println(s1);
            for(int i=0;i<s1.length();i++)
            {
                if(i<len)
                    System.out.print("*");
                else 
                {
                    System.out.print(s2.charAt(j));
                    j++;
                }
            }
        }
        else 
        {
            for(int i=0;i<s2.length();i++)
            {
                try {
                    System.out.print(s1.charAt(i));
                } catch(Exception e) {
                    System.out.print("*");
                }
            }
            System.out.print("\n"+s2);
        }
    }
}