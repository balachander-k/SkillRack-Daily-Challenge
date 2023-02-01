// The program must accept two alphabets ch1 and ch2 as the input. The program must print the count of consonants between the given alphabets (including ch1 and ch2) as the output.

// Input Format:
// The first line contains ch1 and ch2 separated by a space.

// Output Format:
// The first line contains the count of consonants between ch1 and ch2.

// Example Input/Output 1:
// Input:
// d j

// Output:
// 5

// Example Input/Output 2:
// Input:
// s u

// Output:
// 2




import java.util.*;
public class Count_Consonants_In_Range
{
    public static int isvowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='U' ||ch=='u')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char a=obj.next().charAt(0),b=obj.next().charAt(0);
        int count=0;
        for(char i=a;i<=b;i++)
            if(isvowel(i)==0)count++;
        System.out.print(count);
    }
}