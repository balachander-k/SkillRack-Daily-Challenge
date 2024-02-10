// The program must accept N integers as the input. The program must print the
// count of triplets where the three integers are in strictly increasing order in the
// given N integers as the output.

// Note: The order of integers in the triplets must be in the same order as in the
// input

// Boundary Condition(s):
// 3 N < = 100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the count of triplets where the three integers are in strictly
// increasing order in the given N integers.

// Example Input/Output 1:
// Input:
// 5
// 3 4 1 8 7

// Output:
// 2

// Explanation:
// The 2 triplets are given below.
// 3 < 4 < 8
// 3 < 4 < 7

// Example Input/Output 2:
// Input:
// 8
// 60 84 17 26 76 87 72 19

// Output:
// 7
// Explanation:
// The 7 triplets are given below.
// 60 < 84 < 87
// 60 < 76 < 87
// 17 < 26 < 76
// 17 < 26 < 87
// 17 < 26 < 72
// 17 < 76 < 87
// 26 < 76 < 87


import java.util.*;
public class Count_Of_Triplets_Sorted_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<arr.length-2;i++)
            for(int j=i+1;j<arr.length-1;j++)
                for(int k=j+1;k<arr.length;k++)
                    if((arr[i]<arr[j])&&(arr[j]<arr[k]))
                        count++;
        System.out.print(count);
            
                
            
        
    }
}