// The program must accept an integer N as the input. The program msut sort the odd digits of N in their positions in ascending order. Then the program must print the modified value of N as the output.

// Boundary Condition(s);
// 1<= N <=10^18

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the modified value of N.

// Example Input/Output 1:
// Input:
// 385613

// Output:
// 183635

// Explanation:
// The odd digits in 385613 are 3, 5, 1 and 3.
// After sorting the odd digits in their positions in ascending order, the value becomes 183635

// Exmaple Input/Output 2:
// Input:
// 971500973311

// Output:
// 111300357799



import java.util.*;
public class Inplace_Sort_Odd_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int[] b=new int[a.length()];
        char[] c=a.toCharArray();
        int j=0,temp=0,w=0;
        for(int i=0;i<a.length();i++)
        {
            int d=Integer.parseInt(String.valueOf(c[i]));
            if(d%2!=0)
            {
                b[j]=d;
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            for(int r=i+1;r<j;r++)
            {
                if(b[i]>b[r])
                {
                    temp=b[i];
                    b[i]=b[r];
                    b[r]=temp;
                }
            }
        }
        for(int i=0;i<a.length();i++)
        {
            int f=Integer.parseInt(String.valueOf(c[i]));
            if(f%2!=0)
            {
                System.out.print(b[w]);
                w++;
            }
            else 
                System.out.print(f);
        }
    }
}