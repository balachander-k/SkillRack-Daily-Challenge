// The program must accept N integers as the input. The program must print the odd integers followed by the even integers as the output.

// Boundary Condition(s);
// 1<= N <= 1000
// -999 <= Each integer value <= 999

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the odd integers followed by the even integers separated by a space.

// Example Input/Output 1:
// Input:
// 6
// 65 10 -41 80 -55 -26

// Output:
// 65 -41 -55 10 80 -26

// Explanation:
// The odd integers are 65, -41 and -55.
// The even integers are 10, 80 and -26.
// So print the odd integers followed by the even integers.
// Hence the output is 65 -41 -55 10 80 -26

// Example Input/Output 2:
// Input:
// 9
// 88 40 89 95 90 53 61 79 16

// Output:
// 89 95 53 61 79 88 40 90 16



import java.util.*;
public class Odd_Followed_By_Even
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int[] c=new int[a];
        int[] d=new int[a];
        int k=0,h=0;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(b[i]%2==0)
            {
                d[k]=b[i];
                k++;
            }
            else 
            {
                c[h]=b[i];
                h++;
            }
        }
        for(int i=0;i<h;i++)
            System.out.print(c[i]+" ");
        for(int i=0;i<k;i++)
            System.out.print(d[i]+" ");
    }
}