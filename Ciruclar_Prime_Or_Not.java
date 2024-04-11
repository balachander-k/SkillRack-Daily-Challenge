// The program must accept an integer N as the input. The program must print YES if
// N is a circular prime integer. Else the program must print NO as the output. An
// integer is said to be a circular prime if all rotations of its digits are prime.

// Boundary Condition(s):
// 10 <= N < = 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 131

// Output:
// YES

// Explanation:
// All possible rotations of 131 are given below.
// 131
// 113
// 311
// Here, all the three possible rotations are prime integers.
// So YES is printed as the output.

// Example Input/Output 2:
// Input:
// 457

// Output:
// NO


import java.util.*;
public class Ciruclar_Prime_Or_Not{
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isCircularPrime(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            s = s.substring(1) + s.charAt(0);
            if (!isPrime(Integer.parseInt(s))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        System.out.println(isCircularPrime(N) ? "YES" : "NO");
    }
}