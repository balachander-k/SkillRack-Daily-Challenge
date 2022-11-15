// The program must accept a string value S as the input. The program must print the desired pattern as shown in the Example Input/Output section.
// Note: The length of S is always odd.

// Boundary Condition(s);
// 1<=Length of S <=99

// Input Format:
// The first line contains the string S.

// Output Format:
// The lsit of lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// s
// k
// i
// l
// l r a c k

// Example Input/Output 2:
// Input:
// distributer

// Output:
// d
// i
// s
// t
// r
// i b u t e r 

import java.util.*;
public class L_Pattern_String 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int len=a.length()/2;
        for(int i=0;i<a.length();i++)
        {
            if(i<len)
                System.out.println(b[i]);
            else 
                System.out.print(b[i]+" ");
        }
    }
}