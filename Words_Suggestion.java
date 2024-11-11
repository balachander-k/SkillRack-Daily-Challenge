// The program must accept N string values and a string S as the input. The N string
// values represent the words present in a text document. The string S is a word to
// be typed in the text document The text document is opened in a text editor which
// suggests the words among the N words after each character of S is typed. The
// suggested words should have a common prefix with the word S. The program
// must print the suggested words after each character of S is typed. The suggested
// words must be printed in sorted order. If there are no words to suggest, the
// program must print -1.

// Boundary Condition(s):
// 1 <=  N <= 50
// 1 <= Length of each string <= 30

// Input Format:
// The first line contains N.
// The next N lines, each contains a string value.
// The (N +2)nd line contains S.

// Output Format:
// The lines, each contains the string values representing the suggested words or -1.

// Example Input/Output 1:
// Input:
// 8
// monsoon
// moonlight
// mute
// monday
// make
// monks
// monochrome
// monster
// mono

// Output:
// make monday monks monochrome monsoon monster moonlight mute
// monday monks monochrome monsoon monster moonlight
// monday monks monochrome monsoon monster
// monochrome

// Explanation:
// Here S = mono.
// After typing the ISt character m, the suggested words are make, monday, monks,
// monochrome, monsoon, monster, moonlight and mute.
// After typing the 2nd character o, the suggested words are monday, monks,
// monochrome, monsoon, monster and moonlight.
// After typing the 3rd character n, the suggested words are monday, monks,
// monochrome, monsoon and monster.
// After typing the 4th character o, the suggested word is monochrome.
// Hence the output is
// make monday monks monochrome monsoon monster moonlight mute
// monday monks monochrome monsoon monster moonlight
// monday monks monochrome monsoon monster
// monochrome

// Example Input/Output 2:
// Input:
// 3
// luck
// lose
// lottery
// London

// Output:
// lose lottery luck
// lose lottery
// -1
// -1
// -1
// -1


import java.util.*;
public class Words_Suggestion
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();obj.nextLine();
        String[] present=new String[N];
        for(int i=0;i<N;i++)
            present[i]=obj.nextLine();
        String type=obj.nextLine();
        for(int i=0;i<type.length();i++)
        {
            ArrayList<String> list=new ArrayList<String>();
            String suggest=type.substring(0,i+1);
            for(int j=0;j<present.length;j++)
            {
                if(i<present[j].length())
                {
                    String value=present[j].substring(0,i+1);
                    if(value.equals(suggest))
                        list.add(present[j]);
                }
            }
            if(!list.isEmpty())
            {
                Collections.sort(list);
                for(String t:list)
                    System.out.print(t+" ");
                System.out.println();
            }
            else System.out.print("-1");
        }
    }
}