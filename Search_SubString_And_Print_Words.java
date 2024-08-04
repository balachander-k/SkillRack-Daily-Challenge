// The program must accept a space-separated string S and N string values as the input. For
// each string X among the N string values, the program must print the words in S having the
// substring X at least once. If there is no such word in the string S, the program must print -1
// as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000
// 1 <= N <= 50
// 1 <= Length of each string among the N string values <= 100

// Input Format:
// The first line contains S.
// The second line contains N.
// The next N lines, each contains a string value.

// Output Format:
// The first N lines, each contains a string or -1 as per the given conditions.

// Example Input/Output 1:
// Input:
// learning makes a good man better and a bad man worse
// 4
// k
// ea
// ma
// a

// Output:
// makes
// learning
// makes man man
// learning makes a man and a bad man

// Explanation:
// The ISt string is k, the word that contains the substring k in the string S is makes.
// The 2nd string is ea, the word that contains the substring ea in the string S is learning.
// The 3rd string is ma, the words that contain the substring ma in the string S are makes,
// man and man.
// The 4th string is a, the words that contain the substring a in the string S are learning,
// makes, a, man, and, a, bad and man.
// Example Input/Output 2:
// Input:
// programming is an explanatory activity
// 5
// o
// al
// an
// ing
// Output:
// programming explanatory
// programming is activity
// an explanatory
// programming

// Example Input/Output 3:
// Input:
// enter green rocking cooking clean terminate backward eat
// 6
// king
// en
// ter


// Output:
// enter green clean terminate eat
// rocking cooking
// enter green
// green rocking cooking
// enter terminate


import java.util.*;
public class Search_SubString_And_Print_Words
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int n=obj.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=obj.next();
        String[] sarr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<sarr.length;j++)
            {
                if(sarr[j].contains(arr[i]))
                {
                    System.out.print(sarr[j]+" ");
                    count++;
                }
            }
            System.out.print(count!=0?"\n":"-1 \n");
        }
        
    }
}