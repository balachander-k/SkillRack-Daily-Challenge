/*The must accept two string values SI and S2 containing only as the input
The program must print the strir9 which has a maxirnum number of vowels. If both Sl and S2
contain the same number of vowels then the program must print Sl as the output, If both Sl
and S2 contain only consonants then the must print -1 as the output.

Boundary Condition(s);
1 <= Length of S1,S2 <= 100

Input Format:
The first line contains Sl.
The second line contains S2.

Output Format:
The first line contains Sl or S2 or -1.

Example Input/Output 1:
Input:
Day
Good

Output:
Good

Explanation:
In the D y, the number of vowel is 1.
In the G d. the number Of vowels is 2.
so the maximum number Of vowels is 2.
Hence the output is Good.

Example Input/Output 2:
Input:
hello
world

Output:
hello

Example Input/Output 3:
Input:
fly
cry

Output:
-1
*/



import java.util.*;
public class String_Maximum_Number_Of_Vowels
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
        String a=obj.nextLine(),b=obj.nextLine();
        int count1=0,count2=0;
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(isVowel(c)==1)
                count1++;
        }
        for(int i=0;i<b.length();i++)
        {
            char d=b.charAt(i);
            if(isVowel(d)==1)
                count2++;
        }
        if((count1==0) && (count2==0))System.out.print("-1");
        if((count1!=0) && (count2!=0))
        {
            if(count1==count2)
            {
                System.out.print(a);
            }
        }
        if(count1>count2)System.out.print(a);
        if(count2>count1)System.out.print(b);
    }
}