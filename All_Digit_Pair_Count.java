// The program must accept N integers as the input. The program must print the number of
// pairs X where the concatenation of the two integers in the pair consists of all the digits from
// 0 to 9 in any order at least once.

// Boundary Condition(s):
// 1 <= N <= 10
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains X.

// Example Input/Output 1:
// Input:
// 6
// 38479 74180 967132 1584604 726510 6512160

// Output:
// 3

// Explanation:
// The 3 possible pairs are given below.
// (38479, 726510) 38479726510
// (38479, 6512160) 384796512160
// (967132, 1584604) 9671321584604
// The concatenation of the two integers in each pair contains all the digits from 0 to 9 at least
// once.

// Example Input/Output 2:
// Input:
// 4
// 2670589 243106 3145987 5789

// Output:
// 4


import java.util.*;
public class All_Digit_Pair_Count
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),pair=0;
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.next();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                boolean[] num=new boolean[10];
                String temp=arr[i]+arr[j];
                int count=0;
                for(int k=0;k<temp.length();k++)
                    num[Integer.valueOf(temp.charAt(k))-'0']=true;
                for(int k=0;k<num.length;k++)
                    if(num[k])count++;
                if(count==num.length)pair++;
            }
        }
        System.out.print(pair);
    }
}