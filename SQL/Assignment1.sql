create table Customer(
CustomerId int primary key, CompanyName varchar(50) Not null, ContactName varchar(50), contactTitle varchar(50),
Address varchar(50), City varchar(50), Region varchar(50), PostalCode varchar(20),Country varchar(50) default 'canada', phone varchar(10));

create table Supplier(
SupplierId int primary key,
Name varchar(50) not null,
Address varchar(50),
City varchar(50),
Province varchar(50)
);

create table Shipper(
ShipperId int primary key,
CompanyName varchar(50) not null unique
);

create table Products(
ProductId int primary key,
SupplierId int references Supplier(SupplierId),
CategoryId int,
ProductName Varchar(50) not null,
QuantityPerUnit varchar(60),
UnitPrice decimal(10,2),
UnitInStock int,
UnitsOnOrder int,
ReorderLevel int,
Discontinued boolean
);

create table Orders(
OrderId int primary key,
CustomerId int references Customer(CustomerId),
EmployeeID int,
ShipName varchar(50),
ShipAddress varchar(50),
ShipCity varchar(25),
ShipRegion varchar(25),
ShipPostalCode varchar(50),
ShipCountry varchar(50),
ShipVia int references Shipper(ShipperId),
OrderDate date,
ShippedDate date check(ShippedDate > OrderDate)
);

create table OrderDetails(
OrderId int references Orders(OrderId),
ProductId int references Products(ProductId),
UnitPrice decimal(10,2),
Quantity int check( Quantity > 10),
Discount decimal(4,2),
primary key(orderId, ProductId)
);
