// The program must accept two lines of N positive integers each as the input. The
// program must print the integers from the first line whose sum of digits present in
// the second line. If there is no such integer in the first line, then the program must
// print -1 as the output.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains N integers separated by a space.

// Output Format:
// The first line contains the integers in the first line whose sum of digits present in
// the second line.

// Example Input/Output 1:
// Input:
// 5
// 53 23 57 123 457
// 12 16 8 21 17

// Output:
// 53 57 457

// Explanation:
// The sum of digits in 53, 23, 57, 123 and 457 are 8, 5, 12, 6 and 16 respectively.
// The integers 8, 12 and 16 are present in the second line. So their corresponding
// integer values 53, 57 and 457 are printed as the output.

// Example Input/Output 2:
// Input:
// 7
// 7211 275 888 112 205 385 400
// 7 24 33 10 4 3 14

// Output:
// 275 888 112 205 400

// Example Input/Output 3:
// Input:
// 8
// 556 403 910 120 219 317 177 767
// 13 9 17 6 22 19 4 2

// Output:
// -1


import java.util.*;
public class Integers_Digits_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        LinkedHashSet<Integer> list=new LinkedHashSet<Integer>();
        int N=obj.nextInt(),c=0;
        int[] first=new int[N],second=new int[N];
        for(int i=0;i<N;i++)
            first[i]=obj.nextInt();
        for(int i=0;i<N;i++)
            second[i]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            int temp=first[i],sum=0;
            while(temp!=0)
            {
                int rev=temp%10;
                sum+=rev;
                temp/=10;
            }
            for(int j=0;j<N;j++)
                if(sum==second[j])
                    list.add(first[i]);
        }
        if(!list.isEmpty())
            for(int t:list)
                System.out.print(t+" ");
        else System.out.print("-1");
    }
}