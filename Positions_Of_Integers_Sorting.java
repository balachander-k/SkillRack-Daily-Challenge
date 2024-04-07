// The program must accept N unique integers as the input. The program must sort
// the integers in ascending order. Then the program must print the original
// positions of the integers in the sorted integers as the output.

// Boundary Condition(s):
// 2 <= N <= 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the original positions of the integers in the sorted integers.

// Example Input/Output 1:
// Input:
// 6
// 27 68 12 39 74 75

// Output:
// 3 1 4 2 5 6

// Explanation:
// The 6 integers are 27 68 12 39 74 75.
// After sorting the integers in ascending order, the integers become 12 27 39 68 74
// 75.
// The original position of the integer 12 is 3. So 3 is printed.
// The original position of the integer 27 is 1. So 1 is printed.
// The original position of the integer 39 is 4. So 4 is printed.
// The original position of the integer 68 is 2. So 2 is printed.
// The original position of the integer 74 is 5. So 5 is printed.
// The original position of the integer 75 is 6. So 5 is printed.

// Example Input/Output 2:
// Input:
// 9
// 60 78 90 59 50 51 47 13 79

// Output:
// 8 7 5 6 4 1 2 9 3


import java.util.*;
public class Positions_Of_Integers_Sorting
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> asce=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
        {
            list.add(obj.nextInt());
            asce.add(obj.nextInt());
        }
        Collections.sort(asce);
        for(int i=0;i<asce.size();i++)
        {
            int t=asce.get(i);
            for(int j=0;j<list.size();j++)
            {
                if(t==list.get(j))
                {
                    System.out.print((j+1)+" ");
                    break;
                }
            }
        }
    }
}