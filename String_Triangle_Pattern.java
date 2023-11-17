// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// s********
// ks*******
// ski******
// liks*****
// skill****
// rlliks***
// skillra**
// carlliks*
// skillrack

// Example Input/Output 2:
// Input:
// hope

// Output:
// h***
// oh**
// hop*
// epoh


import java.util.*;
public class String_Triangle_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<=i;j++)
                    System.out.print(s[j]);
                for(int j=i+1;j<s.length;j++)
                    System.out.print("*");
            }
            else 
            {
                for(int j=i;j>=0;j--)
                    System.out.print(s[j]);
                for(int j=i+1;j<s.length;j++)
                    System.out.print("*");
                
            }
            System.out.println();
        }
    }
}