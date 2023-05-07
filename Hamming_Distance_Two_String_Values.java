// The program must accept two string values Sl and S2 of equal length as the
// input The program must print the Hamming distance of two string values as the
// output. The Hamming distance of two string values is the minimum number of
// substitutions required to change one string into the other string value.
// Boundary Condition(s):
// 1 <= Length of Sl and S2 < = 1000

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains the Hamming distance of Sl and S2.
// Example Input/Output 1:
// Input:
// karolin
// kathrin

// Output:
// 3

// Explanation:
// The three characters in karo'in or kathrin can be substituted to get the other
// string value.
// Hence 3 is printed.

// Example Input/Output 2:
// Input:
// carpet
// carrot

// Output:
// 2

import java.util.*;
public class Hamming_Distance_Two_String_Values
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),b=obj.next();
        int count=0;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))count++;
        System.out.print(count);
    }
}