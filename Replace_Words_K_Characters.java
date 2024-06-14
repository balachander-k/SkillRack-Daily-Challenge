// The program must accept a word W, an integer K and a string S containing multiple words
// as the input. The program must replace the words in S having the first K characters of W
// with the word W. Then the program must print the modified string S as the output.
// Note: Both W and S are case insensitive.

// Boundary Condition(s):
// 1 <= K <= Length of W <= 100
// 3 <= Length of S <= 1000
// 1 <= Length of each word in S <= 100

// Input Format:
// The first line contains W and K separated by a space.

// The second line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// skill 3
// skillrack helps students to succeed

// Output:
// skill helps students to succeed

// Explanation:
// Here W = skill and K = 3. The first three characters in W are ski.
// The only word that has the first three characters as ski in the string "skillrack helps students
// to succeed" is skillrack. So it is replaced with skill.
// Hence the output is
// skill helps students to succeed


// Example Input/Output 2:
// Input
// happy 4
// WORK HAPPENS TO LIVE HAPPIER NOT TO HATE

// Output:
// WORK happy TO LIVE happy NOT TO HATE

// Example Input/Output 3:
// Input
// #5467 2
// @abcd #521A

// Output:
// @abcd #5467


import java.util.*;
public class Replace_Words_K_Characters 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String w=obj.next();
        int k=obj.nextInt();obj.nextLine();
        String s=obj.nextLine(),kchar=w.substring(0,k).toLowerCase();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String temp="";
            if(arr[i].length()>=k)
            {
                for(int j=0;j<k;j++)
                    temp+=arr[i].charAt(j);
                temp=temp.toLowerCase();
                System.out.print(temp.equals(kchar)?w+" ":arr[i]+" ");
            }
            else System.out.print(arr[i]+" ");
        }
    }
}