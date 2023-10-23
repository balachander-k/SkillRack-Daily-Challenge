A table called student is created with the following DDL command:
create table student(regnum int, name varchar(30),arrearscount int);
Write the SQL query to list all the arrearscount along with the number of students
having that arrearscount from the table student.
Note: The arrearscount of the students must be sorted in descending order.


SELECT arrearscount, COUNT(*) AS count
FROM student
GROUP BY arrearscount
ORDER BY arrearscount DESC;