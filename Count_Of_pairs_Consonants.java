// The program must accept a string S as the input. The program must print the
// count of consecutive pairs having the consonants in S as the output.

// Boundary Condition(s):
// 2 <= length of S <= 1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the count of consecutive pairs having consonants in S.

// Example Input/Output 1:
// Input:
// Apple

// Output:
// 2

// Explanation:
// The first consecutive pair of consonants is pp.
// The second consecutive pair of consonants is pl.
// So 2 is printed as the output.

// Example Input/Output 2:
// Input:
// ORANGE

// Output:
// 1


import java.util.*;
public class Count_Of_pairs_Consonants
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
        char[] a=obj.nextLine().toCharArray();
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
            if((isVowel(a[i])==0) && (isVowel(a[i+1])==0))
                count++;
        }
        System.out.print(count);
    }
}