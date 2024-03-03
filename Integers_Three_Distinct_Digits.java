// The program accepts N integers and prints the integers which are having at least
// three distinct digits. If there is no such integer, the program must print -1 as the
// output.

// Boundary Condition(s):
// 1 >= N <= 100
// 100 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the integers which are having at least three distinct digits
// separated by a space or -1.

// Example Input/Output 1:
// Input:
// 5
// 488 978 1432 151 5070

// Output:
// 978 1432 5070

// Explanation:
// The integer 488 contains 2 distinct digits.
// The integer 978 contains 3 distinct digits.
// The integer 1432 contains 4 distinct digits.
// The integer 151 contains 2 distinct digits.
// The integer 5070 contains 3 distinct digits.
// Hence the output is 978 1432 5070

// Example Input/Output 2:
// Input:
// 4
// 100 474 255 666

// Output:
// -1


import java.util.*;
public class Integers_Three_Distinct_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0;
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N;i++)
        {
            char[] carr=arr[i].toCharArray();
            HashSet<Integer> has=new HashSet<Integer>();
            for(int j=0;j<carr.length;j++)
                has.add(Integer.valueOf(carr[j]-'0'));
            if(has.size()>=3)
            {
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        if(count==0)System.out.print("-1");
    }
}