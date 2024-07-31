// The program must accept N integers as the input. The program must sort the N integers in
// ascending order based on the smallest digit in each integer. If two or more integers have
// the same smallest digit, then the program must sort those integers in descending order.
// Finally, the program must print the N sorted integers as the output.

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
// 7
// 6844 25171 53677 18072 26457 70816 59225

// Output:
// 70816 18072 25171 59225 26457 53677 6844

// Explanation:
// The smallest digit in 6844 is 4.
// The smallest digit in 25171 is 1.
// The smallest digit in 53677 is 3.
// The smallest digit in 18072 is O.
// The smallest digit in 26457 is 2.
// The smallest digit in 70816 is O.
// The smallest digit in 59225 is 2.
// After sorting the integers based on the smallest digit in each integer, the integers become
// 70816, 18072, 25171, 59225, 26457, 53677 and 6844.
// Hence the output is
// 70816 18072 25171 59225 26457 53677 6844

// Example Input/Output 2:
// Input:
// 5
// 7287 9836 47 76 99234

// Output:
// 99234 7287 9836 47 76


import java.util.*;
public class Sort_Based_On_Smallest_Integer 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=obj.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.next();
        for(int i=0;i<n;i++)
        {
            char[] charr=arr[i].toCharArray();
            Arrays.sort(charr);
            list.add(Integer.valueOf(charr[0])-'0');
        }
        Collections.sort(list);
        Set<Integer> l=new LinkedHashSet<Integer>();
        ArrayList<Integer> q=new ArrayList<Integer>(l);
        for(int i=0;i<l.size();i++)
        {
            int count=0;
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<n;j++)
            {
                char[] charr=arr[j].toCharArray();
                Arrays.sort(charr);
                int t=q.get(i),z=Integer.valueOf(charr[0])-'0';
                if(z==t)temp.add(Integer.valueOf(arr[j]));
            }
            Collections.sort(temp,Collections.reverseOrder());
            for(int j=0;j<temp.size();j++)
                System.out.print(temp.get(j)+" ");
        }
    }
}