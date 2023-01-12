// N integers are passed as the input to the program. The program must print the negative integers, followed by zeros and finally the positive numbers in the reverse order of their occurrence.

// Boundary Condition(s);
// 1<= N <=100

// Input Format:
// The first line contains the value of N.
// The second line contains the N integers separated by a space.


// Output Format:
// The first line contains N integers separated by a space.

// Example Input/Output 1:
// Input:
// 7 
// 10 -90 66 0 22 0 -14

// Output:
// -14 -90 0 0 22 66 10 


// Explanation:
// The negative integers from the end are -14 -90.
// There are two zeroes.
// The positive integers from the end are 22 66 10.

// Example Input/Output 2:
// Input:
// 5 
// 10 20 -88 98 -90

// Output:
// -90 -88 98 20 10






import java.util.*;
public class Negative_Zero_And_Positive 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] array=new int[N];
        int[] negative=new int[N];
        int[] positive=new int[N];
        int[] zero=new int[N];
        int count1=0,count2=0,count3=0,p=0,n=0,z=0;
        for(int i=0;i<N;i++)array[i]=obj.nextInt();
        for(int i=N-1;i>=0;i--)
        {
            if(array[i]<0)
            {
                negative[n]=array[i];
                n++;
                count1=1;
            }
            if(array[i]>0)
            {
                positive[p]=array[i];
                p++;
                count2=1;
            }
            if(array[i]==0)
            {
                zero[z]=array[i];
                z++;
                count3=1;
            }
        }
        if(count1==1)
            for(int i=0;i<n;i++)System.out.print(negative[i]+" ");
        if(count3==1)
            for(int i=0;i<z;i++)System.out.print(zero[i]+" ");
        if(count2==1)
            for(int i=0;i<p;i++)System.out.print(positive[i]+" ");
    }
}