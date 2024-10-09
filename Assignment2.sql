create table customers(customer_id varchar(10), customer_name varchar(20), address varchar(20),phone_no bigint,email_id varchar(20));
create table delivery_partners(partner_id varchar(10), partner_name varchar(20), phone_no bigint, rating int);
create table hotel_details(hotel_id varchar(10), hotel_name varchar(20), hotel_type varchar(20),rating int);
alter table customers add constraint customers_pkey primary key(customer_id);
alter table delivery_partners add constraint deliverypartners_pkey primary key(partner_id);
alter table hotel_details add constraint hoteldetails_pkey primary key(hotel_id);
create table orders(order_id varchar(10), customer_id varchar(10) references customers(customer_id), hotel_id varchar(10) references hotel_details(hotel_id), partner_id varchar(10) references delivery_partners(partner_id));
alter table orders add column order_date date, add column order_amount int;
select*from orders
insert into customers values('c001', 'john', '123 main St', 9876543210, 'john@example.com'),('c002', 'Smith','456 Oak Ave', 9876543211, 'smith@example.com'),('c003', 'Malt','789 Oak Ave', 9876543212, 'malt@example.com');
insert into delivery_partners values('p001', 'Fasrdelivery', 1234567890, 5),('p002', 'quickCourier', 1234567891, 4),('p003', 'ExpressShipping', 1234567892, 3);
insert into hotel_details values('h001', 'hotel_blue', 'Luxury', 5),('h002', 'Green_in', 'Budget', 4),('h003', 'Sunset Stay', 'Resort', 5);
insert into orders values('0001','c001','h001','p001','2023-10-01', 200),('0002','c002','h002','p002','2023-10-02',150),('0003','c003','h003','p003','2023-10-03',300);
insert into delivery_partners values('p004', 'Fasterdelivery', 1234567894, 6),('p005', 'slowCourier', 1234567895, 2),('p006', 'fastShipping', 1234567896, 3);

---1
select partner_id, partner_name, phone_no from delivery_partners where rating >=3 and rating <=5 order by partner_id;
select partner_id, partner_name, phone_no from delivery_partners where rating between 3 and 5 order by partner_id;

--2 update table
insert into customers values('cust1001','Thomas', 'kochi','9856325486','thomas@gmail.com'),('cust1002','Charles', 'Allepy','9856367486','charles@gmail.com'),('cust1003','Sudhakar', 'kochi','9856323869','sudhakar@gmail.com'),
('cust1004','Jagadish', 'Ernakulam','9856326666','jagadish@gmail.com'),('cust1005','Albert', 'Allepy','9856328659','albert@gmail.com'),('cust1006','Ashwin Das', 'Kannur','9856325659','ashwin@gmail.com');

update customers set phone_no = 9876543210 where customer_id = 'cust1004';
select*from customers where customer_id = 'cust1004';

--3 customer having gmail id
select customer_id, customer_name, address, phone_no from customers where email_id like '%@gmail.com' 
order by customer_id;

--4 change datatype
alter table orders drop constraint orders_customer_id_fkey;
update customers set customer_id = regexp_replace(customer_id, '[^0-9]', '', 'g');
alter table customers alter column customer_id type int using customer_id :: integer;

--5 change field name
alter table hotel_details rename column rating to hotel_rating;

--6 hotel_info
select concat(hotel_name, ' is a ', hotel_type, 'hotel') as hotel_info from hotel_details order by hotel_name desc;

--7 order more than five times
select h.hotel_id, h.hotel_name, count(o.order_id) as order_count 
from hotel_details h 
join orders o on h.hotel_id = o.hotel_id
group by h.hotel_id, h.hotel_name
having count(o.order_id) > 5 
order by h.hotel_id asc;

--8 not taken orders in specific month
select hd.hotel_id, hd.hotel_name, hd.hotel_type
from Hotel_details hd
left join orders o on hd.hotel_id=o.hotel_id
and o.order_date >='2019-05-01'
and o.order_date<'2019-06-01'
where O.order_id is null
order by hd.hotel_id asc;

--9 order detail	
SELECT column_name,data_type
FROM information_schema.columns
WHERE table_name='orders';
SELECT column_name,data_type
FROM information_schema.columns
WHERE table_name='Customers';
SELECT column_name, data_type
FROM information_schema.columns
WHERE table_schema='public'
AND table_name='orders';
SELECT column_name,data_type
FROM information_schema.columns
WHERE table_schema='public'
AND table_name='Customers';

--10 Pizza
create table customer(cust_id varchar(10), cust_name varchar(20), cust_phone bigint, cust_address varchar(20));
alter table customer add constraint cust_pkey primary key(cust_id);
create table delivery_partner(partner_id varchar(10) primary key, partner_name varchar(15), rating bigint);
create table pizza(pizza_id varchar(10), cust_id varchar(10) references customer(cust_id), partner_id varchar(10) references delivery_partner(partner_id), 
pizza_name varchar(15), pizza_type varchar(15), order_date date, amount bigint);
insert into customer values (1, 'john', 555-1234),(2, 'jane', 5891234),(3, 'smith', 5551234);
insert into delivery_partner values('p001', 'zomato', 8),('p002', 'blink', 6),('p003', 'swiggy', 10);
insert into pizza values('a001', 1, 'p001','margherita', 'large', '2024-06-09', 500),
('a002', 2, 'p002','Pepperoni', 'small', '2023-08-09', 800),('a003', 3, 'p003', 'onion','large', '2024-08-09', 900);
update pizza set amount = amount * 0.97 where pizza_type = 'large';





