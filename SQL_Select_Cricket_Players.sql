// A table called player is created with the following DDL command:

// create tbale player (id int,name varchar(30), odimatches int,testmatches int,t20imatches int);

// Write the SQL query to select the id, name, odimatches, testmatches
// and t20imatches from the table player where the odimatches, testmatches
// and t20imatches are greater than 10.
// Note: The name of the players must be sorted in alphabetical order.


select id,name,odimatches,testmatches,t20imatches from player where odimatches >10 and testmatches >10 and t20imatches >10 order by name;