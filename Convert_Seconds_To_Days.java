// The program must accept an integer S denoting seconds and convert it into days,
// hours, minutes and seconds as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= S <= 10^8

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the days, hours, minutes and seconds as shown in the

// Example Input/Output 1:
// Input:
// 164

// Output:
// 0D 00:02:44

// Explanation:
// 164 seconds equal to O day, O hour, 2 minutes and 44 seconds.
// Hence the output is OD 00:02:44

// Example Input/Output 2:
// Input:
// 96408

// Output:
// 1D 02:46:48


import java.util.*;
public class Convert_Seconds_To_Days{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int days = seconds / 86400;
        seconds -= days * 86400;
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        System.out.printf("%dD %02d:%02d:%02d%n", days, hours, minutes, seconds);
    }
}