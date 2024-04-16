// The program must accept a string S as the input. The program must print yes if
// the string contains only the characters 'X' and 'Y' (case insensitive). Else the
// program must print no as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// XyxYyXx

// Output:
// yes

// Explanation:
// The string XyxYyXx contains only the characters X and Y (case insensitive).
// So yes is printed.

// Example Input/Output 2:
// Input:
// zyxxy

// Output:
// no


import java.util.*;
public class String_Contains_X_And_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int counter=0;
        for(int i=0;i<s.length;i++)
            if(s[i]=='x'||s[i]=='y'||s[i]=='X'||s[i]=='Y')
                counter++;
        System.out.print((counter==s.length)?"yes":"no");
    }
}