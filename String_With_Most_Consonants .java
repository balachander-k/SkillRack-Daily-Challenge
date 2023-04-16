// The program must accept N string values as the input. The program must print the
// string having maximum number of consonants among the N string values as the
// output. If more than one string values have the maximum number of consonants
// then the program must print the first occurring string.
// Note: At least one string will always contain one consonant.

// Boundary Condition(s):
// 1 <= N < = 100
// 1 <= Length of each string <= 100

// Input Format:
// The first line contains N.
// The next N lines, each contains a string.

// Output Format:
// The first line contains the string having maximum number of consonants based on
// the above conditions.

// Example Input/Output 1:
// Input:
// 3
// burger
// sandwich
// pizza

// Output:
// sandwich

// Explanation:
// The string "burger" has 4 consonants.
// The string "sandwich" has 6 consonants.
// The string "pizza" has 3 consonants.
// Here the string "sandwich" has the maximum number of consonants among the
// other string values.
// Hence the output is sandwich

// Example Input/Output 2:
// Input:
// 5
// CALCIUM
// SULPHATE
// SODIUM
// POTASSIUM
// CATS

// Output:
// SULPHATE


import java.util.*;
public class String_With_Most_Consonants 
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
        int a=obj.nextInt(),conso=0,count=0;
        String val="";
        for(int i=0;i<a;i++)
        {
            count=0;
            String b=obj.next();
            char[] c=b.toCharArray();
            for(int j=0;j<c.length;j++)
            {
                if(isVowel(c[j])==0)
                    count++;
            }
            if(count>conso)
            {
                conso=count;
                val=b;
            }
        }
        System.out.print(val);
    }
}