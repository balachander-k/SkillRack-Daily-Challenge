// The program must accept two string values Sl and S2 as the input. The program
// must trim the longer string to the length of the shorter string by removing the
// characters at the end of the longer string. Then the program must print the
// modified string values as the output. If both the string values have the same
// length, the program must print the given two string values as they are.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl and S2 separated by a space.

// Output Format:
// The first line contains the modified string values separated by a space.

// Example Input/Output 1:
// Input:
// Skill Rack

// Output:
// Skil Rack

// Explanation:
// The length of the string Skill is 5.
// The length of the string Rack is 4.
// Here the string Rack is shorter, so the string Skill is trimmed to the first 4
// characters.
// Hence the output is Skil Rack

// Example Input/Output 2:
// Input:
// boy w#TeR

// Output:
// bOy w#T


import java.util.*;
public class Trim_String_To_Shorter_Length
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.next(),s2=obj.next();
        if(s1.length()>s2.length())
            s1=s1.substring(0,s2.length());
        else if(s2.length()>s1.length())
            s2=s2.substring(0,s1.length());
        System.out.print(s1+" "+s2);
    }
}