// The program must accept N queries as the input. Each query contains a character
// CH and an integer X. The program must form a list based on the queries. The
// program must print the output by executing the queries one by one based on
// following the conditions.

// -If CH is + then the program must insert the value of X at the end of the list.
// -If CH is - then the program must remove the first occurrence of X from the list.
// -If CH is ? then the query value X can be either 1 or O. If X is 1 then the program
// must print all the odd integers from the list in the order of insertion. Else if X is O
// then the program must print all the even integers from the list in the order of
// insertion.
// Note: If there is no odd integer or even integer to print from the list, the program
// must print -1.

// Boundary Condition(s):
// 1 <= N <= 100
// O <= X <= 10^9

// Input Format:
// The first line contains the value of N.
// The next N lines contain the query (CH and X separated by a space).

// Output Format:
// The list of lines containing a list of integers separated by a space as per the given
// conditions.


// Example Input/Output 1:
// Input:
// 12
// + 245
// + 91
// ? 1
// + 743
// - 245
// ? 0
// + 1009
// ? 1
// - 1009
// ? 1
// + 100
// ? 0

// Output:
// 245 91
// -1
// 91 743 1009
// 91 743
// 100


// Explanation:
// After the ISt query, 245 is inserted into the list. Now the list contains 245.
// After the 2nd query, 91 is inserted into the list. Now the list contains 245 91.
// After the 3rd query, all the odd integers in the list are printed. Hence 245 91 are
// printed.
// After the 4th query, 743 is inserted into the list. Now the list contains 245 91 743.
// After the 5th query, 245 is removed from the list. Now the list contains 91 743.
// After the 6th query, there is no even integer in the list. Hence -1 is printed.
// After the 7th query, 1009 is inserted into the list. Now the list contains 91 743
// 1009.
// After the 8th query, all the odd integers in the list are printed. Hence 91 743 1009
// are printed.
// After the 9th query, 1009 is removed from the list. Now the list contains 91 743.
// After the 10th query, all the odd integers in the list are printed. Hence 91 743 are
// printed.
// After the 11th query, 100 is inserted into the list. Now the list contains 91 743 100.
// After the 12th query, all the even integers in the list are printed. Hence 100 is
// printed.


// Example Input/Output 2:
// Input:
// 5
// + 147
// + 147
// - 147

// Output:
// 147 147
// 147


import java.util.*;
class Linked 
{
    Node head;
    class Node 
    {
        int data;
        Node next;
    }
    public void Insert(int x)
    {
        Node NewNode=new Node();
        NewNode.data=x;
        Node temp=head;
        if(head==null)
            head=NewNode;
        else 
        {
            while(temp.next!=null)
                temp=temp.next;
            temp.next=NewNode;
            NewNode.next=null;
        }
    }
    public void DeleteElement(int num)
    {
        Node temp=head;
        Node prev=null;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==num && i==0)
            {
                head=head.next;
                break;
            }
            if(temp.data==num)
            {
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
            i++;
        }
    }
    public void Even()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                System.out.print(temp.data+" ");
                count++;
            }
            temp=temp.next;
        }
        if(count==0)
            System.out.print("-1");
        System.out.println();
    }
    public void Odd()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                System.out.print(temp.data+" ");
                count++;
            }
            temp=temp.next;
        }
        if(count==0)
            System.out.print("-1");
        System.out.println();
    }
}
public class Odd_&_Even_Queries
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        Linked list=new Linked();
        int size=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            char choice=obj.next().charAt(0);
            switch(choice)
            {
                case '+':
                    int value=obj.nextInt();
                    list.Insert(value);
                    break;
                case '-':
                    int delete=obj.nextInt();
                    list.DeleteElement(delete);
                    break;
                case '?':
                    int val=obj.nextInt();
                    if(val==1)
                        list.Odd();
                    if(val==0)
                        list.Even();
                    break;
            }
        }
        
    }
}