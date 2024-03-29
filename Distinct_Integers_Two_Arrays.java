// The program must accept two integer arrays of size M and N as the input. The
// program must print the distinct integers in the two arrays in sorted order as the
// output.

// Boundary Condition(s):
// 2 <= M, N <= 100
// 1 <= Each integer value <= 1000

// Input Format:
// The first line contains M and N separated by a space.
// The second line contains M integers separated by a space.
// The third line contains N integers separated by a space.

// Output Format:
// The first line contains the distinct integers in the two arrays in sorted order.

// Example Input/Output 1:
// Input:
// 10 5
// 50 40 60 20 20 50 10 50 60 40
// 45 45 45 50 60

// Output:
// 10 20 40 45 50 60

// Explanation:
// The distinct integers are 50 40 60 20 IO 45.
// After sorting the distinct integers, the integers become IO 20 40 45 50 60.
// Hence the output is 10 20 40 45 50 60

// Example Input/Output 2:
// Input:
// 4 5
// 2 2 1 1
// 5 6 7 3 4

// Output:
// 1 2 3 4 5 6 7


import java.util.*;
public class Distinct_Integers_Two_Arrays
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int M=obj.nextInt(),N=obj.nextInt(),w=M+N;
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i=0;i<w;i++)
            hash.add(obj.nextInt());
        List<Integer> val=new ArrayList<Integer>(hash);
        Collections.sort(val);
        for(int i=0;i<val.size();i++)
            System.out.print(val.get(i)+" ");
    }
}