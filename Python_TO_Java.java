// Convert the below Python code to Java.

// N=input().strip()
// for size in range(1,len(N)+1):
//   for ind in range(size,len(N)+1):
//     val=int(N[ind-size:ind])
//     if len(str(val)) == size and val%2==0 :
//       print(val,end=" ")



import java.util.*;
public class Python_TO_Java{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine().trim();
        for (int size = 1; size <= N.length(); size++) {
            for (int ind = size; ind <= N.length(); ind++) {
                int val = Integer.parseInt(N.substring(ind - size, ind));
                if (String.valueOf(val).length() == size && val % 2 == 0) {
                    System.out.print(val + " ");
                }
            }
        }
    }
}