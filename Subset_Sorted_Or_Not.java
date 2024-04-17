// The program must accept N integers and an integer K as the input. The program
// must print Yes if all the integers in any of the subsets of size K among the N
// integers are sorted (ascending order or descending order). Else the program must
// print No as the output.

// Boundary Condition(s):
// 2 <= K <= N <= 100

// Input Format:
// The first line contains N and K separated by a space.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains Yes or No.

// Example Input/Output 1:
// Input:
// 5 3
// 9 5 7 8 1

// Output:
// Yes

// Explanation:
// The integers in the first subset of size 3 are 9, 5 and 7.
// The integers in the second subset of size 3 are 5, 7 and 8.
// The integers in the third subset of size 3 are 7, 8 and 1.
// The integers in the second subset are sorted in ascending order.
// Hence the output is Yes

// Example Input/Output 2:
// Input:
// 12 4
// 3 1 12 9 11 7 10 8 2 5 6 4

// Output:
// No

// Example Input/Output 3:
// Input:
// 4 2 
// 98 65 21 10

// Output:
// Yes


import java.util.*;
public class Subset_Sorted_Or_Not
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),K=obj.nextInt(),yup=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<=Math.abs(N-K);i++)
        {
            ArrayList<Integer> list=new ArrayList<Integer>();
            int j=i,q=1,asc=1,dec=1;
            while(q<=K)
            {
                list.add(arr[j++]);
                q++;
            }
            for(int k=0;k<list.size()-1;k++)
                if(list.get(k)<=list.get(k+1))
                    asc++;
            for(int k=0;k<list.size()-1;k++)
                if(list.get(k)>=list.get(k+1))
                    dec++;
            if(asc==K || dec==K)
                yup++;
        }
        System.out.print((yup!=0)?"Yes":"No");
    }
}