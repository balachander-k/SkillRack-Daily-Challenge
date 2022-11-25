// The program must accept two integers N1 and N2 and two string values S1 and S2 as the input. The program must print the concatenate of the first N1 characters in S1 and the last N2 characters in S2. Then the program must print the concatenate of remaining characters in S2 and S1 as the output.

// Boundary Condition(s);
// 1<= S1,S2 <=50
// 1<= N1 <= Length of S1
// 1<= N2 <= Length of S2

// Input Format:
// The first line contains the string S1.
// The second line contains the string S2.
// The third line contains two integers N1 and N2 separated by space.

// Output Format:
// The first line contains the concatenate of the first N1 characters in S1 and the last N2 characters in S2.
// The second line contains the concatenate of remaining characters in S2 and S2 as the output.

// Example Input/Output 1:
// Input:
// courier
// river
// 3  2

// Output:
// couer
// rivrier

// Explanation:
// The first 3 characters in "courier" are cou and the last 2 characters in "river" are er.
// So couer is printed.
// The remaining characters in "river" and riv and "courier" are rier.
// So rivrier is printed.

// Example Input/Output 2:
// Input:
// Batman
// Joker
// 5  2

// Output:
// Batmaer
// Jokn





import java.util.*;
public class Concatenate_Two_Strings 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),b=obj.nextLine();
        int c=obj.nextInt(),d=obj.nextInt();
        char[] e=a.toCharArray();
        char[] f=b.toCharArray();
        int add=c+d,len=b.length()-1;
        String temp="";
        for(int i=0;i<add;i++)
        {
            if(i<c)
                System.out.print(e[i]);
            else 
            {
                temp=f[len]+temp;
                len--;
            }
        }
        System.out.print(temp+"\n");
        for(int i=0;i<len;i++)
            System.out.print(f[i]);
        for(int i=c;i<a.length();i++)
            System.out.print(e[i]);
    }
}