// A table called sweet is created with the following DDL command:

// create table sweet (id int,name varchar(30),mainingredients varchar(100),price int);

// Write the SQL query to select the id, name and price from the table sweet where
// the mainingredients contains 'Milk' or 'milk'.

Note: The price of the sweets must be sorted in ascending order.
SELECT id, name, price
FROM sweet
WHERE mainingredients LIKE '%Milk%' OR mainingredients LIKE '%milk%'
ORDER BY price ASC;