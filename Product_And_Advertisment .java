// In a super market, there is a list consisting of N products which are numbered
// from 0 to N - 1. The names of the products are passed as the input to the
// program. The super market has advertisements to attract customers. The program
// also accepts a list of integers representing the product number which is advertised
// as the input The program must print the product name having the maximum
// number of advertisements as the output. If more than one product is having the
// maximum number of advertisements then the program must print the first
// occurring product as the output.

// Boundary Condition(s):
// 2 <= N < = 100
// 2 <= Length of each product name <= 1000

// Input Format:
// The first line contains N.
// The next N lines each contain a string representing a product name.
// The (N +2)nd line contains a list of integers representing the product numbers
// being advertised separated by a space.

// Output Format:
// The first line contains the product name having the maximum number of
// advertisements.

// Example Input/Output 1:
// Input:
// 10
// swansonFrozenDinner
// Pepsi
// Fritos
// HeinzKetchup
// FrenchsMustard
// Ortega
// LeanCuisine
// Eggo
// DietCoke
// KoolAid
// 0 1 2 3 4 5 6 7 8 1 1 2 3 4 1 3 1

// Output:
// Pepsi

// Explanation:
// The product Pepsi has the maximum number of advertisements 5 (as the product
// number 1 which is for pepsi has occurred 5 times).

// Example Input/Output 2:
// Input:
// 7
// Agatha
// Bogner
// Champion
// Ecco
// Guess
// Izod
// Lee
// 0 1 2 3 3 3 3 4 5 6 1

// Output:
// Ecco


public class Product_And_Advertisment 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),max=0,index=0;
        String[] arr=new String[size];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<size;i++)
            arr[i]=obj.next();
        while(obj.hasNext())
        {
            int value=obj.nextInt();
            list.add(value);
        }
        Collection.sort(list);
        for(int i=0;i<list.size();i++)
        {
            int count=0;
            for(int j=0;j<list.size();j++)
            {
                if(!=j)
                {
                    if(list.get(i)==list.get(j))
                        count++;
                }
            }
            if(count>max)
            {
                max=count;
                index=list.get(i);
            }
        }
        System.out.print(arr[index]);
    }
}