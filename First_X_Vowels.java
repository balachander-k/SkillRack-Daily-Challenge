// The program must accept a string value  s and an integer X as the input. The program must print the first X vowels is S as the output. If the there are no vowels or less than X vowels then the program must print -1 as the output.

// Boundary Condition(s);
// 1<= Length of S <=100
// 1<= X <=100

// Input Format:
// The first line contains the value of string S.

// Output Format:
// The first line contains either the first X vowels in  S or -1.


// Example Input/Output 1:
// Input:
// ScorEboard 3

// Output:
// oEo

// Explanation:
// The vowels present in the string "ScorEboard" are o E o a.
// The first 3 vowels are o E o
// Hence the output is oEo

// Example Input/Output 2:
// Input:
// softcopy 5

// Output:
// -1



import java.util.*;
public class First_X_Vowels 
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        int b=obj.nextInt();
        char[] c=a.toCharArray();
        char[] d=new char[a.length()];
        int count=0,k=0;
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(c[i])==1)
            {
                d[k]=c[i];
                k++;
            }
        }
        if(k==0)
        {
            System.out.print("-1");
        }
        else 
        {
            for(int i=0;i<k;i++)
            {
                if(k>=b)
                {
                    if(count!=b)
                    {
                        System.out.print(d[i]);
                        count++;
                    }
                }
                else 
                {
                    System.out.print("-1");
                    break;
                }
            }
        }
    }
}