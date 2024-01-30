// The program must accept two string values Sl and S2 as the input. The program
// must print the number of characters in the string Sl that are not present in the
// string S2 as the output.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains the number of characters in the string Sl that are not
// present in the string S2.

// Example Input/Output 1:
// Input:
// skillrack
// rockstar

// Output:
// 4

// Explanation:
// The four characters in the string skillrack that are not present in the string
// rockstar are i, l, I and k

// Example Input/Output 2:
// Input:
// SolarSystem
// satellite

// Output:
// 6

// Explanation:
// The six characters in the string SolarSystem that are not present in the string
// satellite are S, o, r, S, y and m.


import java.util.*;
public class Characters_Not_In_S2 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s1=obj.next().toCharArray();
        char[] s2=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i]==s2[j])
                {
                    s1[i]='0';
                    s2[j]='0';
                }
            }
        }
        for(int i=0;i<s1.length;i++)
            if(s1[i]!='0')
                count++;
        System.out.print(count);
    }
}