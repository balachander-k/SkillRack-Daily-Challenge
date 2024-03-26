// The program must accept N integers and an integer K as the input The program
// must print the largest integer among the N integers as the output.

// Boundary Condition(s):
// 1 <= N,K <= 1000
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N and K separated by a space-
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the Kth largest integer among the N integers.

// Example Input/Output I:
// Input
// 9 3
// 38 92 83 58 78 86 20 92 81

// Output
// 83

// Explanation:
// Here and K=3,
// The ISt largest integer is 92.
// The 2nd largest integer is 86.
// The 3rd largest integer is 83, so 83 is printed as the output

// Example Input/Output 2:
// Input
// 6 4
// 87 94 91 79 87 87

// Output
// 79

import java.util.*;
public class Nth_Integers_Kth_Largest_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        HashSet<Integer> list=new HashSet<Integer>();
        int N=obj.nextInt(),k=obj.nextInt(),c=1;
        for(int i=0;i<N;i++)
            list.add(obj.nextInt());
        List<Integer> val=new ArrayList<Integer>(list);
        Collections.sort(val);
        for(int i=val.size()-1;i>=0;i--)
        {
            if(c==k){
                System.out.print(val.get(i));break;}
            c++;
        }
    }
}