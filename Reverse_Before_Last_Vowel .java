// The program must accept a string S as the input. The program must reverse all the characters present before the last vowel and print the modified string as the output. Note The string S contains at least one vowel.

// Boundary Condition(s);
// 1<= Length of string S <=1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// ethernet

// Output:
// nrehteet

// Explanation:
// The last vowel is e so all the alphabets before e are reversed.

// Example Input/Output 2:
// Input:
// umbrella

// Output:
// llerbmua



import java.util.*;
public class Reverse_Before_Last_Vowel 
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int r=0;
        String val="",s="";
        for(int i=a.length()-1;i>=0;i--)
        {
            if(isVowel(b[i])==1)
            {
                r=i-1;
                for(int j=r;j>=0;j--)
                    val=val+b[j];
                for(int t=i;t<a.length();t++)
                    s=s+b[t];
                i=-1;
            }
        }
        System.out.print(val+s);
    }
}