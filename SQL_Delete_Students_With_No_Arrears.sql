// A table called student is created with the following DDL command:

// create table student (id int,name varchar(30),arrearscount int);

// Write the SQL statement to delete the records of the students who are not having
// arrears.

delete from student where arrearscount=0;