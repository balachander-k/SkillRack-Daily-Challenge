// The program must accept two string values Sl and S2 containing only alphabets
// and an alphabet CH as the input. The program must print the string which has the
// maximum occurrences of the CH. If both Sl and S2 have the same number of
// occurrences of the CH then the program must print the first string Sl as the
// output.

// Note: At least one of the string values will always contain the alphabet CH.

// Boundary Condition(s):
// 3 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.
// The third line contains CH.

// Output Format:
// The first line contains Sl or S2.

// Example Input/Output 1:
// Input:
// world
// hello
// l

// Output:
// hello

// Explanation:
// The alphabet CH is l.
// In the string wor d, the number of occurrences of the alphabet I is 1.
// In the string he o, the number of occurrences of the alphabet I is 2.
// So the maximum(larger) count is 2.
// Hence the output is hello

// Example Input/Output 2:
// Input:
// happy
// day
// a

// Output:
// happy

import java.util.*;
public class String_With_Maximum_Alphabet_CH
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s1=obj.next().toCharArray();
        char[] s2=obj.next().toCharArray();
        char ch=obj.next().charAt(0);
        int first=0,second=0;
        for(int i=0;i<s1.length;i++)
            if(s1[i]==ch)
                first++;
        for(int i=0;i<s2.length;i++)
            if(s2[i]==ch)
                second++;
        if(first==second)
            System.out.print(String.valueOf(s1));
        else if(first>second)
            System.out.print(String.valueOf(s1));
        else 
            System.out.print(String.valueOf(s2));
            
    }
}