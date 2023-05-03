// The program must accept a string S as the input. The program must print all the
// vowels in the second half of the string S in the given order. Then the program
// must print all the vowels in the first half of the string S in the given order as the
// output. If there is no vowel in S then the program must print -1 as the output.
// Note: The length of S is always even.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains either the vowels based on the above conditions or -1.

// Example Input/Output 1:
// Input:
// farmer

// Output:
// ea

// Explanation:
// The second half of the string "farmer" has only one vowel e. So it is printed.
// The first half of the string "farmer" has only one vowel a. So it is printed.
// Hence the output is ea

// Example Input/Output 2:
// Input:
// CONVERSATION

// Output:
// AIOOE

// Example Input/Output 3:
// Input:
// yhnygv

// Output:
// -1


import java.util.*;
public class Vowels_First_Half_Second_Half
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        String first="",second="";
        int count=0,len=a.length/2;
        for(int i=0;i<a.length;i++)
        {
            if(i<len)
                first=first+a[i];
            else 
                second=second+a[i];
        }
        for(int i=0;i<second.length();i++)
        {
            if(isVowel(second.charAt(i))==1)
            {
                System.out.print(second.charAt(i));
                count++;
            }
        }
        for(int i=0;i<first.length();i++)
        {
            if(isVowel(first.charAt(i))==1)
            {
                System.out.print(first.charAt(i));
                count++;
            }
        }
        if(count==0)System.out.print("-1");
    }
}