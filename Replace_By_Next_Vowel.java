// The program must accept a string S and an alphabet CH as the input. The
// program must replace all the occurrences of the alphabet CH by the next
// occurring vowel in the string S. Then the program must print the modified string
// as the output.

// Note: If there is no vowel after the alphabet CH then CH must be printed as it is.

// Boundary Condition(s):
// 1 <= Length of the string <= 1000

// Input Format:
// The first line contains the string S and an alphabet CH separated by a space.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// teleportation t

// Output:
// eeleporaaiion

// Example Input/Output 2:
// Input:
// accuracy c

// Output:
// auuuracy


import java.util.*;
public class Replace_By_Next_Vowel
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char b=obj.next().charAt(0);
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            count=0;
            if(a.charAt(i)==b)
            {
                for(int j=i+1;j<a.length();j++)
                {
                    if(isVowel(a.charAt(j))==1)
                    {
                        System.out.print(a.charAt(j));
                        count++;
                        break;
                    }
                }
                if(count==0)
                    System.out.print(a.charAt(i));
            }
            else 
                System.out.print(a.charAt(i));
        }
    }
}