// The program must accept N integers as the input. The program must sort the
// integers in ascending order based on the number of zeros in their binary
// representation. Then the program must print the N sorted integers as the output.
// If more than one integers have the same number of zeros in their binary
// representation, the program must sort those integers in the given order.

// Boundary Condition(s):
// 2 <= N < = 100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the N modified integers.
// Example Input/Output 1:
// Input:
// 4
// 14 488 64 47

// Output:
// 14 47 488 64

// Explanation:
// The binary representation of 14 is 1110 and the number of zeros in it is 1.
// The binary representation of 488 is 1 1 1101000 and the number of zeros in it is 4.
// The binary representation of 64 is 1000000 and the number of zeros in it is 6.
// The binary representation of 47 is 10111 and the number of zeros in it is 1.
// So they are sorted based on the number of zeros in their binary representation.

// Example Input/Output 2:
// Input:
// 5
// 4 3 8 7 1

// Output:
// 3 7 1 4 8

import java.util.*;
public class Sort_Integers_Based_On_Zeros
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int N=obj.nextInt(),t=0;
        int[] arr=new int[N];
        String[] str=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<N;i++)
            str[i]=Integer.toBinaryString(arr[i]);
        for(int i=0;i<str.length;i++)
        {
            char[] carr=str[i].toCharArray();
            int zero=0;
            for(int j=0;j<arr.length;j++)
                if(arr[j]=='0')zero++;
            list.add(zero);
        }
        for(int i=0;i<list.size();i++)
        {
            int min=Integer.MAX_VALUE,index=0;
            for(int j=0;j<list.size();j++)
            {
                if(list.get(j)<min)
                {
                    min=list.get(j);
                    index=j;
                }
            }
            System.out.print(arr[index]+" ");
            list.set(index,Integer.MAX_VALUE);
        }
    }
}