// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1<= N <=50

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first N lines containing the desired pattern as shown in the Example


// Example Input/Output 1:
// Input:
// 4

// Output:
// 4 3 2 1 
// 5 6 7 8
// 12 11 10 9
// 13 14 15 16

// Example Input/Output 2:
// Input:
// 3

// Output:
// 3 2 1
// 4 5 6
// 9 8 7

import java.util.*;
public class Zig_Zag_From_Top_Right
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a,end=1,rev=0,count=0,k=0;
        int[] array=new int[a];
        for(int i=0;i<a;i++)
        {
            for(int j=temp;j>=end;j--)
            {
                if(count%2==0)
                    System.out.print(j+" ");
                else 
                {
                    array[k]=j;
                    k++;
                    rev++;
                }
            }
            count++;
            if(rev!=0)
            {
                for(int j=a-1;j>=0;j--)
                    System.out.print(array[j]+" ");
                rev=0;
                k=0;
            }
            temp=temp+a;
            end=end+a;
            System.out.println();
        }
    }
}