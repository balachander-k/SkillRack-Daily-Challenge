// The program must accept two string values Sl and S2 as the input. The string Sl represents
// a pattern and the string S2 represents a space-separated string value. Each character in Sl
// represents a word in S2 in the order of their occurrence. The program must print YES if the
// string S2 follows the pattern Sl. Else the program must print NO as the output.

// Boundary Condition(s):
// 2 <= Length of Sl <= 100
// 2 <= Length of S2 <= 1000

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input
// abcacb
// book pen pencil book pencil pen

// Output:
// YES

// Explanation:
// The characters a, b and c are matched with the words book, pen and pencil respectively.
// Here the string "book pen pencil book pencil pen" follows the pattern "abcacb", so YES is
// printed as the output.

// Example Input/Output 2:
// Input
// Xyxy
// bat ball bat ball

// Output:
// NO

// Example Input/Output 3:
// Input:
// PQRS
// doll car toy

// Output:
// NO


import java.util.*;
public class String_Matching_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        Set<Character> ch=new LinkedHashSet<Character>();
        Set<String> val=new LinkedHashSet<String>();
        char[] s1=obj.next().toCharArray();
        obj.nextLine();
        String s2=obj.nextLine();
        String[] arr=s2.split(" ");
        for(int i=0;i<s1.length;i++)
            ch.add(s1[i]);
        for(int i=0;i<arr.length;i++)
            val.add(arr[i]);
        System.out.print((ch.size()==val.size())?"YES":"NO");
    }
}