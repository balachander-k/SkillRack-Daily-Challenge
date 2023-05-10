// The program must accept a string value S and an integer N as the input. The
// program must print the output based on the following conditions.
// -If the length of the string S is divisible by N, then the program must print the
// characters present at the positions of multiples of N in the string S as the output.
// -If the length of the string S is not divisible by N, then the program must print the
// characters which are not present at the positions of multiples of N in the string S as
// the output.

// Boundary Condition(s):
// 1 <= Length of S < = 100
// 1 <= N <= Length of S

// Input Format:
// The first line contains the string S.
// The second line contains the integer N.

// Output Format:
// The first line contains the string based on the given condition.

// Example Input/Output 1:
// Input:
// Encyclopedia
// 3

// Output:
// clea

// Explanation:
// The length of Encyclopedia is 12.
// The length 12 is a divisible integer of 3.
// Hence the multiples of 3 position are c, l, e, and a.
// Hence the output is clea

// Example Input/Output 2:
// Input:
// wikipedia
// 2

// Output:
// wkpda



import java.util.*;
public class Multiples_In_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int b=obj.nextInt(),count=0,c=0;
        if(a.length()%b==0)
        {
            for(int i=0;i<a.length();i++)
            {
                count++;
                if(count==b)
                {
                    System.out.print(a.charAt(i));
                    count=0;
                }
            }
        }
        if(a.length()%2!=0)
        {
            for(int i=0;i<a.length();i++)
            {
                c++;
                if(c==b)
                {
                    c=0;
                    continue;
                }
                else 
                    System.out.print(a.charAt(i));
            }
        }
    }
}