// The program must accpet an integer N as the input. The program must print the sum of the fist N terms in the series given below.
// The order of the series must be 1,-2,3,-4,5,-6 and so on (All the odd terms in the series formed from the positive odd numbers and all the even terms in the series formed the negative even number(s).

// Boundary Condition(s);
// 1<= N <=10^4

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the sum of the first N terms in the above mentioned series.

// Example Input/Output 1:
// Input:
// 5

// Output:
// 3

// Explanation:
// The first 5 terms are 1,-2,3,-4,5 and their sum is 3(1 - 2+ 3 - 4 +5).
// Hence the output is 3.

// Example Input/Output 2:
// Input:
// 8

// Output:
// -4


import java.util.*;
public class Positive_Negative_Series
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] array=new int[a];
        int k=0,sum=0;
        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
                array[k]=i;
            else 
                array[k]=-i;
            k++;
        }
        for(int i=0;i<k;i++)
            sum=sum+array[i];
        System.out.print(sum);
    }
}