// The program must accept three integers N, K and X as the input. The program
// must print the count of subsets of size K in N which are divisible by X as the
// output.

// Boundary Condition(s):
// 1 <= N <= 10^18
// 1 <= K < = Total number of digits in N
// 1 <= X <= N

// Input Format:
// The first line contains N, K and X separated by a space.

// Output Format:
// The first line contains the count of subsets of size K in N which are divisible by X.

// Example Input/Output 1:
// Input:
// 2421036 2 6

// Output:
// 3

// Explanation:
// The possible subsets of size 2 in 2421036 are 24, 42, 21, IO and 36. Here, the
// subsets 24, 42 and 36 are divisible by 6.
// Hence the output is 3

// Example Input/Output 2:
// Input:
// 900456 3 9

// Output:
// 1

import java.util.*;
public class Subsets_Of_Size_K_Divisbile_By_X 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        char[] N=obj.next().toCharArray();
        int k=obj.nextInt(),x=obj.nextInt(),count=0;
        for(int i=0;i<N.length;i++)
        {
            try{
                String temp=String.valueOf(N[i]);
                int r=i+1;
                for(int j=0;j<k-1;j++)
                {
                    temp+=String.valueOf(N[r]);
                    r++;
                }
                list.add(Integer.parseInt(temp));
            }
            catch(Exception e)
            {
                break;
            }
        }
        for(int i=0;i<list.size();i++)
        {
            int len=(int)Math.log10(list.get(i))+1;
            if(list.get(i)%x==0 && len==k)
                count++;
        }
        System.out.print(count);
    }
}