// The program must accept an integer array of size N and an integer K as the input.
// The program must print the output based on the following conditions.
// - After sorting the first K integers in the array, if all the integers in the array in
// sorted order then the program must print YES.
// - Else the program must print NO as the output

// Boundary Condition(s):
// 2 <= N <=100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains K.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 9
// 39 23 19 27 41 55 69 88 97
// 4

// Output:
// YES

// Explanation:
// The 9 integers are 39 23 19 27 41 55 69 88 97.
// After sorting the first 4 integers in ascending order, the integers become 19 23 27
// 3941 55 69 88 97.
// Now, all the 9 integers are in ascending order. So YES is printed.

// Example Input/Output 2:
// Input:
// 5
// 25 39 41 85 27
// 3

// Output:
// NO

import java.util.*;
public class First_K_Integers_Sorting
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list3=new ArrayList<Integer>();
        int N=obj.nextInt(),count=0;
        for(int i=0;i<N;i++)
            list1.add(obj.nextInt());
        ArrayList<Integer> list2=new ArrayList<Integer>(list1);
        int k=obj.nextInt();
        Collections.sort(list2);
        for(int i=0;i<N;i++)
        {
            if(i<k)
                list3.add(list2.get(i));
            else 
                list3.add(list1.get(i));
        }
        for(int i=0;i<N;i++)
            if(list2.get(i)==list3.get(i))
                count++;
        System.out.print((count==N)?"YES":"NO");
    }
}