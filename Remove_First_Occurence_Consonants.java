// The program must accept a string S as the input. The program must remove the
// first occurrence of all the repeated consonants in the string S. Then the program
// must print the modified string S as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// Attendance

// Output:
// Atedance

// Explanation:
// The repeated consonants in the string Attendance are t and n.
// So the first occurrence of both the consonants are removed from the string
// Attendance.
// Hence the output is Atedance

// Example Input/Output 2:
// Input:
// Cloud

// Output:
// Cloud

// Example Input/Output 3:
// Input:
// OCcurrence@123

// Output:
// OCurence@123


import java.util.*;
public class Remove_First_Occurence_Consonants
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int[] arr=new int[256];
        for(int i=0;i<s.length;i++)
        {
            if(!isVowel(s[i])&&Character.isAlphabetic(s[i]))
            {
                int ascii=(int)s[i];
                int temp=arr[ascii];
                arr[ascii]=++temp;
            }
        }
        for(int i=0;i<s.lenth;i++)
        {
            if(!isVowel(s[i])&&Character.isAlphabetic(s[i]))
            {
                int ascii=(int)s[i];
                if(arr[ascii]>1)
                    arr[ascii]=0;
                else 
                    System.out.print(s[i]);
            }
            else 
                System.out.print(s[i]);
        }
    }
}