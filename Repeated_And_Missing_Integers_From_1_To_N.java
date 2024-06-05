// The program must accept a list of integers that have integers ranging from 1 to N, but an
// integer in the list is repeated, thus missing an integer in the list. The program must print the
// repeated integer and the missing integer between 1 to N. N will be the largest integer in the
// list and will always be present.

// Boundary Condition(s):
// 1 <= Each integer value <= 1000

// Input Format:
// The first line contains the list of integers separated by a space.

// Output Format:
// The first line contains the repeated integer and the missing integer separated by a space.

// Example Input/Output 1:
// Input:
// 3 1 2 5 3

// Output:
// 3 4 

// Explanation:
// The given integers are 3 1 2 5 3.
// The largest integer is 5, so N = 5.
// The repeated integer between 1 to 5 is 3.
// The missing integer between 1 to 5 is 4.
// Hence the output is 3 4

// Example Input/Output 2:
// Input:
// 9 3 4 5 6 8 2 5 1 10

// Output:
// 5 7

// Example Input/Output 3:
// Input:
// 14 15 8 9 2 1 7 3 2 4 5 6 11 12 13

// Output:
// 2 10


import java.util.*;
public class Repeated_And_Missing_Integers_From_1_To_N
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine();
        String[] carr=val.split(" ");
        int[] arr=new int[carr.length],freq=new int[(carr.length)+1];
        int w=0;
        for(int i=0;i<carr.length;i++)
            arr[w++]=Integer.valueOf(carr[i]);
        for(int i=0;i<arr.length;i++)
            freq[arr[i]]++;
        for(int i=0;i<freq.length;i++)
            if(freq[i]>1)System.out.print(i+" ");
        for(int i=1;i<=carr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
                if(arr[j]==i)
                    count++;
            if(count==0)System.out.print(i+" ");
        }
    }
}