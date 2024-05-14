// The program must accept N unique integers as the input. The program must print the
// largest integer among the N integers as the output. Then the program must print the
// remaining integers in the left and right side of the largest integer alternatively as the output.

// Boundary Condition(s):
// 3 <= N <= 100
// 1 <= Each integer value <= 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the integers based on the given conditions.

// Example Input/Output 1:
// Input
// 5
// 12 45 78 56 23

// Output:
// 78 45 56 12 23

// Explanation:
// The largest integer among the 5 integers is 78. So 78 is printed.
// Then the remaining integers present in the left and right side of the largest integer 78 are
// printed alternatively (45 56 12 23).

// Example Input/Output 2:
// Input:
// 8
// 26 43 49 30 3 63 44 56

// Output:
// 63 3 44 30 56 49 43 26

// Example Input/Output 3:
// Input:
// 6
// 67 23 56 87 21 90

// Output:
// 90 21 87 56 23 67

import java.util.*;
public class Alternate_Left_&_Right
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> righ=new ArrayList<Integer>();
        int N=obj.nextInt(),max=Integer.MIN_VALUE,ind=0,l=0,r=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]>max){max=arr[i];
                ind=i;}
        }
        System.out.print(arr[ind]+" ");
        for(int i=ind-1;i>=0;i--)
            left.add(arr[i]);
        for(int i=ind+1;i<N;i++)
            righ.add(arr[i]);
        while(true)
        {
            if(!left.isEmpty())
            {
                System.out.print(left.get(0)+" ");
                left.remove(0);
            }
            if(!righ.isEmpty())
            {
                System.out.print(righ.get(0)+" ");
                righ.remove(0);
            }
            if(left.isEmpty() && righ.isEmpty())
                break;
        }
        
    }
}