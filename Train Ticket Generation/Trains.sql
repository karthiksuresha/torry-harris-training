CREATE TABLE Trains ( TRAIN_NO int PRIMARY KEY, 
TRAIN_NAME VARCHAR(40), 
SOURCE VARCHAR(20), 
DESTINATION VARCHAR(20), 
TICKET_PRICE int);
Insert into trains values (1001,'Shatabdi Express','Bangalore','Delhi',2500), 
(1002,'Shatabdi Express','Delhi','Bangalore',2500),
(1003,'Udyan Express','Bangalore','Mumbai',1500),
(1004,'Udyan Express','Mumbai','Bangalore',1500), 
(1005,'Brindavan Express','Bangalore','Chennai',1000), 
(1006,'Brindavan Express','Chennai','Bangalore',1000);

DROP TABLE TRAINS;

select* from trains;