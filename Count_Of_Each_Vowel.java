// The program must accept a string S as the input. The program must coun the number of occurrences of each vowel in the string S and print all the vowels along with their count as the output. The order of vowels must be a, e, i, o and u.
// Note: All the alphabets in S are only in lowercase.

// Boundary Condition(s);
// 1<= Length of S <=1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the vowel a with its count separated by a space.
// The second line contains the vowel e with its count separated by a space.
// The third line contains the vowel i with its count separated by a space.
// The fourth line contains the vowel o with its count separated by a space.
// the fifth line contains the vowel u with its count separated by a space.

// Example Input/Output 1:
// Input:
// bcdefghijklmnopqrstvwxyz

// Output:
// a 0
// e 1
// i 1
// o 1
// u 0

// Explanation:
// The vowel e has occured once.
// The vowel i has occured once.
// The vowel o has occured once.
// Hence the otuput is 
// a 0
// e 1
// i 1
// o 1
// u 0

// Example Input/Output 2:
// Input:
// fqwetdcqrbgpvqvhionkpklwafuwqeyvfcjiibvooohvhnuuu


// Output:
// a 1
// e 2
// i 3
// o 4
// u 5



import java.util.*;
public class Count_Of_Each_Vowel
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int acount=0,ecount=0,icount=0,ocount=0,ucount=0;
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='a')acount++;
            if(b[i]=='e')ecount++;
            if(b[i]=='i')icount++;
            if(b[i]=='o')ocount++;
            if(b[i]=='u')ucount++;
        }
        System.out.print("a"+" "+acount+"\n"+"e"+" "+ecount+"\n"+"i"+" "+icount+"\n"+"o"+" "+ocount+"\n"+"u"+" "+ucount);
    }
}