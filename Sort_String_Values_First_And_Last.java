// The program must accept N string values and sort them. Then the program must
// print the first and the last string values.

// Boundary Condition(s):
// 2 <= N < = 100
// 1 <= Length of each string <= 100

// Input Format:
// The first line contains N.
// The second line contains N string values separated by a space.

// Output Format:
// The first line contains the first string value in the N sorted string values.
// The second line contains the last string value in the N sorted string values.

// Example Input/Output 1:
// Input:
// 5
// lion tiger elephant monkey leopard

// Output:
// elephant
// tiger

// Explanation:
// Here N = 5.
// After sorting the 5 string values, the string values become elephant leopard lion
// monkey tiger
// Here, the first and the last string values are elephant and tiger.
// Hence the output is
// elephant
// tiger

// Example Input/Output 2:
// Input:
// 4
// bluebell rose bluebell sunflower

// Output:
// bluebell
// sunflower


import java.util.*;
public class Sort_String_Values_First_And_Last
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        Arrays.sort(arr);
        System.out.print(arr[0]+"\n"+arr[N-1]);
    }
}