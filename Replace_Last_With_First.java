// The program must accept a string S with spaces as the input. For each word W in
// the string S (i.e., each word from left to right of S), the program must replace the
// last character of W by the first character of the next word. For the last word, the
// program must replace the last character by the first character of the first word.
// Finally, the program must print the modified string S as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// Nice to meet you

// Output:
// Nict tm meey YON

// Explanation:
// Here S = "Nice to meet you".
// The last character of Nice is replaced by the first character of to. So Nice becomes
// Nict.
// The last character of to is replaced by the first character of meet. So to becomes
// tm.
// The last character of meet is replaced by the first character of you. So meet
// becomes meey.
// The last character of you is replaced by the first character of Nice. So you
// becomes YON.
// Hence the output is Nict tm meey YON

// Example Input/Output 2:
// Input:
// tit for tat

// Output:
// tif fot tat



import java.util.*;
public class Replace_Last_With_First 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine();
        String[] arr=val.split(" ");
        int in=1;
        for(int i=0;i<arr.length;i++)
        {
            String t="",w="";
            if(in==arr.length)
                in=0;
            t=arr[in];
            w=arr[i];
            for(int j=0;j<w.length();j++)
            {
                if(j==w.length()-1)
                    System.out.print(t.charAt(0));
                else 
                    System.out.print(w.charAt(j));
            }
            in++;
            System.out.print(" ");
        }
    }
}