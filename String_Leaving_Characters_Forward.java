// The program must accept a string S as the input. The program must print the first
// character, the third character, the sixth character and so on as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the characters of string S as per the given conditions.

// Example Input/Output 1:
// Input:
// abcdefghijklmno

// Output:
// acfjo

// Explanation:
// ISt character is a.
// 3rd character is c.
// 6th character is f.
// 10th character is j.
// 1 5th character is o.
// So these characters are printed as the output.

// Example Input/Output 2:
// Input:
// northeastwestsouth

// Output:
// nrewo

import java.util.*;
public class String_Leaving_Characters_Forward
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char[] b=a.toCharArray();
        int sum=0;
        if(a.length()==1)
            System.out.print(a);
        else 
        {
            for(int i=1;i<a.length();i++)
            {
                try{
                sum=sum+i;
                System.out.print(b[sum-1]);
                }
                catch(Exception e)
                {
                    break;
                }
            }
        }
    }
}