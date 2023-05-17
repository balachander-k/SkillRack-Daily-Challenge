// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.
// Note: N is always a non-zero value.

// Boundary Condition(s):
// -100 < = N <= 100

// Input Format:
// The first line contains the value Of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example

// Input/Output section.
// Example Input/Output 1:
// Input:
// 4

// Output:
// 1 * * *
// 2 3 * *
// 4 5 6 *
// 7 8 9 10


// Example Input/Output 2:
// Input:
// -4

// Output:
// * * * 1
// * * 3 2
// * 6 5 4
// 10 9 8 7 



import java.util.*;
public class Signed_Mirror_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=1,star=a-1,val=1,n=0;
        int[] arr=new int[100];
        if(a>0)
        {
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<val;j++)
                {
                    System.out.print(b+" ");
                    b++;
                }
                for(int k=0;k<star;k++)
                    System.out.print("*"+" ");
            star--;
            val++;
            System.out.println();
            }
        }
        if(a<0)
        {
            int temp=Math.abs(a),sub=temp-1,store=1,y=1,q=0,iter=0;
            for(int i=0;i<temp;i++)
            {
                for(int j=0;j<sub;j++)
                    System.out.print("*"+" ");
                for(int k=0;k<y;k++)
                {
                    arr[n]=store;
                    n++;
                    store++;
                }
                for(int k=n-1;k>=0;k--)
                    System.out.print(arr[k]+" ");
                n=0;
                sub--;
                y++;
                System.out.println();
            }
        }
    }
}