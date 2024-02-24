// The program must accept two integer arrays of size N and print 1 if the two arrays
// are mirror images (reverse of another array) of each other. Else the program must
// print O.

// Boundary Condition(s):
// 2 <= N < = 100
// 1 <= Each integer value <= 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains N integers separated by a space.

// Output Format:
// The first line contains 1 or 0.

// Example Input/Output 1:
// Input:
// 4
// 10 20 30 40
// 40 30 20 10

// Output:
// 1

// Explanation:
// After reversing the second array, the second array becomes 10 20 30 40 which is
// equal to the first array. Here, the given two arrays are mirror images of each other.
// Hence the output is 1

// Example Input/Output 2:
// Input:
// 7
// 95 72 86 16 59 20 56
// 56 20 72 59 16 86 95

// Output:
// 0



import java.util.*;
public class Mirror_Image_Arrays
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0,k=0;
        int[] arr1=new int[N],arr2=new int[N],arr3=new int[N];
        for(int i=0;i<N;i++)
            arr1[i]=obj.nextInt();
        for(int i=0;i<N;i++)
            arr2[i]=obj.nextInt();
        for(int i=N-1;i>=0;i--)
            arr3[k++]=arr2[i];
        for(int i=0;i<N;i++)
            if(arr1[i]==arr3[i])
                count++;
        System.out.print((count==N)?1:0);
    }
}