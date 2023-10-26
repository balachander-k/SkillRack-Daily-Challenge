
// A table called cricketplayer is created with the following DDL command:
// create table cricketplayer(id int,name varchar(30),runs int);
// Write the SQL query to select the name and the runs of the top three run scorers
// from the table cricketplayer.
// Note: The runs of the cricket players must be sorted in descending order.

SELECT name, runs
FROM cricketplayer
ORDER BY runs DESC
LIMIT 3;