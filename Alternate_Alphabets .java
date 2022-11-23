// The program must accept a string S (contains only alphabets) as the input. The program msut split the string into two equal halves. The program mus print the alphabets in the second hald interlaced with the alphabets in the first half of S as the output.
// Note: Length of S is always even.

// Boundary Condition(s);
// 2 <= Length of S <= 10^4

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the alphabets in the second half are interlaced wiht the alphabets in the first half of S.

// Example Input/Output 1:
// Input:
// radeon

// Output:
// eroand

// Explanation:
// The first half of radeon is "rad".
// The second half of radeon is "eon".
// The alphabets in "eon" are interlaced with the alphabets in "rad" as "eroand".
// Hence the output is eroand

// Example Input/Output 2:
// Input:
// netbeans

// Output:
// enaentsb



import java.util.*;
public class Alternate_Alphabets 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        char[] c=new char[a.length()];
        int len=a.length()/2;
        int temp=a.length()-1;
        int k=0,r=0;
        for(int i=len;i<a.length();i++)
        {
            c[k]=b[i];
            k++;
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(c[r]);
            System.out.print(b[i]);
            r++;
        }
    }
}