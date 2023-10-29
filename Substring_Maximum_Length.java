// The program must accept two string values Sl and S2 are of equal length as the
// input. The program must print the common substring which is having the
// maximum length and occurring at the same position in both string values. If there
// is more than one such substring then print the first occurring one as the output.
// Note: At least one character is always present at the same position in both string
// values.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 1000

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains the common substring which is having the maximum length
// and occurring at the same position in both string values.

// Example Input/Output 1:
// Input:
// skillrack
// SkillRack

// Output:
// kill

// Explanation:
// There are two substrings kill and ack occurring at the same position in both string
// values.
// Here the substring kill is having the maximum length. So kill is printed as the
// output.

// Example Input/Output 2:
// Input:
// abcxxyzmn
// abdxyzkmn

// Output:
// ab


import java.util.*;
public class Substring_Maximum_Length 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        char[] s1=obj.next().toCharArray();
        char[] s2=obj.next().toCharArray();
        String con="";
        int in=0,max=0;
        
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]==s2[i])
                con=con+s1[i];
            else 
            {
                if(!con.equals(""))
                {
                    list.add(con);
                    con="";
                }
            }
        }
        if(!con.equals(""))
            list.add(con);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).length()>max)
            {
                max=list.get(i).length();
                in=i;
            }
        }
        System.out.print(list.get(in));
    }
}