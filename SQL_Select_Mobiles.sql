// A table called mobile is created with the following DDL command:

// create table mobile (id int,name varchar(30),imei varchar(30));

// Write the SQL query to select id, name and imei from the table mobile where the
// imei number contains 545 in any position.
// Note: The id of the mobiles must be sorted in ascending order.


select id,name,imei from mobile where imei like '%545%' order by id;