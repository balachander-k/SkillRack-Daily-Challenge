// The program must accept an integer N as the input. The program must replace the odd digits by even digits and replace the even digits by odd digits in the given order. Then the program must print the modified N as the output.

// Note: The number of odd digits will be equal to the number of even digits.

// Boundary Condition(s);
// 1<= N <=10^9

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the modified N.

// Example Input/Output 1:
// Input:
// 534632

// Output:
// 465323

// Explanation:
// The odd digits 5 3 and 3 are replaced by the even digits 4 6 and 2. Also, the even digits 4 6 and 2 replaced by the odd digits 5 3 and 3. So 465323 is printed as the output.

// Example Input/Output 2:
// Input:
// 2327

// Output:
// 3272



import java.util.*;
public class Replace_Odd_By_Even_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int[] odd=new int[a.length()];
        int[] even=new int[a.length()];
        int r=0,k=0,q=0,w=0;
        for(int i=0;i<a.length();i++)
        {
            int e=Integer.parseInt(String.valueOf(b[i]));
            if(e%2==0)
            {
                even[k]=e;
                k++;
            }
            else 
            {
                odd[r]=e;
                r++;
            }
        }
        for(int i=0;i<a.length();i++)
        {
            int e=Integer.parseInt(String.valueOf(b[i]));
            if(e%2==0)
            {
                System.out.print(odd[w]);
                w++;
            }
            else 
            {
                System.out.print(even[q]);
                q++;
            }
        }
    }
}