// The program must accept a string S as the input. The program must arrange the
// vowels in the string S in sorted order. Finally, the program must print the modified
// string S as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// skallrick

// Explanation:
// After arranging the vowels in the string skillrack in sorted order, the string
// becomes skallrick.
// Hence the output is skallrick

// Example Input/Output 2:
// Input:
// PROGRAMMING

// Output:
// PRAGRIMMONG


import java.util.*;
public class Sort_The_Vowels
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        else 
            return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Character> list=new ArrayList<Character>();
        char[] s=obj.next().toCharArray();
        int j=0;
        for(int i=0;i<s.length;i++)
            if(isVowel(s[i]))
                list.add(s[i]);
        Collections.sort(list);
        for(int i=0;i<s.length;i++)
        {
            if(isVowel(s[i]))
                System.out.print(list.get(j++));
            else 
                System.out.print(s[i]);
        }
        
        
    }
}