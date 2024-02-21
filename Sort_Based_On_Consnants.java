The program must accept N string values as the input. The program must sort the
N string values based on the number of consonants. If more than one string values
have the same number of consonants then sort them in the order of their
occurrence. Finally, the program must print the N modified string values as the
output.

Boundary Condition(s):
1 <= N, Length of each string <= 100

Input Format:
The first line contains N.
The second line contains N string values separated by a space.

Output Format:
The first line contains the N modified string values separated by a space.

Example Input/Output 1:
Input:
4
// Robot Computing Cloud Lab

// Output:
// Lab Robot Cloud Computing

// Explanation:
// The number of consonants in the string "Robot" is 3.
// The number of consonants in the string "Computing" is 6.
// The number of consonants in the string "Cloud" is 3.
// The number of consonants in the string "Lab" is 2.
// After sorting the 4 string values based on the number of consonants, the order of
// the 4 string values become

// Example Input/Output 2:
// Input:
// 5
// Early bird catches the worm

// Output:
// the Early bird worm catches

import java.util.*;
public class Sort_Based_On_Consnants
{
    public static int consonant(String temp)
    {
        char[] arr=temp.toCharArray();
        int count=0;
        for(int j=0;j<arr.length;j++)
            if(arr[j]!='a' || arr[j]!='A' || arr[j]!='e' || arr[j]!='E' || arr[j]!='i' || arr[j]!='I' || arr[j]!='O' || arr[j]!='o' || arr[j]!='u' || arr[j]!='U')
                count++;
        return count;
        
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int N=obj.nextInt();
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.next();
        for(int i=0;i<N;i++)
            list.add(consonant(arr[i]));
        for(int i=0;i<N;i++)
        {
            int min=Integer.MAX_VALUE,index=0;
            for(int j=0;j<list.size();j++)
            {
                if(list.get(j)<min)
                {
                    min=list.get(j);
                    index=j;
                }
            }
            list.set(index,Integer.MAX_VALUE);
            System.out.print(arr[index]+" ");
        }
        
    }
}