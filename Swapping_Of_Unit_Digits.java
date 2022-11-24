// The program must accept N integers as the input. The program must swap the unit digit of the first integers and the unit digit of Nth integer. The program msut swap the unit digit of the second integer and the unit digit of (N-1)th integer and so on. Finally, the program must print the modified N integers as the output.

// Boundary Condition(s);
// 1<= N <=10^5

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the modified N integers separated by space(s).

// Example Input/Output 1:
// Input:
// 4
// 98 50 15 19

// Output:
// 99 55 10 18


// Explanation:
// The first integer is 98 and its unit digit is 8.
// The fourth integer is 19 and its unit digit is 9.
// After swapping the unit digits of 98 and 19, 98 becomes 99 and 19 becomes 18.
// The second integer is 50 and its unit digit is 0.
// The third integer is 15 and its unit digit is 5.
// After swapping the unit digits of 50 and 15, 50 becomes 55 and 15 becomes 10.
// Hence the output is 99 55 10 18

// Example Input/Output 2:
// Input:
// 5
// 8113 8 68 541 97

// Output:
// 8117 1 68 548 93


import java.util.*;
public class Swapping_Of_Unit_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int len=a/2;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
        }
        int temp1,temp2,val=a-1,store1,store2,swap1=0,swap2=0;
        for(int i=0;i<len;i++)
        {
            temp1=b[i]/10;
            store1=b[val]%10;
            swap1=(temp1*10)+store1;
            System.out.print(swap1+" ");
            val--;
        }
        int r=len-1;
        if(a%2!=0)
        {
            System.out.print(b[len]+" ");
            len++;
            for(int j=len;j<a;j++)
            {
                temp2=b[j]/10;
                store2=b[r]%10;
                swap2=(temp2*10)+store2;
                System.out.print(swap2+" ");
                r--;
            }
        }
        else 
        {
            for(int q=len;q<a;q++)
            {
                temp2=b[q]/10;
                store2=b[r]%10;
                swap2=(temp2*10)+store2;
                System.out.print(swap2+" ");
                r--;
            }
        }
    }
}