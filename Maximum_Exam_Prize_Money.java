// The students of a class has to write two exams in Science and Maths. For the
// students passing the exam either a ball or a pen must be given as a prize based on
// the following conditions.
// - If a ball is given for passing Science exam then a pen is given for passing Maths
// exam.
// - If a pen is given for passing Science exam then a ball is given for passing Maths
// exam.
// The price of a ball B and the price of a pen P is passed as input to the program.
// The number of students N taking the test is also passed as the input to the
// program. The program must print the minimum amount A required to buy the
// prizes for the student.

// Boundary Condition(s):
// 1 N < = 100
// 1 B, P 1000

// Input Format:
// The first line contains the values of B and P separated by a space.
// The second line contains the value of N.
// The next N lines contain the pass or fail status of N students (1 indicates pass and
// 0 indicates fail) in Science and Maths exams.

// Output Format:
// The first line contains the value of the minimum amount A required.

// Example Input/Output 1:
// Input:
// 5 10
// 6
// 1 0
// 1 1
// 1 0
// 0 1
// 1 1
// 1 0

// Output:
// 55

// Explanation:
// Ball cost = 5 and Pen cost = 10
// Total students who passed Science = 5.
// Total students who passed Maths = 3.
// If we assign ball to Science and pen to maths, then total cost —
// - + 10*3 = 55
// If we assign pen to Science and ball to maths, then total cost —
// - 10*5 + = 65
// The minimum cost is 55.

// Example Input/Output 2:
// Input:
// 253 104
// 7
// 0 1
// 0 0
// 0 1
// 0 1
// 1 1
// 0 0
// 1 1

// Output:
// 1026



import java.util.*;
public class Maximum_Exam_Prize_Money
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long ball=obj.nextLong(),pen=obj.nextLong(),pass=obj.nextLong(),science=0,maths=0,first=0,second=0;
        for(long i=0;i<pass;i++)
        {
            long val1=obj.nextLong();
            long val2=obj.nextLong();
            if(val1==1)science++;
            if(val2==1)maths++;
        }
        first=(ball*science)+(pen*maths);
        second=(ball*maths)+(pen*science);
        System.out.print((first<=second)?first:second);
    }
}