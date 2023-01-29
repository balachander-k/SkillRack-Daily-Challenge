// The program must accept an integer N as the input. The  program must remove every 2nd integer and print the remanining integers as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 1<= Each integer value <=10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains integers separated by a space.

// Example Input/Output 1:
// Input:
// 6
// 41 69 73 43 5 3

// Output:
// 41 73 5

// Explanation:
// The 2nd, 4th and 6th integers are removed and the remaining integers separated as the output.

// Example Input/Output 2:
// Input:
// 7
// 71 21 67 53 57 97 11

// Output:
// 71 67 57 11




import java.util.*;
public class Remove_Every_2nd_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),c=0;
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        while(c<=a)
        {
            try{
            System.out.print(b[c]+" ");
            c=c+2;
            }
            catch(Exception e)
            {
                break;
            }
        }
    }
}