// The program must accept a string S as the input. The program must remove all the
// vowels from the string S. Finally, the program must print YES if the modified string S
// is a palindrome. Else the program must print NO as the output. If there is no
// consonant in the modified string S then the program must print -1 as the output.
// Note: All the alphabets in S are only in lower case.

// Boundary Condition(s):
// 1 <= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains YES or NO or -1 as per given conditions.

// Example Input/Output 1:
// Input:
// abcdefdcb

// Output:
// YES

// Explanation:
// The vowels in the string " bcd fdcb" are removed. Now the string becomes
// "bcdfdcb". Here the string "bcdfdcb" is a palindrome.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// monkeyeknod

// Output:
// NO

// Example Input/Output 3:
// Input:
// aeeeei

// Output:
// -1


import java.util.*;
public class Consonants_Plaindrome
{
    public static int isVowel(char ch )
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),temp="",rev="",conso="";
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(a.charAt(i))==0)
            {
                count++;
                conso=conso+a.charAt(i);
            }
        }
        temp=conso;
        for(int i=conso.length()-1;i>=0;i--)
            rev=rev+conso.charAt(i);
        if(count==0)System.out.print("-1");
        else if(temp.equals(rev))System.out.print("YES");
        else System.out.print("NO");
    }
}