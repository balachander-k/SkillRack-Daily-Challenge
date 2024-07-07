// In a supermarket, there are X products that are listed on a board. Each product has a unique
// number. A boy wants to purchase Y products from the supermarket. The program must
// accept X integers representing the unique number of X products and Y integers
// representing the unique number of Y products as the input. The program must print the
// unique number of all the products that are available to the boy in the order of their
// occurrence(i.e., the order mentioned in the board) as the output.
// Note: At least one product is always available in the supermarket from the list of Y products.

// Boundary Condition(s):
// 1 < = X, Y <= 100
// 1 <= Unique number of each product <= 100

// Input Format:
// The first line contains X and Y separated by a space.
// The second line contains X integers separated by a space.
// The third line contains Y integers separated by a space.

// Output Format:
// The first line contains the integers as per the given condition.

// Example Input/Output 1:
// Input
// 7 3
// 3 4 6 2 7 1 9
// 2 1 6

// Output:
// 6 2 1

// Example Input/Output 2:
// Input
// 5 5
// 5 4 3 7 1 0
// 7 3 6 9 1 0

// Output:
// 3 7 10 


import java.util.*;
public class Super_Market_Available_Products
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt();
        int[] products=new int[x],purchase=new int[y];
        for(int i=0;i<x;i++)
            products[i]=obj.nextInt();
        for(int i=0;i<y;i++)
            purchase[i]=obj.nextInt();
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++)
                if(products[i]==purchase[j])
                    System.out.print(products[i]+" ");
    }
}