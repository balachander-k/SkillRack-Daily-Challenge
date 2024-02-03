// The program must accept two integers X and Y as the input. The program must
// form the smallest possible integer N based on the following conditions.
// - The integer N must be formed using all the digits of X.
// - The value of N must be greater than Y.
// Finally, the program must print the value of N as the output. If it is not possible to
// form such an integer then the program must print -1 as the output.
// Boundary Condition(s):
// 1 <= X,Y <=10^7

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains N or -1.

// Example Input/Output 1:
// Input:
// 459 500

// Output:
// 549

// Explanation:
// All the possible integers that can be formed using the digits of 459 are 459, 495,
// 549, 594, 945 and 954.
// Here 549 is the smallest possible integer which is greater than 500.
// Hence the output is 549

// Example Input/Output 2:
// Input:
// 456 660

// Output:
// -1

import java.util.*;
public class Smallest_Integer_Greater_Than_Y{
    
    public static ArrayList<Integer> list=new ArrayList<Integer>();    
    public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
    public static void generatePermutation(String str, int start, int end)  
    {  
        if (start == end-1)  
            list.add(Integer.valueOf(str));
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                str = swapString(str,start,i);  
                generatePermutation(str,start+1,end);  
                str = swapString(str,start,i);  
            }  
        }  
    } 
    public static void main(String[] args)  
    {  
        Scanner obj=new Scanner(System.in);
        int count=0;
        String x=obj.next(),y=obj.next();
        generatePermutation(x,0,x.length());
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>Integer.valueOf(y))
            {
                System.out.print(list.get(i));
                count++;
                break;
            }
        }
        if(count==0)System.out.print("-1");
    }  
      
}  