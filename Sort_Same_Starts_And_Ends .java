// The program must accept N string values containing only lower case alphabets as
// the input. The program must sort the string values starting and ending with the
// same alphabet. Then the program must print the N modified string values as the
// output.

// Boundary Condition(s):
// 2 <= N <= 50
// 2 <= Length of each string value <= 100

// Input Format:
// The first line contains N.
// The next N lines, each containing a string.

// Output Format:
// The first N lines, each containing a string representing the N modified string
// values.

// Example Input/Output 1:
// Input:
// 5
// rotator
// madam
// auto
// bomb
// travels

// Output:
// bomb
// madam
// auto
// rotator
// travels

// Explanation:
// The string values starting and ending with the same alphabet are rotator, madam
// and bomb.
// After sorting those 3 string values in their positions, the string values become
// bomb
// madam
// auto
// rotator
// travels

// Example Input/Output 2:
// Input:
// 6
// river
// steps
// chair
// libel
// window
// heath

// Output:
// heath
// libel
// chair
// river
// steps
// window


import java.util.*;
public class Sort_Same_Starts_And_Ends 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        int N=obj.nextInt(),w=0;
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N;i++)
        {
            char[] carr=arr[i].toCharArray();
            if(carr[0]==carr[carr.length-1])
                list.add(arr[i]);
        }
        Collections.sort(list);
        for(int i=0;i<N;i++)
        {
            char[] carr=arr[i].toCharArray();
            if(carr[0]==carr[carr.length-1])
                System.out.println(list.get(w++));
            else 
                System.out.println(arr[i]);
        }
    }
}