// A table called student is created with the following DDL command:

// create table student (id int,name varchar(20), physics int,maths int,chemistry int)

// Write the Java code using JDBC APIs to insert two student records with the
// following values:

// id as 1, name as "Studentl physics as 85, maths as 95 and chemistry as 89.
// id as 2, name as "Student2", physics as 91, maths as 96 and chemistry as 93.
// IMPORTANT:
// 1. Place your code inside the execute method. You need not code/implement
// the main method.
// 2. DO NOT close the Database Connection conn in your code.


import java.util.*;
import java.sql.*;

public class JDBC_Insert_Two_Records{
    public static void execute(Connection con, Scanner sc) {
        try {
            PreparedStatement stmt1 = con.prepareStatement("INSERT INTO student (id, name, physics, maths, chemistry) VALUES (?, ?, ?, ?, ?)");
            stmt1.setInt(1, 1);
            stmt1.setString(2, "Student1");
            stmt1.setInt(3, 85);
            stmt1.setInt(4, 95);
            stmt1.setInt(5, 89);
            stmt1.executeUpdate();
            
            PreparedStatement stmt2 = con.prepareStatement("INSERT INTO student (id, name, physics, maths, chemistry) VALUES (?, ?, ?, ?, ?)");
            stmt2.setInt(1, 2);
            stmt2.setString(2, "Student2");
            stmt2.setInt(3, 91);
            stmt2.setInt(4, 96);
            stmt2.setInt(5, 93);
            stmt2.executeUpdate();
            System.out.println("Second student record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error occurred while inserting records: " + e.getMessage());
        }
    }
}
