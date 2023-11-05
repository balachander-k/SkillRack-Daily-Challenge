// A table called bus is created with the following DDL command:

// create table bus(id int,number int,totalseats int,bookseats int);

// Write the SQL statement to create another table called filledbus with the data
// populated from the columns id, number and totalseats from the table bus where
// the totalseats is equal to bookedseats.

CREATE TABLE filledbus AS
SELECT id, number, totalseats
FROM bus
WHERE totalseats = bookseats;