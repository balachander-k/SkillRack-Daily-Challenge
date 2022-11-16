// The program must accept a string value S as the input. The program must print the expanded string as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the values of string S.

// Output Format:
// The first line contains the expanded string as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// orange

// Output:
// egengeangerangeorange.

// Explanation:
// The string orange is expanded e ge nge ange range orange.
// Hence the output is egengeangerangeorange

// Example Input/Output 2:
// Input:
// Water

// Output:
// rerteraterWater


import java.util.*;
public class Expansion_Of_String 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        String[] c=new String[a.length()];
        String temp="";
        int k=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            temp=b[i]+temp;
            c[k]=temp;
            k++;
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(c[i]);
        }
        
    }
}