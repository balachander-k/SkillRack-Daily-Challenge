// A table called book is created with the following DDL command:
// create table book(id int,name varchar(30),overview text);
// Write the SQL query to select id, name and the first 20 characters of the overview
// from the table book.
// Note: The id of the books must be sorted in ascending order.

select id,name,substring(overview,1,20) from table order by id asc;