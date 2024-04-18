// The program must accept N integers as the input. The program must sort the
// integers based on the number of ones in their binary representation in descending
// order. If more than one integers have the same number of ones in their binary
// representation, the program must sort those integers in ascending order. Finally,
// the program must print the N sorted integers as the output.

// Boundary Condition(s):
// 2 <= N <= 1000
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the N sorted integers separated by a space.

// Example Input/Output 1:
// Input:
// 6
// 65 2 78 790 10 31

// Output:
// 31 790 78 10 652

// Explanation:
// The binary representation of 790 is 1100010110.
// The binary representation of 78 is 1001110.
// The binary representation of 10 is 1010.
// The binary representation of 65 is 1000001.
// The binary representation of 2 is 10.
// Here the 6 integers are sorted based on the number of ones in their binary
// representation.
// Example Input/Output 2:
// Input:
// 5
// 9 15 6 4 14

// Output:
// 15 14 6 9 4


import java.util.*;
public class Sort_Integers_Based_On_Ones
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int N=obj.nextInt();
        for(int i=0;i<N;i++)
            list.add(obj.nextInt());
        for(int i=0;i<N;i++)
        {
            int maxone=Integer.MIN_VALUE,index=0;
            for(int j=0;j<list.size();j++)
            {
                String val=Integer.toBinaryString(list.get(j));
                int one=0;
                for(int k=0;k<val.length();k++)
                    if(val.charAt(k)=='1')
                        one++;
                if(one>maxone)
                {
                    maxone=one;
                    index=j;
                }
                if(one>=maxone)
                    if(list.get(j)<list.get(index))
                        index=j;
            }
            System.out.print(list.get(index)+" ");
            list.remove(index);
        }
    }
}