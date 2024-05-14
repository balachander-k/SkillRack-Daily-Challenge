// The program must accept N integers as the input. The program must print yes if the N
// integers are alternating between odd and even integers. Else the program must print no as
// the output.

// Boundary Condition(s):
// 2 <= N <= 10 
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains yes or no.
// Example Input/Output 1:
// Input
// 5
// 12 25 456 875 1000
// Output:
// yes
// Explanation:
// The first integer 12 is even.
// The second integer 25 is odd.
// The third integer 456 is even.
// The fourth integer 875 is odd.
// The fifth integer 1000 is even.
// Here the integers are alternating between even and odd integers.
// So yes is printed as the output.

// Example Input/Output 2:
// Input
// 6
// 11 22 745 466 31 24

// Output:
// yes

// Example Input/Output 3:
// Input
// 4
// 207 552 871 903

// Output:
// no


import java.util.*;
public class Check_Alternate_OddEven
{
    
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),evod=0,odev=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]%2==0 && arr[i+1]%2!=0)
                evod++;
            if(arr[i]%2!=0 && arr[i+1]%2==0)
                odev++;
        }
        if(N%2!=0)
        {
            if(evod==N/2 && arr[N-1]%2==0)
                System.out.print("yes");
            else if(odev==N/2 && arr[N-1]%2!=0)
                System.out.print("no");
            else 
                System.out.print("no");
        }
        else 
            System.out.print((odev==N/2 || evod==N/2)?"yes":"no");
    }
}