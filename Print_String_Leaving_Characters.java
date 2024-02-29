// The program must accept a string S as the input. The program must print the first
// character and then the third character and then the sixth character and so on from
// the end as the output.

// Note: The interval between the printed characters increases by 1 each time.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the characters based on the given conditions.

// Example Input/Output 1:
// Input:
// abcdefghijklmno

// Output:
// omjfa

// Explanation:
// The string is abcdefghijklmno.
// The first character from the end of the string is
// The third character from the end of the string is
// is 1, so is printed.
// The sixth character from the end of the string is
// 2, so is printed.
// , so • is printed.
// , the interval between o and m
// , the interval between m and j is
// The tenth character from the end of the string is , the interval between j and f is
// 3, so is printed.
// The fifteenth character from the end of the string is , the interval between f and
// a is 4, so is printed.

// Example Input/Output 2:
// Input:
// northeastwestsouth

// Output:
// huttt



import java.util.*;
public class Print_String_Leaving_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int i=s.length-1,j=2;
        while(i!=0)
        {
            try{
                System.out.print(s[i]);
                i=i-j;
                j++;
            }
            catch(Exception e)
            {
                break;
            }
        }
        if(i>=0)System.out.print(0);
    }
}