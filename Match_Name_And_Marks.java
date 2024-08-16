// The program must accept the names of the students in a class as the input. Each student's
// marks is enclosed within the first and the last character of his/her name. The program also
// accepts the marks of those students. For each student in the class, the program must print
// the name along with the marks he/she scored (without the characters enclosed) as the
// output.

// Note: There are no students in the class having the same first and last characters in the
// name.

// Boundary Condition(s):
// 3 <= Length of each student's name <= 20
// 1 <= Marks of each student <= 100

// Input Format:
// The first line contains the names of the students in the class separated by a space.
// The second line contains the marks scored by the students in the class separated by a space.

// Output Format:
// The lines, each contains the name of a student and his/her marks separated by a space.

// Example Input/Output 1:
// Input:
// JAKE RAVI ABDUL AYSHA DIYA
// A98L J76E AIOOA D88A R911

// Output:
// JAKE 76
// RAVI 91
// ABDUL 98
// AYSHA 100
// DIYA 88

// Explanation:
// The ISt student name is JAKE and his marks match J76E.
// The 2nd student name is RAVI and his marks match R911.
// The 3 student name is ABDUL and his marks match A98L
// The 4th student name is AYSHA and her marks match AIOOA.
// The 5th student name is DIYA and her marks match D88A.
// Hence the output is
// JAKE 76
// RAVI 91
// ABDUL 98
// AYSHA 100
// DIYA 88

// Example Input/Output 2:
// Input:
// JOSHUA SANJU RAJU SAM FATHIMA ISHAAN
// 198N S66U S99M R56U J90A F81A

// Output:
// JOSHUA 90
// SANJU 66
// RAJU 56
// SAM 99
// FATHIMA 81
// ISHAAN 98

// Example Input/Output 3:
// Input:
// ABI JEMI DEVI
// J911 AIOOI D951

// Output:
// ABI 100
// JEMI 91
// DEVI 95


import java.util.*;
public class Match_Name_And_Marks 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String name=obj.nextLine(),mark=obj.nextLine();
        String[] namearr=name.split(" "),markar=mark.split(" ");
        for(int i=0;i<namearr.length;i++)
        {
            char f=namearr[i].charAt(0),l=namearr[i].charAt(namearr[i].length()-1);
            for(int j=0;j<markar.length;j++)
            {
                char ff=markar[j].charAt(0),ll=markar[j].charAt(markar[j].length()-1);
                if(ff==f && ll==l)
                {
                    String mm="";
                    for(int k=1;k<markar[j].length()-1;k++)
                        mm+=markar[j].charAt(k);
                    System.out.print(namearr[i]+" "+mm);
                    break;
                }
            }
        }
    }
}