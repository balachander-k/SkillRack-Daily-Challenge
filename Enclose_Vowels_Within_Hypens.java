// The program must accept a string S as the input. The program must find the number of
// vowels V in the given string S. The program must print the string in V lines based on the
// following conditions.
// - In the first line, the ISt vowel and the V in the string S are enclosed within hyphens.
// - In the second line, the 2nd vowel and the (V-l)th in the string S are enclosed within
// hyphens.
// - In the third line, the 3rd vowel and the (V-2)th in the string S are enclosed within hyphens.
// - Similarly, the remaining lines are printed as the output.

// Note:
// - If V is odd, the middle line contains the string S where the middle vowel is enclosed within
// hyphens.
// - At least one vowel is always present in the string S.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first V lines, each contains a string value based on the given conditions.

// Example Input/Output 1:
// Input:
// NOTEBOOKPAPER

// Output:
// N-O-TEBOOKPAP-E-R
// NOT-E-BOOKP-A-PER
// NOTEB-O--O-KPAPER
// NOTEB-O--O-KPAPER
// NOT-E-BOOKP-A-PER
// N-O-TEBOOKPAP-E-R

// Explanation:
// The number of vowels in the given string NOTEBOOKPAPER is 6. So 6 lines are printed in
// the output.
// N-O-TEBOOKPAP-E-R
// NOT-E-BOOKP-A-PER
// NOTEB-O--O-KPAPER
// NOTEB-O--O-KPAPER
// NOT-E-BOOKP-A-PER
// N-O-TEBOOKPAP-E-R

// Example Input/Output 2:
// Input:
// Elevation

// Output:
// -E-levati-o-n
// El-e-vat-i-on
// Elev-a-tion
// El-e-vat-i-on
// -E-levati-o-n


import java.util.*;
public class Enclose_Vowels_Within_Hypens
{
    public static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        ArrayList<String> list=new ArrayList<String>();
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int vowel=0,first=1,last=0,v=0,g=0;
        for(int i=0;i<s.length();i++)
            if(isVowel(s.charAt(i)))vowel++;
        last=vowel;
        while(first<=last && last>=first)
        {
            String temp="";
            int count=0;
            for(int i=0;i<s.length();i++)
            {
                if(isVowel(s.charAt(i)))
                {
                    count++;
                    if(first==count || last==count)
                        temp+="-"+s.charAt(i)+"-";
                    else 
                        temp+=s.charAt(i);
                }
                else temp+=s.charAt(i);
            }
            System.out.println(temp);
            list.add(temp);
            v++;
            first++;
            last--;
        }
        g=(vowel%2==0)?list.size()-1:list.size()-2;
        for(int i=0;i<Math.abs(vowel-v);i++)
            System.out.println(list.get(g--));
        
    }
}