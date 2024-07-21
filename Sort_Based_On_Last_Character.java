// The program must accept a string S containing multiple words as the input. The program
// must sort the words based on the last character of each word in S. If two or more words
// have the same last character, then sort those words in the order of their occurrence. Finally,
// the program must print modified string S as the output.

// Boundary Condition(s):
// 5 <= Length of S <= 1000
// 1 <= Length of each word in S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// Welcome to skillrack

// Output:
// Welcome skillrack to

// Explanation:
// Here S = "Welcome to skillrack".
// After sorting the words based on the last character, the string becomes "Welcome skillrack
// to".
// Hence the output is
// Welcome skillrack to

// Example Input/Output 2:
// Input:
// WE WENT TO THE TEMPLE YESTERDAY

// Output:
// WE THE TEMPLE TO WENT YESTERDAY


import java.util.*;
public class Sort_Based_On_Last_Character 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Character> list=new ArrayList<Character>();
        ArrayList<String> val=new ArrayList<String>();
        String s=obj.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i].charAt(arr[i].length()-1));
            val.add(arr[i]);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<val.size();j++)
            {
                String temp=val.get(j);
                if(temp.charAt(temp.length()-1)==list.get(i))
                {
                    System.out.print(val.get(j)+" ");
                    val.remove(j);
                    break;
                }
            }
        }
    }
}