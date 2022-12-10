// N integers are passed as input to the program. For each integer other than the first integer, the program must print the product of unit and tenth digit of the previous integer.

// Boundary Condition(s);
// 2<= N <=100
// 10<= Each integer value <=100000

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains N-1 integer values separated by a space.

// Example Input/Output 1:
// Input:
// 5
// 10 20 712 28 90

// Output:
// 0 0 2 16

// Explanation:
// For 20,the previous integer is 10. Hence 1*0=0.
// For 712,the previous integer is 20. Hence 2*0=0.
// For 28,the previous integer is 712. Hence 1*2=2.
// For 90,the previous integer is 28. Hence 2*8=16.



import java.util.*;
public class Previous_Value_Unit_Tenth_Digits_Product{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int count=0,rem=0,pro=1;
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        for(int i=1;i<a;i++)
        {
            int temp=b[i-1];
            while(count!=2)
            {
                rem=temp%10;
                pro=pro*rem;
                temp=temp/10;
                count++;
            }
            System.out.print(pro+" ");
            pro=1;
            count=0;
        }
    }
}