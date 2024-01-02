// The program must accept N integers as the input. For every two integers X and Y
// among the N integers, the program must remove the last digit of X and the first
// digit of Y and form an integer T by concatenating those digits. Then the program
// must insert the integer T between X and Y. Finally, the program must print the sum
// of 2N-1 integers as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <= 100
// 100 <= Each integer value <= 10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains 2N integer values as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 5
// 340 651 2000 3004 853

// Output:
// 34 + 6 + 5 + 12 + 0 + 3 + 0 + 48 + 53 = 161

// Explanation:
// The given 5 integers are 340, 651, 2000, 3004 and 853.
// After inserting the new integers between every two integers as per the given
// conditions, the integers become 34, 6, 5, 12 ,O, 3, O, 48 and 53.
// The sum of those integers is 161(34+6+5+12+0+3+0+48+53).
// Hence the output is 34 + 6+ 5 + 12 + 0 + 3 + 0 + 48 + 53 = 161

// Example Input/Output 2:
// Input:
// 3
// 60646 157 5878

// Output:
// 6064 + 61 + 5 + 75 + 878 = 7083

// Example Input/Output 3:
// Input:
// 4
// 100 1000 10000 100000

// Output:
// 10 + 1 + 0 + 1 + 0 + 1 + 0 = 13


import java.util.*;
public class Sum_Concatenate_First_And_Last_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),sum=0;
        String[] arr=new String[N];
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N-1;i++)
        {
            String f=arr[i],s=arr[i+1],cf="",cs="";
            String w=String.valueOf(f.charAt(f.length()-1))+String.valueOf(s.charAt(0));
            for(int j=0;j<f.length()-1;j++)
                cf=cf+f.charAt(j);
            for(int j=1;j<s.length();j++)
                cs=cs+s.charAt(j);
            int t=Integer.parseInt(cf),r=Integer.parseInt(w);
            list.add(t);list.add(r);
            if(i==N-2)
                list.add(Integer.parseInt(cs));
            arr[i+1]=cs;
        }
        for(int i=0;i<list.size();i++)
        {
            sum=sum+list.get(i);
            System.out.print(list.get(i));
            if(i!=list.size()-1)
                System.out.print(" + ");
        }
        System.out.print(" = "+sum);
    }
}