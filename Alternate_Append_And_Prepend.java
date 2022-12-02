// The program must accept N string values as the input. The program must form a string S by copying the first string. Then the program must prepend the second string to S, then append the third string to S, then prepend the fourth string to S and so on. Finally, the program must print the string S as the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Length of each string <=100

// Input Format:
// The first line contains the value of N.
// The next N lines each contains a string.

// Output Format:
// The first line contains the string S.

// Example Input/Output 1:
// Input:
// 4
// future
// perfect
// continuous
// tense

// Output:
// tenseperfectfuturecontinuous

// Explanation:
// Form the string S by copying the first string. Now the string S becomes "future".
// Prepend the second string to S -> "perfectfuture".
// Append the third string to S -> "perfectfuturecontinuous".
// Prepend the fourth string to S -> "tenseperfectfuturecontinuous"/


// Example Input/Output 2:
// Input:
// 7
// aaa
// bbbb
// ccdcc
// efefefe
// ghg
// ijkl
// mnmnmnm

// Output:
// ijklefefefebbbbaaaccdccghgmnmnmnm



import java.util.*;
public class Alternate_Append_And_Prepend 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String[] b=new String[a+1];
        for(int i=0;i<a+1;i++)
            b[i]=obj.nextLine();
        String temp=b[0];
        for(int i=1;i<a+1;i++)
        {
            if(i%2!=0)
                temp=temp+b[i];
            else 
                temp=b[i]+temp;
        }
        System.out.print(temp);
    }
}