// A table called laptop is created with the following DDL command:

// create table laptop (id int,name varchar(30),price int,processor varchar(30),storage varchar(10),ram varchar(10));


// Write the SQL query to select id, name, price, processor, storage, ram from the
// table laptop where the price is less than 40000, the processor is equal to 'Core i5',
// the storage is equal to '1 TB' and the ram is equal to '8GB'.
// Note: The id of the laptops must be sorted in ascending order.


select id,name,price,processor,storage,ram from laptop where prices<40000 and processor='Core i5' and storage='1TB' and ram='8GB'order by id;