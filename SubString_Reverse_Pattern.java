// The program must accept a string S as the input. The program must print the desired pattern as shown in the Example Input/Output section.
// Note:The length of S is always odd.

// Boundary Condition(s);
// 1<= Length of S <= 99

// Input Format:
// The first line contains the value of string S.

// Output Format:
// The list of lines containing the desired pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// skillrack
// *carllik
// **illra
// ***rll
// ****l

// Example Input/Output 2:
// Input:
// first 

// Output:
// first
// *sri
// **r



import java.util.*;
public class SubString_Reverse_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String striname=obj.nextLine();
        char[] charname=striname.toCharArray();
        int length=striname.length()/2;
        int len=striname.length()-2,evenlen=striname.length()-3;
        int oddnum=1,evennum=2,val=1;
        System.out.println(striname);
        for(int row=1;row<=length;row++)
        {
            for(int i=1;i<=row;i++)
                System.out.print("*");
            if(row%2!=0)
            {
                for(int r=len;r>=oddnum;r--)
                {
                    System.out.print(charname[r]);
                }
                oddnum=oddnum+2;
                len=len-2;
            }
            else 
            {
                for(int j=evennum;j<=evenlen;j++)
                {
                    System.out.print(charname[j]);
                }
                evennum=evennum+2;
                evenlen=evenlen-2;
            }
            System.out.println();
        }
    }
}