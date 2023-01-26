// The program must accept N integers as the input. The program must print the second distinct integer in the given order among the N integers as the output.
// Note: There will be at least twpo distinct integers.

// Boundary Condition(s);
// 2<= N <=100

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the second distinct integer.

// Example Input/Output 1:
// Input:
// 5
// 12 12 12 13 14

// Output:
// 13

// Explanation:
// The distinct integers are 12,13 and 14.
// The second distinct integer is 13.

// Example Input/Output 2:
// Input:
// 7
// 45 45 45 45 78 78 89

// Output:
// 78


import java.util.*;
public class Second_Distinct_Integer 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)array[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]==array[j])
                {
                    for(int k=j;k<size;k++)
                    {
                        if(k+1<size)
                        {
                            array[k]=array[k+1];
                        }
                    }
                    j--;
                    size--;
                }
            }
        }
        System.out.print(array[1]);
    }
}