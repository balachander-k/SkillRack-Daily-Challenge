// The program must accept an integer N as the input. The program must print the next
// greater integer of N having no consecutive Is in its binary representation. If there are no
// consecutive Is in the binary representation of N, the program must print the integer N as
// the output.

// Boundary Condition(s):
// 2 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains N or the next greater integer of N having no consecutive Is in its
// binary representation.

// Example Input/Output 1:
// Input
// 6

// Output:
// 8

// Explanation:
// Here N = 6.
// The binary representation of 6 is 110 (2 consecutive Is).
// The binary representation of 7 is 111 (3 consecutive Is).
// The binary representation of 8 is 1000 (NO consecutive Is).
// So 8 is printed as the output.

// Example Input/Output 2:
// Input:
// 9

// Output:
// 9

import java.util.*;
public class Next_Greater_No_Consectuive_1's
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=N;
        while(true)
        {
            String bin=Integer.toBinaryString(t);
            int count=0;
            for(int i=0;i<bin.length()-1;i++)
                if(bin.charAt(i)=='1' && bin.charAt(i+1)=='1')
                    count++;
            if(count==0)
                break;
            t++;
        }
        System.out.print(t);
    }
}