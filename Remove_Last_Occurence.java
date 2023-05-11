// The program must accept M and N integers as the input. For each integer I among
// the N integers, the program must remove the last occurrence of I from the M
// integers. Then the program must print the remaining integers of the M integers as
// the output.

// Note: If the integer to be removed is not present, then ignore it.

// Boundary Condition(s):
// 1 N < M < = 1000
// 1 Each integer value <= 1O^9

// Input Format:
// The first line contains M and N separated by a space.
// The second line contains M integers separated by a space.
// The third line contains N integers separated by a space.

// Output Format:
// The first line contains the remaining integers of the M integers separated by a space.

// Example Input/Output 1:
// Input:
// 8 3
// 1 4 7 21 4 7 4 21
// 4 1 7

// Explanation:
// The last occurrence of the integer 4 is at the position 7 which is removed.
// The integers become 1 4 7 21 4 7 21.
// Then the last occurrence of 1 is at the position 1 which is removed.
// The integers become 4 7 21 4 7 21.
// Then the last occurrence Of 7 in the remaining integers is at the position 5 which is
// removed.
// The integers become 4 7 21 4 21.
// Hence 4 7 21 4 21 is printed as the output.

// Example Input/Output 2:
// Input:
// 21 30 30 21 21 21
// 21 40 30 41

// Output:
// 21 30 21 21


import java.util.*;
public class Remove_Last_Occurence
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),count=0;
        int[] arr1=new int[a];
        int[] arr2=new int[b];
        for(int i=0;i<a;i++)
            arr1[i]=obj.nextInt();
        for(int i=0;i<b;i++)
            arr2[i]=obj.nextInt();
        for(int i=0;i<b;i++)
        {
            count=0;
            for(int j=a-1;j>=0;j--)
            {
                if(arr2[i]==arr1[j])
                {
                    count++;
                    if(count==1)
                        arr1[j]=-1;
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            if(arr1[i]!=-1)
                System.out.print(arr1[i]+" ");
        }
    }
}