
// The Program must accept N integers as the input. The program must print the sum of duplicate integers (occuring two or more times) as the output. If there is no duplicate integer then the program must print -1 as the output.

// Boundary Condition(s);
// 1<= N <=10^6

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains either the sum of duplicate integers or -1.

// Example Input/Output 1:
// Input:
// 10 
// 10 20 30 40 10 50 20 60 10 70

// Output:
// 30

// Explanation:
// The duplicate integers are 10 and 20.So the sum of 10 and 20 is 30
// Hence the output is 30

// Example Input/Output 2:
// Input:
// 3
// 10 20 30

// Output:
// -1

// Example Input/Output 3:
// Input:
// 5
// 10 20 30 20 30

// Output:
// 50

// Explanation:
// The duplicate integers are 20 and 30. So the sum of 20 and 30 is 50
// Hence the output is 50

import java.util.*;
public class Sum_of_duplicate_integers
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    int[] array=new int[a];
    int[] b=new int[a];
    for(int i=0;i<a;i++)
    {
        array[i]=obj.nextInt();
    }
    Set<Integer> set = new HashSet<Integer>();
    int count=0,k=0;
    for(int i=0;i<array.length;i++) 
    {
      if(set.add(array[i]) == false) 
      {
        b[k]=array[i];
        count++;
        k++;
      }
    }
    int sum=0,temp=0;
    List<Integer> val=new ArrayList<Integer>();
    for(int i=0;i<count;i++)
    {
        val.add(b[i]);
    }
    Set<Integer> s=new LinkedHashSet<Integer>(val);
    Iterator<Integer> it=s.iterator();
    while(it.hasNext())
    {
        sum+=it.next();
        temp++;
    }
    if(temp==0)
        System.out.print("-1");
    else 
        System.out.print(sum);
  }
}