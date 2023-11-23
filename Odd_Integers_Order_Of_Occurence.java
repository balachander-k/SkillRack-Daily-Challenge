// The program must accept two lines of N integers each as the input. The program
// must print the odd integers from both the lines based on their order of
// occurrences as the output. If both lines having odd integers in the same position
// then print the odd integer from the first line followed by the odd integer from the
// second line.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Each integer value <= 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains N integers separated by a space.

// Output Format:
// The first line contains the odd integers based on their order of occurrences.

// Example Input/Output 1:
// Input:
// 5
// 11 10 12 13 77
// 45 44 44 43 10

// Output:
// 11 45 13 43 77

// Explanation:
// The odd integers in the ISt line are 11 13 and 77.
// The odd integers in the 2nd list are 45 and 43.
// So, those odd integers are printed based on their order of occurrences.
// Hence the output is 11 45 13 43 77

// Example Input/Output 2:
// Input:
// 6
// 12 11 14 13 10 20
// 8 15 24 22 13 19

// Output:
// 11 15 13 13 19

// Example Input/Output 3:
// Input:
// 4
// 3 1 4 8
// 6 2 7 9

// Output:
// 3 1 7 9

import java.util.*;
public class Odd_Integers_Order_Of_Occurence
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0;
        int[] arr1=new int[size];
        int[] arr2=new int[size];
        for(int i=0;i<size;i++)
            arr1[i]=obj.nextInt();
        for(int i=0;i<size;i++)
            arr2[i]=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr1[i]%2!=0)
            {
                System.out.print(arr1[i]+" ");
                count++;
            }
            if(count!=0)
            {
                if(arr2[i]%2!=0)    
                    System.out.print(arr2[i]+" ");
                count=0;
            }
            else if(arr2[i]%2!=0)
                System.out.print(arr2[i]+" ");
        }
        
    }
}