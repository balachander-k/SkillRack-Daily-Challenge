// The program must accept a string S and an integer X as the input. The program
// must print the characters which are present at the positions of multiples of X in
// reverse order as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 <= X <= Length of S

// Input Format:
// The first line contains S.
// The second line contains X.

// Output Format:
// The first line contains the characters which are present at the positions of multiple
// of X in reverse order.

// Example Input/Output 1:
// Input:
// skillrack
// 3

// Output:
// kri

// Explanation:
// The characters which are present at the positions of multiples of 3 are i, r and k.
// So they are reversed and printed as the output.

// Example Input/Output 2:
// Input:
// employee
// 2

// Output:
// eylm

import java.util.*;
public class Characters_Multiple_Of_X_Reverse
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),val="";
        int c=obj.nextInt(),temp=1;
        for(int i=0;i<a.length();i++)
        {
            if(temp%c==0)
                val=a.charAt(i)+val;
            temp++;
        }
        System.out.print(val);
    }
}