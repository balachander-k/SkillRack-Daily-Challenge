// The program must accept N string values and print the string value that matches
// the given abbreviation A.
// Note: Always only one string will match with the given abbreviation A.

// Boundary Condition(s):
// 2 <= N, Length of each string <= 100
// 1 <= Length of A <= 50

// Input Format:
// The first line contains N.
// The next N lines, each contain a string value.
// The (N +2)nd line contains A.

// Output Format:
// The first line contains the string value which matches the abbreviation A.

// Example Input/Output 1:
// Input:
// 4
// hello Good Morning
// World Health organisation
// World Human Chain
// World War Two
// WHO

// Output:
// World Health organisation

// Explanation:
// Here N = 4.
// In the given 4 string values, the suited string value for the abbreviation "WHO" is
// "World Health organisation".
// Hence the output is World Health organisation

// Example Input/Output 2:
// Input:
// 4
// hello Good Morning
// World Health Organisation
// World Human Chain
// World War Two
// WWT

// Output:
// World War Two


import java.util.*;
public class Matching_Abbrevation
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        obj.nextLine();
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextLine();
        String abbr=obj.next();
        char[] t=abbr.toCharArray();
        for(int j=0;j<N;j++)
        {
            String[] val=arr[j].split(" ");
            int match=0;
            if(val.length==abbr.length())
            {
                for(int k=0;k<val.length;k++)
                {
                    char[] r=val[k].toCharArray();
                    if((Character.toUpperCase(t[k])==r[0]) || (Character.toLowerCase(t[j])==r[0]))
                        match++;
                }
                if(match==abbr.length())
                {
                    for(int i=0;i<val.length;i++)
                        System.out.print(val[i]+" ");
                }
            }
        }
    }
}