// The program must accept N positive integetrs as the input. The program must print the integer which has the maximum digit sum. If more than one integer has the same digit sum then print the maximum integer among them.

// Boundary Condition(s);
// 1<= N <=1000
// 1<= Each integer value <=10^9

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the integer as per conditions mentioned above.

// Example Input/Output 1:
// Input:
// 5
// 44 73 114 253 235

// Outupt:
// 253

// Explanation:
// The digit sum of 44 is 8.
// The digit sum of 73 is 10.
// The digit sum of 114 is 6.
// The digit sum of 253 is 10.
// The digit sum of 235 is 10.
// Here the maximum digit sum is 10. But 73, 235 and 253 are having the same digit sum as 10.
// Hence the output is 253

// Example Input/Output 2:
// Input:
// 8 
// 93 62 99 9087 13 80 7

// Output:
// 99

import java.util.*;
public class Max_Digits_Sum_Max_Value
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)b[i]=obj.nextInt();
        int temp=0,rem=0,sum=0,max=0,index=0;
        Arrays.sort(b);
        for(int i=0;i<a;i++)
        {
            temp=b[i];
            while(temp!=0)
            {
                rem=temp%10;
                sum=sum+rem;
                temp=temp/10;
            }
            if(sum>=max)
            {
                max=sum;
                index=i;
            }
            sum=0;
        }
        System.out.print(b[index]);
        
    }
}