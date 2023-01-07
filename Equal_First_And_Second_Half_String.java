// The program must accept a string S as the input. The program must print yes if the first half of the string is equal to the second half of the string. Else the program must print no as the output.

// Note:If the length of the string is odd ignore the character in the middle.

// Boundary Condition(s);
// 1<= Length of the string <=1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains either yes or no.

// Example Input/Ouput 1:
// Input:
// dumdum

// Output:
// yes

// Explanation:
// Both the first and second half of the string is same so yes is printed.

// Example Input/Output 2:
// Input:
// YelYe

// Output:
// yes

// Example Input/Output1:
// Input:
// tellet

// Output:
// no


import java.util.*;
public class Equal_First_And_Second_Half_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        String first="",last="";
        int len=a.length(),value=0,item=0,odd=0,even=0;
        if(len%2!=0)
        {
            value=len/2;
            value--;
            odd=1;
        }
        if(len%2==0)
        {
            item=len/2;
            even=1;
        }
        if(odd==1)
        {
            for(int i=0;i<=value;i++)
            {
                first=first+b[i];
            }
            value=value+2;
            for(int j=value;j<a.length();j++)
            {
                last=last+b[j];
            }
        }
        if(even==1)
        {
            for(int i=0;i<item;i++)
            {
                first=first+b[i];
            }
            for(int j=item;j<a.length();j++)
            {
                last=last+b[j];
            }
        }
        if(first.equals(last))
            System.out.print("yes");
        else 
            System.out.print("no");
    }
}