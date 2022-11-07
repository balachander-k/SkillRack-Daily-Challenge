// The program must accept an integer N as the input. The program must replace the odd digits by 1 and replace the even digits by 0 in N. Finally, the program must print the modified value of N as the output.

// Boundary Conditions(s);
// 1<=N<=10^7

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the modified value of N.

// Example Input/Output 1:
// Input:
// 2345

// Output:
// 0101

// Explanation:
// The digits 2 and 4 are even in 2345, so replace 2 and 4 as 0 (0305).
// The digits 3 and 5 are odd in 0305, so replace 3 and 5 as 1 (o1o1).
// Hence the output is 0101

// Example Input/Output 2:
// Input:
// 657762

// Output:
// 011100



import java.util.*;
public class Replace_Odd_And_Even_Digits.
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int rem,count=0,store,k=0,t,temp;
        temp=a;
        while(temp!=0)
        {
            rem=temp%10;
            count++;
            temp=temp/10;
        }
        int[] b=new int[count];
        while(a!=0)
        {
            store=a%10;
            b[k]=store;
            k++;
            a=a/10;
        }
        t=count-1;
        for(int i=t;i>=0;i--)
        {
            if(b[i]%2==0)
                System.out.print("0");
            else 
                System.out.print("1");
        }
    }
}