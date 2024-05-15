// The program must accept the names of N files with their extension as the input. The
// program must print the number of files in each type of extension in the order of their
// occurrence among the given N filenames.

// Boundary Condition(s):
// 2<= N <= 50
// 5 <= Length of each filename <= 24

// Input Format:
// The first line contains N.
// The next N lines, each contains the name of a file with the extension.

// Output Format:
// The lines contain the number of files in each type of extension in the order of their
// occurrence among the given N filenames.

// Example Input/Output 1:
// Input:
// 6
// Hello.java
// srack.c
// tcinput.txt
// tcoutput.txt
// tcgenerator.py
// Student.java

// Output:
// 2 .java
// 2 .txt
// 1 .py

// Explanation:
// There are two files with the extension ".java". So 2 .java is printed.
// There is only one file with the extension ".c". So 1 .c is printed.
// There are two files with the extension ".txt". So 2 .txt is printed.
// There is only one file with the extension ".py". So 1 .py is printed.

// Example Input/Output 2:
// Input
// 6
// sound.doc
// Al.bum.html
// output_3.txt
// FAM.PNG
// design2.html
// paper.png

// Output:
// 1 .doc
// 2 .html
// 1 .txt
// 1 .PNG
// 1 .png


import java.util.*;
public class File_&_Extension
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 
        LinkedHashMap<String, Integer> extensionCountMap = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            String fileName = scanner.nextLine();
            String extension = fileName.substring(fileName.lastIndexOf('.'));
            extensionCountMap.put(extension, extensionCountMap.getOrDefault(extension, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : extensionCountMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

    }
}
