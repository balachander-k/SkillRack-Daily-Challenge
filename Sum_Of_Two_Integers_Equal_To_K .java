// The program must accept N integers and an integer K as the input. The program
// must print yes if the sum of any two integers among the N integers is equal to K.
// Else the program must print no as the output.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= K, Each integer value <= 10^8

// Input Format:
// The first line contains N and K separated by a space.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// 5 10
// 2 5 8 4 7

// Output:
// yes

// Explanation:
// The sum of 2 and 8 is 10. So yes is printed.

// Example Input/Output 2:
// Input:
// 4 25
// 12 24 15 11

// Output:
// no


import java.util.*;
public class Sum_Of_Two_Integers_Equal_To_K 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),K=obj.nextInt(),count=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i!=j)
                {
                    int sum=arr[i]+arr[j];
                    if(sum==K)
                        count++;
                }
            }
        }
        System.out.print((count!=0)?"yes":"no");
    }
}