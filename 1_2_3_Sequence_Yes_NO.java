// The program must accept N integers as the input. The program must print YES if
// the sequence 1 2 3 has occurred in the N integers. Else the program must print
// NO as the output.

// Boundary Condition(s):
// 3 <= N < = 100
// 1 <= Each integer value <=3

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 5
// 1 1 2 3 1

// Output:
// YES

// Explanation:
// The sequence 1 2 3 has occurred in the given 5 integers.
// So YES is printed as the output.

// Example Input/Output 2:
// Input:
// 6
// 1 2 1 2 1 3
// Output:
// NO

import java.util.*;
public class 1_2_3_Sequence_Yes_NO
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            try{
            if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
            {
                count++;
                break;
            }
            }
            catch(Exception e)
            {
                break;
            }
        }
        System.out.print((count!=0)?"YES":"NO");
    }
}