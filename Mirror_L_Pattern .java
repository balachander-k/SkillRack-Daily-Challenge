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
// skillrack
// kkillrack
// iiillrack
// rrrrrrack
// aaaaaaack
// cccccccck
// kkkkkkkkk

// Example Input/Output 2:
// Input:
// huge

// Output:
// huge
// uuge
// ggge
// eeee


import java.util.*;
public class Mirror_L_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        System.out.print(String.valueOf(temp));
        for(int i=1;i<temp.length;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(temp[i]);
            for(int j=i+1;j<temp.length;j++)
                System.out.print(temp[j]);
            System.out.println();
        }
    }
}