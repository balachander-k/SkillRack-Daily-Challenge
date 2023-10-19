A table called employee is created with the following DDL command:

create table employee(id int,name varchar(30),overtime int,salary int);

Write the SQL statement to update the salary of all the employees by adding the
overtime * 50 to the salary.


update table employee set salary=salary+overtime*50;