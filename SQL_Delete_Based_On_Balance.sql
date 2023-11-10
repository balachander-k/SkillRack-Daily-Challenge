// A table called debtor is created with the following DDL command:

// create table debtor (id int,accountnum int,name VARCHAR(20),sanctionedamount int,currentbalance int);

// Write the SQL statement to delete the records of the debtor who have paid off
// the entire loan amount (i.e., Delete all the debtors who have their currentbalance

delete from debtor where currentbalance=0;