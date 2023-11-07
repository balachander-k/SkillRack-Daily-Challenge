// The program must accept a string S containing only lower case alphabets as the
// input The program must print YES if all the consonants are present in the string S
// (in any order). Else the program must print NO as the output.

// Boundary Condition(s):
// 26 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// abcdefghijklmnopqrstuvwxyz

// Output:
// YES

// Explanation:
// All the 21 consonants (bcdfghjklmnpqrstvwxyz) are present in the string
// abcdefghijklmnopqrstuvwxyz.
// So YES is printed.

// Example Input/Output 2:
// Input:
// pqbchjrgstvwklmndfhjbcgstmrrs

// Output:
// NO


import java.util.*;
public class Presence_Of_All_Consonants_Or_Not
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        int [] arr=new int[26];
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            int t=(int)temp[i]-97;
            if(!isVowel(temp[i]))
            {
                int r=arr[t];
                arr[t]=++r;
            }
            else 
            {
                arr[t]=-2;
            }
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=-2 || arr[i]!=0)
                count++;
        System.out.print((count>=21)?"YES":"NO");
    }
}