// A table called customer is created with the following DDL command:

// create table customers(id int,accountnum int,name varchar(30),loanamount int,branchname varchar(30);

// Write the SQL query to select the branchname and its sum of Ioanamount from
// the table customer.
// Note: The total Ioanamount of the branches must be sorted in descending order.

select name,sum(loanamount) as totalamount from customer group by branchname order by totalamount desc;