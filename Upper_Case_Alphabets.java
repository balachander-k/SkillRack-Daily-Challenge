The program must accept two string values Sl and S2 containing only alphabets
as the input. The program must print yes if all the upper case alphabets (A to Z)
present only once in two string values. Else the program must print no as the
output.

Boundary Condition(s):
1 <= Length of Sl, S2 <= 100

Input Format:
The first line contains Sl.
The second line contains S2.

Output Format:
The first line contains yes or no.

Example Input/Output 1:
Input:
ABCDEFGHIJKLMNO
PQRSTUVWXYZ

Output:
yes

// Explanation:
// Here all the upper case alphabets (A to Z) occur only once in two string values.
// So yes is printed.

// Example Input/Output 2:
// Input:
// FEDCBA
// GHIJKLMNOPQRSTUVWXYZ

// Output:
// yes

// Example Input/Output 3:
// Input:
// CBADEFGHljkl
// MNOPQRSTuvwXYZ

// Output:
// no

import java.util.*;
public class Upper_Case_Alphabets
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int[] fre=new int[26];
        char[] s1=obj.next().toCharArray(),s2=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<s1.length;i++)
            if(Character.isUpperCase(s1[i]))
                fre[((int)s1[i]-0)-65]=++fre[((int)s1[i]-0)-65];
        for(int i=0;i<s2.length;i++)
            if(Character.isUpperCase(s2[i]))
                fre[((int)s2[i]-0)-65]=++fre[((int)s2[i]-0)-65];
        for(int i=0;i<fre.length;i++)
            if(fre[i]==1)
                count++;
        System.out.print((count==26)?"yes":"no");
            
    }
}