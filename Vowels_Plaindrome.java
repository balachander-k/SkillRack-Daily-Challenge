// The program must accept a string S as the input. The program must remove the consonants from the string S.Finally the program must print YES if the modified string S is a plaindrome. Else the program must print NO as the output. If there is no vowel in the modified string S then the program must print -1 as the output.
// Note:All the alphabets in S are only in lower case.

// Boundary Condition(s);
// 1<= Length of S <= 1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains either the string value (YES or No) or -1.

// Example Input/Output 1:
// Input:
// abcuhuvmnba

// Output:
// YES

// Explanation:
// The consnants in the string "abcuhumnb" are removed. Now the string becomes "auua".
// So the string "auua" is a plaindrome.
// Hence the output is YES.

// Example Input/Output 2:
// Input:
// xayzuezyax

// Output:
// NO

// Example Input/Output 3:
// Input:
// bkdhgcj

// Output:
// -1.



import java.util.*;
public class Main 
{
    public static int isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='E' || c=='e'|| c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        int count=0,k=0;
        String temp="",store="";
        for(int i=0;i<a.length;i++)
        {
            if(isVowel(a[i])==1)
            {
                temp=temp+a[i];
                count++;
            }
        }
        String rev=temp;
        char[] c=rev.toCharArray();
        for(int i=rev.length()-1;i>=0;i--)
        {
            store=store+c[i];
        }
        if(count==0)
            System.out.print("-1");
        else if(rev.equals(store))
            System.out.print("YES");
        else 
            System.out.print("NO");
        
    }
}