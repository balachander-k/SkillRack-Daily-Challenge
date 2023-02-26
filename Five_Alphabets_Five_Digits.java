// The program must accept a string S (where the length of S is always a multiple of 5) as the
// input. The program must print YES if the first five characters of S are alphabets, the second five
// characters of S are digits, the third five characters of S are alphabets and so on. Else the
// program must print NO as the output.

// Boundary Condition(s):
// 5 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output l:
// Input:
// abcde25353KnMDn92483fJkdm

// Output:
// YES

// Explanation:
// The first five characters in S are alphabets (abcde).
// The second five characters in S are digits (25353).
// The third five characters in S are alphabets (KnMDn).
// The fourth five characters in S are digits (92483).
// The fifth five characters in S are alphabets ($kdm).
// Hence the output is YES.

// Example Input/Output 2:
// Input:
// qwers63i53asdfe

// Output:
// NO


import java.util.*;
public class Five_Alphabets_Five_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int len=a.length()/5,r=4,y=5,t=0,o=9,counter1=0,counter2=0,charcount=0,digitcount=0,count=0;
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
                for(int e=t;e<=r;e++)
                {
                    if(Character.isAlphabetic(a.charAt(e)))
                        charcount++;
                }
                if(charcount==5)
                    counter1++;
                charcount=0;
                t=(o+1);
                r=(o+5);
            }
            else 
            {
                for(int j=y;j<=o;j++)
                {
                    if(Character.isDigit(a.charAt(j)))
                        digitcount++;
                }
                if(digitcount==5)
                    counter2++;
                digitcount=0;
                y=(r+1);
                o=(r+5);
            }
        }
        count=counter1+counter2;
        if(count==len)System.out.print("YES");
        else System.out.print("NO");
        
    }
}