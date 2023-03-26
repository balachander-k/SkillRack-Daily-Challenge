// The program must accept an integer N as the input. The program must find the binary
// representation of N as X. Then the program must shift all 1is to the right as Y. Finally, the
// program must print the minimum number of flips required to form Y from X as the output.

// Boundary Condition(s):
// 1 <=  N <=10^8

// Input Format:
// The first line contains the values of N.

// Output Format:
// The first line contains the minimum number of flips required to form Y from X based on the
// given conditions.

// Example Input/Output 1:
// Input:
// 73

// Output:
// 4

// Explanation:
// The binary representation of 73 is 1001001. So X = 1001001.
// After shifting all the binary 1 •s to the right, the binary representation of 73 becomes 0000111.
// so Y = 0000111.
 
// X = 1001001.
// Y = 0000111.

// Here 4 flips are required to form Y from X.
// Hence 4 is printed as the output.

// Example Input/Output 1:
// Input:
// 15

// Output:
// 0


import java.util.*;
public class Flip_Count_Binary_Representation
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),one=0,count=0;
        String b=Integer.toBinaryString(a);
        String d="",y="";
        char[] c=b.toCharArray();
        for(int i=0;i<b.length();i++)
        {
            if(c[i]=='1')
                one++;
        }
        for(int i=c.length-1;i>=0;i--)
        {
            if(one!=0)
            {
                d=d+"1";
                one--;
            }
            else 
                d=d+"0";
        }
        char[] t=d.toCharArray();
        for(int i=d.length()-1;i>=0;i--)
            y=y+t[i];
        char[] w=y.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(w[i]!=c[i])
                count++;
        }
        System.out.print(count);
    }
}