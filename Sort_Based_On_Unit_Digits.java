// The program must accept N integers as the input. The program must sort the integers based on their unit digit in descending order and print them as the output.If the more than one integers have the same unit digit then the larger integer must appear first in the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Each Integer value <=10^7

// Input Format:
// The first line contains the the value of N
// The second line contains N integers separated by space(s);


// Output:
// The first line contains sorted N integers separated by space.


// Example Input/Output 1:
// Input:
// 6
// 24 56 100 61 9 7881

// Output:
// 9 56 24 7881 61 100

// Explanation:
// Sorted integers based on their unit digit are 9 56 24 61 7881 100 in descending order.
// Here the unit digit 1 is the same for two integers are 61 and 7881. The larger integer is 
// 7881.So it appears before 61.
// Hence the output is 9 56 24 7881 61 100.

// Example Input/Output 2:
// Input:
// 5
// 121 231 341 9 8 

// Output:
// 9 8 341 231 121




import java.util.*;
public class Sort_Based_On_Unit_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]%10 < arr[j]%10 && arr[i]%10!=arr[j]%10)
                {
                    int val=arr[i];
                    arr[i]=arr[j];
                    arr[j]=val;
                }
                if(arr[i]%10==arr[j]%10)
                {
                    if(arr[i]<arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<a;i++)
            System.out.print(arr[i]+" ");
    }
}