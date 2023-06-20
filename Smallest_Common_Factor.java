// The program must accept two positive integers Nl and N2 as the input. The
// program must print the smallest common factor of Nl and N2 which is greater than
// 1 as the output. If there is no common factor other than 1 then the program must
// print -1 as the output.

// Boundary Condition(s):
// 2 <= Nl, N2 <= 10^8

// Input Format:
// The first line contains the values of Nl and N2 separated by space(s).

// Output Format:
// The first line contains the common factor.

// Example Input/Output 1:
// Input:
// 15 30

// Output:
// 3

// Explanation:
// 3 is the smallest number (greater than 1) which divides both 15 and 30.
// Hence 3 is printed.

// Example Input/Output 2:
// Input:
// 3 7
// Output:
// -1


import java.util.*;
public class Smallest_Common_Factor
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),count=0;
        int[] arr={a,b};
        int[] freq=new int[999999];
        for(int i=0;i<2;i++)
        {
            int value=arr[i];
            for(int j=1;j<=value;j++)
            {
                if(value%j==0)
                {
                    int temp=freq[j];
                    freq[j]=++temp;
                }
            }
        }
        for(int i=2;i<freq.length;i++)
        {
            if(freq[i]==2)
            {
                System.out.print(i);
                count++;
                break;
            }
        }
        if(count==0)System.out.print("-1");
    }
}