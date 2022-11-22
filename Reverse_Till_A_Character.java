// The program must accept a string S and a character CH as the input. The program must reverse the String S till the first occurrence of the character CH and print it as the output. If CH has not occurred in S then print -1 as the output.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.
// The second line contains the character CH.

// Output Format:
// The first line contains either the reversed string till the first occurrence of the character CH or -1.

// Example Input/Output 1:
// Input:
// skillrack
// l

// Output:
// liks

// Explanation:
// The characters up to the first occurrence of l in the String  "skillrack" are s,k,i and l.
// So the reverse of  "skil" is "liks"/
// Hence the output is liks.

// Example Input/Output 2:
// Input:
// hello
// x

// Output:
// -1




import java.util.*;
public class Reverse_Till_A_Character
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char c=obj.next().charAt(0);
        char[] b=a.toCharArray();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(b[i]==c)
            {
                count++;
                for(int j=i;j>=0;j++)
                {
                    System.out.print(b[j]);
                }
            i=a.length();
            }
        }
        if(count==0)
            System.out.print("-1");
    }
}