
/* Drop Triggers */

DROP TRIGGER TRI_customer_custid;
DROP TRIGGER TRI_NEW_TABLE_custid;
DROP TRIGGER TRI_orders_custid;



/* Drop Tables */

DROP TABLE customer CASCADE CONSTRAINTS;
DROP TABLE orders CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_customer_custid;
DROP SEQUENCE SEQ_NEW_TABLE_custid;
DROP SEQUENCE SEQ_orders_custid;




/* Create Sequences */

CREATE SEQUENCE SEQ_customer_custid INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_NEW_TABLE_custid INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_orders_custid INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE customer2
(
	custid number NOT NULL,
	name varchar2(50),
	address varchar2(50 char),
	phone varchar2(50),
	PRIMARY KEY (custid)
);


CREATE TABLE orders
(
	custid number NOT NULL,
	name varchar2(50),
	bookid number,
	saleprice number,
	orderdate date,
	PRIMARY KEY (custid)
);

select * from CUSTOMER;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_customer_custid BEFORE INSERT ON customer
FOR EACH ROW
BEGIN
	SELECT SEQ_customer_custid.nextval
	INTO :new.custid
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_NEW_TABLE_custid BEFORE INSERT ON NEW_TABLE
FOR EACH ROW
BEGIN
	SELECT SEQ_NEW_TABLE_custid.nextval
	INTO :new.custid
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_orders_custid BEFORE INSERT ON orders
FOR EACH ROW
BEGIN
	SELECT SEQ_orders_custid.nextval
	INTO :new.custid
	FROM dual;
END;

/




