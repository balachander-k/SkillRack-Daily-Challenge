// There are M trainers and N students in a programming training center. The head of
// the training center wants to form the maximum number of teams to train the
// students. So he has two different criteria which are given below.

// Criteria 1:
// - Each team should consist of exactly one trainer and two students.
// - Each trainer and student should belong to exactly one team.

// Criteria 2:
// - Each team should consist of exactly two trainers and one student.
// - Each trainer and student should belong to exactly one team.
// The head of the training center wants to know which criteria form the maximum
// number of teams.

// The values of M and N are passed as input to the program. The program must print
// the output based on the following conditions.
// - If the criteria 1 makes more teams than the criteria 2 then print 1.
// - If the criteria 2 makes more teams than the criteria 1 then print 2.
// - If both criteria make an equal number of teams then print "ANYONE".

// Boundary Condition(s):
// 1 <= M, N 10^4

// Input Format:
// The first line contains M and N separated by a space.

// Output Format:
// The first line contains 1 or 2 or ANYONE.

// Example Input/Output 1:
// Input:
// 2 6

// Output:
// 1

// Explanation:
// There are 2 trainers and 6 students.
// According to criteria 1, two teams can be formed.
// According to criteria 2, one team can be formed.
// Here criteria 1 makes more teams than criteria 2.
// Hence the output is 1

// Example Input/Output 2:
// Input:
// 6 4

// Output:
// 2

// Example Input/Output 3
// Input:
// 4 5

// Output:
// ANYONE

import java.util.*;
public class Trainers_And_Students_Team 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int trainers=obj.nextInt(),students=obj.nextInt();
        int criteria1=0,criteria2=0;
        int[] fstu=new int[students/2];
        int[] strain=new int[trainers/2];
        for(int i=0;i<fstu.length;i++)
            fstu[i]=2;
        for(int i=0;i<trainers;i++)
        {
            try{
                if(fstu[i]==2)
                    criteria1++;
            }
            catch(Exception e)
            {
                break;
            }
        }
        for(int i=0;i<strain.length;i++)
            strain[i]=2;
        for(int i=0;i<students;i++)
        {
            try{
                if(strain[i]==2)
                    criteria2++;
            }
            catch(Exception e)
            {
                break;
            }
        }
        if(criteria1>criteria2)
            System.out.print("1");
        else if(criteria2>criteria1)
            System.out.print("2");
        else 
            System.out.print("ANYONE");
    }
}