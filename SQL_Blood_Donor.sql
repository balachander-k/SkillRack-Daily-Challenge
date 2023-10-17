// A table called person is created with the following DDL command:

// create table person(id INT,name varchar(30),age INT,weight INT,bloodgroup VARCHAR(3));

// Write the SQL query to select id, name and bloodgroup from the table person
// where age is between 18 and 65 (excluding 18 and 65) and weight is greater than
// 50.

// Note: The id of the person must be sorted in ascending order.

select id,name,bloodgroup from person where age between 19 and 64 and weight>50 order by id;