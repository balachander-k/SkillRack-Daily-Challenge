// The program must accept a string S containing multiple words and an integer X as
// the input. The program must reverse the every word in S. Then the program
// must print the modified string S as the output.

// Boundary Condition(s):
// 5 <= Length of S <= 1000
// 1 <= x <=50

// Input Format:
// The first line contains S.
// The second line contains X.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// A jellyfish stings even when dead
// 3

// Output:
// A jellyfish sgnits even when daed

// Explanation:
// After reversing the every 3rd word in the given string, it becomes " A jellyfish
// sgnits even when daed

// Example Input/Output 2:
// Input:
// Butterflies can hear, and some of them have ears that are situated on their wings.
// 4

// Output:
// Butterflies can hear, dna some of them evah ears that are detautis on their wings.

import java.util.*;
public class Reverse_Every_Xth_Word 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int x=obj.nextInt(),count=0;
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String t=arr[i];
            count++;
            if(count==x)
            {
                for(int j=t.length()-1;j>=0;j--)
                    System.out.print(t.charAt(j));
                System.out.print(" ");
                count=0;
            }
            else 
                System.out.print(t+" ");
        }
        
    }
}