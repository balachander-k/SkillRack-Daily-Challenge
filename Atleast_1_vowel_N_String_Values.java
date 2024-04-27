// The program must accept N string values as the input. The program must print yes
// if all the N string values contain at least 1 vowel. Else the program must print no as
// the output.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Length of each string <= 100

// Input Format:
// The first line contains N.
// The next N lines, each containing a string.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// 4
// lion
// TIGER
// elEphant
// Deer

// Output:
// yes

// Explanation:
// The number of vowels in the string lion is 2.
// The number of vowels in the string TIGER is 2.
// The number of vowels in the string elEphant is 3.
// The number of vowels in the string Deer is 2.
// Here all the 4 string values contain at least 1 vowel.
// Hence the output is yes

// Example Input/Output 2:
// Input:
// 5
// Land
// Earth
// SKY
// Water

// Output:
// no


import java.util.*;
public class Atleast_1_vowel_N_String_Values
{
    public static boolean isVowel(char c)
    {
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),at=0;
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N;i++)
        {
            char[] carr=arr[i].toCharArray();
            int count=0;
            for(int j=0;j<carr.length;j++)
                if(isVowel(carr[j]))
                    count++;
            if(count!=0)
                at++;
        }
        System.out.print((at==N)?"yes":"no");
        
    }
}