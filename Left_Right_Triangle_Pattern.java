// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// skillrack
// *killrac*
// **illra**
// ***llr***
// ****l****
// ***llr***
// **illra**
// *killrac*
// skillrack

// Example Input/Output 2:
// Input:
// logics

// Output:
// logics
// *ogic*
// **gi**
// *ogic*
// logics


import java.util.*;
public class Left_Right_Triangle_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int first=1,last=s.length-2,y=1,t=2;
        System.out.println(String.valueOf(s));
        for(int i=0;i<s.length;i++)
        {
            if(first<=last)
            {
                for(int k=0;k<=i;k++)
                    System.out.print("*");
                for(int j=first;j<=last;j++)
                    System.out.print(s[j]);
                for(int k=0;k<=i;k++)
                    System.out.print("*");
                first++;
                last--;
                System.out.println();
            }
            else 
            {
                if(y>1 && (last+y<s.length) && (first-y>=0))
                {
                    for(int k=0;k<=first-t;k++)
                        System.out.print("*");
                    for(int j=first-y;j<=last+y;j++)
                        System.out.print(s[j]);
                    for(int k=0;k<=first-t;k++)
                        System.out.print("*");
                    System.out.println();
                }
                y++;
                t++;
            }
        }
    }
}