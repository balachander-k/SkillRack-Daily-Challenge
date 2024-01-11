// A table called player is created with the following DDL command:

// create table player(id int,name varchar(30),country varchar(30), goldmedalscount int, silvermdealscount int,bronzemedalscount int);

// Write the SQL query to select id and name from the table player where the
// country is equal to 'INDIA', the goldmedalscount is greater than 5, the
// silvermedalscount is greater than 10 and the bronzemedalscount is greater than 15.
// Note: The id of the players must be sorted in ascending order.



select id,name from player where countr='INDIA' and goldmedalscount > 5 and silvermedalscount > 10 and bronzemedalscount > 15 order by id asc;