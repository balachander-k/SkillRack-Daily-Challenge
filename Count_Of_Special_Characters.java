// The program must accept a string S as the input. The program must print the cound of special characters in the string S as the output.
// Note: Special character is a character which is not an alphabet or not a digit.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the count of special charcters in S.

// Example Input/Output 1:
// Input:
// eur09!^rp!e*!1*

// Output:
// 6

// Example Input/Output 2:
// Input:
// o$ra^nge*

// Output:
// 3



import java.util.*;
public class Count_Of_Special_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int count=0;
        for(int i=0;i<a.length();i++)
            if((b[i]>='a' && b[i]<='z') || (b[i]>='A' && b[i]<='Z') || Character.isDigit(b[i])) count++;
        System.out.print(a.length()-count);
    }
}