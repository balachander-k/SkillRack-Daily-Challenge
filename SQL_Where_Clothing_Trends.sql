// A table called clothing is created with the following DDL command:

// CREATE TABEL CLOTHING (id INT, name VARCHAR(30), publishedyear INT, price FLOAT);

// Write the SQL query to select name, publishedyear and price from the table
// clothing where the publishedyear is greater than 2010.

// Note: The publishedyear of the clothings must be sorted in descending order.

select name,publishedyear,price from clothing where publishedyear>2010 order by publishedyear desc;