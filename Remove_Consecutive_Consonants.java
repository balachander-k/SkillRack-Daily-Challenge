// The program must accept a string S which contains only lower case alphabets as the
// input The program must remove the consonants which are occurred consecutively.
// Then the program must print the modified string S as the output.
// Note: At least one vowel is always present in the string S.

// Boundary Condition(s):
// 1 <= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the modified string value of S.

// Example Input/Output 1:
// Input:
// elephants

// Output:
// elea

// Explanation:
// The consonants p and h are have occurred consecutively so they are removed from
// the string "elephants". Now the string becomes "eleants".
// The consonants n t and s are occurred consecutively so they are removed from the
// string "eleants". Now the string becomes "elea"
// Hence the output is elea

// Example Input/Output 2:
// Input:
// document

// Output:
// docume


import java.util.*;
public class Remove_Consecutive_Consonants
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            if(isVowel(b[i])==0)
            {
                for(int j=i+1;j<b.length;j++)
                {
                    if(isVowel(b[j])==0)
                    {
                        b[i]='0';
                        b[j]='0';
                    }
                    else 
                    {
                        i=j;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='0')
                continue;
            else 
                System.out.print(b[i]);
        }
    }
}