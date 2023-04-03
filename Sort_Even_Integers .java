// The program must accept N integers as the input. The program must sort only the
// even integers among the N integers in ascending order. The odd integers are
// retained in their same positions. Finally, the program must print the modified values
// Of N integers as the output.

// Boundary Condition(s):
// I <= N < = 100
// -999 < = Each integer value <= 999

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the modified values Of N integers separated by a space.

// Example Input/Output I:
// Input:
// 5
// 56 45 78 20 91

// Output:
// 20 45 56 78 91

// Explanation:
// The even integers are
// positions.
// and which are sorted (ascending order) in their
// The odd integers are 45 and 91 which are retained in their same positions.
// Hence the output is 20 45 56 78 91

// Example Input/Output 2:
// Input:
// 8
// 54 73 17 -6 -3 88 43 -90

// Output:
// -90 73 17 -6 -3 5443 88


import java.util.*;
public class Sort_Even_Integers 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=0,j=0,t=0;
        int[] array=new int[a];
        int[] even=new int[a];
        for(int i=0;i<a;i++)
            array[i]=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            if(array[i]%2==0)
            {
                even[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            for(int r=i+1;r<j;r++)
            {
                if(even[i]>even[r])
                {
                    temp=even[i];
                    even[i]=even[r];
                    even[r]=temp;
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            if(array[i]%2==0)
            {
                System.out.print(even[t]+" ");
                t++;
            }
            else 
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}