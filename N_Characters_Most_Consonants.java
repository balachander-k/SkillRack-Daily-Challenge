// The program must accept a string S and an integer N as the input. The program
// must print the first N characters of S if it contains more consonants than the
// number of consonants in the last N characters of S as the output. Else the program
// must print the last N characters of S as the output. If both the first N and last N
// characters contain the same number of consonants then the program must print
// the entire string without any modifications as the output.

// Boundary Condition(s):
// 2 <= Length of string <= 100
// 1 <= N <= Length of string

// Input Format:
// The first line contains S and N separated by a space.

// Output Format:
// The first line contains the string as per the given condition.

// Example Input/Output 1:
// Input:
// tamarind 4

// Output:
// rind

// Explanation:
// There are 2 consonants in the first 4 characters.
// There are 3 consonants in the last 4 characters.
// Hence the last 4 characters are printed.

// Example Input/Output 2:
// Input:
// basic 2

// Output:
// basic


import java.util.*;
public class N_Characters_Most_Consonants
{
    public static int isConso(char ch)
    {
        Character.toLowerCase(ch);
        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            return 1;
        else
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next(),f="",l="";
        int b=obj.nextInt(),first=0,last=0,count=0;
        for(int i=0;i<b;i++)
        {
            f+=a.charAt(i);
            if(isConso(a.charAt(i))==1)first++;
        }
        for(int i=a.length()-1;i>=0;i--)
        {
            if(count==b)break;
            if(isConso(a.charAt(i))==1)last++;
            l=a.charAt(i)+l;
            count++;
        }
        System.out.print((first==last)?a:((first>last)?f:l));
        
    }
}