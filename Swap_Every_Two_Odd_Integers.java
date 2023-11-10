// The program must accept N integers as the input. The program must swap every
// two odd integers in their positions among the N integers. The program must print
// the revised values of N integers as the output. If the number of odd integers in the
// given N integers is odd then the program must keep that last odd integer as it is.

// Boundary Condition(s):
// 2 <= N <= 1000
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the revised values of N integers separated by a space.

// Example Input/Output 1:
// Input:
// 7
// 22 23 51 56 69 53 29

// Output:
// 22 51 23 56 53 69 29

// Explanation:
// After swapping the first two odd integers 23 and 51 in the given 7 integers, the
// integers become 22 51 23 56 69 53 29.
// After swapping the last two odd integers 69 and 53 in the given 7 integers, the
// integers become 22 51 23 56 53 69 29.
// Hence the output is 22 51 23 56 53 69 29

// Example Input/Output 2:
// Input:
// 5
// 3 4 7 21 89

// Output:
// 7 4 3 89 21


import java.util.*;
public class Swap_Every_Two_Odd_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0,f=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
                if(count==1)
                    f=i;
                if(count==2)
                {
                    int t=arr[f];
                    arr[f]=arr[i];
                    arr[i]=t;
                    count=0;
                }
            }
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
}
    