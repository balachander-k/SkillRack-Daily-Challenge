// The program must accept a string S as the input. The program must replace all the vowels in S
// by the vowels a, e, i, o and u in a circular manner. Finally, the program must print the modified
// string as the output.

// Note: All the alphabets in S are only in lower case.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string value S.

// Output Format:
// The first line contains the modified string value of S.

// Example Input/Output 1:
// Input:
// king kong

// Output:
// kangkeng

// Explanation:
// The vowels in the string k ngk ng are i and o. So they are replaced by a and e.
// Hence the output is kangkeng

// Example Input/Output 2:
// Input:
// icecreamchocolate

// Output:
// acecriomchucaleti


import java.util.*;
public class Replace_Vowels_Circular_Fashion
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
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==1)
            {
                count++;
                if(count==1)
                    b[i]='a';
                if(count==2)
                    b[i]='e';
                if(count==3)
                    b[i]='i';
                if(count==4)
                    b[i]='o';
                if(count==5)
                {
                    b[i]='u';
                    count=0;
                }
            }
            System.out.print(b[i]);
        }
    }
}