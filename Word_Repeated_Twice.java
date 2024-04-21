// The program must accept a string S containing multiple words as the input. The
// program must print the word which is repeated twice in the string S as the output.
// If more than one such words are present in S, the program must print the first
// occurring one as the output. If there is no such word, the program must print -1 as
// the output.

// Boundary Condition(s):
// 5 <= Length of S <= 1000
// 1 <= Length of each word <= 50

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the word which is repeated twice in the string S or -1.

// Example Input/Output 1:
// Input:
// apple banana cherry banana dates apple apple

// Output:
// banana

// Explanation:
// The word repeated twice in the string "apple banana cherry banana dates apple
// apple" is banana.

// Example Input/Output 2:
// Input:
// one two three two two three four three

// Output:
// -1

// Example Input/Output 3:
// Input:
// decjan feb mar jan feb mar

// Output:
// jan
import java.util.*;
public class Word_Repeated_Twice
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        String s=obj.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=0;j<arr.length;j++)
                if(i!=j)
                    if(arr[i]==arr[j])
                        count++;
            if(count==2)list.add(arr[i]);
        }
        System.out.print((list.size()==0)?"-1":list.get(0));
    }
}